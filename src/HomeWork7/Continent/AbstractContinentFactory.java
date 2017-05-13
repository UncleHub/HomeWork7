package HomeWork7.Continent;


public class AbstractContinentFactory {
    public ContinentCityFactory getContinentFactory(String cont){
        if ("europe".equals(cont)){
            return new EuropeCityFactory();
        }
        if ("asia".equals(cont)){
            return new AsiaCityFactory();
        }
        if("america".equals(cont)){
            return new AmericaCityFactory();
        }
        if ("africa".equals(cont)){
            return new AfricaCityFactory();
        }
        if ("australia".equals(cont)){
            return new AustraliaCityFactory();
        }
        throw new IllegalArgumentException("Данный континент ещё не открыли.");
    }
}
