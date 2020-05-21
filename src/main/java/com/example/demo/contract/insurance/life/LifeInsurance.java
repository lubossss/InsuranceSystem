package com.example.demo.contract.insurance.life;


import com.example.demo.contract.Contract;
import com.example.demo.user.User;

import javax.validation.constraints.NotNull;

public abstract class LifeInsurance extends Contract {
    @NotNull
    protected User insured;

    public LifeInsurance() {
    }

    public LifeInsurance(long contractNumber) {
        super(contractNumber);
    }

    public String getName() {
        return super.getName();
    }

    public User getInsured() {
        return insured;
    }

    public void setInsured(User insured) {
        isNull(insured, "Not null");
        this.insured = insured;
    }

    @Override
    public void copy(Contract contract) {
        super.copy(contract);
        insured = ((LifeInsurance) contract).getInsured();
    }

    @Override
    public String toString() {
        return super.toString() + "LifeInsurance{" +
                "insured=" + insured +
                '}';
    }
}
