import objectsClasses.Consulta;
import objectsClasses.Medico;
import objectsClasses.Paciente;

import javax.swing.*;
import java.util.ArrayList;

public class Clinica {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Larissa Souza", "99999999999", "012965892314");
        Medico m1 = new Medico("Viper Beryl","Clinico Geral");
        Medico m2 = new Medico("Zeka Meiko", "Cardiologista");
        Medico m3 = new Medico("Casimiro Miguel", "Neurologista");
        Medico m4 = new Medico("Scout Deft", "Pediatra");
        ArrayList<Medico> medicos = new ArrayList<Medico>();
        medicos.add(m1);
        medicos.add(m2);
        medicos.add(m3);
        medicos.add(m4);
        Consulta c1 = new Consulta("10/10/2022", p1, medicos);
        Medico especialista = c1.buscarMedicoPorEspecialidade("Pediatra");
        if (especialista != null){
            c1.marcarConsulta(especialista);
        }else {
            JOptionPane alert = new JOptionPane();
            String text = "Não temos médico dessa especialidade. ";
            JOptionPane.showMessageDialog(alert, text);
        }

    }
}
