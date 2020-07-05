public class EligibilityVoting {
    public boolean isEligible(int age) {
        return age >= 18;
    }

    public boolean isPresidentElection(int presidentAge) {
        return presidentAge >= 35 && presidentAge <= 50;
    }

    public boolean isChiefMinisterElection(int chiefMinisterAge) {
        return chiefMinisterAge >= 25 && chiefMinisterAge <= 40;
    }
}
