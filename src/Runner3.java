public class Runner3 {

    public static void main(String[] args) {

        Operation3 o1 = new Operation3();
        o1.setNum1(10);
        o1.setNum2(4);
        System.out.println(o1.getContador());

        int resultado =o1.suma(o1.getNum1(),o1.getNum2());
        System.out.println(resultado);

        Operation3 o2 = new Operation3();
        o2.setNum1(11);
        o2.setNum2(5);
        System.out.println(o2.getContador());

        int resultado2 =o2.suma(o1.getNum1(),o1.getNum2());
        System.out.println(resultado2);

        int resultadoVariebleStatica=Operation3.getContador();
        System.out.println(resultadoVariebleStatica);



    }
}
