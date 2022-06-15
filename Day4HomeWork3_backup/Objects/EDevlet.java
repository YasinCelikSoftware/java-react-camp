package Day4HomeWork3;

public class EDevlet {
	private String firstName;
	private String lastName;
	private String yearOfBirth;
	private String nationalIdentity;
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getYearOfBirth() {
		return yearOfBirth;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public EDevlet(String firstName, String lastName, String yearOfBirth, String nationalIdentity) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.nationalIdentity = nationalIdentity;
	}
	
}
