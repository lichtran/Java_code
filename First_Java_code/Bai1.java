package First_Java_code;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
//        System.out.println("Hello anh em");
//        System.out.println(122322);
//        Scanner lich=new Scanner(System.in);
//        int a, b;
//        a=lich.nextInt();
//        b=lich.nextInt();
//        //xóa bộ nhớ đệm
//        lich.nextLine();
//        String str ;
//        str=lich.nextLine();
//        System.out.println(a+str+b);

        //chương trình tính diện tích hình chữ nhật
        int a, b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        a=scanner.nextInt();
        System.out.println("Nhập chiều rộng: ");
        b=scanner.nextInt();
        System.out.println("S= "+a*b);
        System.out.println("C= "+(a+b)*2);
        System.out.println("c= "+a+b);
        for (int i=0; i<3; i++){
            System.out.println("HAHA thứ "+ (i+1));
        }
    }
}
