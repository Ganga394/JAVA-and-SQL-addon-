package Day6pgms;
import java.util.HashSet;
public class Day6task3 {

	public static void main(String[] args) {
		HashSet<String> stuemail=new HashSet();
		stuemail.add("ganga@gmail.com");
		stuemail.add("devika@gmail.com");
		stuemail.add("chotuu@gmail.com");
		for(String data:stuemail) {
			System.out.println(data);
		}

	}

}
