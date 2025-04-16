package lib;

public class FamilyStatus {
    private boolean isMarried;
    private int numberOfChildren;

    public FamilyStatus(boolean isMarried, int numberOfChildren) {
        this.isMarried = isMarried;
        this.numberOfChildren = Math.min(numberOfChildren, 3);
    }

    public FamilyStatus() {
        //TODO Auto-generated constructor stub
    }

    public boolean isMarried() {
        return isMarried;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }
}
