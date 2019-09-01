import java.util.Arrays;
import java.util.Collections;

public class Route {
	private char [] route;
	private final static char street='s';
	private final static char avenue='a';
	
	public Route() {
		this.route=makeRandomRoute();
		
	}
	//Niet heel mooi maar kreeg hem anders niet werkend
	public char[] makeRandomRoute() {
		char[] route=new char[9];
		int streetCount=0;
		int avenueCount=0;
		for(int i=0;i<9;i++) {
			
			int temp = (Math.random() <= 0.5) ? 1 : 2;
			if(streetCount==3) {
				temp=2;
			}else if(avenueCount==6) {
				temp=1;
			}
			if(temp==1) {
				route[i]=street;
				streetCount++;
			}else if(temp==2) {
				route[i]=avenue;
				avenueCount++;
			}
		}
		return route;
	}
	public static char [] makeHomeRoute(char[] route)  {
		
		Stack<Character> stack = new Stack<Character>();
	     
	      int size = route.length;
	      for(int i=0; i<size; i++) {
	         stack.push(route[i]);
	      }
	      char []homeRoute= new char[size];
	      for(int i=0; i<size; i++) {
	    	  homeRoute[i] = (char) stack.pop();
	      }
		
		return homeRoute;
	}
	public static void main(String[] args)  {
		Route r = new Route();
		
		System.out.println(Arrays.toString(r.getRoute()));
		char[]f=makeHomeRoute(r.getRoute());
		System.out.println(Arrays.toString(f));
	}
	@Override
	public String toString() {
		return "Route [street=" + street + "]";
	}
	public char[] getRoute() {
		return route;
	}

}
