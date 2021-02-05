/*
  Esta clase representa una operación matematica con 2 numeros x, y.
 */
public class Operation {


    private int x; //Numero 1
    private int y; //Numero 2

    //Getter and Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x == 10){
            System.out.println("No se colocara ningun valor en la variable x");
        }else{
            this.x = x;
        }

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    //Operación sumar
    public void sumar(int xxx, int yyy){
        System.out.println(x+y);
    }

    //Operacion multiplicar
    public void multiplicar(int x, int y){
        System.out.println(x*y);
    }

    public void resta(int a, int b){
        System.out.println(a-b);
    }

}
