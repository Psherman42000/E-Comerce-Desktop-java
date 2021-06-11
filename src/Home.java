
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lindo
 */
public class Home extends javax.swing.JFrame {

    /**int 
     * Creates new form Home
     */Conexao con;int tam2;
     ArrayList<Produto> produ;
     int tam;

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    public Home() {
        initComponents();
        con=new Conexao();
     
    }
    public Home(int id) throws IOException, SQLException {
        initComponents();
        setIdPessoa(id);
        con=new Conexao();
        nome.setText(con.getNomePessoa(id));
        produ=new ArrayList<Produto>();
        produ=con.getProdutos();
         try{
             
             nome01.setText(produ.get(0).getNome());
             descricao1.setText(produ.get(0).getDescricao());
             preco1.setText("POR APENAS R$:"+Float.toString(produ.get(0).getPrecovenda()));
             foto1.setIcon(produ.get(0).getFoto());
             setTam(0);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome01.setText("");
             descricao1.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco1.setText("");
             foto1.setIcon(null);
         }
         try{
             nome2.setText(produ.get(1).getNome());
             descricao2.setText(produ.get(1).getDescricao());
             preco2.setText("POR APENAS R$: "+Float.toString(produ.get(1).getPrecovenda()));
             foto2.setIcon(produ.get(1).getFoto());
             setTam(1);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome2.setText("");
             descricao2.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco2.setText("");
             foto2.setIcon(null);
         }
         try{
             nome3.setText(produ.get(2).getNome());
             descricao3.setText(produ.get(2).getDescricao());
             preco3.setText("POR APENAS R$: "+Float.toString(produ.get(2).getPrecovenda()));
             foto3.setIcon(produ.get(2).getFoto());
             setTam(2);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome3.setText("");
             descricao3.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco3.setText("");
             foto3.setIcon(null);
         }
         try{
             nome4.setText(produ.get(3).getNome());
             descricao4.setText(produ.get(3).getDescricao());
             preco4.setText("POR APENAS R$: "+Float.toString(produ.get(3).getPrecovenda()));
             foto4.setIcon(produ.get(3).getFoto());
             setTam(3);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome4.setText("");
             descricao4.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco4.setText("");
             foto4.setIcon(null);
         }
         try{
             nome5.setText(produ.get(4).getNome());
             descricao05.setText(produ.get(4).getDescricao());
             preco5.setText("POR APENAS R$: "+Float.toString(produ.get(4).getPrecovenda()));
             foto5.setIcon(produ.get(4).getFoto());
             setTam(4);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome5.setText("");
             descricao05.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco5.setText("");
             foto5.setIcon(null);
         }
         try{
             nome6.setText(produ.get(5).getNome());
             descricao6.setText(produ.get(5).getDescricao());
             preco6.setText("POR APENAS R$: "+Float.toString(produ.get(5).getPrecovenda()));
             foto6.setIcon(produ.get(5).getFoto());
    
             setTam(5);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome6.setText("");
             descricao6.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco6.setText("");
             foto6.setIcon(null);
         }
         try{
             nome7.setText(produ.get(6).getNome());
             descricao7.setText(produ.get(6).getDescricao());
             preco7.setText("POR APENAS R$: "+Float.toString(produ.get(6).getPrecovenda()));
             foto7.setIcon(produ.get(6).getFoto());
             setTam(6);
             tam2=tam;
         }
        catch(IndexOutOfBoundsException e){
             nome7.setText("");
             descricao7.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco7.setText("");
             foto7.setIcon(null);
         }
         try{
             nome8.setText(produ.get(7).getNome());
             descricao8.setText(produ.get(7).getDescricao());
             preco8.setText("POR APENAS R$: "+Float.toString(produ.get(7).getPrecovenda()));
             foto8.setIcon(produ.get(7).getFoto());
             setTam(7);
             tam2=tam;
         }
        catch(IndexOutOfBoundsException e){
             nome8.setText("");
             descricao8.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco8.setText("");
             foto8.setIcon(null);
         }
         try{
             nome9.setText(produ.get(8).getNome());
             descricao9.setText(produ.get(8).getDescricao());
             preco9.setText("POR APENAS R$: "+Float.toString(produ.get(8).getPrecovenda()));
             foto9.setIcon(produ.get(8).getFoto());
             setTam(8);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome9.setText("");
             descricao9.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco9.setText("");
             foto9.setIcon(null);
         }
         try{
             nome10.setText(produ.get(9).getNome());
             descricao10.setText(produ.get(9).getDescricao());
             preco10.setText("POR APENAS R$: "+Float.toString(produ.get(9).getPrecovenda()));
             foto10.setIcon(produ.get(9).getFoto());
             setTam(9);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome10.setText("");
             descricao10.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco10.setText("");
             foto10.setIcon(null);
         }
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        minhaConta = new javax.swing.JLabel();
        carrinho = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        zr = new javax.swing.JTextField();
        drg = new javax.swing.JTextField();
        dr = new javax.swing.JTextField();
        th = new javax.swing.JTextField();
        descricao5 = new javax.swing.JTextField();
        gzrgdz = new javax.swing.JTextField();
        zgrrg = new javax.swing.JTextField();
        rggrd = new javax.swing.JTextField();
        gzrgrg = new javax.swing.JTextField();
        z = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        ant = new javax.swing.JButton();
        prox = new javax.swing.JButton();
        foto8 = new javax.swing.JLabel();
        foto6 = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        foto3 = new javax.swing.JLabel();
        foto4 = new javax.swing.JLabel();
        foto5 = new javax.swing.JLabel();
        mincin = new javax.swing.JLabel();
        minhaConta2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        carrinho2 = new javax.swing.JLabel();
        foto9 = new javax.swing.JLabel();
        foto7 = new javax.swing.JLabel();
        nome1 = new javax.swing.JLabel();
        nome2 = new javax.swing.JLabel();
        nome01 = new javax.swing.JLabel();
        nome3 = new javax.swing.JLabel();
        nome4 = new javax.swing.JLabel();
        nome5 = new javax.swing.JLabel();
        nome6 = new javax.swing.JLabel();
        nome7 = new javax.swing.JLabel();
        nome8 = new javax.swing.JLabel();
        nome9 = new javax.swing.JLabel();
        preco1 = new javax.swing.JLabel();
        preco2 = new javax.swing.JLabel();
        preco3 = new javax.swing.JLabel();
        preco4 = new javax.swing.JLabel();
        preco5 = new javax.swing.JLabel();
        preco6 = new javax.swing.JLabel();
        preco7 = new javax.swing.JLabel();
        preco8 = new javax.swing.JLabel();
        preco9 = new javax.swing.JLabel();
        foto10 = new javax.swing.JLabel();
        nome10 = new javax.swing.JLabel();
        preco10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descricao1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        descricao2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        descricao3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        descricao4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        descricao05 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        descricao6 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        descricao7 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        descricao8 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        descricao9 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        descricao10 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        pesq = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        add4 = new javax.swing.JButton();
        add5 = new javax.swing.JButton();
        add6 = new javax.swing.JButton();
        add7 = new javax.swing.JButton();
        add8 = new javax.swing.JButton();
        add9 = new javax.swing.JButton();
        add10 = new javax.swing.JButton();

        jButton1.setText("Minha Conta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Carrinho");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Minha Conta");

        jLabel7.setText("Carrinho");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        minhaConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minhaContaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(minhaConta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(carrinho)
                .addGap(1876, 1876, 1876))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minhaConta)
                .addGap(120, 120, 120)
                .addComponent(carrinho)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        jLabel4.setText("POR APENAS:");

        jLabel3.setText("POR APENAS:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        zr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zrActionPerformed(evt);
            }
        });

        drg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drgActionPerformed(evt);
            }
        });

        dr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drActionPerformed(evt);
            }
        });

        gzrgdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gzrgdzActionPerformed(evt);
            }
        });

        z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jButton9.setText("jButton9");

        jButton8.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Óla, ");

        nome.setText("...");

        ant.setText("<== PAGINA ANTERIOR");
        ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antActionPerformed(evt);
            }
        });

        prox.setText("PAGINA SEQUINTE ==>");
        prox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proxActionPerformed(evt);
            }
        });

        foto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        foto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        foto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        foto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        foto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        mincin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-usuário-24.png"))); // NOI18N
        mincin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mincinMouseClicked(evt);
            }
        });

        minhaConta2.setText("Minha Conta");
        minhaConta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minhaConta2MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-carrinho-de-compras-24.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        carrinho2.setText("Carrinho");
        carrinho2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carrinho2MouseClicked(evt);
            }
        });

        foto9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        foto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        nome2.setText("............");

        nome01.setText("...........");

        nome3.setText(".........");

        nome4.setText("..........");

        nome5.setText("...........");

        nome6.setText("..........");

        nome7.setText("...........");

        nome8.setText("...........");

        nome9.setText("..........");

        preco1.setText("...");

        preco2.setText("...");

        preco3.setText("...");

        preco4.setText("...");

        preco5.setText("...");

        preco6.setText("...");

        preco7.setText("...");

        preco8.setText("...");

        preco9.setText("...");

        foto10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/not-found.jpg"))); // NOI18N

        nome10.setText("...");

        preco10.setText("...");

        descricao1.setColumns(20);
        descricao1.setRows(5);
        jScrollPane2.setViewportView(descricao1);

        descricao2.setColumns(20);
        descricao2.setRows(5);
        jScrollPane3.setViewportView(descricao2);

        descricao3.setColumns(20);
        descricao3.setRows(5);
        jScrollPane4.setViewportView(descricao3);

        descricao4.setColumns(20);
        descricao4.setRows(5);
        jScrollPane5.setViewportView(descricao4);

        descricao05.setColumns(20);
        descricao05.setRows(5);
        jScrollPane6.setViewportView(descricao05);

        descricao6.setColumns(20);
        descricao6.setRows(5);
        jScrollPane7.setViewportView(descricao6);

        descricao7.setColumns(20);
        descricao7.setRows(5);
        jScrollPane8.setViewportView(descricao7);

        descricao8.setColumns(20);
        descricao8.setRows(5);
        jScrollPane9.setViewportView(descricao8);

        descricao9.setColumns(20);
        descricao9.setRows(5);
        jScrollPane10.setViewportView(descricao9);

        descricao10.setColumns(20);
        descricao10.setRows(5);
        jScrollPane11.setViewportView(descricao10);

        jLabel8.setText("Pesquisar Produto");

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        add2.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        add1.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        add3.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });

        add4.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });

        add5.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");
        add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add5ActionPerformed(evt);
            }
        });

        add6.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");
        add6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add6ActionPerformed(evt);
            }
        });

        add7.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");
        add7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add7ActionPerformed(evt);
            }
        });

        add8.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");
        add8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add8ActionPerformed(evt);
            }
        });

        add9.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");
        add9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add9ActionPerformed(evt);
            }
        });

        add10.setText("+++ADICIONAR PRODUTO AO CARRINHO+++");
        add10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(minhaConta2)
                        .addComponent(carrinho2)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(mincin)
                                .addComponent(jLabel9)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(prox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ant, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(pesq, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(pesquisar)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(preco6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(preco7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(preco8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(foto9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nome9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(preco9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(add9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1302, 1302, 1302))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(954, 954, 954))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nome01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(preco1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(nome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane3)
                                                    .addComponent(nome2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(9, 9, 9)
                                                        .addComponent(nome1))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane5)
                                            .addComponent(foto4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nome4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nome5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(foto5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(preco2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(preco3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(add4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(preco4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(preco5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(add5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nome10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(preco10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(add10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(foto10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(foto6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nome6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(add2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(foto7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nome7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(foto8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(nome8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(983, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(nome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mincin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(minhaConta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(2, 2, 2)
                                .addComponent(carrinho2)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesquisar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(foto4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foto5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ant, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 463, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nome1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nome2)
                                            .addComponent(nome3)
                                            .addComponent(nome4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nome5)
                                            .addComponent(nome01))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                            .addComponent(jScrollPane3)
                                            .addComponent(jScrollPane4)
                                            .addComponent(jScrollPane5)
                                            .addComponent(jScrollPane6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(preco1)
                                            .addComponent(preco2)
                                            .addComponent(preco3)
                                            .addComponent(preco4)
                                            .addComponent(preco5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(add4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(add5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(foto6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(foto7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(foto8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nome7)
                                            .addComponent(nome6)
                                            .addComponent(nome8))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                            .addComponent(jScrollPane9)
                                            .addComponent(jScrollPane8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(preco6)
                                            .addComponent(preco7)
                                            .addComponent(preco8))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(add6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(add7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(add8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(preco10)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(foto10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nome10)
                                                .addGap(10, 10, 10)
                                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)))
                                        .addComponent(add10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(foto9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome9)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preco9)
                                .addGap(0, 0, 0)
                                .addComponent(add9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(204, 204, 204))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void minhaContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhaContaMouseClicked
        minhaConta2MouseClicked(evt);
    }//GEN-LAST:event_minhaContaMouseClicked

    private void minhaConta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhaConta2MouseClicked
        Minha_Conta mc=new Minha_Conta(getIdPessoa());
        mc.setVisible(true);
        dispose();
    }//GEN-LAST:event_minhaConta2MouseClicked

    private void mincinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mincinMouseClicked
        minhaConta2MouseClicked(evt);
    }//GEN-LAST:event_mincinMouseClicked

    private void drgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drgActionPerformed

    private void zrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zrActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zActionPerformed

    private void drActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drActionPerformed

    private void gzrgdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gzrgdzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gzrgdzActionPerformed

    private void proxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proxActionPerformed
        
        
        if(getTam()<produ.size()-1){
         try{
             tam2=tam;
             tam++;
             nome01.setText(produ.get(getTam()).getNome());
             descricao1.setText(produ.get(getTam()).getDescricao());
             preco1.setText("POR APENAS R$:"+Float.toString(produ.get(getTam()).getPrecovenda()));
             foto1.setIcon(produ.get(getTam()).getFoto());
         }
         catch(Exception e){
             nome01.setText("");
             descricao1.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco1.setText("");
             foto1.setIcon(null);
         }
         try{
             setTam(getTam()+1);
             nome2.setText(produ.get(getTam()).getNome());
             descricao2.setText(produ.get(getTam()).getDescricao());
             preco2.setText("POR APENAS R$: "+Float.toString(produ.get(1).getPrecovenda()));
             foto2.setIcon(produ.get(getTam()).getFoto());
         }
         catch(Exception e){
             nome2.setText("");
             descricao2.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco2.setText("");
             foto2.setIcon(null);
         }
         try{
             setTam(getTam()+1);
             nome3.setText(produ.get(getTam()).getNome());
             descricao3.setText(produ.get(2).getDescricao());
             preco3.setText("POR APENAS R$: "+Float.toString(produ.get(getTam()).getPrecovenda()));
             foto3.setIcon(produ.get(getTam()).getFoto());
         }
         catch(Exception e){
             nome3.setText("");
             descricao3.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco3.setText("");
             foto3.setIcon(null);
         }
         try{
             setTam(getTam()+1);
             nome4.setText(produ.get(getTam()).getNome());
             descricao4.setText(produ.get(getTam()).getDescricao());
             preco4.setText("POR APENAS R$: "+Float.toString(produ.get(getTam()).getPrecovenda()));
             foto4.setIcon(produ.get(getTam()).getFoto());
         }
        catch(Exception e){
             nome4.setText("");
             descricao4.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco4.setText("");
             foto4.setIcon(null);
         }
         try{setTam(getTam()+1);
             
             nome5.setText(produ.get(getTam()).getNome());
             descricao05.setText(produ.get(getTam()).getDescricao());
             preco5.setText("POR APENAS R$: "+Float.toString(produ.get(getTam()).getPrecovenda()));
             foto5.setIcon(produ.get(getTam()).getFoto());
         }
         catch(Exception e){
             nome5.setText("");
             descricao05.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco5.setText("");
             foto5.setIcon(null);
         }
         try{
             setTam(getTam()+1);
             nome6.setText(produ.get(getTam()).getNome());
             descricao6.setText(produ.get(getTam()).getDescricao());
             preco6.setText("POR APENAS R$: "+Float.toString(produ.get(getTam()).getPrecovenda()));
             foto6.setIcon(produ.get(getTam()).getFoto());
         }
         catch(Exception e){
             nome6.setText("");
             descricao6.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco6.setText("");
             foto6.setIcon(null);
         }
         try{
             setTam(getTam()+1);
             nome7.setText(produ.get(getTam()).getNome());
             descricao7.setText(produ.get(getTam()).getDescricao());
             preco7.setText("POR APENAS R$: "+Float.toString(produ.get(getTam()).getPrecovenda()));
             foto7.setIcon(produ.get(getTam()).getFoto());
         }
        catch(Exception e){
             nome7.setText("");
             descricao7.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco7.setText("");
             foto7.setIcon(null);
         }
         try{
             setTam(getTam()+1);
             nome8.setText(produ.get(getTam()).getNome());
             descricao8.setText(produ.get(getTam()).getDescricao());
             preco8.setText("POR APENAS R$: "+Float.toString(produ.get(getTam()).getPrecovenda()));
             foto8.setIcon(produ.get(getTam()).getFoto());
         }
        catch(Exception e){
             nome8.setText("");
             descricao8.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco8.setText("");
             foto8.setIcon(null);
         }
         try{
             setTam(getTam()+1);
             nome9.setText(produ.get(getTam()).getNome());
             descricao9.setText(produ.get(getTam()).getDescricao());
             preco9.setText("POR APENAS R$: "+Float.toString(produ.get(getTam()).getPrecovenda()));
             foto9.setIcon(produ.get(getTam()).getFoto());
         }
        catch(Exception e){
             nome9.setText("");
             descricao9.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco9.setText("");
             foto9.setIcon(null);
         }
         try{
             setTam(getTam()+1);
             nome10.setText(produ.get(getTam()).getNome());
             descricao10.setText(produ.get(getTam()).getDescricao());
             preco10.setText("POR APENAS R$: "+Float.toString(produ.get(getTam()).getPrecovenda()));
             foto10.setIcon(produ.get(getTam()).getFoto());
         }
         catch(Exception e){
             nome10.setText("");
             descricao10.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco10.setText("");
             foto10.setIcon(null);
         }
        }else{
            JOptionPane.showMessageDialog(null,"NAO HA MAIS PAGINAS DE PRODUTOS, ESSA É A ULTIMA");
        }
        
    }//GEN-LAST:event_proxActionPerformed

    private void antActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antActionPerformed
        
        if(getTam()>9){
         try{
             
             nome10.setText(produ.get(tam2).getNome());
             descricao10.setText(produ.get(tam2).getDescricao());
             preco10.setText("POR APENAS R$:"+Float.toString(produ.get(tam2).getPrecovenda()));
             foto10.setIcon(produ.get(tam2).getFoto());
             setTam(tam2);
             tam2--;
             
         }
         catch(Exception e){
             nome10.setText("");
             descricao10.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco10.setText("");
             foto10.setIcon(null);
         }
         try{
             nome9.setText(produ.get(tam2).getNome());
             descricao9.setText(produ.get(tam2).getDescricao());
             preco9.setText("POR APENAS R$: "+Float.toString(produ.get(tam2).getPrecovenda()));
             foto9.setIcon(produ.get(tam2).getFoto());
             tam2--;
         }
         catch(Exception e){
             nome9.setText("");
             descricao9.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco9.setText("");
             foto9.setIcon(null);
         }
         try{
             nome8.setText(produ.get(tam2).getNome());
             descricao8.setText(produ.get(tam2).getDescricao());
             preco8.setText("POR APENAS R$: "+Float.toString(produ.get(tam2).getPrecovenda()));
             foto8.setIcon(produ.get(tam2).getFoto());
             tam2--;
         }
         catch(Exception e){
             nome8.setText("");
             descricao8.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco8.setText("");
             foto8.setIcon(null);
         }
         try{
             nome7.setText(produ.get(tam2).getNome());
             descricao7.setText(produ.get(tam2).getDescricao());
             preco7.setText("POR APENAS R$: "+Float.toString(produ.get(tam2).getPrecovenda()));
             foto7.setIcon(produ.get(tam2).getFoto());
             tam2--;
         }
        catch(Exception e){
             nome7.setText("");
             descricao7.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco7.setText("");
             foto7.setIcon(null);
         }
         try{
             nome6.setText(produ.get(tam2).getNome());
             descricao6.setText(produ.get(tam2).getDescricao());
             preco6.setText("POR APENAS R$: "+Float.toString(produ.get(tam2).getPrecovenda()));
             foto6.setIcon(produ.get(tam2).getFoto());
             tam2--;
         }
         catch(Exception e){
             nome6.setText("");
             descricao6.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco6.setText("");
             foto6.setIcon(null);
         }
         try{
             nome5.setText(produ.get(tam2).getNome());
             descricao05.setText(produ.get(getTam()).getDescricao());
             preco5.setText("POR APENAS R$: "+Float.toString(produ.get(tam2).getPrecovenda()));
             foto5.setIcon(produ.get(tam2).getFoto());
             tam2--;
         }
         catch(Exception e){
             nome5.setText("");
             descricao5.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco5.setText("");
             foto5.setIcon(null);
         }
         try{
             nome4.setText(produ.get(tam2).getNome());
             descricao4.setText(produ.get(tam2).getDescricao());
             preco4.setText("POR APENAS R$: "+Float.toString(produ.get(tam2).getPrecovenda()));
             foto4.setIcon(produ.get(tam2).getFoto());
             tam2--;
         }
        catch(Exception e){
             nome4.setText("");
             descricao4.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco4.setText("");
             foto4.setIcon(null);
         }
         try{
             nome3.setText(produ.get(tam2).getNome());
             descricao3.setText(produ.get(tam2).getDescricao());
             preco3.setText("POR APENAS R$: "+Float.toString(produ.get(tam2).getPrecovenda()));
             foto3.setIcon(produ.get(tam2).getFoto());
             tam2--;
         }
        catch(Exception e){
             nome3.setText("");
             descricao3.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco3.setText("");
             foto3.setIcon(null);
         }
         try{
             nome2.setText(produ.get(tam2).getNome());
             descricao2.setText(produ.get(tam2).getDescricao());
             preco2.setText("POR APENAS R$: "+Float.toString(produ.get(tam2).getPrecovenda()));
             foto2.setIcon(produ.get(tam2).getFoto());
             tam2--;
         }
        catch(Exception e){
             nome2.setText("");
             descricao2.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco2.setText("");
             foto2.setIcon(null);
         }
         try{
             nome01.setText(produ.get(tam2).getNome());
             descricao1.setText(produ.get(getTam()).getDescricao());
             preco1.setText("POR APENAS R$: "+Float.toString(produ.get(tam2).getPrecovenda()));
             foto1.setIcon(produ.get(tam2).getFoto());
             tam2--;
         }
         catch(Exception e){
             nome01.setText("");
             descricao1.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco1.setText("");
             foto1.setIcon(null);
             
         }
        }else{
            JOptionPane.showMessageDialog(null,"ESSA É A PRIMEIRA PAGINA");
        }
    }//GEN-LAST:event_antActionPerformed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
         try {
             produ=con.pesquisar(pesq.getText());
         } catch (IOException ex) {
             Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
         }try{
             
             nome01.setText(produ.get(0).getNome());
             descricao1.setText(produ.get(0).getDescricao());
             preco1.setText("POR APENAS R$:"+Float.toString(produ.get(0).getPrecovenda()));
             foto1.setIcon(produ.get(0).getFoto());
             setTam(0);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome01.setText("");
             descricao1.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco1.setText("");
             foto1.setIcon(null);
         }
         try{
             nome2.setText(produ.get(1).getNome());
             descricao2.setText(produ.get(1).getDescricao());
             preco2.setText("POR APENAS R$: "+Float.toString(produ.get(1).getPrecovenda()));
             foto2.setIcon(produ.get(1).getFoto());
             setTam(1);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome2.setText("");
             descricao2.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco2.setText("");
             foto2.setIcon(null);
         }
         try{
             nome3.setText(produ.get(2).getNome());
             descricao3.setText(produ.get(2).getDescricao());
             preco3.setText("POR APENAS R$: "+Float.toString(produ.get(2).getPrecovenda()));
             foto3.setIcon(produ.get(2).getFoto());
             setTam(2);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome3.setText("");
             descricao3.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco3.setText("");
             foto3.setIcon(null);
         }
         try{
             nome4.setText(produ.get(3).getNome());
             descricao4.setText(produ.get(3).getDescricao());
             preco4.setText("POR APENAS R$: "+Float.toString(produ.get(3).getPrecovenda()));
             foto4.setIcon(produ.get(3).getFoto());
             setTam(3);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome4.setText("");
             descricao4.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco4.setText("");
             foto4.setIcon(null);
         }
         try{
             nome5.setText(produ.get(4).getNome());
             descricao05.setText(produ.get(4).getDescricao());
             preco5.setText("POR APENAS R$: "+Float.toString(produ.get(4).getPrecovenda()));
             foto5.setIcon(produ.get(4).getFoto());
             setTam(4);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome5.setText("");
             descricao05.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco5.setText("");
             foto5.setIcon(null);
         }
         try{
             nome6.setText(produ.get(5).getNome());
             descricao6.setText(produ.get(5).getDescricao());
             preco6.setText("POR APENAS R$: "+Float.toString(produ.get(5).getPrecovenda()));
             foto6.setIcon(produ.get(5).getFoto());
    
             setTam(5);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome6.setText("");
             descricao6.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco6.setText("");
             foto6.setIcon(null);
         }
         try{
             nome7.setText(produ.get(6).getNome());
             descricao7.setText(produ.get(6).getDescricao());
             preco7.setText("POR APENAS R$: "+Float.toString(produ.get(6).getPrecovenda()));
             foto7.setIcon(produ.get(6).getFoto());
             setTam(6);
             tam2=tam;
         }
        catch(IndexOutOfBoundsException e){
             nome7.setText("");
             descricao7.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco7.setText("");
             foto7.setIcon(null);
         }
         try{
             nome8.setText(produ.get(7).getNome());
             descricao8.setText(produ.get(7).getDescricao());
             preco8.setText("POR APENAS R$: "+Float.toString(produ.get(7).getPrecovenda()));
             foto8.setIcon(produ.get(7).getFoto());
             setTam(7);
             tam2=tam;
         }
        catch(IndexOutOfBoundsException e){
             nome8.setText("");
             descricao8.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco8.setText("");
             foto8.setIcon(null);
         }
         try{
             nome9.setText(produ.get(8).getNome());
             descricao9.setText(produ.get(8).getDescricao());
             preco9.setText("POR APENAS R$: "+Float.toString(produ.get(8).getPrecovenda()));
             foto9.setIcon(produ.get(8).getFoto());
             setTam(8);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome9.setText("");
             descricao9.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco9.setText("");
             foto9.setIcon(null);
         }
         try{
             nome10.setText(produ.get(9).getNome());
             descricao10.setText(produ.get(9).getDescricao());
             preco10.setText("POR APENAS R$: "+Float.toString(produ.get(9).getPrecovenda()));
             foto10.setIcon(produ.get(9).getFoto());
             setTam(9);
             tam2=tam;
         }
         catch(IndexOutOfBoundsException e){
             nome10.setText("");
             descricao10.setText("SEM MAIS PRODUTOS DISPONIVEIS NO MOMENTO");
             preco10.setText("");
             foto10.setIcon(null);
         }
    }//GEN-LAST:event_pesquisarActionPerformed

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        if(tam==tam2)
            con.insereCarrinho(con.getIdProduto(produ.get(1).getNome(),produ.get(1).getDescricao(),produ.get(1).getPrecovenda()),getIdPessoa());
        else
            con.insereCarrinho(con.getIdProduto(produ.get(tam2+2).getNome(),produ.get(tam2+2).getDescricao(),produ.get(tam2+2).getPrecovenda()),getIdPessoa());
        JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO AO CARRINHO");
    }//GEN-LAST:event_add2ActionPerformed

    private void add6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add6ActionPerformed
        if(tam==tam2)
            con.insereCarrinho(con.getIdProduto(produ.get(5).getNome(),produ.get(5).getDescricao(),produ.get(5).getPrecovenda()),getIdPessoa());
        else
            con.insereCarrinho(con.getIdProduto(produ.get(tam2+6).getNome(),produ.get(tam2+6).getDescricao(),produ.get(tam2+6).getPrecovenda()),getIdPessoa());
        JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO AO CARRINHO");
    }//GEN-LAST:event_add6ActionPerformed

    private void add9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add9ActionPerformed
        if(tam==tam2)
            con.insereCarrinho(con.getIdProduto(produ.get(8).getNome(),produ.get(8).getDescricao(),produ.get(8).getPrecovenda()),getIdPessoa());
        else
            con.insereCarrinho(con.getIdProduto(produ.get(tam2+9).getNome(),produ.get(tam2+9).getDescricao(),produ.get(tam2+9).getPrecovenda()),getIdPessoa());
        JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO AO CARRINHO");
    }//GEN-LAST:event_add9ActionPerformed

    private void add8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add8ActionPerformed
        if(tam==tam2)
            con.insereCarrinho(con.getIdProduto(produ.get(7).getNome(),produ.get(7).getDescricao(),produ.get(7).getPrecovenda()),getIdPessoa());
        else
            con.insereCarrinho(con.getIdProduto(produ.get(tam2+8).getNome(),produ.get(tam2+8).getDescricao(),produ.get(tam2+8).getPrecovenda()),getIdPessoa());
        JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO AO CARRINHO");
    }//GEN-LAST:event_add8ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Carrinho(getIdPessoa()).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void carrinho2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrinho2MouseClicked
        new Carrinho(getIdPessoa()).setVisible(true);
        dispose();
    }//GEN-LAST:event_carrinho2MouseClicked

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        if(tam==tam2)
            con.insereCarrinho(con.getIdProduto(produ.get(0).getNome(),produ.get(0).getDescricao(),produ.get(0).getPrecovenda()),getIdPessoa());
        else
            con.insereCarrinho(con.getIdProduto(produ.get(tam2+1).getNome(),produ.get(tam2+1).getDescricao(),produ.get(tam2+1).getPrecovenda()),getIdPessoa());
        JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO AO CARRINHO");
    }//GEN-LAST:event_add1ActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        if(tam==tam2)
            con.insereCarrinho(con.getIdProduto(produ.get(2).getNome(),produ.get(2).getDescricao(),produ.get(2).getPrecovenda()),getIdPessoa());
        else
            con.insereCarrinho(con.getIdProduto(produ.get(tam2+3).getNome(),produ.get(tam2+3).getDescricao(),produ.get(tam2+3).getPrecovenda()),getIdPessoa());
        JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO AO CARRINHO");
    }//GEN-LAST:event_add3ActionPerformed

    private void add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add4ActionPerformed
        if(tam==tam2)
            con.insereCarrinho(con.getIdProduto(produ.get(3).getNome(),produ.get(3).getDescricao(),produ.get(3).getPrecovenda()),getIdPessoa());
        else
            con.insereCarrinho(con.getIdProduto(produ.get(tam2+4).getNome(),produ.get(tam2+4).getDescricao(),produ.get(tam2+4).getPrecovenda()),getIdPessoa());
        JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO AO CARRINHO");
    }//GEN-LAST:event_add4ActionPerformed

    private void add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add5ActionPerformed
        if(tam==tam2)
            con.insereCarrinho(con.getIdProduto(produ.get(4).getNome(),produ.get(4).getDescricao(),produ.get(4).getPrecovenda()),getIdPessoa());
        else
            con.insereCarrinho(con.getIdProduto(produ.get(tam2+5).getNome(),produ.get(tam2+5).getDescricao(),produ.get(tam2+5).getPrecovenda()),getIdPessoa());
        JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO AO CARRINHO");
    }//GEN-LAST:event_add5ActionPerformed

    private void add7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add7ActionPerformed
        if(tam==tam2)
            con.insereCarrinho(con.getIdProduto(produ.get(6).getNome(),produ.get(6).getDescricao(),produ.get(6).getPrecovenda()),getIdPessoa());
        else
            con.insereCarrinho(con.getIdProduto(produ.get(tam2+7).getNome(),produ.get(tam2+7).getDescricao(),produ.get(tam2+7).getPrecovenda()),getIdPessoa());
        JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO AO CARRINHO");
    }//GEN-LAST:event_add7ActionPerformed

    private void add10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add10ActionPerformed
        if(tam==tam2)
            con.insereCarrinho(con.getIdProduto(produ.get(9).getNome(),produ.get(9).getDescricao(),produ.get(9).getPrecovenda()),getIdPessoa());
        else
            con.insereCarrinho(con.getIdProduto(produ.get(tam2+10).getNome(),produ.get(tam2+10).getDescricao(),produ.get(tam2+10).getPrecovenda()),getIdPessoa());
        JOptionPane.showMessageDialog(null, "PRODUTO ADICIONADO AO CARRINHO");
    }//GEN-LAST:event_add10ActionPerformed
    public JLabel getNome(){
        return nome;
    }
    
    public void setIdPessoa(int id){
        this.id=id;
    }
    public int getIdPessoa(){
        return id;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    private int id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1;
    private javax.swing.JButton add10;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton add4;
    private javax.swing.JButton add5;
    private javax.swing.JButton add6;
    private javax.swing.JButton add7;
    private javax.swing.JButton add8;
    private javax.swing.JButton add9;
    private javax.swing.JButton ant;
    private javax.swing.JLabel carrinho;
    private javax.swing.JLabel carrinho2;
    private javax.swing.JTextArea descricao05;
    private javax.swing.JTextArea descricao1;
    private javax.swing.JTextArea descricao10;
    private javax.swing.JTextArea descricao2;
    private javax.swing.JTextArea descricao3;
    private javax.swing.JTextArea descricao4;
    private javax.swing.JTextField descricao5;
    private javax.swing.JTextArea descricao6;
    private javax.swing.JTextArea descricao7;
    private javax.swing.JTextArea descricao8;
    private javax.swing.JTextArea descricao9;
    private javax.swing.JTextField dr;
    private javax.swing.JTextField drg;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto10;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel foto4;
    private javax.swing.JLabel foto5;
    private javax.swing.JLabel foto6;
    private javax.swing.JLabel foto7;
    private javax.swing.JLabel foto8;
    private javax.swing.JLabel foto9;
    private javax.swing.JTextField gzrgdz;
    private javax.swing.JTextField gzrgrg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel mincin;
    private javax.swing.JLabel minhaConta;
    private javax.swing.JLabel minhaConta2;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nome01;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel nome10;
    private javax.swing.JLabel nome2;
    private javax.swing.JLabel nome3;
    private javax.swing.JLabel nome4;
    private javax.swing.JLabel nome5;
    private javax.swing.JLabel nome6;
    private javax.swing.JLabel nome7;
    private javax.swing.JLabel nome8;
    private javax.swing.JLabel nome9;
    private javax.swing.JTextField pesq;
    private javax.swing.JButton pesquisar;
    private javax.swing.JLabel preco1;
    private javax.swing.JLabel preco10;
    private javax.swing.JLabel preco2;
    private javax.swing.JLabel preco3;
    private javax.swing.JLabel preco4;
    private javax.swing.JLabel preco5;
    private javax.swing.JLabel preco6;
    private javax.swing.JLabel preco7;
    private javax.swing.JLabel preco8;
    private javax.swing.JLabel preco9;
    private javax.swing.JButton prox;
    private javax.swing.JTextField rggrd;
    private javax.swing.JTextField th;
    private javax.swing.JTextField z;
    private javax.swing.JTextField zgrrg;
    private javax.swing.JTextField zr;
    // End of variables declaration//GEN-END:variables
}
