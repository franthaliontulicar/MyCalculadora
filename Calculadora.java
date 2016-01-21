
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
        int num = 0;
        int sum = 0;
        while(num >= 0 && num <= 10){
            if(sum >= 0 && sum <=10){
                System.out.println(num+" + "+sum+"="+(num+sum));
            }
        }

    }
    
    
}
