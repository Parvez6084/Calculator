package com.example.mobileappdevelop.interestcalculator;

class allinall {

    private double priAc;
    private double intAc;
    private double timeac;
    private double sowint;
    private double sowtotal;

    public allinall(double priAc, double intAc, double timeac) {
        this.priAc = priAc;
        this.intAc = intAc;
        this.timeac = timeac;
        calculators();
    }


    public double getSowint() {
        return sowint;
    }

    public double getSowtotal() {
        return sowtotal;
    }


    public void calculators(){


        sowint =(intAc*timeac);
        sowtotal=priAc+sowint;

    }


}

