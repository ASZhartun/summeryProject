package dao.apartmentholder;

import entities.ApartmentHolder;

import java.util.List;

public interface ApartmentHolderDao {
    ApartmentHolder getApartmentHolder(int id);

    List<ApartmentHolder> getAllHolders();

    void updateApartmentHolder(ApartmentHolder apartmentHolder);

    void deleteApartmentHolder(ApartmentHolder apartmentHolder);
}
