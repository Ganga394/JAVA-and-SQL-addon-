public class MyownConstructor{
    String name;
    int year;
    String language;
    //Original constructor
    MyownConstructor(String name, int year, String language){
        this.name=name;
        this.year=year;
        this.language=language;
    }
    //copy constructor
    MyownConstructor(MyownConstructor copy){
        this.name=copy.name;
        this.year=copy.year;
        this.language=copy.language;
    }
    void display(){
        System.out.println("My Own Constructor.."+" "+name+" "+year+" "+language);
    }
    public static void main(String[] args) {
        System.out.println("Original Constructor");
        MyownConstructor ref= new MyownConstructor("Ganga",1401,"Java");
        ref.display();
        System.out.println("Copy Constructor");
        MyownConstructor ref1= new MyownConstructor(ref);
        ref1.display();
    }
}
