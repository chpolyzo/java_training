package create_profile;


public class PersonaCheck {

    public static void main(String[] args) {

        Persona lorena = new Volontari("Lorena", "Phillippa","Via Indipendenza", "3894245687", "lorena@hmail.com");
        System.out.println(lorena);

        Persona ornella = new Impiegati("Ornella", "Tabacco", "Via della Republica", "6936528582", "ornella@domain.com", "MIKTRY835678Y", 200.0, 500.0);
        System.out.println(ornella);

        Persona teresa = new Giornalieri("Teresa", "Capello", "Via Tiburtina", "3394599432", "teresa@domain.com", "TERCAP835678Y", 300.0, 20.0);
        System.out.println(teresa);
    }

}