import java.util.Scanner;
public class DrawImageUseFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu:\n" + "Print the rectangle(1)\n" + "Print the square triangle(Bottom-left)(2)\n" +"Print the square triangle(Top-left)(3)\n"+ "Print isosceles triangle(4)\n" + "Exit(5)\n" + "Enter your choice: ");
        int i =scanner.nextInt();
        while (i>5||i<1){
            System.out.println("Vui lòng nhập lại số thứ tự bạn chọn: ");
            i =scanner.nextInt();
        }
        switch (i){
            case 1:
                System.out.println("Print the rectangle");
                int width=7,height=3;
                for (int j =0;j<height;j++){
                    for (int k=0;k<width;k++){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 2:
                System.out.println("Print the square triangle (Bottom-left)");
                for (int j =1;j<=6;j++){
                    for (int k=1;k<j;k++){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 3:
                System.out.println("Print the square triangle (Top-left)");
                for (int j =1;j<=6;j++){
                    for (int k=6;k>j;k--){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 4:
                System.out.println("Print isosceles triangle");
                for (int j =1;j<=5;j++){
                    for (int k=1;k<=5-j;k++){
                        System.out.print(" ");
                    }
                    for (int n=0;n<2*j-1;n++){
                        System.out.print("*");
                    }
                    System.out.println("\n");
                }
                break;
            case 5:
                System.out.println("Exit.");
                break;
            default:
                break;
        }
    }
}
