package cgi.Mockito;
import org.mockito.Mockito;

import java.util.List;

public class MockitoDemo {
    private List<String> fruits;

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }
}
