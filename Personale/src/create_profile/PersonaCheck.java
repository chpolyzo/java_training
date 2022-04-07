package create_profile;


public class PersonaCheck {

    public static void main(String[] args) {

        Persona sally = new Volontari("Sally", "Phillips","Via Indipendenza", "3894245687", "chpolyzo@hmail.com");
        System.out.println(sally);

        Persona mike = new Impiegati("Mike", "Thompson", "Via della Republica", "6936528582", "mike@domain.com", "MIKTRY835678Y", 2000.0, 500.0);
        System.out.println(mike);
    }

}