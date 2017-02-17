import java.util.*;

public class CollectionsExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> collectionOne = new ArrayList<Integer>();
		ArrayList<Integer> collectionTwo = new ArrayList<Integer>();
		//add the right number ranges to each collection
		for(int i = 1; i<=10; i++){
			collectionOne.add(i);
		}
		for(int j = 6; j<=15; j++){
			collectionTwo.add(j);
		}
		//randomize them both
		Collections.shuffle(collectionOne);
		Collections.shuffle(collectionTwo);
		//printing both collections
		System.out.println("Collection 1: "+collectionOne.toString());
		System.out.println("Collection 2: "+collectionTwo.toString());
		//printing size of both collections
		System.out.println("Collection 1 Size: "+collectionOne.size());
		System.out.println("Collection 2 Size: "+collectionTwo.size());
		//third collection
		ArrayList<Integer> collectionThree = new ArrayList<Integer>();
		//temp collection to hold all the values, will use to find and "remove" duplicates
		ArrayList<Integer> collectionTemp = new ArrayList<Integer>();
		//add both collections to the temporary one
		collectionTemp.addAll(collectionOne);
		collectionTemp.addAll(collectionTwo);
		//sort it
		Collections.sort(collectionTemp);
		//add each number to collectionThree
		for(int num : collectionTemp){
			//if there is a duplicate it will skip
			if(!collectionThree.contains(num)){
				collectionThree.add(num);
			}
		}
		System.out.println("Collection 3: "+collectionThree.toString());
		//removing middle entry
		collectionThree.remove(collectionThree.size()/2);
		System.out.println("Collection 3 missing middle: "+collectionThree.toString());
		//reversing the order
		Collections.reverse(collectionThree);
		System.out.println("Collection 3 reversed: "+collectionThree.toString());
		//printing size
		System.out.println("Collection 3 size: "+collectionThree.toString());
		//create our hashtable for key value pairs
		Hashtable<Integer, Integer> keyValueSet = new Hashtable<>();
		//add 5 pairs into it
		for(int x = 1; x<6; x++){
			keyValueSet.put(x, (x*100));
		}
		//add duplicate
		//check to see if it already has key
		if(keyValueSet.containsKey(1)){
			System.out.println("Key 1 and value already exists ---> "+keyValueSet.get(1));
		}
		//if not then put it in(our example will never do this)
		else{
			keyValueSet.put(1, 100);
		}
		//print the pairs
		System.out.println("Key Value Pairs: "+keyValueSet.toString());
		//print size
		System.out.println("HashTable size: "+keyValueSet.size());
		/*
		 * For the first two parts of this example I chose to use an arraylist as it allowed for easy ordering, sorting, reversing
		 * and re-ordering. Along with this I could easily randomize it and find the middle sections.
		 * 
		 * For the last part(key/values) I figured it was best to use a hash table as I could easily add key/value pairs to it. 
		 */
	}	

}
