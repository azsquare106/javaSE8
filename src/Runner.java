public class Runner {

    public static void main(String[] args) {


        Persona persona = new Persona("Carlos");



        Persona otraPersona = new Persona();
        otraPersona.setName("Paty");


        System.out.println(persona.getName());
        System.out.println(otraPersona.getName());


    }

}
