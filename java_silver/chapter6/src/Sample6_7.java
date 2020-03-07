class Super3 {
    public Super3() { System.out.println("Super()"); }
    public Super3(int a) { System.out.println("Super(int a)"); }
}
class Sub3 extends Super3 {
    public Sub3() { System.out.println("Sub()"); }
    public Sub3(int a) {
        super(a);
        System.out.println("Sub(int a)"); }
}
class Sample6_7 {
    public static void main(String[] args) {
        Sub3 s1 = new Sub3();
        Sub3 s2 = new Sub3(10);
    }
}
