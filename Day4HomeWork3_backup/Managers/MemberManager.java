package Day4HomeWork3;

public class MemberManager implements IMember {

	@Override
	public void addMember(Member member) {
		
		System.out.println(member.getFirstName() + " is registered.");
		
	}

	@Override
	public void deleteMember(Member member) {
		
		System.out.println(member.getFirstName() + " is deleted.");
		
	}

	@Override
	public void updateMember(Member member) {

		System.out.println(member.getFirstName() + " is updated.");
		
	}

}
