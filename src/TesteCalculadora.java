public class TesteCalculadora {
    public static void main(String[] args) {

        CalculadoraSimples calcSimples = new CalculadoraSimples();
        System.out.println("Calculadora Simpls:");
        calcSimples.calcular("soma", 14, 5);
        System.out.println("Resultado da soma: " + calcSimples.getResultado());

        calcSimples.calcular("divisao", 7, 2);
        System.out.println("Resultado da divisão: " + calcSimples.getResultado());

        calcSimples.calcular("multiplicacao", 8, 6);
        System.out.println("Resultado da multiplicação: " + calcSimples.getResultado());

        calcSimples.calcular("divisao", 10, 2); // Testando divisão por zero
        System.out.println("Resultado da divisão por zero: " + calcSimples.getResultado());

        // Testando a Calculadora Científica
        CalculadoraCientifica calcCientifica = new CalculadoraCientifica();
        System.out.println("\nCalculadora Científica:");
        calcCientifica.calcular("seno", 45, 0);
        System.out.println("Resultado do seno de 30°: " + calcCientifica.getResultado());

        calcCientifica.calcular("logaritmo", 10, 0);
        System.out.println("Resultado do logaritmo de 10: " + calcCientifica.getResultado());

        calcCientifica.calcular("divisao", 10, 4);
        System.out.println("Resultado da divisão: " + calcCientifica.getResultado());
    }
}
