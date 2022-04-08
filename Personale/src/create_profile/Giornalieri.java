package create_profile;

import java.util.Objects;

import static java.lang.Double.sum;

public class Giornalieri extends Dipendenti{
    protected Double giornaliero;

    public Giornalieri(String nome, String cognome, String indirizzo, String telefono, String email, String codiceFiscale, Double baseRetribuzione, Double giornaliero) {
        super(nome, cognome, indirizzo, telefono, email, codiceFiscale, baseRetribuzione);
        this.giornaliero = giornaliero;
    }

    public Double sum;

    public Double calcolaPaga(){return sum = sum(baseRetribuzione, giornaliero);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Giornalieri that = (Giornalieri) o;
        return Objects.equals(giornaliero, that.giornaliero) && Objects.equals(sum, that.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), giornaliero, sum);
    }

    @Override
    public String toString() {
        return "Giornalieri{" +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", baseRetribuzione=" + baseRetribuzione +
                ", giornaliero=" + giornaliero +
                ", sum=" + calcolaPaga() +
                '}';
    }
}
