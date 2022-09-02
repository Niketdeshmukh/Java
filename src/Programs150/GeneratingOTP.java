package Programs150;

import java.util.Random;

public class GeneratingOTP {
    public static void main(String[] args) {
        int length = 4;
        System.out.println(new_otp(length));
    }
    static char[] new_otp(int len){
        System.out.println("Your OTP is : ");
        Random rdm_method = new Random();
        String numbers = "1234567890";
        char[] password = new char[4];
        for (int i = 0; i < 4; i++) {
            password[i] =
                    numbers.charAt(rdm_method.nextInt(numbers.length()));
        }
        return password;
    }
}
