
public class Cat
{
    public static final int EYES_COUNT = 2;
    public static final Double MIN_WEIGHT = 1000.0;
    public static final Double MAX_WEIGHT = 9000.0;

    private double originWeight;
    private double weight;

    public double feedAmount;
    public boolean isAlive = true;

    private static int count = 0;

    private CatColor color;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat(double originWeight){

        this.originWeight = originWeight;
        this.weight = originWeight;
        count++;

    }

    public Cat makeTwin()
    {
        Cat cat = new Cat();
        cat.originWeight = originWeight;
        cat.weight = weight;
        return cat;
    }


    public void meow()
    {
        if(isAlive) {
            weight = weight - 1;
            System.out.println("Meow");
            if (weight < MIN_WEIGHT) {
                count--;
                this.isAlive = false;
            }
        }
        else{
            System.out.println("Cat is dead. And dead cat have no voice.");
        }
    }

    public void feed(Double feedAmount)
    {
        if(isAlive) {
            this.feedAmount = feedAmount;
            weight = weight + feedAmount;

            if (weight > MAX_WEIGHT) {
                count--;
                this.isAlive = false;
            }
        }
        else{
            System.out.println("Cat is dead! Don't feed him!");
        }
    }

    public void drink(Double amount)
    {
        if(isAlive) {
            weight = weight + amount;
            if (weight > MAX_WEIGHT) {
                count--;
                this.isAlive = false;
            }
        }
        else{
            System.out.println("Cat is dead! He does not want to drink.");
        }
    }

    public void poops()
    {
        if(isAlive) {
            weight = weight - 200 * Math.random();
            System.out.println("Uffff");
            if (weight < MIN_WEIGHT) {
                count--;
                isAlive = false;
            }
        }
        else{
            System.out.println("Cat is dead. Deal with it.");
        }
    }

    public Double getWeight()
    {
        return weight;
    }


    public void setColor(CatColor color) {
        this.color = color;
    }


    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public boolean isAlive(){
        if(this.getStatus().equals("Dead")){
            return isAlive = false;
        }
        else return isAlive = true;
    }

    public static int getCount()
    {
        return count;
    }
}