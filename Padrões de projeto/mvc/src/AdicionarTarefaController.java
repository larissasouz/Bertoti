public class AdicionarTarefaController {
    private ListaTarefasModel listaTarefas;

    public AdicionarTarefaController(ListaTarefasModel listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    public void adicionarTarefa(String descricao) {
        TarefaModel novaTarefa = new TarefaModel(descricao);
        listaTarefas.adicionarTarefa(novaTarefa);
    }

    public void marcarComoConcluida(TarefaModel tarefa) {
        tarefa.setConcluida(true);
        listaTarefas.notificarObservers();
    }
}
