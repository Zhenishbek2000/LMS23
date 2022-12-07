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
        System.out.println(Arrays.toString(sort(massive)));
        System.out.println(sort(arrayList));
        System.out.println(sort(linkedList));
    }
    public static int[] sort(int[]massive){
        Arrays.sort(massive);

        return massive;
    }
    public static ArrayList<Integer> sort(ArrayList<Integer>arrayList){
        Collections.sort(arrayList);

        return arrayList;
    }
    public static LinkedList<Integer> sort(LinkedList<Integer>linkedList){
        Collections.sort(linkedList);

        return linkedList;
    }
}