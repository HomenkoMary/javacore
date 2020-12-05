package mary.lesson.three;

public class Box  {

    private static float weight;
    private static String typeBox = "";

    public static void Add(Fruit item)
    {
        if (typeBox == "") {
            // создаем новую коробку с указанным типом
            typeBox = item.getType();
            weight += item.getWeight();
        }
        else{
            if (typeBox == item.getType()){
                // если тип коробкит соответствет переданному типу фрукта
                weight += item.getWeight();
            }
            else {
                System.out.println("Нельзя положить " + item.getType() + " в коробку с " + typeBox);
            }
        }
    }

    public static float getWeight()
    {
        return weight;
    }

    public static String getTypeBox()
    {
        return typeBox;
    }

}