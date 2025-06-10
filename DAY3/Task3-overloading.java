package programs;
public class Day3Task3 {
    public int sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum of integers: " + result);
        return result;
    }
    public double sum(double a, double b) {
        double result = a + b;
        System.out.println("Sum of doubles: " + result);
        return result;
    } 
    public void sum() {
        sum(25, 40);         
        sum(2.5, 6.5);      
    }
    public static void main(String[] args) {
        Day3Task3 demo = new Day3Task3();
        demo.sum();  
    }

}


