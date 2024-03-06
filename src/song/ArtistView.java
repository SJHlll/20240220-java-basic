package song;

import util.Utility;

import static util.Utility.*;

// 화면단을 담당하는 클래스 (콘솔)
// 대부분의 기능을 static으로 선언해 객체생성 없이도 화면을 띄울 수 있게 설계
public class ArtistView {

    private static ArtistRepository ar;

    static {
        ar = new ArtistRepository();
    }

    // 메인 실행 기능
    public static void start() {

        // 세이브 파일 로드
        ar.loadData();
        
        while (true) {
            System.out.println("\n\n****** 음악 관리 프로그램 ******");
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 노래 정보 저장");
            System.out.println("# 4. 프로그램 종료");

            makeLine();

            System.out.println("\n# 원하시는 메뉴의 번호를 입력하세요.");
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    insertProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    ar.saveData();
                    break;
                case "4":
                    System.out.println("\n# 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 숫자를 잘못 입력했습니다.");

            }

        }

    }

    // 1번 메뉴에 대한 입출력 실행 내용
    private static void insertProcess() {
        System.out.println("\n# 노래 등록을 시작합니다.");
        String artistName = input("- 가수명 : ");
        String songName = input("- 노래명 : ");

        // 기존에 등록된 가수인가?
        if (!ar.isRegisted(artistName)) {
        // No -> 새로운 가수 정보를 생성
            ar.addNewAtrist(artistName, songName);
            System.out.printf("\n# %s의 정보가 새로 등록됐습니다.", artistName);
        } else {
        // Yes -> 새로운 가수 정보를 생성하는 것이 아닌, 기존 가수 정보에 노래만 추가
            boolean flag = ar.addNewSong(artistName, songName);
            if (!flag) {
                System.out.printf("\n'# %s'은(는) 이미 등록된 노래입니다.\n", songName);
            } else {
                System.out.printf("\n# 가수 '%s'의 노래 목록에 '%s'이(가) 추가됐습니다.\n", artistName, songName);
            }
        }
    }

    // 2번 메뉴에 대한 입출력 실행 내용
    private static void searchProcess() {

        System.out.println("\n# 검색할 가수명을 입력하세요.");
        String artistName = input("- 가수명 : ");

        if (ar.isRegisted(artistName)) {
            System.out.printf("\n# 가수 '%s'의 노래 목록\n", artistName);
            makeLine();

            ar.showSongList(artistName);

        } else {
            System.out.println("\n# 해당 가수는 등록이 안됐습니다.");

        }

    }

}
