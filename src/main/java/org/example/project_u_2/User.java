package org.example.project_u_2;

public class User {
    private String uId;
    private String name;
    private String lNameP;
    private String lNameM;
    private String address;
    private String phone;

    public User(String uId, String name, String lNameP, String lNameM, String address, String phone) {
        this.uId = uId;
        this.name = name;
        this.lNameP = lNameP;
        this.lNameM = lNameM;
        this.address = address;
        this.phone = phone;
    }

    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLNameP() {
        return lNameP;
    }

    public void setLNameP(String lNameP) {
        this.lNameP = lNameP;
    }

    public String getLNameM() {
        return lNameM;
    }

    public void setLNameM(String lNameM) {
        this.lNameM = lNameM;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
