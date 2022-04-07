package create_profile;

import java.util.Objects;

public class Dipendenti extends Persona{

    protected String codiceFiscale;
    protected Double baseRetribuzione;


    public Dipendenti(String nome, String cognome, String indirizzo, String telefono, String email, String codiceFiscale, Double baseRetribuzione) {
        super(nome, cognome, indirizzo, telefono, email);
        this.codiceFiscale = codiceFiscale;
        this.baseRetribuzione = baseRetribuzione;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dipendenti that = (Dipendenti) o;
        return Objects.equals(codiceFiscale, that.codiceFiscale) && Objects.equals(baseRetribuzione, that.baseRetribuzione);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codiceFiscale, baseRetribuzione);
    }

    @Override
    public String toString() {
        return "Dipendenti{" +
                "codiceFiscale='" + codiceFiscale + '\'' +
                ", baseRetribuzione=" + baseRetribuzione +
                '}';
    }
}

