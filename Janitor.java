import javafx.scene.control.*;
import java.util.*;
import java.text.*;

public class Janitor extends Person {
	// fields
	private int yearsOfService;
	private String buildingMaintained;
	private double hourlyPayRate;
	private TextInputDialog td;

	public Janitor(Date dOB, Character gender, boolean isSmoker) {
		super(dOB, gender, isSmoker);

	}

	public int getYearsOfService() {
		return yearsOfService;
	}

	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	public String getBuildingMaintained() {
		return buildingMaintained;
	}

	public void setBuildingMaintained(String buildingMaintained) {
		this.buildingMaintained = buildingMaintained;
	}

	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	public void setHourlyPayRate(double hourlyPayRate) {
		// create Text Dialogs
		td = new TextInputDialog();
		td.setHeaderText("Enter a valid pay rate");
		boolean valid = false;
		// while value is not correct
		while (!valid) {
			// check payRate is in acceptable range
			if (hourlyPayRate >= 10.00 && hourlyPayRate <= 25.00) {
				this.hourlyPayRate = hourlyPayRate;
				valid = true;
			} else {
				// alert issue with payrate value
				Methods.alert("pay rate");
				hourlyPayRate = Double.parseDouble(td.getEditor().getText());
			} // end else
		} // end while
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildingMaintained == null) ? 0 : buildingMaintained.hashCode());
		long temp;
		temp = Double.doubleToLongBits(hourlyPayRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + yearsOfService;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Janitor))
			return false;
		Janitor other = (Janitor) obj;
		if (buildingMaintained == null) {
			if (other.buildingMaintained != null)
				return false;
		} else if (!buildingMaintained.equals(other.buildingMaintained))
			return false;
		if (Double.doubleToLongBits(hourlyPayRate) != Double.doubleToLongBits(other.hourlyPayRate))
			return false;
		if (yearsOfService != other.yearsOfService)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Janitor [yearsOfService=" + yearsOfService + ", buildingMaintained=" + buildingMaintained
				+ ", hourlyPayRate=" + hourlyPayRate + "]";
	}

}
