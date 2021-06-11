import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;
import java.sql.Connection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Conexao 
{
	private String url = "jdbc:postgresql://localhost/MTP_DB";
	private String usuario = "postgres";
	private String senha = "3128";
	private Connection conn;
        private String caminho;
        private File arquivo;
        
    public boolean naoExistemPedidos(int id){
            try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT idproduto FROM pedido_produto WHERE idproduto = ?;");
                ps.setInt(1,id);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    return false;
                }
                else{
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
    }

    public File getArquivo() {
        return arquivo;
    }
        
	public Conexao() 
	{
		conectar();
                arquivo=null;
	}
	public void conectar()//conecta com o banco
	{
		try 
        {
			Class.forName("org.postgresql.Driver");
        } 
        catch (ClassNotFoundException e1) 
		{
			e1.printStackTrace();
		}		
            Properties prop = new Properties();
            prop.setProperty("password", this.senha);
            prop.setProperty("user", this.usuario);
            try
            {
				this.conn = DriverManager.getConnection(this.url, prop);
                                
            } 
            catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
                
            }
	}
	public Connection getConnection() 
	{
		return this.conn;
	}
	public int login(String email,String senha)
	{
		try
		{
			PreparedStatement ps = this.conn./*getConnection().*/prepareStatement("SELECT idpessoa FROM pessoa WHERE email = ? AND senha = ?;");
			ps.setString(1,email);
			ps.setString(2,senha);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{
				return rs.getInt(1);
			}	
			else
			{
                                
				return 0;
                                
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
                        
			return 0;
		} 
	}
    public void inserirProduto(String nome, String descricao, Float precocusto, Float precovenda) 
    {
		try 
		{
	        FileInputStream fot = new FileInputStream(arquivo);
	        PreparedStatement ps = this.conn.prepareStatement("INSERT INTO produto (nome, descricao, preco_venda, preco_custo, foto) VALUES (?, ?, ?, ?, ?);");
	        ps.setString(1, nome);
	        ps.setString(2, descricao);
	      	ps.setFloat(3, precovenda);
		ps.setFloat(4, precocusto);
	        ps.setBinaryStream(5, fot, (int) arquivo.length());
	        ps.executeUpdate();
	        ps.close();
                arquivo=null;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
    public ArrayList<Produto> getProdutos() throws IOException, SQLException 
    {
		try 
		{
	        PreparedStatement ps = this.conn.prepareStatement("SELECT nome,descricao,preco_custo,preco_venda,foto FROM produto;");
	        ResultSet rs=ps.executeQuery();
                InputStream is;
                BufferedImage imag;
                Image image;
                ImageIcon icon;
                ArrayList<Produto> produ=new ArrayList<Produto>();
                boolean x=false;
                byte foto[];
                while(rs.next()){
                    x=true;
                    Produto prod = new Produto();
                    prod.setNome(rs.getString(1));
                    prod.setDescricao(rs.getString(2));
                    prod.setPrecocusto(rs.getFloat(3));
                    prod.setPrecovenda(rs.getFloat(4));
                    foto=rs.getBytes(5);
                    is = new ByteArrayInputStream(foto);
                    imag = ImageIO.read(is);
                    image = imag;
                    image = Toolkit.getDefaultToolkit().createImage(foto);
                    image = image.getScaledInstance(300,300, 0);//Image.SCALE_SMOOTH);
                    icon = new ImageIcon(image);
                    prod.setFoto(icon);
                    produ.add(prod);
                }
                if(x)
                    return produ;
                else
                    return null;
                } catch (SQLException e) 
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
                catch(NullPointerException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                return null;
	}
	public void inserirPessoa(String nome, String senha, String email,String cidade,String estado,String endereco) throws FileNotFoundException, IOException
	{
        /*if(arquivo!=null){
            FileInputStream fis = new FileInputStream(this.arquivo);
        }else{
            FileInputStream fis=null;
        }*/
        try 
        {       
            FileInputStream fis = null;
            if(arquivo!=null){
                    fis = new FileInputStream(this.arquivo);}
                String sql;
                if(arquivo!=null){
                    sql="INSERT INTO pessoa (email, nome, senha, cidade, estado, endereco, foto) VALUES (?,?,?,?,?,?,?);";
                }else{
                    sql="INSERT INTO pessoa (email, nome, senha, cidade, estado, endereco) VALUES (?,?,?,?,?,?);";
                }
            
            
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, nome); 
            ps.setString(3, senha);
            ps.setString(4, cidade);
            ps.setString(5, estado);
            ps.setString(6, endereco);
            if(arquivo!=null)
                    ps.setBinaryStream(7, fis, (int) this.arquivo.length());
            
            ps.executeUpdate();
            ps.close();
            arquivo=null;
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
	}
    public void produtoCarrinho(int email, int idProduto, int quantidade) {
		try 
		{
	        PreparedStatement ps = this.conn.prepareStatement("INSERT INTO carrinho (email, idproduto, quantidade) VALUES (?, ?, ?) ;");
	        ps.setInt(1, email);
	        ps.setInt(2, idProduto);   
	        ps.setInt(3, quantidade);
	        ps.executeUpdate();
	        ps.close();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	public void atualizarPessoa(int id,String nome, String senha, String cidade,String estado,String endereco) throws FileNotFoundException 
	{
                FileInputStream fis = null;
                if(arquivo!=null){
                    fis = new FileInputStream(this.arquivo);}
                String sql;
                if(arquivo!=null){
                    sql="UPDATE pessoa SET nome = ?, senha = ?, cidade = ?, estado = ?, endereco = ?, foto = ? WHERE idpessoa = ? ;";
                }else{
                    sql="UPDATE pessoa SET nome = ?, senha = ?, cidade = ?, estado = ?, endereco = ? WHERE idpessoa = ? ;";
                }
		try
		{
                    
			PreparedStatement ps = this.conn.prepareStatement(sql);
			ps.setString(1, nome);
                        ps.setString(2, senha);
                        ps.setString(3, cidade);
                        ps.setString(4, estado);
                        ps.setString(5, endereco);
                        if(arquivo!=null){
                            ps.setBinaryStream(6, fis, (int) this.arquivo.length());
                            ps.setInt(7, id);
                        }
                        else
                            ps.setInt(6, id);


                        ps.executeUpdate();
                        ps.close();
                        arquivo=null;
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void removerProduto (String nome,String descricao,float precocusto,float precovenda)
	{
		try{
			PreparedStatement ps = this.conn.prepareStatement("DELETE  FROM produto WHERE nome = ? AND descricao = ? AND preco_custo = ? AND preco_venda= ? ;");
			ps.setString(1,nome);
                        ps.setString(2,descricao);
                        ps.setFloat(3,precocusto);
                        ps.setFloat(4,precovenda);
                        ps.executeUpdate();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
        
        public void removerPessoa (String email)
	{
		try{
			PreparedStatement ps = this.conn.prepareStatement("DELETE  FROM pessoa WHERE email = ? ;");
			ps.setString(1, email);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
        
        public String getNomePessoa(int id)
	{
		try
		{
			PreparedStatement ps = this.conn./*getConnection().*/prepareStatement("SELECT nome FROM pessoa WHERE idpessoa = ? ;");
                        
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{
                                
				return rs.getString(1);
			}	
			else
			{
                               
				return null;
			}
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage());
			return null;
		} 
        }
        public boolean admin(String email)
	{
		try
		{
			PreparedStatement ps = this.conn./*getConnection().*/prepareStatement("SELECT admin FROM pessoa WHERE email = ?;");
			ps.setString(1,email);
			ResultSet rs = ps.executeQuery();
			if (rs.next())
			{
				return rs.getBoolean(1);
			}	
			else
			{
                                
				return false;
                                
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
                        
			return false;
		} 
	}
        
        public Image selectFoto() throws IOException{
            JFileChooser foto=new JFileChooser();
            JLabel tela=new JLabel("");
            tela.setBounds(200,200,200,200);
            foto.setDialogTitle("Selecionar Imagem");
            foto.showOpenDialog(tela);
            if(foto.getSelectedFile()!=null){
                arquivo=foto.getSelectedFile();
                try{
                    BufferedImage imagem=ImageIO.read(new File(foto.getSelectedFile().getAbsolutePath()));
                    Image imagemsetada= imagem.getScaledInstance(300,300,0);
                    return imagemsetada;
                }
                catch (IOException ex) {
                    Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return null;
        }
        
        public void saveFoto(int id) throws FileNotFoundException, IOException{
            //BufferedImage imagebuffer=ImageIO.read(new File(caminho));
            //ByteArrayOutputStream bytesimg= new ByteArrayOutputStream();
            //byte[] buffer = null;
            if(arquivo!=null){
            FileInputStream fis = new FileInputStream(this.arquivo);//ps.setBinaryStream(1, fis, (int) this.arquivo.length());
            //ImageIO.write(imagebuffer,"jpg",bytesimg);
            //bytesimg.flush();
            //buffer=bytesimg.toByteArray();
            //bytesimg.close();
            
            //is.close();
            try {
                PreparedStatement ps=this.conn.prepareStatement("UPDATE pessoa SET foto = ? WHERE idpessoa = ?;");
                ps.setBinaryStream(2, fis, (int) this.arquivo.length());
                ps.setInt(2,id);
                ps.executeUpdate();
                ps.close();
                JOptionPane.showMessageDialog(null,"funcionou");
                arquivo=null;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"erro dentro da funcao");
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
            }
        }
        
        public boolean naoExiste(String email){
            try {
                PreparedStatement ps=this.conn.prepareStatement("select email from pessoa where email= ?;");
                ps.setString(1,email);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    return false;
                }
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
        
        public ImageIcon getFotoPessoa(int id) throws IOException{
            PreparedStatement ps;
            try {
                ps = this.conn.prepareStatement("select foto from pessoa where idpessoa = ?;");
                ps.setInt(1,id);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    byte foto[]=rs.getBytes(1);
                    InputStream is = new ByteArrayInputStream(foto);
                    BufferedImage imag = ImageIO.read(is);
                    Image image = imag;
                    image = Toolkit.getDefaultToolkit().createImage(foto);
                    image = image.getScaledInstance(300,300, 0);//Image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(image);
                   /* byte[] binario = rs.getBytes(1);
				InputStream is = new ByteArrayInputStream(binario);
				BufferedImage imag = ImageIO.read(is);
				ImageIcon icon = new ImageIcon(imag);*/
                    return icon;
                }
                return null;
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            return null;  
        }

    public String getCidadePessoa(int id) {
            try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT cidade FROM pessoa WHERE idpessoa = ?;");
                ps.setInt(1, id);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    return rs.getString(1);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
    }

    public String getEstadoPessoa(int id) {
        try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT estado FROM pessoa WHERE idpessoa = ?;");
                ps.setInt(1, id);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    return rs.getString(1);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
    }

    public String getEnderecoPessoa(int id) {
        try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT endereco FROM pessoa WHERE idpessoa = ?;");
                ps.setInt(1, id);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    return rs.getString(1);
                }
                
        } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return null;
    }

    String getEmailPessoa(int id) {
        try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT email FROM pessoa WHERE idpessoa = ?;");
                ps.setInt(1, id);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    return rs.getString(1);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
    }

    public String getSenhaPessoa(int id) {
        try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT senha FROM pessoa WHERE idpessoa = ?;");
                ps.setInt(1, id);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    return rs.getString(1);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
    }

    void alteraProduto(String nome, String descricao, float precocusto, float precovenda, Produto prod) throws FileNotFoundException {
            String sql=null;
            if(arquivo!=null){
                sql="UPDATE produto SET nome = ?, descricao = ?, preco_custo = ?, preco_venda = ?, foto = ? WHERE nome = ? AND descricao = ? AND preco_custo = ? AND preco_venda = ?;";
            }
            else{
                sql="UPDATE produto SET nome = ?, descricao = ?, preco_custo = ?, preco_venda = ? WHERE nome = ? AND descricao = ? AND preco_custo = ? AND preco_venda = ?;";
            }
            try {
                PreparedStatement ps=this.conn.prepareStatement(sql);
                ps.setString(1, nome);
                ps.setString(2, descricao);
                ps.setFloat(3, precocusto);
                ps.setFloat(4, precovenda);
                if(arquivo!=null){
                    FileInputStream fis = new FileInputStream(this.arquivo);
                    ps.setBinaryStream(5, fis, (int) this.arquivo.length());
                    ps.setString(6, prod.getNome());
                    ps.setString(7, prod.getDescricao());
                    ps.setFloat(8, prod.getPrecocusto());
                    ps.setFloat(9, prod.getPrecovenda());
                    ps.executeUpdate();
                }
                else{
                    ps.setString(5, prod.getNome());
                    ps.setString(6, prod.getDescricao());
                    ps.setFloat(7, prod.getPrecocusto());
                    ps.setFloat(8, prod.getPrecovenda());
                    ps.executeUpdate();
                }
                arquivo=null;
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

    public ArrayList<Produto> pesquisar(String nome_descricao) throws IOException {
            try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT nome,descricao,preco_venda,foto FROM produto WHERE nome = ? OR descricao = ?;");
                ps.setString(1, nome_descricao);
                ps.setString(2, nome_descricao);
                ResultSet rs=ps.executeQuery();
                ArrayList<Produto> produ=new ArrayList<Produto>();
                InputStream is;
                BufferedImage imag;
                Image image;
                ImageIcon icon;
                byte foto[];
                boolean x=false;
                while(rs.next()){
                    x=true;
                    Produto prod=new Produto();
                    prod.setNome(rs.getString(1));
                    prod.setDescricao(rs.getString(2));
                    prod.setPrecovenda(rs.getFloat(3));
                    foto=rs.getBytes(4);
                    is = new ByteArrayInputStream(foto);
                    imag = ImageIO.read(is);
                    image = imag;
                    image = Toolkit.getDefaultToolkit().createImage(foto);
                    image = image.getScaledInstance(300,300, 0);//Image.SCALE_SMOOTH);
                    icon = new ImageIcon(image);
                    prod.setFoto(icon);
                    produ.add(prod);
                }
                if(x)
                    return produ;
                else
                    return null;
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        
        return null;
    }
    
    public int getIdProduto(String nome,String descricao, float preco){
            try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT idproduto FROM produto WHERE nome = ? AND descricao = ? AND preco_venda = ?;");
                ps.setString(1, nome);
                ps.setString(2, descricao);
                ps.setFloat(3, preco);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    return rs.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        return 0;
    }
    
    public void insereCarrinho(int idproduto,int idpessoa){
            try {
                PreparedStatement ps=this.conn.prepareStatement("INSERT INTO carrinho(quantidade,idproduto,idpessoa) VALUES(?,?,?);");
                ps.setInt(1,1);
                ps.setInt(2, idproduto);
                ps.setInt(3, idpessoa);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
     public Produto getProduto(int id) throws IOException {
            try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT nome,descricao,preco_venda,foto FROM produto WHERE idproduto = ?;");
                ps.setInt(1,id);
                ResultSet rs=ps.executeQuery();
                InputStream is;
                BufferedImage imag;
                Image image;
                ImageIcon icon;
                byte foto[];
                boolean x=false;
                Produto prod=new Produto();
                if(rs.next()){
                    x=true;
                    
                    prod.setNome(rs.getString(1));
                    prod.setDescricao(rs.getString(2));
                    prod.setPrecovenda(rs.getFloat(3));
                    foto=rs.getBytes(4);
                    is = new ByteArrayInputStream(foto);
                    imag = ImageIO.read(is);
                    image = imag;
                    image = Toolkit.getDefaultToolkit().createImage(foto);
                    image = image.getScaledInstance(300,300, 0);//Image.SCALE_SMOOTH);
                    icon = new ImageIcon(image);
                    prod.setFoto(icon);
                }
                if(x)
                    return prod;
                else
                    return null;
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        
        return null;
    }
     
    public ArrayList<Produto> getProdutosCarrinho() throws IOException {
            try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT idproduto FROM carrinho;");
                
                ResultSet rs=ps.executeQuery();
                ArrayList<Produto> produ=new ArrayList<Produto>();
                boolean x=false;
                while(rs.next()){
                    x=true;
                    produ.add(getProduto(rs.getInt(1)));
                }
                if(x)
                    return produ;
                else
                    return null;
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        
        return null;
    } 
     
    public int getQuantidade(int id,int idpessoa){
            try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT quantidade FROM carrinho WHERE idproduto = ? AND idpessoa = ? ;");
                ps.setInt(1,id);
                ps.setInt(2,idpessoa);
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                    return rs.getInt(1);
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        return 0;
    }

    void removeCarrinho(int idProduto, int idPessoa) {
            try {
                PreparedStatement ps=this.conn.prepareStatement("DELETE FROM carrinho WHERE idproduto = ? AND idpessoa = ?;");
                ps.setInt(1, idProduto);
                ps.setInt(2, idPessoa);
                ps.executeUpdate();
            } catch (Exception ex) {
            }
    }

    public void removeCarrinho(int id) {
            try {
                PreparedStatement ps=this.conn.prepareStatement("DELETE FROM carrinho WHERE idproduto = ?;");
                ps.setInt(1, id);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public ArrayList<Produto> getProdutosCarrinho(int idpessoa) throws IOException {
        try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT idproduto FROM carrinho WHERE idpessoa = ?;");
                ps.setInt(1,idpessoa);
                ResultSet rs=ps.executeQuery();
                ArrayList<Produto> produ=new ArrayList<Produto>();
                boolean x=false;
                while(rs.next()){
                    x=true;
                    produ.add(getProduto(rs.getInt(1)));
                }
                if(x)
                    return produ;
                else
                    return null;
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        
        return null;
    }

    public void setMenosQuantidade(int idProduto, int idPessoa) {
            try {
                PreparedStatement ps=this.conn.prepareStatement("UPDATE carrinho SET quantidade = ? WHERE idproduto = ? AND idpessoa = ?;");
                ps.setInt(1, getQuantidade(idProduto,idPessoa)-1);
                ps.setInt(2,idProduto);
                ps.setInt(3,idPessoa);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void setMaisQuantidade(int idProduto, int idPessoa) {
            try {
                PreparedStatement ps=this.conn.prepareStatement("UPDATE carrinho SET quantidade = ? WHERE idproduto = ? AND idpessoa = ?;");
                ps.setInt(1, getQuantidade(idProduto,idPessoa)+1);
                ps.setInt(2,idProduto);
                ps.setInt(3,idPessoa);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public void inserePedido(String data, float preco, int idpessoa) {
            try {
                PreparedStatement ps=this.conn.prepareStatement("INSERT INTO pedido(data,valortotal,idpessoa) VALUES(?, ?, ?);");
                ps.setString(1, data);
                ps.setFloat(2, preco);
                ps.setInt(3, idpessoa);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public int getIdPedido(String data, float preco, int idpessoa) {
            try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT idpedido FROM pedido WHERE data = ? AND valortotal = ? AND idpessoa = ?;");
                ps.setString(1, data);
                ps.setFloat(2, preco);
                ps.setInt(3, idpessoa);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    return rs.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
                return 0;
    }
    
    public void inserePedidoProduto(Float preco, int quantidade,int idproduto, int idpedido) {
            try {
                PreparedStatement ps=this.conn.prepareStatement("INSERT INTO pedido_produto(preco,quantidade,idproduto,idpedido) VALUES(?, ?, ?, ?);");
                ps.setFloat(1, preco);
                ps.setInt(2, quantidade);
                ps.setInt(3, idproduto);
                ps.setInt(4, idpedido);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public boolean existePedidoPessoa(int idpessoa) {
            try {
                PreparedStatement ps=this.conn.prepareStatement("SELECT idpessoa FROM pedido WHERE idpessoa = ?;");
                ps.setInt(1,idpessoa);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
    }

    public void apagaPedidos(int idpessoa) {
        PreparedStatement ps;
            try {
                ps = this.conn.prepareStatement("DELETE FROM pedido WHERE idpessoa = ?;");
                ps.setInt(1,idpessoa);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
                
    }
    
    public ArrayList<Integer> getPedidosProdutos(int id){
        try {
                PreparedStatement ps = this.conn.prepareStatement("SELECT idpedido FROM pedido WHERE idpessoa = ?;");
                ps.setInt(1,id);
                ResultSet rs=ps.executeQuery();
                ArrayList<Integer> arr=new ArrayList<Integer>();
                while(rs.next()){
                    arr.add(rs.getInt(1));
                }
                return arr;
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }

    public void apagaPedidoProduto(Integer id) {
        try {
                PreparedStatement ps = this.conn.prepareStatement("DELETE FROM pedido_produto WHERE idpedido = ?;");
                ps.setInt(1,id);ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}