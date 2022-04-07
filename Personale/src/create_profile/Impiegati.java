package create_profile;

import java.util.Objects;

import static java.lang.Double.sum;

public class Impiegati extends Dipendenti{
    protected Double bonus;
    protected Double paga;

    public Impiegati(String nome, String cognome, String indirizzo, String telefono, String email, String codiceFiscale, Double baseRetribuzione, Double bonus) {
        super(nome, cognome, indirizzo, telefono, email, codiceFiscale, baseRetribuzione);
        this.bonus = bonus;
    }


    public Double sum;

    public Double calcolaPaga(){return sum = sum(paga, bonus);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Impiegati impiegati = (Impiegati) o;
        return Objects.equals(bonus, impiegati.bonus) && Objects.equals(paga, impiegati.paga) && Objects.equals(sum, impiegati.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus, paga, sum);
    }

    @Override
    public String toString() {
        return "Impiegati{" +
                "bonus=" + bonus +
                ", paga=" + paga +
                ", sum=" + sum +
                '}';
    }
}
