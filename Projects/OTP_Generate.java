package Projects;
import java.util.Random;
public class OTP_Generate {
    public static void main(String[] args) {
        Random random = new Random();
        int otp = random.nextInt(1000000);
        System.out.println(" Your OTP Is :" + otp );
        System.out.print(" Hey guys Don't share anybody");

    }
}