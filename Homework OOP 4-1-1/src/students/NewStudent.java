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

		System.out.println("Введите имя студента: ");
		addStudent.setName(sc.nextLine());

		System.out.println("Введите Фамилию студента: ");
		addStudent.setLastName(sc.nextLine());

		System.out.println("Введите пол типу  MALE/FEMALE ");
		try {
			addStudent.setGender(Gender.valueOf(sc.nextLine()));
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Пол указан некорректно");
		}

		System.out.println("Укажите номер зачетки");
		addStudent.setId(sc.nextInt());

		return addStudent;

	}

	public void addNewStudentGroup(Group group) throws GroupOverflowException {
		group.addStudent(addStudent);
	}
}