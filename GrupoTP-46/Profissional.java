import java.time.LocalDate;

public class Profissional extends Utilizador {
    public Profissional() {
        super();
    }

    public Profissional(String email, String codigo, String nome, String morada, char genero, double altura, double peso, LocalDate dataNasc, double freqCardio, String tipo) {
        super(email, codigo, nome, morada, genero, altura, peso, dataNasc, freqCardio, tipo);
    }

    @Override
    public double calcularFator() {
        return 1.2 * (getFreqCardio() / 50);
    }
    
    @Override
    public Profissional clone() {
        return new Profissional(getEmail(), getCodigo(), getNome(), getMorada(), getGenero(), getAltura(), getPeso(), getDataNasc(), getFreqCardio(), getTipo());
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
