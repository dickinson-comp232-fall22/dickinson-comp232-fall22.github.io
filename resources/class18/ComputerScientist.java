import java.time.LocalDate;
import java.util.ArrayList;

public class ComputerScientist {
	private LocalDate birthDate;
	private String name;

	public ComputerScientist(String name, String birthDate) {
		this.birthDate = LocalDate.parse(birthDate);
		this.name = name;
	}

	/**
	 * @return the birthDate
	 */
	LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * @return the name
	 */
	String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " (" + birthDate + ")";
	}

	@Override
	public int hashCode() {
		return birthDate.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComputerScientist other = (ComputerScientist) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		return true;
	}

	public static ArrayList<ComputerScientist> someCompScis() {
		String[][] values = { { "Ada Lovelace", "1815-12-10" },
				{ "Grace Hopper", "1906-12-09" },
				{ "Alan Turing", "1912-06-23" },
				{ "Luis von Ahn", "1978-08-19" },
				{ "Joy Buolamwini", "1990-01-01" }, // approximate
				{ "Judy Faulkner", "1943-08-01" },
				{ "Nate Mitchell", "2004-05-01" }, // approximate
				{ "Shafi Goldwasser", "1959-01-09" }, // approximate
				{ "Yoshua Bengio", "1964-03-05" }, };
		ArrayList<ComputerScientist> famousCompScis = new ArrayList<>();
		for (String[] val : values) {
			ComputerScientist cs = new ComputerScientist(val[0], val[1]);
			famousCompScis.add(cs);
		}
		return famousCompScis;
	}

	public static void main(String[] args) {
		System.out.println("Here are the computer scientists:");
		ArrayList<ComputerScientist> compScis = someCompScis();
		for (ComputerScientist computerScientist : compScis) {
			System.out.println(computerScientist);
		}

		System.out.println();
		System.out.println("Here is an example of a date and its hashcode:");
		LocalDate d = LocalDate.of(1938, 1, 10);
		System.out.println(d + ", hash: " + d.hashCode() + ", hash%9: "
				+ d.hashCode() % 9 + ", hash%18: " + d.hashCode() % 18);
	}
}
