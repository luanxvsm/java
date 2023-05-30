import java.util.Collection;
import java.util.Iterator;

public class removeColors {
    private static void removeColors(Collection<String> collection1, Collection<String> collection2){

        Iterator<String> iterator = collection1.iterator();

        while(iterator.hasNext()){
            if(collection2.contains(iterator.next()))
            iterator.remove();
        }
    }
}
