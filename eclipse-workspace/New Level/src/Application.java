
public class Application {
	public static void main(String[] args) {

		int grid[][] = { { 3, 4, 5, 6, 7 }, { 1, 2, 3, 4, 5 }, { 0, 9, 8, 7, 6 } };

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.println(grid[row][col] + "\t");
			}
			
			
		}

	}
}
