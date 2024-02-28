package oop.inter.good;

public class Delete implements IUserService{

    public Delete() {
        System.out.println("회원탈퇴요청중");
    }

    @Override
    public void execute() {
        System.out.println("아무튼 db 에서 삭제중");
    }
}
