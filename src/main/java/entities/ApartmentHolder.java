package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ApartmentHolder {
    private int id;
    private HolderData holderData;

    @Autowired
    public ApartmentHolder(int id, HolderData holderData) {
        this.id = id;
        this.holderData = holderData;
    }

    public ApartmentHolder() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HolderData getHolderData() {
        return holderData;
    }

    public void setHolderData(HolderData holderData) {
        this.holderData = holderData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApartmentHolder that = (ApartmentHolder) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "citizen is here!";
    }
}
