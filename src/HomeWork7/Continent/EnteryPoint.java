package HomeWork7.Continent;

import HomeWork7.Continent.City.City;

import java.util.Scanner;

public class EnteryPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont1, city1;

        System.out.println("europe, africa, america, asia, australia");
        System.out.println("Введите название континента:");

        cont1 = sc.nextLine();

        AbstractContinentFactory abs = new AbstractContinentFactory();
        ContinentCityFactory cityFactory = abs.getContinentFactory(cont1);

        cityFactory.printList();

        System.out.println("Введите название города: ");
        city1 = sc.nextLine();

        City city = cityFactory.getCity(city1);
        city.printPopulation();
    }
}
