package phong_airline.demo.enums;

import lombok.Getter;

@Getter
public enum City {
    PARIS(Country.FRANCE),
    NEW_YORK(Country.USA),
    LONDON(Country.UK),
    BERLIN(Country.GERMANY),
    ROME(Country.ITALY),
    MADRID(Country.SPAIN),
    TORONTO(Country.CANADA),
    SYDNEY(Country.AUSTRALIA),
    TOKYO(Country.JAPAN);

    private final Country country;

    City (Country country) {
        this.country = country;
    }

    
}
