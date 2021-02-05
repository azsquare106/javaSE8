public class Persona {

    private String nombrePersona;
    private int edad;
    private String genero;
    private String apellido;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void mayoriaEdad(){

        if(edad> 18){
            System.out.println("La persona es mayor de edad");
        }else{
            System.out.println("La persona es menor de edad");
        }

    }


    public String mayorOmenor(){

           if(edad>18){
               return "es mayor de edad";
           }else{
               return "no es mayor de edad";
           }
    }

    public int getEdad() {
        return edad;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getApellido() {
        return apellido;
    }
}
