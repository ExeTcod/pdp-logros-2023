public class Rank {
    private String rankName;
    private int requiredPoints;

    public Rank(){
    }
    public Rank(String rankName,int requiredPoints){
        this.rankName=rankName;
        this.requiredPoints=requiredPoints;
    }
    public String getRankName() {
        return rankName;
    }
    public void setRankName(String rankName) {
        this.rankName = rankName;
    }
    public int getRequiredPoints() {
        return requiredPoints;
    }
    public void setRequiredPoints(int requiredPoints) {
        this.requiredPoints = requiredPoints;
    }
}
