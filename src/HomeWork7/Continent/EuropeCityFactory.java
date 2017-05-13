package HomeWork7.Continent;

import HomeWork7.Continent.City.*;

public class EuropeCityFactory implements ContinentCityFactory {

    @Override
    public City getCity(String city) {

        if ("kiev".equals(city))return new Kiev();
        if ("amsterdam".equals(city))return new Amsterdam();
        if ("berlin".equals(city))return new Berlin();
        if ("london".equals(city))return new London();
        if ("paris".equals(city))return new Paris();
        throw new IllegalArgumentException("Информации по городу "+city+" пока нет.");
    }

    @Override
    public void printList() {
        System.out.println("amsterdam, berlin, london, paris, kiev.");

    }


}
