package com.mysite.ml.toDoSite;

public enum Priority {
    LOW("Mało ważne"),
    MODERATE("Średnio ważne"),
    HIGH("Bardzo ważne");

    private final String displayName;

    private Priority(String displayName){
        this.displayName = displayName;
    }
    public String getDisplayName(){
        return displayName;
    }
}
