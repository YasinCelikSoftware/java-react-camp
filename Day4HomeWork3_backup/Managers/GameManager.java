package Day4HomeWork3;

public class GameManager implements IGame {

	@Override
	public void addGame(Game game, Member member) {
		
		System.out.println(member.getFirstName()+ " has new game : "+ game.getName());
		
	}

	@Override
	public void deleteGame(Game game, Member member) {
		
		System.out.println(member.getFirstName()+ " has delete a game : "+ game.getName());
		
	}

	@Override
	public void updateGame(Game game, Member member) {

		System.out.println(member.getFirstName()+ " has update a game : "+ game.getName());
		
	}

}
