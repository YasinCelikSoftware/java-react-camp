package Day4HomeWork3;

public class EDevletManager{
	
	boolean checkIfPersonReal = false;
	
	public void realityCheck(String firstName, String lastName, String yearOfBirth, String nationalIdentity, Member member) {
		
		if (firstName == member.getFirstName() && lastName == member.getLastName() && yearOfBirth == member.getYearOfBirth() && nationalIdentity == member.getNationalIdentity()) {
			
			System.out.println(member.getFirstName() + " kisisi e-devlet uzerinde kayitlidir.");
			
		}else {
			
			System.out.println(member.getFirstName() + " kisisi e-devlet uzerinde kayitli degildir.");
			
		}
		
	}
	
	
	
}
