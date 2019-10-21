
public class Cat
{
    public static final int EYES_COUNT = 2;
    public static final Double MIN_WEIGHT = 1000.0;
    public static final Double MAX_WEIGHT = 9000.0;

    private double originWeight;
    private double weight;

    public String color;

    private static int count = 0;

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
        weight = weight - 1;
        System.out.println("Meow");
        if (weight < MIN_WEIGHT)
        {
            count--;
        }
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        if (weight > MAX_WEIGHT)
        {
            count--;
        }
    }

    public Double feedAmount()
    {
        Double feedAmount = weight - originWeight;
        return feedAmount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        if (weight > MAX_WEIGHT)
        {
            count--;
        }
    }

    public void poops()
    {
        weight = weight - 200 * Math.random();
        System.out.println("Uffff");
        if (weight < MIN_WEIGHT)
        {
            count--;
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public void setCatColors(CatColors colors){
        if(colors.equals(CatColors.GINGER)){
            this.color = "Рыжий";
        }
        else if(colors.equals(CatColors.RUSSIAN_BLUE)){
            this.color = "Русский голубой";
        }
        else if(colors.equals(CatColors.WHITE)){
            this.color = "Белый";
        }
        else if(colors.equals(CatColors.BLACK)){
            this.color = "Чёрный";
        }
        else if(colors.equals(CatColors.SPOTTY)){
            this.color = "Пятнистый";
        }

    }

    public String getColor(){
        return color + " - вот какой у меня окрас.";
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

    public static int getCount()
    {
        return count;
    }
}