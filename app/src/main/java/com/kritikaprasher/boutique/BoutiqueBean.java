package com.kritikaprasher.boutique;

/**
 * Created by pranavprashar on 5/18/17.
 */

public class BoutiqueBean {
    int idb;
    String nameb;
    String phoneb;
    String emailb;
    String addressb;
    String cityb;
    String dobb;

    public BoutiqueBean() {
    }

    public BoutiqueBean(int idb, String nameb, String phoneb, String emailb, String addressb, String cityb, String dobb) {
        this.idb = idb;
        this.nameb = nameb;
        this.phoneb = phoneb;
        this.emailb = emailb;
        this.addressb = addressb;
        this.cityb = cityb;
        this.dobb = dobb;
    }

    public int getIdb() {
        return idb;
    }

    public void setIdb(int idb) {
        this.idb = idb;
    }

    public String getNameb() {
        return nameb;
    }

    public void setNameb(String nameb) {
        this.nameb = nameb;
    }

    public String getPhoneb() {
        return phoneb;
    }

    public void setPhoneb(String phoneb) {
        this.phoneb = phoneb;
    }

    public String getEmailb() {
        return emailb;
    }

    public void setEmailb(String emailb) {
        this.emailb = emailb;
    }

    public String getAddressb() {
        return addressb;
    }

    public void setAddressb(String addressb) {
        this.addressb = addressb;
    }

    public String getCityb() {
        return cityb;
    }

    public void setCityb(String cityb) {
        this.cityb = cityb;
    }

    public String getDobb() {
        return dobb;
    }

    public void setDobb(String dobb) {
        this.dobb = dobb;
    }

    @Override
    public String toString() {
        return "BoutiqueBean{" +
                "idb=" + idb +
                ", nameb='" + nameb + '\'' +
                ", phoneb='" + phoneb + '\'' +
                ", emailb='" + emailb + '\'' +
                ", addressb='" + addressb + '\'' +
                ", cityb='" + cityb + '\'' +
                ", dobb='" + dobb + '\'' +
                '}';
    }
}
