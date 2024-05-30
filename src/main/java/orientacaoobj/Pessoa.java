package orientacaoobj;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private String sexo;

    void mudarNome(String novoNome){
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
