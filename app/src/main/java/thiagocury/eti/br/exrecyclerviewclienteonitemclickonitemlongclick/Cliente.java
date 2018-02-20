package thiagocury.eti.br.exrecyclerviewclienteonitemclickonitemlongclick;

import java.io.Serializable;

/**
 * Created by thiagocury on 20/11/17.
 */

public class Cliente implements Serializable {

    private String nome;
    private String sexo;
    private double renda;

    public Cliente() {
    }

    public Cliente(String nome, String sexo, double renda) {
        this.nome = nome;
        this.sexo = sexo;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", renda=" + renda +
                '}';
    }

}
