import java.util.HashMap;
import java.util.Map;

public class Utilizadores {
    private Map<String,Utilizador> users;

    public Utilizadores() {
        this.users = new HashMap<>();
    }

    public Utilizador getUtilizador(String cod) {
        if(!this.users.containsKey(cod)){
            return null;
        }
        return this.users.get(cod).clone();
    }

    public Map<String, Utilizador> getUsers() {
        Map<String, Utilizador> safeCopy = new HashMap<>();
        for (Map.Entry<String, Utilizador> entry : this.users.entrySet()) {
            safeCopy.put(entry.getKey(), entry.getValue().clone());
        }
        return safeCopy;
    }

    public void setUtilizador(Utilizador user) {
            if (user == null) {
            System.out.println("Erro: Utilizador não pode ser nulo.");
            return;
        }
        this.users.put(user.getEmail(), user.clone());
    }
}