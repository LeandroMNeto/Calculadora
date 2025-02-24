public class CalculadoraSimples extends Calculadora {

    @Override
    public void calcular(String operacao, double num1, double num2) {
        switch (operacao) {
            case "soma":
                setResultado(num1 + num2);
                break;
            case "subtracao":
                setResultado(num1-num2);
                break;
            case "multipicacao":
                setResultado(num1 * num2);
                break;
            case "divisao":
                if (num2 !=0) {
                    setResultado(num1 / num2);
                } else {
                    System.out.println("Erro: Divisao por zero");
                }
                break;
            default:
                System.out.println("Operacao Invalida");
        }
    }
}
