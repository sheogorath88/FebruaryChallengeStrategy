import java.util.Random;

public class Runner {

    public static void main(String[] args) {

        Washer diswasher = new Washer(new UseDishwasher());
        Washer handwash = new Washer(new UseYourHands());
        Washer husband = new Washer(new AskYourHusband());

        Washer[] option = new Washer[3];
        option[0] = diswasher;
        option[1] = handwash;
        option[2] = husband;

        int range = option.length-1;

        Random random = new Random();


        int happyWasher = (int)Math.round(Math.random()*range);
//        System.out.println("happy washer is "+ option[happyWasher]);

        option[happyWasher].wash();

    }
}
