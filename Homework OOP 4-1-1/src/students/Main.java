package students;

public class Main {

	public static void main(String[] args) {

		Group group1 = new Group();
		group1.setGroupName("JAVA OOP 180422");

		Student student1 = new Student("Taras", "Bulba", Gender.MALE, 25478, group1.getGroupName());
		Student student2 = new Student("Lesya", "Sobakina", Gender.FEMALE, 47896, group1.getGroupName());
		Student student3 = new Student("Oleh", "Snipka", Gender.MALE, 45893, group1.getGroupName());
		Student student4 = new Student("Olya", "Barabolya", Gender.FEMALE, 14523, group1.getGroupName());
		Student student5 = new Student("Zoryana", "Zelova", Gender.FEMALE, 98563, group1.getGroupName());
		Student student6 = new Student("Ivan", "Bazikalo", Gender.MALE, 47856, group1.getGroupName());
		Student student7 = new Student("Evgen", "Laskevich", Gender.MALE, 41256, group1.getGroupName());
		Student student8 = new Student("Katya", "Chili", Gender.FEMALE, 12369, group1.getGroupName());
		Student student9 = new Student("Nikola", "Perestukinskiy", Gender.MALE, 78563, group1.getGroupName());
		Student student10 = new Student("Irina", "Balerina", Gender.FEMALE, 41259, group1.getGroupName());
		Student student11 = new Student("Darynya", "Mandarina", Gender.MALE, 78569, group1.getGroupName());

		try {
			group1.addStudent(student1);
			group1.addStudent(student2);
			group1.addStudent(student3);
			group1.addStudent(student4);
			group1.addStudent(student5);
			group1.addStudent(student6);

		} catch (GroupOverflowException e) {
			System.err.println(e.getMessage());
		}

		try {
			Student searchStudentByLastName = group1.searchStudentByLastName("Bazikalo");
			System.out.println(searchStudentByLastName);
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}

		group1.removeStudentByID(98563);

		group1.removeStudentByID(15000);

		group1.sortStudentsByLastName();

		System.out.println(group1.toString());

		NewStudent newStudent1 = new NewStudent();

		newStudent1.createNewStudent();

		try {
			newStudent1.addNewStudentGroup(group1);
		} catch (GroupOverflowException e) {
			e.printStackTrace();
		}

	}

}
