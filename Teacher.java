
public class Teacher extends Person {
	// fields
	private String subjectTaught;
	private int numClassesTaught;
	private String officeNumber;

	public Teacher(Date dOB, Character gender, boolean isSmoker, String subjectTaught, int numClassesTaught, String officeNumber) {
		super(dOB, gender, isSmoker);

	}

	public String getSubjectTaught() {
		return subjectTaught;
	}

	public void setSubjectTaught(String subjectTaught) {
		this.subjectTaught = subjectTaught;
	}

	public int getNumClassesTaught() {
		return numClassesTaught;
	}

	public void setNumClassesTaught(int numClassesTaught) {
		this.numClassesTaught = numClassesTaught;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		//confirm office number is number dash number
		
		try {
			String [] arrOfficeNumber = officeNumber.split("-",8);
			this.officeNumber = (arrOfficeNumber[0] + "-" + arrOfficeNumber[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Teacher [subjectTaught=" + subjectTaught + ", numClassesTaught=" + numClassesTaught + ", officeNumber="
				+ officeNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numClassesTaught;
		result = prime * result + ((officeNumber == null) ? 0 : officeNumber.hashCode());
		result = prime * result + ((subjectTaught == null) ? 0 : subjectTaught.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Teacher))
			return false;
		Teacher other = (Teacher) obj;
		if (numClassesTaught != other.numClassesTaught)
			return false;
		if (officeNumber == null) {
			if (other.officeNumber != null)
				return false;
		} else if (!officeNumber.equals(other.officeNumber))
			return false;
		if (subjectTaught == null) {
			if (other.subjectTaught != null)
				return false;
		} else if (!subjectTaught.equals(other.subjectTaught))
			return false;
		return true;
	}
}
