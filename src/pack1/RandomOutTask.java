package pack1;

import java.util.Random;
public class RandomOutTask implements Task{

    public RandomOutTask() {
        Random rand= new Random();
        this.rndnr =rand.nextInt(99999);

    }

    int rndnr;
    public void execute()
    {
        System.out.println(rndnr);
    }

}
