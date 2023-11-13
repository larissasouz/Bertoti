import java.util.List;

public class TelaListaTarefasView implements ObserverTarefa {
    private ListaTarefasModel listaTarefas;

    public TelaListaTarefasView(ListaTarefasModel listaTarefas) {
        this.listaTarefas = listaTarefas;
        listaTarefas.addObserver(this);
    }

    public void mostrarTarefas() {
        List<TarefaModel> tarefas = listaTarefas.getTarefas();
        for (TarefaModel tarefa : tarefas) {
            System.out.println("Descrição: " + tarefa.getDescricao() + ", Concluída: " + tarefa.isConcluida());
        }
    }

    @Override
    public void atualizar(ListaTarefasModel listaTarefas) {
        System.out.println("\nLista de Tarefas atualizada!");
        mostrarTarefas();
    }
}
