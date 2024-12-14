package projectacme.util;

import java.util.List;
import java.util.Map;

public class Report {
    private List<Map<String, Object>> information;
    private String title;

    public Report(List<Map<String, Object>> information, String title) {
        this.information = information;
        this.title = title;
    }

    public List<Map<String, Object>> getInformation() {
        return information;
    }

    public void setInformation(List<Map<String, Object>> information) {
        this.information = information;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
