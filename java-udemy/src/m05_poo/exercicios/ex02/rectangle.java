package m05_poo.exercicios.ex02;

public class rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * width + 2 * height;
    }
    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
    public String toString(){
        return "AREA = "
                + area()
                + "\nPERIMETER = "
                + perimeter()
                + "\nDIAGONAL = "
                + diagonal();
    }
}
