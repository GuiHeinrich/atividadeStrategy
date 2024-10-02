public class Main {
    public static void main(String[] args) {
        Aritmetica calculoArit = new Aritmetica();
        Geometrica calculoGeo = new Geometrica();

        Disciplina d = new Disciplina(calculoArit);

        d.setNome( "Padrões de Desenvolvimento");
        d.setP1(7); d.setP2(9);
        d.CalculoMedia();
        System.out.printf("P1:%.2f P2:%.2f Média do aluno:%.2f Situação: %s%n",
                d.getP1(),d.getP2(), d.getMedia(), d.getSituacao());

        Disciplina e = new Disciplina(calculoGeo);
        e.setNome( "Padrões de Desenvolvimento");
        e.setP1(3); e.setP2(9);
        e.CalculoMedia();
        System.out.printf("P1:%.2f P2:%.2f Média do aluno:%.2f Situação: %s%n",
                e.getP1(),e.getP2(), e.getMedia(), e.getSituacao());
    }
}
