import java.util.ArrayList;
import java.util.List;

public class GrupoTarefasComposite {
    private String nomeGrupo;
    private List<TarefaModel> tarefasNoGrupo = new ArrayList<>();

    public GrupoTarefasComposite(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public void adicionarTarefa(TarefaModel tarefa) {
        tarefasNoGrupo.add(tarefa);
    }

    public String getNome() {
        return nomeGrupo;
    }

    public List<TarefaModel> getTarefasNoGrupo() {
        return tarefasNoGrupo;
    }
}
