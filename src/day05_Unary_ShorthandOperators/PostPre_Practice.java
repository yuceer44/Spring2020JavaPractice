package day05_Unary_ShorthandOperators;

public class PostPre_Practice {


    public static void main(String[] args) {
        int a = 50;
        a = --a +  a++  +  a--  + a++;
        // a =  49  +  49   +  50  + 49  = 197

        System.out.println(a);  // 197

        System.out.println( ++a );  // 198

        System.out.println( a++ );  // 198
        System.out.println( a ); // 199


    int b =1;
      b  =  -b--  + b++  / -b--  * --b;
      //  -1   +  0  / - 1   *  -1
        // -1 + 0 * -1
        //  -1 + 0 = -1

        System.out.println(b);


    }

}
