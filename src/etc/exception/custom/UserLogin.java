package etc.exception.custom;

public class UserLogin {

    String userAccount; // 아이디
    String userPassword; // 비밀번호

    // 객체 생성시 아이디, 비밀번호 한번에 세팅
    public UserLogin(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    // 로그인 검증
    public String loginValidate(String inputAccount, String inputPassword) throws LoginValidateException {

        // 계정명 일치 확인
        if (userAccount.equals(inputAccount)) {
            // 패스워드 일치 확인
            if (userPassword.equals(inputPassword)) {
                return "Success";
            } else {
                // 패스워드 틀림
                throw new LoginValidateException("비밀번호 틀림");
            }
        } else {
            // 계정 정보 틀림
            throw new LoginValidateException("회원가입안함");
        }

    }


}
