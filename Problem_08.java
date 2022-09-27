import java.util.Scanner;

public class Problem_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 몇개? >> ");
        int num = scanner.nextInt();

        int num_arr[] = new int[num];

        for(int i = 0; i < num_arr.length; i++) {
            int temp = (int)(Math.random()*(100+1));
            int check = 0;
            for(int j = 0; j < num_arr.length; j++) {
                if(temp == num_arr[j]) {
                    check=1;
                    break;
                }
            }
            if(check == 1) {
                i--;
                continue;
            }
            num_arr[i] = temp;
        }

        for(int i = 0; i < num_arr.length; i++) {
            if(i%10 == 0 && i != 0)
                System.out.println();
            System.out.print(num_arr[i] + " ");
        }
        scanner.close();
    }
}
