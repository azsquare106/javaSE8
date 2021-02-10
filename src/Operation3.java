public class Operation3 {


    private int num1;
    private int num2;

    private static int contador;

    public  static int getContador(){
        return contador = contador + 1;
    }


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    //sumar
    public int suma(int x, int y){
       return x+y;
    }
}
