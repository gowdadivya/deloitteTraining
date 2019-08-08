package collections;

import java.util.*;

public class MapDemo {
		public static void main(String[] args) {
			//key - value
			Map<Integer,String> data = new Hashtable<Integer,String>();
			
			data.put(9871,"Rishi");
			data.put(9872, "Neeru");
			data.put(6752, "Naina");
			data.put(546, "Riya");
			
			System.out.println(data.get(546));
		}
}
