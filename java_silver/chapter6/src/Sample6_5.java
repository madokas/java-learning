class Super1 {
    int num;
    public void methodA() { num += 100; }
    public void print() { System.out.println("num値 : " + num); }
}
class Sub1 extends Super1 {
    public void methodA() { num += 500; }
    public void methodB(int num) {
        methodA();          // 7行目が呼び出される
        print();            // スーパークラスのメソッド呼び出し
        super.methodA();    // 3行目が呼び出される
        print();            // スーパークラスのメソッド呼び出し
    }
}
class Sample6_5 {
    public static void main(String[] args) {
        Sub1 s = new Sub1();
        s.methodB(0);
    }
}
