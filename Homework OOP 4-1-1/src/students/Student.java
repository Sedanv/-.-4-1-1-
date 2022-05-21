package students;

public class Student extends Human {

	private int Id;
	private String groupName;

	public Student(String name, String lastName, Gender gender, int id, String groupName) {
		super(name, lastName, gender);
		Id = id;
		this.groupName = groupName;
	}

	public Student() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Номер зачётки: = " + getId() + ", название группы: " + getGroupName() + ", " + super.toString() + "";
	}

}
