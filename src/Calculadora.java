public abstract class Calculadora {
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public abstract void calcular(String operacao, double num1, double num2);
}
