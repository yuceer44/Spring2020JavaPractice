package A_Deneme_thenewboston;

public class Compound_Interest_Program {
    public static void main(String[] args) {

        double amaunt;
        double principal=100;
        double rate = .02;
        for (int day=1; day<=20; day++){

            amaunt=principal*Math.pow(1+rate,day);
            System.out.println(day+ " " + amaunt);
        }

    }
}
