import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        System.out.println("Первая задача");
        String naborSlovvStroke = "Я словил трип слушая песню Продиджей про лису представившаяся Трип";
        System.out.println(naborSlovvStroke);
        String naborSlovvStroke1 = naborSlovvStroke.toLowerCase();
        String [] naborvMassive = naborSlovvStroke1.split(" ");
        System.out.println(("Текст состоит из " + naborvMassive.length + " слов"));
    }

    private static void task2() {
       String meowString = "Кошки гворят мяу, я тоже говорю мяу, ведь я котик ";
        System.out.println(meowString);
        String meowString1 = meowString.replace(",","");
        System.out.println(meowString1);
        String meowString2 = meowString1.toLowerCase();
        System.out.println(meowString2);
        String [] meowMassiv = meowString2.split(" ");
        Arrays.stream(meowMassiv).collect(Collectors.toMap(x -> x,x1 ->1 ,Integer::sum)).
                entrySet().
                stream().
                sorted((o1, o2) -> {
                    int razdelitel = (o2.getValue()).compareTo(o1.getValue());
                    if (razdelitel == 0) {
                        razdelitel = o1.getKey().compareTo(o2.getKey());
                    }
                    return razdelitel;
                }).
                limit(10).
                forEach( x-> System.out.println(x.getValue() + "-" + x.getKey()));
    }

}