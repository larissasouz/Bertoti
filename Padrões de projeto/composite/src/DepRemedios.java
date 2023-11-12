import java.util.ArrayList;
import java.util.List;

class DepRemedios implements Remedio {
    private List<Remedio> remedioList = new ArrayList<>();

    public void add(Remedio remedio) {
        remedioList.add(remedio);
    }

    public void remove(Remedio remedio) {
        remedioList.remove(remedio);
    }

    @Override
    public void insert() {
        System.out.println("Inserindo Remédios no Depósito:");
        for (Remedio remedio : remedioList) {
            remedio.insert();
        }
    }
}
