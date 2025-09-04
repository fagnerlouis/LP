package CalculoMedia;

public class CalculoMedia {

    public static double calcular(double p1, double e1, double e2, double api, double sub, double x) {
        // 1. nota base
        double notaBase = (p1 * 0.5) + (e1 * 0.2) + (e2 * 0.3) + x + (sub * 0.15);

        // 2. média final
        if (notaBase > 5.9) {
            return (notaBase * 0.5) + (api * 0.5);
        } else {
            return (notaBase * 0.5);
        }
    }
}
