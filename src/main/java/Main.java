import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(-5, 4, 13, -23, -65, 5, -2));
        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(7, 3, -3, -6, 5, 10, 8));

        ArrayList<Integer> res = mergeTwoArrayLists(l1, l2); // [4, 13, 5, 7, 3, 5, 10, 8]
        System.out.println(res);
    }

    public static ArrayList<Integer> mergeTwoArrayLists(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        // your code here
        ArrayList<Integer> l1Postive = new ArrayList<Integer>();
        ArrayList<Integer> l2Postive = new ArrayList<Integer>();

        for(int i = 0; i < l1.size(); i++){
            if(l1.get(i) >= 0){
                l1Postive.add(l1.get(i));
            }
        }

        for(int j = 0; j < l2.size(); j++){
            if(l2.get(j) >= 0){
                l2Postive.add(l2.get(j));
            }
        }

         l1Postive.addAll(l2Postive);

        return l1Postive;
    }
}
