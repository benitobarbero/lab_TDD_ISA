public class Operations {

    public long suma(long a, long b) {
        return a + b;
    }


    public long resta(long a, long b) {
        return a - b;
    }

    public long multiplicacion(long a, long b) {
        return a * b;
    }

    public double division(long divisor, long dividendo) {
        return dividendo / divisor;
    }

    public double raiz(long a, long b) {
        long raizAproximada = calculoRaizAproximada(b);
        double result = bakhshali(b,raizAproximada);
        return result;
    }

    private long calculoRaizAproximada(long numCalcularRaiz) {
        long raizAprox = 1;
        long cuadrado = elevar(raizAprox, 2);
        while (cuadrado < numCalcularRaiz) {
            raizAprox++;
            cuadrado = elevar(raizAprox, 2);
        }
        return raizAprox;
    }

    private double bakhshali(long numCalcularRaiz, long raizAprox) {
        double result = ((elevar(raizAprox, 4)) + (6 * elevar(raizAprox, 2) * numCalcularRaiz) + (elevar(numCalcularRaiz, 2))) /
                ((4 * elevar(raizAprox, 3)) + (4 * raizAprox * numCalcularRaiz));
        return result;
    }

    private long elevar(long base, long exponente) {
        long result = base;
        while (exponente > 1) {
            result = result * base;
            exponente--;
        }
        return result;
    }
}
