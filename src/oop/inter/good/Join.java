package oop.inter.good;

public class Join implements IUserService{

    public Join() {
        System.out.println("회원가입 요청이 들어옴");
    }


    @Override
    public void execute() {
        System.out.println("회원가입 로직이 실행됨");
        System.out.println("DB, 입력값, 값, ...");
    }
}
