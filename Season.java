package com.company.java_core.homework8.task1;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    private Month month;

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }
}
