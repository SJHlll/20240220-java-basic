package video.main;

import video.ui.AppUi;

import static video.ui.AppUi.inputInteger;

public class Main {

    public static void main(String[] args) {

        AppController controller = new AppController();

        while (true) {
            AppUi.startScreen();
            int selectNumber = inputInteger(">>> ");
            controller.chooseSystem(selectNumber);
        }

    }

}
