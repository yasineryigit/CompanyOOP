import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String [] args){
        Random random;
        random = new Random();
        System.out.println(random.nextInt(100));//0 ile 100 arasında rastgele sayı üretir
        System.out.println(random.nextInt(100));
        System.out.println(ThreadLocalRandom.current().nextInt(100));


    }
}
