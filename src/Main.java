import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        System.out.println("Калькулятор фигур");

        while (continueProgram) {


            System.out.println("Калькулятор фигур");
            System.out.println("1.Прямоугольник");
            System.out.println("2.Круг");
            System.out.println("Выберите фигуру");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    double width = readDouble(scanner, "Введите ширину: ");
                    double height = readDouble(scanner, "Введите высоту: ");

                    Rectangle rectangle = new Rectangle(width, height);
                    System.out.println("Площадь " + rectangle.Area());
                    System.out.println("Перимтр: " + rectangle.getPerimtr());
                    break;
                case 2:

                    double radius = readDouble(scanner, "Введите радиус: ");
                    Circle circle = new Circle(radius);
                    System.out.println("Площадь круга: " + circle.Area());
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
            System.out.println("Посчитать ещё? (y/n): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("n"))
            {
                continueProgram = false;
                System.out.println();

        }
    }
        scanner.close();
    }

    private static double readDouble(Scanner scanner, String prompt)
    {
        while (true)
        {
            System.out.print(prompt);
            if (scanner.hasNextDouble())
            {
                double value = scanner.nextDouble();
                if (value > 0)
                {
                    return value;
                }
                else
                {
                    System.out.println("Значение должно быть положительным");
                }
            }
            else
            {
                System.out.println("Неверно. Введите пожалуйста число.");
                scanner.next();
            }
        }
    }

}