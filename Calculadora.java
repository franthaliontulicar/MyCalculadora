
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    // instance variables - replace the example below with your own

    public Calculadora(){
    }

    public void multiplesOfFive(){
        int numero = 5;//Al pedir multiplo de  cinco uno de los multiplicadores debera ser 5
        int multi = 0;//Corresponde al valor por el cual multiplicamos
        while((numero*multi)<95){

            if((numero*multi)>10){
                System.out.println(numero+" x "+multi+" = "+(numero*multi));
            }

            multi++;
        }

    }

    public void sumValues(){
        int num = 0;//introducimos el primer sumando
        int sum = 0;//introducimos elsegundo sumando
        while(num <= 10){
            sum = sum + num;
            sum++;
        }
        System.out.println("la suma de los valores entre 0 y 10 es "+sum);
    }

    public void sumValuesInterval(int a, int b){
        int num = 0;
        int sum = 0;

        while((num +a) < b){
            sum = sum + (num + a);
            sum++;

        }

        System.out.println("la suma de los valores entre "+a+" y "+b+" es "+sum);
    }

    public boolean isPrime(int n){
        boolean primo = false;
        int div = 2;
        while(primo && (div < n - 1)){
            if(n % div !=0){
                primo = true;
            }
            else{
                primo = false;
            
            }
        }
        return (primo);
    }
}
