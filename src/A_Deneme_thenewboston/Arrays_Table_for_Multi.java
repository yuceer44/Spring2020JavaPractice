package A_Deneme_thenewboston;

public class Arrays_Table_for_Multi {
    public static void main(String[] args) {
        System.out.println(average(44,44,44,44,44 ));
    }
    public static int average (int...numbers){

        int total=0;
        for (int x:numbers)
            total+=x;
        return total/numbers.length;
    }



}
