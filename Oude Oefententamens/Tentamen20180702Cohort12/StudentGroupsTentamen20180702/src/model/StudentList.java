package model;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

import util.Shuffler;

public class StudentList {
	private final static int STUDENTS_PER_GROUP = 25;
	private int numberOfGroups;
	
	private Random randomizer;
    private Student[] students; // de volledig lijst met studenten
    private Group[] studentGroups; // de array van groepen waar de studenten aan toegevoegd moeten worden
    
    public StudentList(int studentCount) {
        randomizer = new SecureRandom();
        students = new Student[studentCount];
        // het aantal groepen hangt af van het aantal studenten en het aantal studenten per groep
        numberOfGroups = (studentCount - 1)/ STUDENTS_PER_GROUP + 1;
        this.initializeGroups();
        this.generateStudents();
    }
    
    private void initializeGroups() {
    	studentGroups = Group.generateGroups(numberOfGroups);	
	}

	public Student[] generateStudents() {
        for (int i = 0; i < students.length; i++) {
        	// random groepsId aan een student meegeven
        	int groupNumber = randomizer.nextInt(numberOfGroups);
            students[i] = new Student(studentGroups[groupNumber]);
        }
        // de lijst wordt geschud.
        Shuffler.shuffleArray(students);
        return students;
    }

	public Group[] getStudentGroups() {
		return studentGroups;
	}

	public Student[] getStudents() {
		return students;
	}

	// Maakt het mogelijk om de lijst van studenten uit te printen.
	@Override
	public String toString() {
		return Arrays.toString(students);
	}
	
}
