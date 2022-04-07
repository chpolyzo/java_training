package create_profile;

import java.util.Objects;

public class Volontari extends Persona {

    private int paga;

    public Volontari(String nome, String cognome, String indirizzo, String telefono, String email) {
        super(nome, cognome, indirizzo, telefono, email);
        this.paga = 0;

    }

    public int getPaga() {
        return paga;
    }

    public void setPaga(int paga) {
        this.paga = paga;
    }

    @Override
    public String toString() {
        return "Volontari{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Volontari volontari = (Volontari) o;
        return paga == volontari.paga;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), paga);
    }
}
