package objectsClasses;

import javax.swing.*;
import java.util.ArrayList;

public class Consulta {

    private String data;
    private Paciente paciente;

    private ArrayList<Medico> medico = new ArrayList<Medico>();

    public Consulta(String data, Paciente paciente, ArrayList<Medico> medico) {
        this.data = data;
        this.paciente = paciente;
        this.medico = medico;

    }

    public Medico buscarMedicoPorEspecialidade(String especialidade) {
        for (Medico value : this.medico) {
            if (especialidade.equals(value.getEspecialidade())) {
                return value;
            }
        }
        return null;
    }

    public void marcarConsulta(Medico medico) {
        JOptionPane alert = new JOptionPane();
        String text = paciente.getNome() + " tem uma consulta com o doutor "
                + medico.getNomeMedico() + " no dia " + data;
        JOptionPane.showMessageDialog(alert, text);

    }
}

