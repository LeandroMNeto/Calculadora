public class CalculadoraCientifica extends Calculadora {

    @Override
    public void calcular(String operacao, double num1, double num2) {
        switch (operacao) {
            case "soma":
                setResultado(num1 + num2);
                break;
            case "subtracao":
                setResultado(num1 - num2);
                break;
            case "multiplicacao":
                setResultado(num1 * num2);
                break;
            case "divisao":
                if (num2 !=0) {
                } else {
                    System.out.println("Erro: Divisao por zero.");
                }
                break;
            case "seno":
                setResultado(Math.sin(Math.toRadians(num1))); // Seno em radianos
                break;
            case "cosseno":
                setResultado(Math.cos(Math.toRadians(num1))); // Cosseno em radianos
                break;
            case "tangente":
                setResultado(Math.tan(Math.toRadians(num1))); // Tangente em radianos
                break;
            case "logaritmo":
                if (num1 > 0) {
                    setResultado(Math.log(num1)); // Logaritmo natural
                } else {
                    System.out.println("Erro: O número deve ser maior que zero para calcular o logaritmo.");
                }
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
