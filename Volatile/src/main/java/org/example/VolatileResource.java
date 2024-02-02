package org.example;

public class VolatileResource {

    private volatile Boolean flag = false;

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Boolean getFlag() {
        return flag;
    }
}
