package etc.api.util.date;

import util.Utility;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static util.Utility.*;

public class DateExample {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        makeLine();

        // 현재 날짜 정보 얻기 (연, 월, 일)
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 현재 시간 정보 얻기 (시, 분, 초)
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        // 현재 날짜와 시간 정보 얻기
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // 특정 날짜와 시간 정보 얻기
        LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println(beginDate);

        // 연, 월, 일 따로 추출
        int year = localDateTime.getYear();
        System.out.println("year = " + year);

        // 문자 형태의 월 리턴(Month)
        Month month = localDateTime.getMonth();
        System.out.println("month = " + month);

        // 숫자 형태의 월 리턴(1~12)
        int monthValue = localDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        // 일 (1~31)
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);

        // 요일 (일~토)
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);

        makeLine();

        // 지금으로부터 3일 뒤
        LocalDateTime d2 = localDateTime.plusDays(3);
        System.out.println("localDateTime1 = " + d2);

        // 지금으로부터 1년 2개월 7일 뒤
        LocalDateTime d3 = localDateTime.plusYears(1).plusMonths(2).plusDays(7);
        System.out.println("localDateTime2 = " + d3);

        // 지금으로부터 9개월 23일 전
        LocalDateTime d4 = localDateTime.minusMonths(9).minusDays(23);
        System.out.println("localDateTime3 = " + d4);

        makeLine();

        // 시야 날짜 연산
        LocalDate b = LocalDate.of(2020, 12, 30);
        LocalDate f = LocalDate.of(2022, 9, 14);
        long between = ChronoUnit.DAYS.between(b, f);
        System.out.println("between = " + between);

        makeLine();

        // 날짜 포맷 변경하기
        // DateTimeFormatter 객체 생성 -> 원하는 날짜 형태를 서식문자로 표현
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");

        // 준비한 DateTimeFormatter 객체를 format() 매개값으로 전달
        System.out.println(localDateTime.format(dtf));



    }

}
