package mary.lesson.three;

public abstract class Fruit {

    private float weight;
    private String type;

    public Fruit(float weight, String type)
    {
        this.weight = weight;
        this.type = type;
    }

    float getWeight() {
        return weight;
    }

    String getType(){
        return type;
    }
}