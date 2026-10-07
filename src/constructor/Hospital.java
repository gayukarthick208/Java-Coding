package constructor;

public class Hospital {
	Hospital(String hospitalname) {
		System.out.println("hospitalname:" + hospitalname);

	}

	public Hospital(int patientID, String patientname, int age, String Disease) {
		System.out.println("patientID :" + patientID);
		System.out.println("patientname :" + patientname);
		System.out.println("age :" + age);
		System.out.println("Disease :" + Disease);
	}

	Hospital(String Bloodgroup, String gender, Float billamount) {
		System.out.println("Bloodgroup:" + Bloodgroup);
		System.out.println("gender:" + gender);
		System.out.println("billamount:" + billamount);

	}

	public Hospital(String Diagnosed_By, int Room_number) {
		System.out.println("Diagnosed_By: " + Diagnosed_By);
		System.out.println("Room_number:" + Room_number);
		

	}

	public static void main(String[] args) {
		Hospital a = new Hospital("JIPMER");
		Hospital b = new Hospital(76597, "Isha", 22, "cold");
		Hospital c = new Hospital("a +ve", "female", 450.986f);
		Hospital d = new Hospital("Diana", 34433);

	}

}
