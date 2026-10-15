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

        System.out.printf("Сума: %s\n", money1.sum(money2));
        System.out.printf("Вшднімання: %s\n", money1.sub(money2));
        System.out.printf("Ділення на число: %s\n", money1.div(2.5));
        System.out.printf("Ділення на гроші: %s\n", money1.div(money2));

        System.out.println(money1);
        System.out.println(money2);

        System.out.printf("Чи рівнв к-ть грошей: %b\n", money1.equals(money2));
        System.out.printf("Чи в першому більше: %b\n", money1.isGreater(money2));
        System.out.printf("Чи в першому менше: %b\n", money1.isLesser(money2));
    }

    public static void task2(Scanner scanner){
       Triangle triangle1 = new Triangle(3, 4, 5);
       Triangle triangle2 = new Triangle(9, 12, 15);

       System.out.printf("Периметр першого трикутника: %d\n", triangle1.getPerimeter());
       System.out.printf("Периметр другого трикутника: %d\n", triangle2.getPerimeter());

       System.out.printf("Площа першого трикутника: %.2f\n", triangle1.getArea());
       System.out.printf("Площа другого трикутника: %.2f\n", triangle2.getArea());

       System.out.printf("Чи вони рівні: %b\n", triangle1.equals(triangle2));
       System.out.printf("Чи більший перший за другий: %b\n", triangle1.isGreater(triangle2));
       System.out.printf("Чи менший перший за другий: %b\n",triangle1.isLesser(triangle2));

       System.out.println(triangle1);
       System.out.println(triangle2);

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

        System.out.printf("Площа першої кулі: %.2f\n", balloon1.getArea());
        System.out.printf("Площа другої кулі: %.2f\n", balloon2.getArea());

        System.out.printf("Перетин: %.2f\n", balloon1.getInter(balloon2));

        System.out.printf("Об'єднання: %.2f\n", balloon1.getUnion(balloon2));

        System.out.printf("Чи вони рівні: %b\n",balloon1.equals(balloon2));

        System.out.println(balloon1);
        System.out.println(balloon2);
    }
}

