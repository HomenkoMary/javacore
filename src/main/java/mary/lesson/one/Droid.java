package mary.lesson.one;

public class Droid {

    private String name;
    private int runningDistance;
    private int heightOfJump;

    public Droid(Integer runningDistance, Integer heightOfJump, String name)
    {
        this.name = name;
        this.runningDistance = runningDistance;
        this.heightOfJump = heightOfJump;
    }

    public String run(Integer runningDistance)
    {
        String result = "";
        if (runningDistance > this.runningDistance){
            result = "Дроид " +  this.name + " Не смог пробежать " + runningDistance + " м.";
        }
        else{
            result = "Дроид " +  this.name + " Смог пробежать " + runningDistance + " м.";
        }
        return result;
    }

    public String jump(Integer heightOfJump)
    {
        String result = "";
        if (heightOfJump > this.heightOfJump){
            result = "Дроид " +  this.name + " Не смог перепрыгнуть стену высотой " + heightOfJump + " м.";
        }
        else{
            result =  "Дроид " +  this.name + " Смог перепрыгнуть стену высотой " + heightOfJump + " м.";
        }
        return result;
    }

}
