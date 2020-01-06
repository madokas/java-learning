public class Sample5_4 {
    public static void main(String[] args) {

    }
}

class Test2 {
    String myPrint(int a, String b) { return "test"; }
    String myPrint(int a, int b) { return "test"; }
    String myPrint(String a, int b) { return "test"; }
    //void myPrint(int a, String b) { }
    //String myPrint(int x, String y) { return "test; }
}
