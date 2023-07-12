public class AdvantageCard extends Card{
    public AdvantageCard(String cardHolderName, int idNumber) {
        super(cardHolderName, idNumber);
    }

    public void recordTransaction(double amountSpent) {
        super.recordTransaction(amountSpent);
    }

    protected String claimRewardResponse() {
        return super.claimRewardResponse();
    }
}
