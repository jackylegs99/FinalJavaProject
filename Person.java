
public class Person {
	private Name name;
	private Date DOB;
	private Character gender;
	private boolean isSmoker;
	
	public Person(Date dOB, Character gender, boolean isSmoker) {
		super();
		DOB = dOB;
		this.gender = gender;
		this.isSmoker = isSmoker;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public boolean isSmoker() {
		return isSmoker;
	}

	public void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}

	@Override
	public String toString() {
		return "Person [DOB=" + DOB + ", gender=" + gender + ", isSmoker=" + isSmoker + "]";
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
	
	

}
