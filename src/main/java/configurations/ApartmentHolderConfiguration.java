package configurations;

import entities.Address;
import entities.ApartmentHolder;
import entities.HolderData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApartmentHolderConfiguration {
    @Bean("citizen")
    @Scope("prototype")
    public ApartmentHolder getApartmentHolder() {
        return new ApartmentHolder();
    }

    @Bean("citizenData")
    @Scope("prototype")
    public HolderData getHolderData() {
        return new HolderData();
    }

    @Bean("citizenAddress")
    @Scope("prototype")
    public Address getAddress() {
        return new Address();
    }
}
