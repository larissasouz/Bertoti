public class Main {
    public static void main(String[] args) {
        // Criando instâncias das classes principais para tarefas
        ListaTarefasModel listaTarefas = new ListaTarefasModel();
        TelaListaTarefasView telaListaTarefas = new TelaListaTarefasView(listaTarefas);
        AdicionarTarefaController adicionarTarefaController = new AdicionarTarefaController(listaTarefas);

        // Adicionando algumas tarefas
        adicionarTarefaController.adicionarTarefa("Estudar Java");
        adicionarTarefaController.adicionarTarefa("Fazer exercícios");
        adicionarTarefaController.adicionarTarefa("Reunião de trabalho");

        // Exibindo a lista de tarefas (deve ser atualizada automaticamente)
        System.out.println("\nLista de Tarefas Inicial:");
        telaListaTarefas.mostrarTarefas();

        // Marcando uma tarefa como concluída
        adicionarTarefaController.marcarComoConcluida(listaTarefas.getTarefas().get(0));

        // Exibindo a lista de tarefas após a marcação
        System.out.println("\nLista de Tarefas Após Marcação:");
        telaListaTarefas.mostrarTarefas();
    }
}