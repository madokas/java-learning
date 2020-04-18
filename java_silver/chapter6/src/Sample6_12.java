interface XIF {
    void methodA();
}
interface YIF {
    void methodB();
}
interface SubIF extends XIF,YIF {
    void methodC();
}
class YuiClass implements SubIF{
    public void methodA() { System.out.println("methodA()"); }
    public void methodB() { System.out.println("methodB()"); }
    public void methodC() { System.out.println("methodC()"); }
}
class Sample6_12 {
    public static void main(String[] args) {
        YuiClass c = new YuiClass();
        c.methodA(); c.methodB(); c.methodC();
    }
}
