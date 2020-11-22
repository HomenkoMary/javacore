package mary.lesson.one;

public class MainApp {
    public static void main(String args[])
    {
        Man[] manArray = new Man[3];
        manArray[0] = new Man(100, 1, "Антон");
        manArray[1] = new Man(50, 2, "Иван");
        manArray[2] = new Man(150, 1, "Василий");

        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat(50, 1, "Рыжик");
        catArray[1] = new Cat(100, 1, "Полосатик");
        catArray[2] = new Cat(50, 3, "Дымка");

        Droid[] droidArray = new Droid[3];
        droidArray[0] = new Droid(50, 1, "Бэндер");
        droidArray[1] = new Droid(100, 3, "Беймакс");
        droidArray[2] = new Droid(150, 3, "Т 1000");

        Track[] trackArray = new Track[2];
        trackArray[0] = new Track(150);
        trackArray[1] = new Track(100);

        Wall[] wallArray = new Wall[3];
        wallArray[0] = new Wall(1);
        wallArray[1] = new Wall(2);
        wallArray[2] = new Wall(3);

        System.out.println("======== Track ==========");
        System.out.println("======== Man ==========");
        for (int i = 0; i < manArray.length; i++) {
            for (int j = 0; j < trackArray.length; j++) {
                System.out.println(manArray[i].run(trackArray[j].length));
            }
        }
        System.out.println("======== Cat ==========");
        for (int i = 0; i < catArray.length; i++) {
            for (int j = 0; j < trackArray.length; j++) {
                System.out.println(catArray[i].run(trackArray[j].length));
            }
        }
        System.out.println("======== Droid ==========");
        for (int i = 0; i < droidArray.length; i++) {
            for (int j = 0; j < trackArray.length; j++) {
                System.out.println(droidArray[i].run(trackArray[j].length));
            }
        }

        System.out.println("\n======= Wall ===========");
        System.out.println("======== Man ==========");
        for (int i = 0; i < manArray.length; i++) {
            for (int j = 0; j < wallArray.length; j++) {
                System.out.println(manArray[i].jump(wallArray[j].height));
            }
        }
        System.out.println("======== Cat ==========");
        for (int i = 0; i < catArray.length; i++) {
            for (int j = 0; j < wallArray.length; j++) {
                System.out.println(catArray[i].jump(wallArray[j].height));
            }
        }
        System.out.println("======== Droid ==========");
        for (int i = 0; i < droidArray.length; i++) {
            for (int j = 0; j < wallArray.length; j++) {
                System.out.println(droidArray[i].jump(wallArray[j].height));
            }
        }


    }
}
