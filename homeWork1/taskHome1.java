//package homeWork1;

//import java.nio.channels.GatheringByteChannel;
//import java.util.Scanner;

/*import java.util.Scanner;

//задача № 1 (Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n))
public class taskHome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i <= n; i++) {
            if (i != n) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
        }
        System.out.print(n*(n+1)/2);
     }
    }
*/
//Задача №2 (Вывести все простые числа от 1 до 1000)    
/* 
public class taskHome1 {
    public static void main(String[] args) {
        for(int i = 2; i <= 1000; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }

    }
}
*/

//Задача №3 (Реализовать простой калькулятор)
/* 
public class taskHome1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt(); //считывает с консоли число
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " +result);
    }
    public static int getInt(){
        System.out.println("Введите число: ");
        int num;
        if (scanner.hasNextLine()){
            num = scanner.nextInt();
        }else {
            System.out.println("Ошибка при вводе числа ");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.err.println("Введите операцию ");
        char operation;
        if (scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }else{
            System.out.println("Ошибка при вводе операции ");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation) {
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1/num2;
                break;        
            default:
                System.out.println("Не верные параметры, повторите ввод! ");
                result = calc(num1, num2, getOperation());
                break;
        }
        return result;
    }




}
*/