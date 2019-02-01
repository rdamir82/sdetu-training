package collections05hashMapLinkedHashMapTreeMap;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		
		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "brilliant sunshine illuminated the scene or exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness or a thing that causes joy or success or satisfaction");
		dictionary.put("Confidence", "the feeling or belief that one can have faith in or rely on someone or something or the state of feeling certain about the truth of something");
		
		for(String word: dictionary.keySet()) {
			System.out.println(dictionary.get(word));
		}
		
		// the difference between a link Hash map and a regular hash map similar to how it was with
		// the linked hash so that it preserves the order of insertion.
		// the tree map is going to sort the keys or it is going to sort the keys in their natural order.
		
		for( Map.Entry<String, String> entry: dictionary.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
						
		}

	}

}
