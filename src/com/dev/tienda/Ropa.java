package com.dev.tienda;

import java.util.ArrayList;

public class Ropa {

    private ArrayList<Pantalon> jeans;
    private ArrayList<Vestido> dresses;

    public ArrayList<Vestido> getDresses() {
        return dresses;
    }

    public void setDresses(ArrayList<Vestido> dresses) {
        this.dresses = dresses;
    }

    public ArrayList<Pantalon> getJeans() {
        return jeans;
    }

    public void setJeans(ArrayList<Pantalon> jeans) {
        this.jeans = jeans;
    }

}
