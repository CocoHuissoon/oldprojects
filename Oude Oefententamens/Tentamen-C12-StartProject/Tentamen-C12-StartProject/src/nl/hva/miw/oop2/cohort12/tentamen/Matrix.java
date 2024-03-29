package nl.hva.miw.oop2.cohort12.tentamen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * Een matrix heeft rijen en kolommen. Deze matrix wordt geimplmenteerd als een
 * lijst van lijsten. Elke rij is een lijst. De matrix is dan een lijst van deze
 * rijen (dus een lijst van lijsten).
 * 
 * Elk veld in de matrix kan aangeduid worden met een rij, kolom combinatie.
 * Bijvoorbeeld: element (0,0) bevindt zich het in eerste element van de eerste
 * lijst van de matrix.
 * 
 * @author michel
 */

public class Matrix<T extends Comparable<T>> implements Comparable<Matrix<T>> {

	private List<List<T>> matrix;
	private int size;

	/**
	 * Maak een matrix van size X size aan. Elementen worden op null
	 * geinitialiseerd.
	 * 
	 * @param size
	 */
	public Matrix(int size) {
		super();
		initializeMatrix(size);
	}

	/*
	 * Creeert de matrix op de juiste grootte en initialiseert ze met null waarden.
	 * Kan ook gebruikt worden om de grootte van een bestaande matrix te veranderen.
	 * Nuttig voor bij het inlezen van een matrix van een file.
	 */
	private void initializeMatrix(int size) {
		this.size = size;

		// Maak de rijen aan (elke rij is een list)
		matrix = new ArrayList<>(size);

		for (int i = 0; i < size; i++) {

			// Maak een rij aan (een lijst met nulls)
			List<T> rij = new ArrayList<>(size);

			for (int j = 0; j < size; j++) {
				rij.add(null);
			}

			// Voeg de rij aan de matrix toe.
			matrix.add((List<T>) rij);
		}
	}

	public T getElement(int rij, int kolom) throws OngeldigeMatrixPositieException {
		if (this.matrix.size() < rij) {
			throw new OngeldigeMatrixPositieException();
		}
		return this.matrix.get(rij).get(kolom);
	}

	public void addElement(int rij, int kolom, T value) throws OngeldigeMatrixPositieException {
		if (this.matrix.size() < rij) {
			throw new OngeldigeMatrixPositieException();
		}
		this.matrix.get(rij).set(kolom, value);

	}

	@Override
	public String toString() {
		String result = "";
		for (List<T> rij : matrix) {
			result += rij + "\n";
		}
		return result;
	}

	/**
	 * Schrijft de matrix naar een file als binary I/O. Het formaat is als volgt: -
	 * Eerst wordt een integer geschreven: de size van de matrix. - Daarna volgen
	 * size * size elementen van de matrix, elk los geschreven. - De elementen kopen
	 * "per rij", dus eerst alle elementen van rij 0, daarna rij 1, etc.
	 * 
	 * @param filenaam
	 * @throws OngeldigeMatrixPositieException
	 */
	public void saveToFile(String filenaam) throws OngeldigeMatrixPositieException {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filenaam))) {

			os.writeInt(this.size);

			for (int rij = 0; rij < size; rij++) {
				for (int kol = 0; kol < size; kol++) {
					os.writeObject(matrix.get(rij).get(kol));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void loadFromFile(String filenaam) throws ClassNotFoundException {
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(filenaam))) {

			int size=is.readInt();
			initializeMatrix(size);
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					T t = (T) is.readObject();
					this.addElement(i, i, t);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OngeldigeMatrixPositieException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public int compareTo(Matrix <T>o) {
		{
			if (this.matrix.size() != o.size) {
				return this.matrix.size() - o.size;
			}
			for (int i = 0; i < this.matrix.size(); i++) {
				for (int j = 0; j < this.matrix.size(); j++) {
					int result;
					try {
						result = this.getElement(i, j).compareTo( o.getElement(i, j));
						if (result != 0 ) {
							return result;
						}
					} catch (OngeldigeMatrixPositieException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return 0;
		}

	}
}
