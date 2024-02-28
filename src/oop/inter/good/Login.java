package oop.inter.good;

public class Login implements IUserService{

    public Login() {
        System.out.println("로그인 요청이 들어옴");
    }


    @Override
    public void execute() {
        System.out.println("id pw db 비교");
    }
}
