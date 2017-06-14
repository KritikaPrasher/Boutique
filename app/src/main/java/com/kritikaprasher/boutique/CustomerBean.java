package com.kritikaprasher.boutique;

/**
 * Created by pranavprashar on 5/17/17.
 */

public class CustomerBean {
    int id;
    String name;
    String phone;
    String email;
    String address;
    String city;
    String dob;
    String husbandnumber;
    String anniversarydate;

    public CustomerBean() {
    }

    public CustomerBean(int id, String name, String phone, String email, String address, String city, String dob, String husbandnumber, String anniversarydate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.dob = dob;
        this.husbandnumber = husbandnumber;
        this.anniversarydate = anniversarydate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getHusbandnumber() {
        return husbandnumber;
    }

    public void setHusbandnumber(String husbandnumber) {
        this.husbandnumber = husbandnumber;
    }

    public String getAnniversarydate() {
        return anniversarydate;
    }

    public void setAnniversarydate(String anniversarydate) {
        this.anniversarydate = anniversarydate;
    }

    @Override
    public String toString() {
        return "CustomerBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", dob='" + dob + '\'' +
                ", husbandnumber='" + husbandnumber + '\'' +
                ", anniversarydate='" + anniversarydate + '\'' +
                '}';
    }
}
