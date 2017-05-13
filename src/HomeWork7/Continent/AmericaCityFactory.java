package HomeWork7.Continent;

import HomeWork7.Continent.City.*;


public class AmericaCityFactory implements ContinentCityFactory {
    @Override
    public City getCity(String city) {
        if ("NY".equals(city))return new NY();
        if ("washington".equals(city))return new Washington();
        if ("toronto".equals(city))return new Toronto();
        if ("mexico".equals(city))return new Mexico();
        throw new IllegalArgumentException("Информации по городу "+city+" пока нет.");
    }

    @Override
    public void printList() {
        System.out.println("NY, washington, toronto, mexico");

    }
}
