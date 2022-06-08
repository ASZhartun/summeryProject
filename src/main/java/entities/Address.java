package entities;

import java.sql.Date;
import java.util.Objects;

/**
 * Address where holder is living nowadays.
 */
public class Address {
    private String city;
    private int house;
    private String corpus;
    private int apartment;
    private Date openDate;

    public Address() {

    }

    public Address(String city, int house, String corpus, int apartment, Date openDate) {
        this.city = city;
        this.house = house;
        this.corpus = corpus;
        this.apartment = apartment;
        this.openDate = openDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getCorpus() {
        return corpus;
    }

    public void setCorpus(String corpus) {
        this.corpus = corpus;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return house == address.house && apartment == address.apartment && city.equals(address.city) && Objects.equals(corpus, address.corpus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, house, corpus, apartment);
    }
}
