package java8Features.forEachMethod;
import java.util.ArrayList;
import java.util.List;

public class ForEachExample1 {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        System.out.println("-------Iterating by forEach---------");
        gamesList.forEach(games -> System.out.println(games));

        System.out.println("-------Iterating by forEachOrder----");
        gamesList.stream().forEachOrdered(game -> System.out.println(game));
    }
}
