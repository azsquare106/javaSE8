public class Operation2 {


    private int num1;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int valorIngresado) {

        if(valorIngresado <0){
            System.out.println("No puedo sumar numero negativos");
        }else{
            this.num1 = valorIngresado;
        }

    }

    public void sumar(){
        int valoFijo =10;
        System.out.println(valoFijo+num1);
    }
}
