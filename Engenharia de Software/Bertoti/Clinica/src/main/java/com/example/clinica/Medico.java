public class Medico {

    private String nomeMedico;
    private String especialidade;

    public Medico(String nomeMedico, String especialidade) {
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
    }

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