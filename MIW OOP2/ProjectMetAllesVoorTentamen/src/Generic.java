
public class Generic <T> {
	
	T a;
	T b;
	
	
	
	public static <T> void printArray(T[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
	}

}
