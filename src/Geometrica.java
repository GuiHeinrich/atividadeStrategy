public class Geometrica implements ICalcMedia{
    @Override
    public double CalcMedia(double a, double b) {
        return Math.sqrt(a * b);
    }

    @Override
    public String Situacao(double media) {
        return media >= 7.0 ? "Aprovado" : "Reprovado";
    }
}
