import java.util.Random;
import java.util.Scanner;
class Main {
    public static int OTP(){
        Random ran = new Random();
        return 1000 + ran.nextInt(4000);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Mobile number:");
        long a=1234567890;
        long b=s.nextLong();
        if(a==b){
        int otp = OTP();
        System.out.println("Your One Time Password is:"+otp);
      
        }
        else{
            System.out.println("Your Mobile number is invalid..");
        }
    }
}
