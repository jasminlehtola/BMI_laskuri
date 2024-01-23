public class bmi {

    public static double laskeBMI(Double pituus, Double paino) {
        double tulos = (paino / (pituus * pituus));
        if (!(tulos > 5 && tulos < 250)) {
            throw new IllegalArgumentException("Epäkelvollinen arvo.");
        }
        return tulos;
    }

    public static void main(String[] args) {
        // Anna pituus ja paino laskeBMI-funktiolle
        double pituus = 1.75;
        double paino = 60;

        try {
            Double bmiTulos = laskeBMI(pituus, paino);
            System.out.println("BMI: " + String.format("%.2f", bmiTulos));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}