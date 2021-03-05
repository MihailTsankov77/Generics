package Second;

import java.util.ArrayList;

public class GenericSort {

	public static void main(String[] args) {
		// Create an Integer array
				Integer[] intArray = { new Integer(2), new Integer(4), new Integer(3) };
		// Create a Double array
				Double[] doubleArray = { new Double(3.4), new Double(1.3), new Double(-22.1) };
		// Create a Character array
				Character[] charArray = { new Character('a'), new Character('J'), new Character('r') };
		// Create a String array
				String[] stringArray = { "Tom", "Susan", "Kim" };
				
				GeometricObject[] GeometricObjectArray = { new Circle(), new Square(), new Circle(), new Square(), new Square() };
				
				ArrayList<GeometricObject> GeometricObjectList = new ArrayList <GeometricObject>() ;
				
				GeometricObjectList.add( new Circle());
				GeometricObjectList.add( new Square());
				GeometricObjectList.add( new Circle());
				GeometricObjectList.add( new Square());
				GeometricObjectList.add( new Circle());
				System.out.println(min(GeometricObjectList));
				
				sort(GeometricObjectList);
				printList(GeometricObjectList);
				
				shuffle(GeometricObjectList);
				printList(GeometricObjectList);
				
				
		//Sort the arrays
				sort(intArray);
				sort(doubleArray);
				sort(charArray);
				sort(stringArray);
				sort(GeometricObjectArray);
		// Display the sorted arrays
				System.out.print("Sorted Integer objects: ");
				printList(intArray);
				System.out.print("Sorted Double objects: ");
				printList(doubleArray);
				System.out.print("Sorted Character objects: ");
				printList(charArray);
				System.out.print("Sorted String objects: ");
				printList(stringArray);
				
				System.out.print("Sorted GeometricObjec objects: ");
				printList(GeometricObjectArray);
			}


	public static <E extends Comparable<E>> void sort(E[] list) {
		E currentMin;
		int currentMinIndex;

		for (int i = 0; i < list.length - 1; i++) {

						currentMin = list[i];
						currentMinIndex = i;
						for (int j = i + 1; j < list.length; j++) {
							if (currentMin.compareTo(list[j]) > 0) {
								currentMin = list[j];
								currentMinIndex = j;
							}
						}

			// Swap list[i] with list[currentMinIndex] if necessary;
						if (currentMinIndex != i) {
							list[currentMinIndex] = list[i];
							list[i] = currentMin;
						}
		}
	}
	
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin;
		int currentMinIndex;

		for (int i = 0; i < list.size() - 1; i++) {

						currentMin = list.get(i);
						currentMinIndex = i;
						for (int j = i + 1; j < list.size(); j++) {
							if (currentMin.compareTo(list.get(j)) > 0) {
								currentMin = list.get(j);
								currentMinIndex = j;
							}
						}


						if (currentMinIndex != i) {
							list.add(currentMinIndex, list.get(i)) ;
							list.remove(currentMinIndex+1);
							list.add(i, currentMin) ;
							list.remove(i+1);

						}
		}
	}
	
	public static <E> void shuffle(ArrayList<E> list) {
		int newPlace;
		for (int i = 0; i < list.size() - 1; i++) {
			do {
				newPlace = (int) Math.abs(Math.random()*(list.size()-1));
			}while(newPlace==i);
			
				E temp = list.get(i);

				list.add(i, list.get(newPlace));
				list.remove(i + 1);
				list.add(newPlace, temp);
				list.remove(newPlace + 1);

		}
		
	}

	
	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		
		E min = list.get(0);
		
		for (int j = 0; j < list.size(); j++) {
			if (min.compareTo(list.get(j)) > 0) {
				min = list.get(j);
			}
		}

		
		return min;
		
	}


	public static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}
	
	public static <E> void printList(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
	}
}
