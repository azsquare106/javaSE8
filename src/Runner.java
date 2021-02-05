public class Runner {

    public static void main(String[] args) {


       Persona persona = new Persona();
       persona.setNombrePersona("Pedro");
       persona.setEdad(30);
       persona.setApellido("Marmol");
       persona.setGenero("Hombre");
       //persona.mayoriaEdad();
       System.out.println("La persona con nombre "+persona.getNombrePersona()+ " y apellido "+persona.getApellido()+" tiene "+persona.getEdad()+ " años y "+persona.mayorOmenor());



       Persona persona2 = new Persona();
       persona2.setNombrePersona("Carlos");
       persona2.setEdad(31);
       persona2.setApellido("Nieblas");
       persona2.setGenero("Hombre");
       //persona2.mayoriaEdad();
        System.out.println("La persona con nombre "+persona2.getNombrePersona()+ " y apellido "+persona2.getApellido()+" tiene "+persona2.getEdad()+ " años y"+persona2.mayorOmenor());


        //  System.out.println(persona.getName());
        // System.out.println(otraPersona.getName());

       // Operation2 oper = new Operation2();
        //oper.setNum1(-20);
        //oper.sumar();

        Casa casa = new Casa();
        casa.setNumberOfRooms(10);
        casa.setColorDeCasa("Negro");

        casa.getSize();
        System.out.println("El numero de habitaciones del objeto casa es :"+casa.getNumberOfRooms());
        casa.getCaracteristicasDeFamilia();
        casa.caracteristicaCasa();

        System.out.println("El color de la casa es: "+casa.getColorDeCasa());






    }

}
