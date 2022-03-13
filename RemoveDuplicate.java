package week3.day2;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			

			String text = "Winter is coming Winter";
			
			String[] splitText = text.split(" ");
			
			LinkedHashSet<String> removeDup = new LinkedHashSet<String>(Arrays.asList(splitText));
			
			for(String noDup : removeDup) {
				System.out.println(noDup);
			}
			

	}

}
