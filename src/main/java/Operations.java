public class Operations {

    public static long suma(long a, long b) {
        return a + b;
    }


    public static long resta(long a, long b) {
        return a - b;
    }

    public static long multiplicacion(long a, long b) {
        return a * b;
    }

    public static double division(long divisor, long dividendo) {
        return dividendo / divisor;
    }

    public static double raiz(long numCalcularRaiz) {
        long raizAproximada = calculoRaizAproximada(numCalcularRaiz);
        return bakhshali(numCalcularRaiz,raizAproximada);
    }

    private static long calculoRaizAproximada(long numCalcularRaiz) {
        long raizAprox = 1;
        long cuadrado = elevar(raizAprox, 2);
        while (cuadrado < numCalcularRaiz) {
            raizAprox++;
            cuadrado = elevar(raizAprox, 2);
        }
        return raizAprox;
    }

    private static double bakhshali(long numCalcularRaiz, long raizAprox) {
        return ((elevar(raizAprox, 4)) + (6 * elevar(raizAprox, 2) * numCalcularRaiz) + (elevar(numCalcularRaiz, 2))) /
                ((4 * elevar(raizAprox, 3)) + (4 * raizAprox * numCalcularRaiz));
    }

    private static long elevar(long base, long exponente) {
        long result = base;
        while (exponente > 1) {
            result = result * base;
            exponente--;
        }
        return result;
    }
}
