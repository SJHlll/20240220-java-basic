package oop.inter.good;

public class Update implements IUserService{

    public Update() {
        System.out.println("회원정보수정함");
    }


    @Override
    public void execute() {
        System.out.println("db 수정중");
    }
}
