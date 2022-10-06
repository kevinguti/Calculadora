//Pablo Enrique Delgadillo Fernandez
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
       
        Scanner teclado= new Scanner(System.in);
        dividir();
    }
    
     public static void dividir(){
     Scanner teclado = new Scanner(System.in);
     float num1,num2,divide;
     
        System.out.println("Ingrese Primer Número:");
        num1= teclado.nextInt();
        System.out.println("Ingrese Segundo Número:");
        num2= teclado.nextInt();
        divide= num1/num2;
        
        System.out.println("La División es:" +divide);
}
}