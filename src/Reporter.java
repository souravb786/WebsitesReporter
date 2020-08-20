import java.util.ArrayList;
import java.util.List;

public class Reporter {

    List<Website> websites;


    public Reporter() {
        websites = new ArrayList<>();
    }


    void broadcastMessage(String message) {
        for (Website i : websites)
            i.obtainMessage(message);
        System.out.println();
    }


    public List<Website> getWebsites() {
        return websites;
    }
}
