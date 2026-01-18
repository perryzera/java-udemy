package m05_poo.exercicios.ex04;

public class student {
    public String name;
    public double n1, n2, n3;

    public double media() {
        return n1 + n2 + n3;
    }
    public double rest() {
        if (media() < 60) {
            return 60 - media();
        } else {
            return 0;
        }
    }
}
