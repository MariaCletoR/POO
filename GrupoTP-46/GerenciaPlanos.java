import java.util.Map;
import java.util.HashMap;

public class GerenciaPlanos {
    private Map<Long, PlanoDeTreino> planosDeTreino;

    public GerenciaPlanos() {
        this.planosDeTreino = new HashMap<>();
    }

    public void adicionarPlano(PlanoDeTreino plano) {
        this.planosDeTreino.put(plano.getId(), plano.clone());
    }

    public PlanoDeTreino getPlano(Long id) {
        if (!this.planosDeTreino.containsKey(id)) {
            return null;
        }
        return this.planosDeTreino.get(id).clone();
    }

    public Map<Long, PlanoDeTreino> getPlanos() {
        Map<Long, PlanoDeTreino> safeCopy = new HashMap<>();
        for (Map.Entry<Long, PlanoDeTreino> entry : this.planosDeTreino.entrySet()) {
            safeCopy.put(entry.getKey(), entry.getValue().clone());
        }
        return safeCopy;
    }

    public void setPlano(PlanoDeTreino plano) {
        if (plano == null) {
            System.out.println("Erro: Plano de Treino não pode ser nulo.");
            return;
        }
        this.planosDeTreino.put(plano.getId(), plano.clone());
    }
}
