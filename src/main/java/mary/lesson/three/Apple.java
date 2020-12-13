package mary.lesson.three;

public class Apple extends Fruit
{
    public Apple() {
        super(1.0f);
    }

    public String getType() {
        return this.getClass().getName();
    }
}
