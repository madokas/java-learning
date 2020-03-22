class Fuu { }

public class Sample7_2 {
    public static void main(String[] args) {
        Fuu f1 = new Fuu(); Fuu f2 = new Fuu();
        System.out.println("fi.equals(f2) : " + (f1.equals(f2)));

        Fuu f3 = new Fuu(); Fuu f4 = f3;
        System.out.println("f3.equals(f4) : " + (f3.equals(f4)));
    }
}
