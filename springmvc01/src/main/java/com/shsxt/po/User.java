package com.shsxt.po;

import java.util.*;

/**
 * Created by xlf on 2019/4/13.
 */
public class User {
    private String name;
    private String pwd;

    //    private List<Phone> phones;
    private Set<Phone> phones = new HashSet<>();

    private Map<String, Phone> map = new HashMap<>();

    private Phone phone;

    public User() {
        phones.add(new Phone());
        phones.add(new Phone());
        phones.add(new Phone());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


//    public List<Phone> getPhones() {
//        return phones;
//    }
//
//    public void setPhones(List<Phone> phones) {
//        this.phones = phones;
//    }


    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Map<String, Phone> getMap() {
        return map;
    }

    public void setMap(Map<String, Phone> map) {
        this.map = map;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phones=" + phones +
                ", map=" + map +
                ", phone=" + phone +
                '}';
    }
}
