package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		String[] names = new String[]{"Ala", "Ola", "Asia", "Basia", "Asia", "Ola", "Ela", "Ela", "Ewa", "Ala"};

		ArrayList<String> lista = new ArrayList<>();
		for(int i = 0; i < names.length; i++) {
			lista.add(names[i]);
		}
		System.out.println(lista);
		
		HashSet<String> zbior = new HashSet<>();
		for(int i = 0; i < names.length; i++) {
			zbior.add(names[i]);
		}
		System.out.println(zbior);
		
		System.out.println("Trzeci element: " + lista.get(2));
		
		System.out.println("Czy lista zawiera 'Ania': " +  lista.contains("Ania"));
		System.out.println("Czy zbior zawiera 'Ania': " +  zbior.contains("Ania"));
	
	     lista.remove("Ola");
	     lista.remove(2);
	     System.out.println(lista);
	     
	     zbior.remove("Ola");
	     System.out.println(zbior);
	}

}
