package Day6pgms;
import java.util.Map;
import java.util.HashMap;
public class Day6task2 {
	public static void main(String[] args) {
		HashMap<String,Integer> mark=new HashMap();
		mark.put("Ganga",95);
		mark.put("Jumana",90);
		mark.put("Joshini",80);
		mark.put("Devika",96);
		mark.put("Navya",85);
		
		int totalMarks=0;
		for(int marks:mark.values()) {
			totalMarks +=marks;
		}
		    System.out.println("Student Total Marks:"+totalMarks); 
		    double avg=totalMarks/5;
		    System.out.println("Average:" +avg);
		    for(Map.Entry<String,Integer> entry : mark.entrySet()) {
		    	System.out.println(entry.getKey()+" "+entry.getValue());
		    	
		    }
  }
}
