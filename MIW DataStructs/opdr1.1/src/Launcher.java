

public class Launcher {
	
	public static void main(String[] args) {
	
		long x=System.currentTimeMillis(); 
		System.out.println(x);
		ExperimentalNumberList e = new ExperimentalNumberList(1000000);
		e.generateNumbers(0, 1);
		x=System.currentTimeMillis()-x;
		System.out.println(x);
		x=System.currentTimeMillis();
		ExperimentalNumberList f = new ExperimentalNumberList(2000000);
		f.generateNumbers(0, 1);
		x=System.currentTimeMillis()-x;
		System.out.println(x);
		x=System.currentTimeMillis();
		ExperimentalNumberList r = new ExperimentalNumberList(4000000);
		r.generateNumbers(0, 1);
		x=System.currentTimeMillis()-x;
		System.out.println(x);
		x=System.currentTimeMillis();
		ExperimentalNumberList t = new ExperimentalNumberList(8000000);
		t.generateNumbers(0, 1);
		x=System.currentTimeMillis()-x;
		System.out.println(x);
		x=System.currentTimeMillis();
		ExperimentalNumberList y = new ExperimentalNumberList(16000000);
		y.generateNumbers(0, 1);
		x=System.currentTimeMillis()-x;
		System.out.println(x);
		
		
		
		
		
//		System.out.println(e.toString());
//		// System.out.println(e.equalValuesExist());
//		// hoeveel(100);
//		System.out.println(e.countPositives());
		
		

		// public static void hoeveel(int aantal) {
		// int ja=0;
		// int nee=0;
		// for (int i = 0; i < aantal; i++) {
		// ExperimentalNumberList f = new ExperimentalNumberList(50);
		// f.generateNumbers(-44, 44);
		// if(f.equalValuesExist()) {
		// ja++;
		// }else {
		// nee++;
		// }
		//
		// }
		//
		// System.out.println("gelijk:"+ja+" ongelijk:"+nee);}
		//
		//
		// }
	}
}

