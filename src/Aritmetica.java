public class Aritmetica implements ICalcMedia{

    @Override
    public double CalcMedia(double a, double b) {
        return (a+b)/2;
    }

    @Override
    public String Situacao(double media) {
        return media >= 5.0 ? "Aprovado" : "Reprovado";
    }
}
