package students;

import java.util.Arrays;
import java.util.Comparator;

public class Group {

	private String groupName;
	private Student[] students = new Student[10];

	public Group(String groupName, Student[] students) {
		super();
		this.groupName = groupName;
		this.students = students;
	}

	public Group() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "�������� ������: " + groupName + ", ������� " + Arrays.toString(students) + "";
	}

	public void addStudent(Student student) throws GroupOverflowException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				student.setGroupName(groupName);
				students[i] = student;
				System.out.println("�������(��) " + student.getName() + " " + student.getLastName()
						+ " ��������(�) � ������ " + student.getGroupName());
				return;
			}
		}
		throw new GroupOverflowException("� ������ " + getGroupName() + " ������ ��� ��������� ����.");
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getLastName().equals(lastName)) {
				System.out.println("������� " + students[i].getLastName() + " ������ � ������ " + groupName + ".");
				return students[i];
			} else {
			}
		}
		throw new StudentNotFoundException("����� ������� �� ������.");
	}

	public boolean removeStudentByID(int id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getId() == id) {
				students[i] = null;
				System.out.println("������� ������� �����.");
				return true;
			}
		}
		System.out.println("������ �������� ��� � ���� ������.");
		return false;

	}

	public void sortStudentsByLastName() {
		Arrays.sort(students, Comparator.nullsLast(new SortLastNameComparator()));
	}

}
