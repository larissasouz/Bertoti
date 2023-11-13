import java.util.ArrayList;
import java.util.List;

public class ListaTarefasModel {
    private List<TarefaModel> tarefas = new ArrayList<>();
    private List<ObserverTarefa> observers = new ArrayList<>();

    public void adicionarTarefa(TarefaModel tarefa) {
        tarefas.add(tarefa);
        notificarObservers();
    }

    public List<TarefaModel> getTarefas() {
        return tarefas;
    }

    public void addObserver(ObserverTarefa observer) {
        observers.add(observer);
    }

    public void notificarObservers() {
        for (ObserverTarefa observer : observers) {
            observer.atualizar(this);
        }
    }
}
