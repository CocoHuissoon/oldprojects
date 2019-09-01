
public class App {
	public static void main (String[]args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		plant1.grow();
		tree.grow();
		plant2.grow();
		tree.shedLeaves();
		
		// Werkt niet want 
		//plant2.shedLeaves();
		doGrow(tree);
		
	}
	public static void doGrow(Plant plant) {
		plant.grow();
	}
	
}
