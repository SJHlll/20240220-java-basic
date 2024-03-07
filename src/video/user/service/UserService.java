package video.user.service;


import oop.constructor.Phone;
import oop.inter.bad.Join;
import video.common.AppService;
import video.ui.AppUi;
import video.user.repository.UserRepository;
import video.user.service.domain.Grade;
import video.user.service.domain.User;

import java.util.ArrayList;
import java.util.List;

import static video.ui.AppUi.*;

public class UserService implements AppService {

    private final UserRepository userRepository = new UserRepository();

    @Override
    public void start() {

        while (true) {
            userManagementScreen();
            int selection = inputInteger(">>> ");

            switch (selection) {
                case 1:
                    join();
                    break;
                case 2:
                    showSearchUser();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 4:
                    return; // start() 메서드를 강제 종료해서 초기화면으로 돌아갈 수 있도록 함
                default:
                    System.out.println("** 다시 입력해주세요. **");


            }


        }

    }



    // 회원 추가 비즈니스 로직
    // 비즈니스 로직 : 요청에 따른 데이터의 생성, 조회, 저장, 변경 등의 로직
    private void join() {

        System.out.println("\n*** 회원가입 ***");
        String name = inputString("# 회원명 : ");
        String phone = inputString("# 전화번호 : ");


        // 입력 받은 값을 토대로 User 객체 생성 (등급은 BRONZE)
        User newUser = new User(name, phone, Grade.BRONZE);

        userRepository.addUser(newUser);
        System.out.printf("\n# [%s]님의 회원가입이 완료됐습니다.\n", newUser.getUserName());


    }


    // 이름을 입력받아 해당 이름의 회원 리스트를 리턴
    private List<User> searchUser() {
        System.out.println("\n# 조회할 회원의 이름을 입력해주세요.");
        String name = inputString(">>> ");
        return userRepository.findUserByName(name);
    }

    // 조회 결과 출력
    private void showSearchUser() {
        List<User> users = searchUser();

        if (users.size() > 0) {
            System.out.println("\n*** 회원 조회 결과 ***");
            for (User user : users) {
                System.out.println(user);
            }
        } else {
            System.out.println("\n# 조회되는 회원이 없습니다.");
        }
    }

    // 회원 탈퇴 비즈니스 로직
    private void deleteUser() {
        List<User> users = searchUser();

        if (users.size() > 0) {
            // 삭제 대상 회원 번호를 저장할 리스트 -> 탈퇴할 회원 번호를 입력할 때 삭제 대상 번호를 입력했는 지 확인용
            List<Integer> userNums = new ArrayList<>();
            
            for (User user : users) {
                System.out.println(user);
                userNums.add(user.getUserNumber());
            }

            System.out.println("\n# 탈퇴할 회원의 번호를 입력해주세요.");
            int delUserNum = inputInteger(">>> ");

            if (userNums.contains(delUserNum)) {
                User delUser = userRepository.deleteUser(delUserNum);
                System.out.printf("\n# %s[%s] 회원님의 정보가 정상적으로 삭제됐습니다.\n", delUser.getUserName(), delUser.getPhoneNumber());
            } else {
                System.out.println("\n# 현재 존재하는 회원과 일치하는 전화번호가 없습니다.");
            }

        } else {
            System.out.println("\n# 조회되는 회원이 없습니다.");
        }

    }
}











