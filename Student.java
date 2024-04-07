public class Student {
    private String name;
    private String registrationNumber;
    private int credits;
    private int levelOfStudies;



    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getCredits() {
        return credits;
    }

    public int getLevelOfStudies() {
        return levelOfStudies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationNumber(String rn) {
        registrationNumber = rn;
    }

    public void setCredits(int c) {
        credits = c;
    }

    public void setLevelOfStudies(int ls) {
        levelOfStudies = ls;
    }

    public void upgradeCredits(int numberOfCredits){

        credits = credits + numberOfCredits;

    }
    public boolean nextLevel(){
        return credits >= 120;

    }
}
