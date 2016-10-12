package classes;

import java.util.List;

/**
 * Created by Albert on 11.10.2016.
 */
public class Day {

    private List<Event> events;
    private List<Suggestion> suggestions;

    public List<Suggestion> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }

    public List<Event> getEvents() {

        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
