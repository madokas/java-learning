public class Sample5_7 {
    public static void main(String[] args) {
        //System.out.println(Sample5_6.instanceVal);
        System.out.println(Sample5_6.staticVal);
        //Sample5_6.methodA();
        Sample5_6.methodB();
        System.out.println("------------------");
        Sample5_6 obj = new Sample5_6();
        System.out.println(obj.instanceVal);
        System.out.println(obj.staticVal);
        obj.methodA();
        obj.methodB();
    }
}
