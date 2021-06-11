
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lindo
 */
public class Produto {
    private String nome;
    private String descricao;
    private float precocusto;
    private float precovenda;
    private ImageIcon foto;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecocusto() {
        return precocusto;
    }

    public void setPrecocusto(float precocusto) {
        this.precocusto = precocusto;
    }

    public float getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(float precovenda) {
        this.precovenda = precovenda;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }
    
}
