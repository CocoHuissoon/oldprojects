package model;

import java.util.ArrayList;
import java.util.Collections;

public class Group {
	private int groupId;
	private int size;
	private static int nextGROUP_ID = 101;  // eerste groep heeft nummer 101.
	private ArrayList<Student> studentsInGroup;
	
	public Group() {
		// groep worden opeenvolgend genummerd, vanaf 101.
		groupId = nextGROUP_ID++;
		studentsInGroup = new ArrayList<>();
		size = 0;
	}
	
	public void addStudentInOrder(Student student) {
		this.size++;
		studentsInGroup.add(student);
		Collections.sort(studentsInGroup);
	}
	
	// Deze statische methode initialiseert een array van groepen, initialiseert het gevraagde aantal groepen en geeft de array terug. 
	public static Group[] generateGroups(int numberOfGroups) {
		Group[] groups = new Group[numberOfGroups];
		for (int i = 0; i < numberOfGroups; i++) {
			groups[i] = new Group();
		}
		return groups;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
	// Maakt het mogelijk alle studenten van een groep onderelkaar te printen.
	@Override
	public String toString() {
		String result = "";
		for (Student student : studentsInGroup) {
			result += student + "\n";
		}
		return result;
	}
}
