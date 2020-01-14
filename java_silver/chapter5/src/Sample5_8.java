public class Sample5_8 {
    int instanceVal;
    static int staticVal;

    int methodA() { return instanceVal; }
    int methodB() { return staticVal; }
    //static int methodC() { return instanceVal; }
    static int methodD() { return staticVal; }
    static int methodE() {
        Sample5_8 obj = new Sample5_8();
        return obj.instanceVal;
    }
}
