import java.util.ArrayList;
import java.util.List;

public class HalloJavaMitForEach {
    List<String> stringList = new ArrayList<>();

    public void addStrings(int amount) {
        for (int i = 0; i < amount; i++) {
            stringList.add("string" + i);
        }
    }

    public void printListForEach() {
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
