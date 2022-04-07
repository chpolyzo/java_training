package create_profile;

import java.util.Objects;

public class Persona {
    protected String nome;
    protected String cognome;
    protected String indirizzo;
    protected String telefono;
    protected String email;

    public Persona(String nome, String cognome, String indirizzo, String telefono, String email) {
        super();
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nome, persona.nome) && Objects.equals(cognome, persona.cognome) && Objects.equals(indirizzo, persona.indirizzo) && Objects.equals(telefono, persona.telefono) && Objects.equals(email, persona.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, indirizzo, telefono, email);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
