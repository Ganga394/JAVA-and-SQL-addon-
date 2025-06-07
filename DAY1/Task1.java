import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("Enter the Range");
        int b=s.nextInt();
        for(int i=a; i<b; i++){
            if(i % 2 ==0)
            System.out.println(i);
        }
        
        
    }
}
