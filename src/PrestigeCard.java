public class PrestigeCard extends Card{
    public PrestigeCard(String cardHolderName, int idNumber) {
        super(cardHolderName, idNumber);
    }

    public void recordTransaction(double amountSpent) {
        int points = (int) (amountSpent / 90) * 15;
        incrementPoints(points);
    }

    protected String claimRewardResponse() {
        int requiredPoints = 150 - getEarnedPoints();
        if (requiredPoints > 0) {
            double minAmount = requiredPoints * 10;
            return "You need to spend at least " + minAmount + " more pesos to earn an award.";
        } else {
            return "Please claim reward";
        }
    }
}
