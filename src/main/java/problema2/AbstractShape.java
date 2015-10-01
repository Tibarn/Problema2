package problema2;

/**
 * Created by Feliu on 30/09/2015.
 */
public abstract class AbstractShape implements Shape {
    private String type;

    public AbstractShape(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "I'm a " + type;
    }
}