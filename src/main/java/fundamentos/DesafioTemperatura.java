package fundamentos;

public class DesafioTemperatura {
    static void main() {

        final double FATOR = 5.0/9.0;
        final double AJUSTE = 32;
        double fahrenheit = 86;
        double celsius = (fahrenheit - 32) * FATOR;

        System.out.println("O Resultado é: " + celsius + "°C");

        fahrenheit = 150;
        celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println("O Resultado é: " + celsius + "°C");
    }
}


