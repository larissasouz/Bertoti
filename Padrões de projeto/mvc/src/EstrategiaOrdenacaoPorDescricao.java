import java.util.Collections;
import java.util.List;

public class EstrategiaOrdenacaoPorDescricao implements EstrategiaOrdenacaoTarefas {
    @Override
    public void ordenar(List<TarefaModel> tarefas) {
        Collections.sort(tarefas, (t1, t2) -> t1.getDescricao().compareToIgnoreCase(t2.getDescricao()));
    }
}
