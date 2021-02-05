public class Casa {

    private int numberOfRooms;
    private String colorDeCasa;


    public void setColorDeCasa(String elColorDeLaCasaQueseMeOcurre) {
        this.colorDeCasa = elColorDeLaCasaQueseMeOcurre;
    }

    public void setNumberOfRooms(int valorDeNuestroObjetoParaColocarEnNumberOfRooms) {
        this.numberOfRooms = valorDeNuestroObjetoParaColocarEnNumberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void getSize(){

        if(numberOfRooms >5){
            System.out.println("El tamñao de la casa es grande");
        }else{
            System.out.println("El tamaño de la casa es chica");
        }

    }

    public void getCaracteristicasDeFamilia(){

        if(numberOfRooms>5){
            System.out.println("La familia es rica");
        }else{
            System.out.println("La familia es pobre");
        }
    }

    public void caracteristicaCasa(){

        if(colorDeCasa.equals("Blanco")){
            System.out.println("La casa es bonita");
        }else{
            System.out.println("La casa es fea");
        }
    }

    public String getColorDeCasa(){
         return colorDeCasa;
    }
}
