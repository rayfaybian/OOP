package com.company;

public class Tire {

    public enum KIND {WINTER,SUMMER,ALLYEAR}

    private String Brand;
    private int size;
    private KIND kind;

    public Tire(String Brand,int size, KIND kind){
        this.Brand = Brand;
        this.size = size;
        this.kind = kind;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public KIND getKind() {
        return kind;
    }

    public void setKind(KIND kind) {
        this.kind = kind;
    }


}
