package com.premaseem.statePattern;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public class TreatmentContext {

    PatientHealthState state;
    StablePatientState stablePatientState = new StablePatientState(this);
    UnStablePatientState unStablePatientState = new UnStablePatientState(this);


    public PatientHealthState getState () {
        return state;
    }

    public void setState (PatientHealthState state) {
        this.state = state;
    }


    void prescribeGeneralMedicine () {
        state.prescribeGeneralMedicine();
    }

    void admitInICU () {
        state.admitInICU();
    }

    void supplyOxygen () {
        state.supplyOxygen();
    }

    void supplyNormalFood () {
        state.supplyOralFood();
    }

    void recommendWalking () {
        state.recommendWalking();
    }

}
