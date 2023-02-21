package teamJava;

import java.util.Scanner;

class Login_dobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디를 입력하세요. : ");
        String name = sc.nextLine();
        System.out.print("비밀번호를 입력하세요. : ");
        int password = sc.nextInt();

        System.out.println("\"" + name + "\"" + "은 아이디이며 " + "\"" + password + "\"" + "은 비밀번호 입니다.\n" + "맞으십니까?");
        System.out.println("맞으시면 1, 틀리면 2");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("확인 감사드립니다.");
                break;
            case 2:
                System.out.println("다시한번 확인 부타드립니다.");
                break;
        }
    }
}