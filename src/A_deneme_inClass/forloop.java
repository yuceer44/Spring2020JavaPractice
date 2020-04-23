package A_deneme_inClass;

public class forloop {
    public static void main(String[] args) {
        int[][] data={ {2,4,5,6,8,22},{32,4,45,6}};

        for (int [] i:data){
            System.out.println(" Row : ");
            for (int second:i){
                System.out.print(second+ " ");
            }
            System.out.println();
        }

    }
}
