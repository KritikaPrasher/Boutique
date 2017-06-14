package com.kritikaprasher.boutique;

/**
 * Created by pranavprashar on 5/18/17.
 */

public class Category {
    private int id1;
    private String categoryname;

    public Category() {
    }

    public Category(int id1, String categoryname) {
        this.id1 = id1;
        this.categoryname = categoryname;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id1=" + id1 +
                ", categoryname='" + categoryname + '\'' +
                '}';
    }
}
