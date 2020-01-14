class Employee3 {
    //インスタンス変数にprivate修飾子を指定
    private int id;

    //コンストラクタにpublic修飾子を指定
    public Employee3(int i) { id = i; }

    //メソッドにpublic修飾子を指定
    public int getId() { return id; }
}

public class Sample5_10 {
    public static void main(String[] args) {
        Employee3 emp = new Employee3(100);

        //private指定されたメンバは、他クラスからアクセス不可
        //System.out.println(
            //"private指定のインスタンス変数へアクセス：" + emp.id);
        //public指定されたメンバは、他クラスからアクセス可
        System.out.println(
                "public指定のメソッドへアクセス：" + emp.getId());
    }
}
