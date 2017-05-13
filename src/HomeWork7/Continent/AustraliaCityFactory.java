package HomeWork7.Continent;

import HomeWork7.Continent.City.*;

/**
 * Created by Serega on 05.05.2017.
 */
public class AustraliaCityFactory implements ContinentCityFactory {
    @Override
    public City getCity(String city) {
        {

            if ("adelaida".equals(city))return new Adelaida();
            if ("melbourne".equals(city))return new Melbourne();
            if ("sydney".equals(city))return new Sydney();
            throw new IllegalArgumentException("Информации по городу "+city+" пока нет.");
        }
    }

    @Override
    public void printList() {
        System.out.println("adelaida, melbourne, sydney");

    }
}
