import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose task: ");
        int task = scanner.nextInt();
        if (task == 1)
            task1(scanner);
        if (task == 2)
            task2(scanner);
        if (task == 3)
            task3(scanner);
    }

    public static void task1(Scanner scanner) {
        Money money1 = new Money(108.9);
        Money money2 = new Money(12.3);

        System.out.printf("", money1.sum(money2));
        System.out.printf("", money1.sub(money2));
        System.out.printf("", money1.div(2.5));
        System.out.printf("", money1.div(money2));

        System.out.println(money1);

        System.out.printf("", money1.equals(money2));
        System.out.printf("", money1.isGreater(money2));
        System.out.printf("", money1.isLesser(money2));
    }

    public static void task2(Scanner scanner){
       Triangle triangle1 = new Triangle(3, 4, 5);
       Triangle triangle2 = new Triangle(9, 12, 15);

       System.out.printf("Периметр першого трикутника: ", triangle1.getPerimeter());
       System.out.printf("Периметр другого трикутника: ", triangle2.getPerimeter());

       System.out.printf("Площа першого трикутника: ", triangle1.getArea());
       System.out.printf("Площа другого трикутника: ", triangle2.getArea());

       System.out.printf("Чи вони рівні: ", triangle1.equals(triangle2));
       System.out.printf("Чи більший перший за другий: ", triangle1.isGreater(triangle2));
       System.out.printf("Чи менший перший за другий: ",triangle1.isLesser(triangle2));

       System.out.println(triangle1);
       System.out.println(triangle1);

    }

    public static void task3(Scanner scanner){
        System.out.println("x, y, r: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();

        System.out.println("x2, y2, r2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int r2 = scanner.nextInt();

        Balloon balloon1 = new Balloon(x, y, r);
        Balloon balloon2 = new Balloon(x2, y2, r2);

        System.out.printf("Площа першої кулі: %.2f", balloon1.getArea());
        System.out.printf("Площа другої кулі: %.2f", balloon2.getArea());

        System.out.printf("Перетин: %.2f", balloon1.getInter(balloon2));

        System.out.printf("Об'єднання: %.2f", balloon1.getUnion(balloon2));

        System.out.printf("Чи вони рівні: ",balloon1.equals(balloon2));

        System.out.println(balloon1);
        System.out.println(balloon2);
    }
}

