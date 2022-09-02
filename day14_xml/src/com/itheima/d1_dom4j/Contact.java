package com.itheima.d1_dom4j;

public class Contact {
    private String id;
    private String name;
    private String gender;
    private String email;
    private boolean vip;

    public Contact() {
    }

    public Contact(String id, String name, String gender, String email, boolean vip) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.vip = vip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", vip=" + vip +
                '}';
    }
}
