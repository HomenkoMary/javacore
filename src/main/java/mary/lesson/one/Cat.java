package mary.lesson.one;

public class Cat {

    private String name;
    private int runningDistance;
    private int heightOfJump;

    public Cat(Integer runningDistance, Integer heightOfJump, String name)
    {
        this.name = name;
        this.runningDistance = runningDistance;
        this.heightOfJump = heightOfJump;
    }

    public String run(Integer runningDistance)
    {
        String result = "";
        if (runningDistance > this.runningDistance){
            result = "Кот " +  this.name + " Не смог пробежать " + runningDistance + " м.";
        }
        else{
            result = "Кот " +  this.name + " Смог пробежать " + runningDistance + " м.";
        }
        return result;
    }

    public String jump(Integer heightOfJump)
    {
        String result = "";
        if (heightOfJump > this.heightOfJump){
            result = "Кот " +  this.name + " Не смог перепрыгнуть стену высотой " + heightOfJump + " м.";
        }
        else{
            result =  "Кот " +  this.name + " Смог перепрыгнуть стену высотой " + heightOfJump + " м.";
        }
        return result;
    }

}
