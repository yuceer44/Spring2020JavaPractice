package A_deneme_inClass;

import java.util.Arrays;

public class Nested_loop {
    public static void main(String[] args) {

        int[] target={11,4,65,6};
        int target1=4;
        Arrays.sort(target);
        Arrays.binarySearch(target, target1);
        Arrays.toString(target);
        for (int item:target){
            System.out.println(item);
        }

    }
}
