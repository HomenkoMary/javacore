package mary.lesson.three;

public class Orange extends Fruit {

    public Orange() {
        super(1.5f);
    }

    public String getType() {
        return this.getClass().getName();
    }
}
