public class Benefits {

    private String benefitId;
    private String benefitName;

    public Benefits(String benefitId, String benefitName){

        this.benefitId = benefitId;
        this.benefitName = benefitName;
    }

    public String getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(String benefitId) {
        this.benefitId = benefitId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }
}
