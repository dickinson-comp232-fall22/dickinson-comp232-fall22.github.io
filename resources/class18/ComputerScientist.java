import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * The ComputerScientist class is a simple class used to demonstrate hash
 * tables. Each instance of the class stores the name and date of birth of
 * a computer scientist.
 * 
 * @author jmac
 */
public class ComputerScientist {

	// The date on which the computer scientist was born.
	private LocalDate birthDate;

	// The name of the computer scientist, e.g. "Ada Lovelace"
	private String name;

	/**
	 * Construct a new ComputerScientist object storing the name and date
	 * of birth of a computer scientist.
	 * 
	 * @param name      The name of the computer scientist, e.g. "Ada
	 *                  Lovelace"
	 * @param birthDate The date of birth of the computer scientist,
	 *                  expressed as a string in the format YYYY-MM-DD,
	 *                  e.g. "1972-06-30"
	 */
	public ComputerScientist(String name, String birthDate) {
		// This will throw a run-time exception if the string is not
		// correctly formatted as the date, but for simplicity we choose
		// not to deal with that here.
		this.birthDate = LocalDate.parse(birthDate);

		this.name = name;
	}

	/**
	 * @return the date on which the computer scientist was born
	 */
	LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * @return the name of the computer scientist
	 */
	String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " (" + birthDate + ")";
	}

	/**
	 * @return An Arraylist containing ComputerScientist objects that
	 *         represent some famous computer scientists, including two
	 *         Dickinson alums.
	 */
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

		////////////////////////////////////////////////////////////////////
		///// Print the list of famous computer scientists
		////////////////////////////////////////////////////////////////////
		System.out.println("Here are the computer scientists:");
		ArrayList<ComputerScientist> compScis = someCompScis();
		for (ComputerScientist computerScientist : compScis) {
			System.out.println(computerScientist);
		}

		////////////////////////////////////////////////////////////////////
		///// Print an example of a date and its hash code.
		////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out
				.println("Here is an example of a date and its hashcode:");
		LocalDate d = LocalDate.of(1938, 1, 10);
		System.out.println(d + ", hash: " + d.hashCode() + ", hash%9: "
				+ d.hashCode() % 9 + ", hash%18: " + d.hashCode() % 18);

		////////////////////////////////////////////////////////////////////
		///// Construct a hash table of computer scientists using key-value
		///// pairs in which the key is the birthdate and the value is the
		///// name of the computer scientist.
		////////////////////////////////////////////////////////////////////
		HashMap<LocalDate, String> compSciMap = new HashMap<>();
		for (ComputerScientist computerScientist : compScis) {
			compSciMap.put(computerScientist.getBirthDate(),
					computerScientist.getName());
		}

		////////////////////////////////////////////////////////////////////
		//// Demonstrate how to look up the name of computer scientist
		//// given the date of birth.
		////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("Now trying some lookups of specific dates...");
		LocalDate[] datesToLookup = { LocalDate.of(1912, 6, 23),
				LocalDate.of(1975, 8, 15), LocalDate.of(1943, 8, 1),
				LocalDate.of(1959, 1, 9), LocalDate.of(1943, 8, 19),
				LocalDate.of(1964, 3, 23), };
		for (LocalDate date : datesToLookup) {
			String name = compSciMap.get(date);
			if (name == null) {
				System.out.println(
						"No known computer scientist was born on " + date);
			} else {
				System.out.println(name + " was born on " + date);
			}
		}
	}
}
