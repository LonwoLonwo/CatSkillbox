
public class Loader
{
    public static void main(String[] args)
    {
        Cat gingerCatHaveNoSoul = new Cat();
        Cat felisSilvestrisCatus = new Cat(1234.5);
        Cat black = getCat(2523.4);
        Cat dieKatze = new Cat(1052.66);
        Cat goldenEye = new Cat();
        Cat nekoBus = new Cat();

        gingerCatHaveNoSoul.setCatColors(CatColors.GINGER);
        System.out.println(gingerCatHaveNoSoul.getColor());
        felisSilvestrisCatus.setCatColors(CatColors.WHITE);
        black.setCatColors(CatColors.BLACK);
        dieKatze.setCatColors(CatColors.SPOTTY);
        System.out.println(nekoBus.EYES_COUNT);
        nekoBus.setCatColors(CatColors.RUSSIAN_BLUE);

        System.out.println("Сколько кошек в чёрной комнате: " + Cat.getCount());

        //Немцу спать
        System.out.println(dieKatze.getStatus());
        System.out.println(dieKatze.getWeight());
        dieKatze.feed(154.5);
        System.out.println(dieKatze.getStatus());
        System.out.println(dieKatze.getWeight());

        System.out.println();

        //Поим Котобус
        System.out.println("До выпивки вес - " + nekoBus.getWeight());
        nekoBus.drink(10.1);
        System.out.println("После выпивки вес - " + nekoBus.getWeight());

        System.out.println();

        //Кормим Золотоглазку
        System.out.println("До еды вес - " + goldenEye.getWeight());
        goldenEye.feed(1.5);
        System.out.println("После еды вес - " + goldenEye.getWeight());
        System.out.println(goldenEye.getStatus());

        System.out.println();

        //Перекармливаем Рыжего
        while(gingerCatHaveNoSoul.getWeight() < Cat.MAX_WEIGHT)
        {
            gingerCatHaveNoSoul.feed(1500.78);
            System.out.println(gingerCatHaveNoSoul.getWeight());
            if (gingerCatHaveNoSoul.getWeight() >= Cat.MAX_WEIGHT) break;
        }
        System.out.println(gingerCatHaveNoSoul.getStatus());

        System.out.println();

        //Замяукиваем Латиноса
        System.out.println(felisSilvestrisCatus.getWeight());
        while (felisSilvestrisCatus.getWeight() < Cat.MAX_WEIGHT)
        {
            felisSilvestrisCatus.meow();
            if (felisSilvestrisCatus.getWeight() <= Cat.MIN_WEIGHT) break;
        }
        System.out.println(felisSilvestrisCatus.getWeight());
        System.out.println(felisSilvestrisCatus.getStatus());

        //Врзвращаем массу съеденной еды
        System.out.println(black.getWeight());
        black.feed(150.87);
        System.out.println(black.getWeight());
        System.out.println("Съедено: " + black.feedAmount());

        System.out.println();

        //Куда идём мы с Пятачком? Большой-большой секрет
        System.out.println("Вес до: " + nekoBus.getWeight());
        nekoBus.poops();
        System.out.println("Вес после: " + nekoBus.getWeight());

        System.out.println();

        //Сколько кошек?
        System.out.println("Сколько кошек в чёрной комнате: " + Cat.getCount());

        System.out.println("Чёрный весит: " + black.getWeight() + " " + black.getColor());

        System.out.println("Брат-близнец Чёрного весит: " + black.makeTwin().getWeight() + " " + black.getColor());

        System.out.println("Сколько кошек в чёрной комнате: " + Cat.getCount());

    }

    public static Cat getCat(Double originWeight){
        return new Cat();
    }
}