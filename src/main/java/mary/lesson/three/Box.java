package mary.lesson.three;

public class Box  {

    private static Fruit item;
    private static float weight;

    public Box(Fruit item) {
        Box.item = item;
        Box.weight = 0;
    }

    public void Add(Fruit item)
    {
        if (CompareType(item)) {
            Box.weight += Box.item.getWeight();
        }
        else{
            System.out.println("Нельзя положить " + item.getType() + " в коробку с " + Box.item.getType());
        }
    }

    private static Boolean CompareType(Fruit compareItem)
    {
        Boolean result = false;
        if (compareItem.getType() == Box.item.getType()) {
            result = true;
        }
        return result;
    }

    public static boolean Compare(Box compareItem)
    {
        Boolean result = false;
        if (compareItem.getWeight() == getWeight()){
            result = true;
        }
        return result;
    }

    public static float getWeight()
    {
        return Box.weight;
    }

    public static String getType()
    {
        return Box.item.getType();
    }
}