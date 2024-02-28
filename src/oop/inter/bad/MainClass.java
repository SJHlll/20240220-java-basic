package oop.inter.bad;

import util.Utility;

import static util.Utility.input;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("정보입력해주세요\n가입 / 로그인 / 정보수정 / 탈퇴");
        String menu = input("> ");
        if (menu.equals("1")) {
            Join join = new Join();
            join.join();
        } else if (menu.equals("2")) {
            Login login = new Login();
            login.login();
        } else if (menu.equals("3")) {
            Update update = new Update();
            update.update();
        } else if (menu.equals("4")) {
            Delete delete = new Delete();
            delete.delete();
        }

    }


}
