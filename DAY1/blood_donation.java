import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner s=new Scanner(System.in);
        int age=s.nextInt();
        System.out.println("Enter your Weight");
        int Weight=s.nextInt();
        if(age>=18 && Weight>=50)
        System.out.println("eligible for blood donation");
        else
        System.out.println("Not eligible for blood donation");
        
        
    }
}
