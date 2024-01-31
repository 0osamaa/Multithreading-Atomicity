package org.example;

public class SharedResources {

    private volatile Boolean flag = false;

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Boolean getFlag() {
        return flag;
    }
}
