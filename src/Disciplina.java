public class Disciplina {
    private ICalcMedia calcMedia;
    private String Nome;
    private double Media, P1, P2;

    public Disciplina(ICalcMedia calcMedia){
        this.calcMedia = calcMedia;
    }

    public void CalculoMedia() {
        this.Media = calcMedia.CalcMedia(P1, P2);
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSituacao() {
        return calcMedia.Situacao(Media);
    }

    public double getMedia() {
        return Media;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        P2 = p2;
    }


}
