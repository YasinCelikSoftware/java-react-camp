package Day4HomeWork3;

public class Main {

	public static void main(String[] args) {
		
		
		Member member = new Member(1, "Yasin", "Celik","1998" , "39016795127");
		Game game = new Game("Valorant");
		Game riseOnline = new Game("Rise Online");
		Offer offer = new Offer("Yaz Indirimi", 25);
		
		MemberManager memberManager = new MemberManager();
		memberManager.addMember(member);
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(game, member);
		
		OfferManager offerManager = new OfferManager();
		offerManager.addOffer(game, offer);
		offerManager.updateOffer(game, offer);
		offerManager.deleteOffer(game, offer);
		
		gameManager.addGame(riseOnline, member);
		offerManager.addOffer(riseOnline, offer);
		
		EDevletManager eDevletManager = new EDevletManager();
		eDevletManager.realityCheck("Yasin", "Celik", "1998", "39016795127", member);
		
	}

}
