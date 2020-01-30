class Super2 {
    public Super2() { System.out.println("Super()"); }
    public Super2(int a) { System.out.println("Super(int a)"); }
}
class Sub2 extends Super2 {
    public Sub2() {System.out.println("Sub()"); }
    public Sub2(int a) { System.out.println("Sub(int a)"); }
}
class Sample6_6 {
    public static void main(String[] args) {
        Sub2 s1 = new Sub2();
        Sub2 s2 = new Sub2(10);
    }
}
