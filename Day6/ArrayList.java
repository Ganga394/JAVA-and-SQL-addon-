package Day6pgms;
import java.util.ArrayList;
class ArrayListpgm {
	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("A");
		arr.add("Web Development");
		arr.add("3rd Year");
		arr.add(1,"Abi");
		arr.add(1,"Anu");
		System.out.println(arr.get(1));
		
		//for(type iterator:existing vn)
		for(Object data:arr) {
			System.out.println(data);
			
		}
		
	}
	
}
