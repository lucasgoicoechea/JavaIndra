import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ElementoSet elemento1= new ElementoSet(25.4,"P2");
        ElementoSet elemento2= new ElementoSet(40.2,"J0");
        ElementoSet elemento3= new ElementoSet(73.9,"T3");
        Set<ElementoSet> setSet= new HashSet<>();
        setSet.add(elemento1);
        setSet.add(elemento2);
        setSet.add(elemento3);
        setSet.forEach(x -> System.out.println(x.toString()));
    }
}
