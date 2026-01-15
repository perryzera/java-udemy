package m05_poo.ex.ex03;

public class aluno {
    public String name;
    public double n1, n2, n3;

    public double nf() {
        return n1 + n2 + n3;
    }
    public void result(double media) {
        media = 100 - nf();
    }

    public String toString() {
        return "Final Grade = "
                + String.format("%.2f%n", nf());

    }

}
