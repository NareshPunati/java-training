package com.example.springdemo.Model;

import java.util.ArrayList;
import java.util.List;

public class Benefits {
    private int benefitId;
    private String benefitName;

    public Benefits(int benefitId, String benefitName) {
        this.benefitId = benefitId;
        this.benefitName = benefitName;
    }
    private List<Benefits> benefits = new ArrayList<>();
    public int getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(int benefitId) {
        this.benefitId = benefitId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

}
