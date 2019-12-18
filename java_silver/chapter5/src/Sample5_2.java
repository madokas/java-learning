class Employee1 {
    int id;
    void setId(int i) {
        id = i;
    }
    int getId() {
        return id;
    }
}

class Sample5_2 {
    public static void main(String[] args) {
        //Aさん用オブジェクトを作成
        Employee1 a = new Employee1();
        //IDをセットする
        a.setId(100);
        //Bさん用オブジェクトを作成
        Employee1 b = new Employee1();
        //IDをセットする
        b.setId(200);

        //それぞれのIDの表示
        System.out.println("Aさん：" + a.getId());
        System.out.println("Bさん：" + b.getId());
    }
}
