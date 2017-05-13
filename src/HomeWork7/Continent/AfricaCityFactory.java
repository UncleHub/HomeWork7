package HomeWork7.Continent;

import HomeWork7.Continent.City.*;


public class AfricaCityFactory implements ContinentCityFactory {
    @Override
    public City getCity(String city) {
        if ("algir".equals(city))return new Algir();
        if ("capetown".equals(city))return new CapeTown();
        if ("kair".equals(city))return new Kair();
        throw new IllegalArgumentException("Информации по городу "+city+" пока нет.");
    }

    @Override
    public void printList() {
        System.out.println("algir, capetown, kair");

    }
}
