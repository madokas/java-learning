class Fun {
    String name;
    Fun(String name) { this.name = name; }
}
class Sample7_7 {
    public static void main(String[] args) {
        Fun[] ary = { new Fun("tanaka"), new Fun("suzuki"), new Fun("yamamoto") };
        System.out.println(ary);
        System.out.println(ary[1]);
        System.out.println(ary[1].name);
    }
}


