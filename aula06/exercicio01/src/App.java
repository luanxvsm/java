import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args){
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();

        for(String color: colors)
        list.add(color);

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        for(String color : removeColors)
        removeList.add(color);

        System.out.println("ArrayList: ");

        for(int count=0; count<list.size(); count++)
        System.out.printf("%s ", list.get(count));

        removeColors(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for(String color : list)
        System.out.printf("%s", color);
    }
}
