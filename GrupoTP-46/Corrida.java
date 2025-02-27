import java.time.LocalDateTime;

public class Corrida extends Atividade {
    private double distancia;        // em km
    private double altimetria;       // em m 

    public Corrida() {
        super();
        this.distancia = 0.0;
        this.altimetria = 0.0;
    }

    public Corrida(Long id, String nome, double caloriasPorHora, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, double duracao, double distancia, double altimetria) {
        super(id, nome, caloriasPorHora, dataHoraInicio, dataHoraFim, duracao, TipoAtividade.DISTANCIA_E_ALTIMETRIA);  
        this.distancia = distancia; 
        this.altimetria = altimetria;
    }
    
    @Override
    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public double getAltimetria() {
        return this.altimetria;
    } 

    public void setAltimetria(double altimetria) {
        this.altimetria = altimetria;
    }

    @Override
    public double calcularCalorias(Utilizador user) {
        double fator = user.calcularFator();
        return (60 * this.getDistancia() * this.getAltimetria() * 0.3 * (user.getPeso() / 70) * fator);
    }

    @Override
    public Corrida clone() {
        return new Corrida(getId(), getNome(), getCaloriasPorHora(), getDataHoraInicio(), getDataHoraFim(), getDuracao(), getDistancia(), getAltimetria());
    }

    @Override
    public String toString() {
        return super.toString() + ", distancia=" + this.getDistancia() + ", altimetria=" + this.getAltimetria();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (getClass() != o.getClass()) return false;
        Corrida corrida = (Corrida) o;
        return Double.compare(corrida.getDistancia(), this.getDistancia()) == 0 && 
        Double.compare(corrida.getDistancia(), this.getDistancia()) == 0;
    }
}
