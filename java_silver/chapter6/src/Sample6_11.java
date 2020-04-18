interface NewInter1 {
    void methodA();
}
class Supers {
    void methodB(){ }
}
class YuimClass extends Supers implements NewInter1 {
    public void methodA(){ }
}