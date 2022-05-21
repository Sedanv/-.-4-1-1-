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
		return "Название группы: " + groupName + ", студент " + Arrays.toString(students) + "";
	}

	public void addStudent(Student student) throws GroupOverflowException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				student.setGroupName(groupName);
				students[i] = student;
				System.out.println("Студент(ка) " + student.getName() + " " + student.getLastName()
						+ " добавлен(а) в группу " + student.getGroupName());
				return;
			}
		}
		throw new GroupOverflowException("В группе " + getGroupName() + " больше нет свободных мест.");
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getLastName().equals(lastName)) {
				System.out.println("Студент " + students[i].getLastName() + " учится в группе " + groupName + ".");
				return students[i];
			} else {
			}
		}
		throw new StudentNotFoundException("Такой студент не найден.");
	}

	public boolean removeStudentByID(int id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getId() == id) {
				students[i] = null;
				System.out.println("Студент успешно удалён.");
				return true;
			}
		}
		System.out.println("Такого студента нет в этой группе.");
		return false;

	}

	public void sortStudentsByLastName() {
		Arrays.sort(students, Comparator.nullsLast(new SortLastNameComparator()));
	}

}
