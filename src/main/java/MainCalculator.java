import java.util.Scanner;

public class MainCalculator {
    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        Messages.titulo();
        Messages.mensajeBienvenida();
        Messages.mensajeParaOperar();

        int numero = reader.nextInt();
        ejecutarOperacion(numero);

    }

    private static void ejecutarOperacion(int numero){
        switch (numero){
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                division();
                break;
            case 5:
                raiz();
                break;
        }

    }

    private static void suma(){
        System.out.println("Introduzca un numero para sumar");
        Long num1 = reader.nextLong();
        System.out.println("Introduzca el segundo numero para sumar");
        Long num2 = reader.nextLong();
        Operations.suma(num1,num2);
    }

    private static void resta(){
        System.out.println("Introduzca un numero para restar");
        Long num1 = reader.nextLong();
        System.out.println("Introduzca el segundo numero para restar");
        Long num2 = reader.nextLong();
        Operations.resta(num1,num2);
    }

    private static void multiplicacion(){
        System.out.println("Introduzca un numero para multiplicar");
        Long num1 = reader.nextLong();
        System.out.println("Introduzca el segundo numero para multiplicar");
        Long num2 = reader.nextLong();
        Operations.multiplicacion(num1,num2);
    }

    private static void division(){
        System.out.println("Introduzca el divisor");
        Long num1 = reader.nextLong();
        System.out.println("Introduzca el numero que desee dividir (Dividendo)");
        Long num2 = reader.nextLong();
        Operations.division(num1,num2);
    }

    private static void raiz(){
        System.out.println("Introduzca el numero del que desea saber la raiz cuadrada");
        Long num1 = reader.nextLong();
        Operations.raiz(num1);
    }


}
