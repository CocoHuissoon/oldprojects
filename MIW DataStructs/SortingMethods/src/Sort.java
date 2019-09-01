
public class Sort {

	public static void selectionSort(Thing[] things) {
		for (int selection = 0; selection < things.length - 1; selection++) {
			int smallest = selection;
			for (int selector = selection + 1; selector < things.length; selector++) {
				if (things[selector].compareTo(things[smallest]) < 0) {
					smallest = selector;
				}
			}
			swap(things, selection, smallest);
		}
	}

	public static void insertionSort(Thing[] things) {
	    int in, out;

	    for (out = 1; out < things.length; out++) {
	      Thing temp = things[out];
	      in = out;

	      while (in > 0 && things[in - 1].compareTo(temp) > 0) {
	        things[in] = things[in - 1];
	        --in;
	      }
	      things[in] = temp;
	    }
	  }
	
	 public static void bubbleSort(Thing[] things) {
		 for(int i=things.length-1;i>1;i--){
				
				for(int j=0;j<i;j++){
					
					if(things[j].compareTo(things[j+1])>0 ){
						swap(things,j, j+1);
		      }
		    }
		  }
	 }
	 

	private static void swap(Thing[] things, int target, int source) {
		Thing temp = things[source];
		things[source] = things[target];
		things[target] = temp;
	}

}
