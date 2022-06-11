package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Objects;

@Component
public class HolderData {
    private String id;
    private String docNumber;
    private String name;
    private String surname;
    private Date birth;
    private Address address;

    public HolderData() {

    }
    @Autowired
    public HolderData(String id, String docNumber, String name, String surname, Date birth, Address address) {
        this.id = id;
        this.docNumber = docNumber;
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HolderData that = (HolderData) o;
        return id.equals(that.id) && docNumber.equals(that.docNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, docNumber);
    }
}
