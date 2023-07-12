public class Card {
    private String cardHolderName;
    private int idNumber;
    private int earnedPoints = 0;

    public Card(String cardHolderName, int idNumber) {
        this.cardHolderName = cardHolderName;
        this.idNumber = idNumber;
    }

    public void recordTransaction(double amountSpent){
        int points = (int) (amountSpent / 100) * 10;
        incrementPoints(points);
    }

    protected void incrementPoints(int points){
        earnedPoints += points;
    }

    public boolean claimReward(){
        if(earnedPoints >= 150){
            earnedPoints -= 150;
            return true;
        }
        return false;
    }

    public void displayInformation(){
        System.out.println("Card Holder : " + cardHolderName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Earned Points: " + earnedPoints);
        System.out.println("Claim award :" + claimRewardResponse());
    }

    protected String claimRewardResponse() {
        int requiredPoints = 150 - earnedPoints;
        if (requiredPoints > 0) {
            double minAmount = requiredPoints * 10; // Calculate minimum amount to earn required points
            return "You need to spend at least " + minAmount + " more pesos to earn an award.";
        } else {
            return "Please claim reward";
        }
    }

    protected int getEarnedPoints() {
        return earnedPoints;
    }
}