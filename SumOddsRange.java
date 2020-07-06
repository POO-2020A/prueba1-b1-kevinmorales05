import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);

    System.out.print("#1: ");
    int number1 = Integer.valueOf(scanner.nextLine());
    
    System.out.print("#2: ");
    int number2 = Integer.valueOf(scanner.nextLine());
    
    int sum = 0;

    for (int i = number1; i <= number2; i++){
        if (i%2 != 0){
          sum = sum + i;
        }
    }
    System.out.println(sum);



  }
}
