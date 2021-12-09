import java.util.Date;

public class Pessoa {

    private String nome;
    private String telefone;
    private Date dataNasc;
    private Date dataCadastro;
    private Date dataUltAlt;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataUltAlt() {
        return dataUltAlt;
    }

    public void setDataUltAlt(Date dataUltAlt) {
        this.dataUltAlt = dataUltAlt;
    }
}
