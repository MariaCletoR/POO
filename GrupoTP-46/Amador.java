import java.time.LocalDate;

public class Amador extends Utilizador {
    public Amador() {
        super();
    }

    public Amador(String email, String codigo, String nome, String morada, char genero, double altura, double peso, LocalDate dataNasc, double freqCardio, String tipo){
        super(email, codigo, nome, morada, genero, altura, peso, dataNasc, freqCardio, tipo);
    }

    @Override
    public double calcularFator() {
        return 1.0 * (getFreqCardio() / 25);
    }

    @Override
    public Amador clone() {
        return new Amador(getEmail(), getCodigo(), getNome(), getMorada(), getGenero(), getAltura(), getPeso(), getDataNasc(), getFreqCardio(), getTipo());
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
