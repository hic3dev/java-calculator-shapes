import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram)
        {
            System.out.println("Калькулятор фигур");
            System.out.println("1. Прямоугольник");
            System.out.println("2. Круг");
            System.out.print("Выберите фигуру (1 или 2): ");

            if (scanner.hasNextInt())
            {
                int choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.print("Введите ширину: ");
                        double width = readDouble(scanner, "ширину");
                        System.out.print("Введите высоту: ");
                        double height = readDouble(scanner, "высоту");

                        Rectangle rectangle = new Rectangle(width, height);
                        System.out.println("Площадь: " + rectangle.area());
                        System.out.println("Периметр: " + rectangle.perimeter());
                        break;

                    case 2:
                        System.out.print("Введите радиус: ");
                        double radius = readDouble(scanner, "радиус");

                        Circle circle = new Circle(radius);
                        System.out.println("Площадь: " + circle.area());
                        System.out.println("Длина окружности: " + (2 * Math.PI * radius));
                        break;

                    default:
                        System.out.println("Ошибка! Введите 1 или 2.");
                        continue;
                }
            }
            else
            {
                System.out.println("Ошибка! Нужно ввести число 1 или 2.");
                scanner.next();
                continue;
            }

            System.out.print("Посчитать ещё? (y/n): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y"))
            {
                continueProgram = false;
            }
        }
        System.out.println("Программа завершена.");
        scanner.close();
    }

    private static double readDouble(Scanner scanner, String fieldName)
    {
        while (true)
        {
            if (scanner.hasNextDouble())
            {
                double value = scanner.nextDouble();
                if (value > 0)
                {
                    return value;
                }
                else
                {
                    System.out.print("Число должно быть положительным. Введите " + fieldName + ": ");
                }
            }
            else
            {
                System.out.print("Ошибка! Нужно ввести число. Введите " + fieldName + ": ");
                scanner.next();
            }
        }
    }
}