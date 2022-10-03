public class Medico {

    //atributos
    private String nomeMedico;
    private String especialidade;

    // construtor
    public Medico(String nomeMedico, String especialidade) {
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
    }

    // get e set
    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}