package create_profile;

import java.util.Objects;

import static java.lang.Double.sum;

public class Giornalieri extends Dipendenti{

    protected Double paga;
    protected Double giornaliero;

    public Giornalieri(String nome, String cognome, String indirizzo, String telefono, String email, String codiceFiscale, Double baseRetribuzione, Double bonus) {
        super(nome, cognome, indirizzo, telefono, email, codiceFiscale, baseRetribuzione);
        this.giornaliero = giornaliero;
        this.paga = paga;
    }

    public Double sum;

    public Double calcolaPaga(){return sum = sum(paga, giornaliero);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Giornalieri that = (Giornalieri) o;
        return Objects.equals(paga, that.paga) && Objects.equals(giornaliero, that.giornaliero) && Objects.equals(sum, that.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), paga, giornaliero, sum);
    }

    @Override
    public String toString() {
        return "Giornalieri{" +
                "paga=" + paga +
                ", giornaliero=" + giornaliero +
                ", sum=" + sum +
                '}';
    }
}
