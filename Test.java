
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own

    public Test()
    {

    }

    public void testSumValuesInterval(){
        Calculadora calculadora1 = new Calculadora(5);
        calculadora1.sumValuesInterval(2,10);//Si el resultado de la suma supera 10 seria erroneo
        System.out.println("la suma "+(5+2)+"es  "+7);
        calculadora1.sumValuesInterval(1,10);
        System.out.println("la suma "+(5+1)+"es  "+6);
        calculadora1.sumValuesInterval(3,10);
        System.out.println("la suma "+(5+3)+"es  "+8);
        calculadora1.sumValuesInterval(6,10);
        System.out.println("la suma "+(5+6)+"es ---- ERROR");
        calculadora1.sumValuesInterval(-2,10);
        System.out.println("la suma "+(5+2)+"es  "+3);

    }

    public void testIsPrime(){
        Calculadora calculadora1 = new Calculadora(6);
        calculadora1.isPrime(2);
        System.out.println("El numero "+2+" RESULTADO ------------------"+calculadora1.isPrime(2));
        calculadora1.isPrime(3);
        System.out.println("El numero "+3+" RESULTADO -------------"+calculadora1.isPrime(3));
        calculadora1.isPrime(4);
        System.out.println("El numero "+4+" RESULTADO -------------------- "+calculadora1.isPrime(4));

    }
}
