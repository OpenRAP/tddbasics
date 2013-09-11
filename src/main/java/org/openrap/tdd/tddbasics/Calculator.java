package org.openrap.tdd.tddbasics;

class Calculator {

    private int total = 0;

    static int subtractNoSideEffected(int currentTotal, int valueToSubtract) {
        if (valueToSubtract < 0) {
            throw new IllegalArgumentException("Subtracting negative numbers is not allowed :" + valueToSubtract);
        }
        return currentTotal - valueToSubtract;
    }

    public void add(int valueToAdd) {
        total = addNoSideEffected(total, valueToAdd);
    }

    public int getValue() {
        return total;
    }

    public void subtract(int valueToSubtract) {
        total = subtractNoSideEffected(total, valueToSubtract);
    }

    static int addNoSideEffected(int currentTotal, int valueToAdd) throws IllegalArgumentException {
        if (valueToAdd < 0) {
            throw new IllegalArgumentException("Adding negative numbers is not allowed :" + valueToAdd);
        }
        return currentTotal + valueToAdd;
    }
}
