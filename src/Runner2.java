public class Runner2 {

    public static void main(String[] args) {

        Operation operation1 = new Operation();
        operation1.setX(10);
        operation1.setY(10);

        operation1.sumar(operation1.getX(),operation1.getY());
        operation1.multiplicar(operation1.getX(),operation1.getY());

        Operation operation2 = new Operation();
        operation2.setX(5);
        operation2.setY(6);

        operation2.sumar(operation2.getX(),operation2.getY());
        operation2.multiplicar(operation2.getX(),operation2.getY());

        Operation operation3 = new Operation();
        operation3.sumar(10,5);
        operation3.resta(50,20);



    }
}
