import javafx.scene.control.*;
import java.util.*;
import java.text.*;

public class Student extends Person{

    private String major;
    private int credits;
    private double GPA;
    private TextInputDialog td;

    public Student(Name name, Date DOB, Character gender, boolean isSmoker, String major, int credits, double GPA) {
    	super(name, DOB, gender, isSmoker);
        setMajor(major);
        setCredits(credits);
        setGPA(GPA);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        char f = Character.toUpperCase(major.charAt(0));
        major = f + major.substring(1);

        this.major = major;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        boolean good;
        td = new TextInputDialog();
        td.setHeaderText("enter a valid amount of credits");
        do {
            good = true;
            if (credits < 0) {
                good = false;
                Methods.alert("age!");
                td.showAndWait();
                credits = Integer.parseInt(td.getEditor().getText());
            }
        } while (!good);
        this.credits = credits;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        boolean good;
        td = new TextInputDialog();
        td.setHeaderText("enter a valid gpa (0.0-5.0)");

        do {
            good = true;
            if (GPA < 0.0 || GPA > 5.0) {
               good = false;
               Methods.alert("gpa (0.0-5.0)!");
               td.showAndWait();
               GPA = Double.parseDouble(td.getEditor().getText());
            }
        } while(!good);
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###,###.00");
        return super.toString() + major + " (" +df.format(GPA) + ") | credits: " + credits;
    }


    //======================================================================


    public String listStudent(ArrayList<Student> peeps) {
        String message = "";
        int i = 1;
        for(Student p : peeps) {
            message += "[" + i + "] " + p + "\n";
            i++;
        }
        return message;
    } //end listStudent

}

