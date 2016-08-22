package com.t0rn4d0.fastdoc;

public class Doctor {
    private String phone;
    private String name,spec,add,city,exp,deg;
    
    public Doctor(String city,String spec,String name,String deg,String add,String exp,String phone){
        this.phone=phone;
        this.name=name;
        this.spec=spec;
        this.add=add;
        this.city=city;
        this.exp=exp;
        this.deg=deg;
    }



    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }



}
