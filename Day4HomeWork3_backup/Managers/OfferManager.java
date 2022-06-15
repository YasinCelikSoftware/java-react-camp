package Day4HomeWork3;

public class OfferManager implements IOffer {

	@Override
	public void addOffer(Game game, Offer offer) {
		
		System.out.println("For "+game.getName()+" , " + offer.getName() +" offer started with " + offer.getDiscount() + "% discount.");
		
	}

	@Override
	public void deleteOffer(Game game, Offer offer) {

		System.out.println("For "+game.getName()+" , " + offer.getName() +" offer deleted.");
		
	}

	@Override
	public void updateOffer(Game game, Offer offer) {

		System.out.println("For "+game.getName()+" , " + offer.getName() +" offer updated with " + offer.getDiscount() + "% discount.");
		
	}

}
