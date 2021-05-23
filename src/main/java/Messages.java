public class Messages {
    public static void titulo(){
        System.out.println(" _____         _               _             _                     \n" +
                "/  __ \\       | |             | |           | |                    \n" +
                "| /  \\/  __ _ | |  ___  _   _ | |  __ _   __| |  ___   _ __   __ _ \n" +
                "| |     / _` || | / __|| | | || | / _` | / _` | / _ \\ | '__| / _` |\n" +
                "| \\__/\\| (_| || || (__ | |_| || || (_| || (_| || (_) || |   | (_| |\n" +
                " \\____/ \\__,_||_| \\___| \\__,_||_| \\__,_| \\__,_| \\___/ |_|    \\__,_|");
        System.out.println("Realizado por: Raquel Benito Barbero\n" +
                "Asignatura: Ingeniería del Software Avanzada\n\n");
    }

    public static void mensajeBienvenida(){
        System.out.println("Bienvenido a la calculadora, tiene a su disposición las siguientes operaciones para realizar: ");
        listarOperaciones();
    }

    public static void listarOperaciones(){
        System.out.println("1. Sumar \n" +
                "2. Restar \n" +
                "3. Multiplicar \n" +
                "4. Dividir \n" +
                "5. Cálculo de raiz cuadrada");
    }

    public static void muestraResultado(double result){
        System.out.println("El resultado es: "+result);
    }

    public static void mensajeParaOperar(){
        System.out.println("¿Qué operación desea realizar?");
        listarOperaciones();
        System.out.println("Introduzca un número de operación");
    }

}
