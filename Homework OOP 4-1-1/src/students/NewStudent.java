package students;

import java.util.Scanner;

public class NewStudent {
	private Student addStudent = new Student();

	public Student getNewStudent() {
		return addStudent;
	}

	public void setNewStudent(Student newStudent) {
		this.addStudent = newStudent;
	}

	public Student createNewStudent() {
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ��� ��������: ");
		addStudent.setName(sc.nextLine());

		System.out.println("������� ������� ��������: ");
		addStudent.setLastName(sc.nextLine());

		System.out.println("������� ��� ����  MALE/FEMALE ");
		try {
			addStudent.setGender(Gender.valueOf(sc.nextLine()));
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("��� ������ �����������");
		}

		System.out.println("������� ����� �������");
		addStudent.setId(sc.nextInt());

		return addStudent;

	}

	public void addNewStudentGroup(Group group) throws GroupOverflowException {
		group.addStudent(addStudent);
	}
}