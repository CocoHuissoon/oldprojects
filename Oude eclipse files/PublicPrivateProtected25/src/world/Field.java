package world;

public class Field {

	private Plant plant = new Plant();
	public Field() {
		//size is protected en Field in dezelfde package als Plant
		System.out.println(plant.size);
	}

	}


