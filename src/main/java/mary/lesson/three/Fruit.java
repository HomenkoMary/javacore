package mary.lesson.three;

public abstract class Fruit<T> {

    private T obj;
    private float weight;

    public Fruit(T оbj) {
        this.obj = оbj;
    }

    public T getObj() {
        return obj;
    }

    public String getType() {
        return obj.getClass().getName();
    }

    public Fruit(float weight)
    {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }

}