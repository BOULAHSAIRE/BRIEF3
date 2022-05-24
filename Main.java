package Brief2;
import java.util.Scanner;

public class Main {
			public static void main(String[] args) {
				
				Employefixe emp1 = new Employefixe("Laila","Tamam",23,4000);
				System.out.println(emp1.toString());
				// employe comission
				 Employehoraire  emphor = new  Employehoraire ("Amal", "Boulahsaire",30, 60, 0.5);
				 System.out.println(emphor.toString());
				//employee horaire
				 Employecommission empCm = new Employecommission("Imanr", "boul", 25, 5000, 0.5, 60);
				 System.out.println(empCm.toString());

	
	}
	
	
	
	

}
