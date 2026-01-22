package com.example.listycitylab3;
import java.io.Serializable;
public class City implements Serializable{
    private String Name;
    private String province;
    public City(String name, String province) {
        this.Name = name;
        this.province = province;
    }
    public String getName() {
        return Name;
    }
    public String getProvince() {
        return province;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public void setProvince(String province) {
        this.province = province;
    }
}