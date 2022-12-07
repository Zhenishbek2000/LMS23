import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        int[]massive=new int[10];
        ArrayList<Integer>arrayList=new ArrayList<>();
        LinkedList<Integer>linkedList=new LinkedList<>();
        for (int i = 0; i <10; i++) {
            massive[i]=random.nextInt(0,2);
            arrayList.add( random.nextInt(0,2));
            linkedList.add(random.nextInt(0,2));

        }
        sort(massive);
        sort(arrayList);
        sort(linkedList);
    }
    public static void sort(int[]massive){
        Arrays.sort(massive);
        for (int i : massive) {
            System.out.print(i+"  ");
        }
    }
    public static void sort(ArrayList<Integer>arrayList){
        Collections.sort(arrayList);
        for (Integer integer : arrayList) {
            System.out.println(integer+"  ");
        }
    }
    public static void sort(LinkedList<Integer>linkedList){
        Collections.sort(linkedList);
        for (Integer integer : linkedList) {
        }
            System.out.println(linkedList+"  ");
    }
}