package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Alienn {
    @Id
    private int aid;

    private String aname;
    private String tech;
    @OneToMany
    private List<Laptopp> laptop;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptopp> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptopp> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alienn{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
