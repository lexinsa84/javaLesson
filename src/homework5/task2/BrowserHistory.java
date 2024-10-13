package homework5.task2;

import java.util.Deque;
import java.util.LinkedList;

public class BrowserHistory {
    private Deque<String> webSite = new LinkedList<>();
    public void visitSite(String site) {
        webSite.addFirst(site);
    }
    public String back(int steps) {
        if (steps>=webSite.size())return null;
        return webSite.stream().skip(steps).findFirst().orElse(null);
    }
    public Deque<String> getHistory() {
        return webSite;
    }

}
