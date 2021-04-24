package com.example.assignmentsecond;

public class VerData {

    private String dataname, expdataone,expdatatwo;
    private  boolean expendable;

    public boolean isExpendable() {
        return expendable;
    }

    public void setExpendable(boolean expendable) {
        this.expendable = expendable;
    }

    public VerData(String dataname, String expdataone, String expdatatwo) {
        this.dataname = dataname;
        this.expdataone = expdataone;
        this.expdatatwo = expdatatwo;
        this.expendable = false;
    }

    public String getDataname() {
        return dataname;
    }

    public void setDataname(String dataname) {
        this.dataname = dataname;
    }

    public String getExpdataone() {
        return expdataone;
    }

    public void setExpdataone(String expdataone) {
        this.expdataone = expdataone;
    }

    public String getExpdatatwo() {
        return expdatatwo;
    }

    public void setExpdatatwo(String expdatatwo) {
        this.expdatatwo = expdatatwo;
    }

    @Override
    public String toString() {
        return "VerData{" +
                "dataname='" + dataname + '\'' +
                ", expdataone='" + expdataone + '\'' +
                ", expdatatwo='" + expdatatwo + '\'' +
                '}';
    }
}
