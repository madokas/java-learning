import java.util.*;
class Sample7_9 {
    public static void main(String[] args) {
        int[] i_array = {30,10,20,50,40};

        //arraycopy()メソッドの利用
        int[] copy = new int[3];
        System.arraycopy(i_array,2,copy,0,3);
        for(int val: copy) {
            System.out.print(val + " ");
        }System.out.println();

        //sort()メソッドの利用
        //Arrays.sort(i_array);
        Integer[] integers = new Integer[i_array.length];
        for(int k = 0; k < i_array.length; k++) {
            integers[k] = i_array[k];
        }

//        for(int k : i_array) {
//            System.out.print(k + " ");
//        }
//        integers[0] = i_array[0];
//        integers[1] = i_array[1];
//        integers[2] = i_array[2];
//        integers[3] = i_array[3];
//        integers[4] = i_array[4];

        Arrays.sort(integers,Collections.reverseOrder());
        for (Integer i : integers)
            System.out.print(i + " ");

//        for(int val: i_array) {
//            System.out.print(val + " ");
//        }System.out.println();



        //asList()メソッドの利用
        String[] s_array = {"takana","suzuki","yamada"};
        List<String> list = Arrays.asList(s_array);
        //list.add("sato")
        for(String val: list) {
            System.out.print(val + " ");
        }
    }
}
