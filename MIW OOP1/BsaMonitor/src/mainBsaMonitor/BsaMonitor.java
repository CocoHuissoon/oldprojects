package mainBsaMonitor;

public class BsaMonitor {
	public static void main (String[]args) {
		Vak v=new Vak("porn",10);
		v.setCijfer(5.6);
		v.behaaldePunten();
		System.out.println(v.toString());
	
		boolean q= v  instanceof BsaMonitor;
			System.out.println("sout sout let it all out");
			System.out.println(v.toString());
		System.out.println(q);
	}

}
