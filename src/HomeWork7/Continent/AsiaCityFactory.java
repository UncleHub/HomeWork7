package HomeWork7.Continent;

import HomeWork7.Continent.City.*;


public class AsiaCityFactory implements ContinentCityFactory {
    @Override
    public City getCity(String city) {
        {

            if ("astana".equals(city))return new Astana();
            if ("boliwood".equals(city))return new Boliwood();
            if ("pekin".equals(city))return new Pekin();
            if ("seul".equals(city))return new Seul();
            if ("ulan-bator".equals(city))return new UlanBator();
            throw new IllegalArgumentException("Информации по городу "+city+" пока нет.");
        }
    }

    @Override
    public void printList() {
        System.out.println("astana, boliwood, pekin, seul, ualn-bator");

    }
}
