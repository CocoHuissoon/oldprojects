package model
;

/**
 * 
 */
public class Student implements Comparable<Student>{
    private static int nextStudentID = 500800001;
    private int studentID;
    private Group group;

    public Student(Group group) {
        studentID = nextStudentID++;
        this.group = group;
    }
    
    
    public int getStudentID() {
        return studentID;
    }
    
    
    public int getGroupId() {
		return group.getGroupId();
	}


    // Maakt het mogelijk een student uit te printen
	public String toString() {
        return String.format("{%9d, %d}", studentID, group.getGroupId());
    }

	
    @Override
    public int compareTo(Student o) {
    	 if (o.getStudentID() > this.getStudentID()) {
             return 1;
         } else if (o.getStudentID() < this.getStudentID()) {
             return -1;
         } else {
             return 0;
         }
    }
}
