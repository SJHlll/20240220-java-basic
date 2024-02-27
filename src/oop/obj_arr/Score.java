package oop.obj_arr;

public class Score {


    private String name;
    private int kor;
    private int math;
    private int eng;
    private int score;
    private double average;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getScore() {
        return score;
    }

//    public void setScore(int score) {
//        this.score = score;
//    }

//    public void setScore() {
//        this.score = this.kor + this.eng + this.math;
//    }

    public double getAverage() {
        return average;
    }

//    public void setAverage(double average) {
//        this.average = average;
//    }

//    public void setAverage() {
//        this.average = (double) this.score / 3;
//    }

    public void setScoreAvg() {
        this.score = this.kor + this.eng + this.math;
        this.average = (double) this.score / 3;
    }

    public void scoreInfo() {
        System.out.printf("이름 : %s\n국어 : %d점\n영어 : %d점\n수학 : %d점\n총점 : %d점\n평균 : %.2f점\n",
                this.name, this.kor, this.eng, this.math, this.score, this.average);
        System.out.println("-------------------------------------");
    }



    //    점수 유효성 검증
    public boolean isValidateScore(int sco) {
        if (sco > 100 | sco < 0) {
            System.out.println("0~100");
            return false;
        }
        return true;
    }


}
    /*
     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
      담을 수 있는 객체를 디자인하세요.

     - 학생의 모든 정보를 한 눈에 확인할 수 있게
      scoreInfo() 메서드를 선언해 주세요.
      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
