import java.time.LocalDateTime;

public class Pessoa {

    private String nome;
    private String telefone;
    private String dataNasc;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataUltAlt;

    public Pessoa() {

    }

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
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public LocalDateTime getDataUltAlt() {
        return dataUltAlt;
    }
    public void setDataUltAlt(LocalDateTime dataUltAlt) {
        this.dataUltAlt = dataUltAlt;
    }

}
