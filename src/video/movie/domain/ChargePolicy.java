package video.movie.domain;

import java.time.LocalDate;

public class ChargePolicy {

    /**
     * 요금정책
     * 1. 올해 출시된 영화는 기본적으로 5000원
     * 2. 출시 이후 1년이 지날 때마다 500원씩 차감
     * 3. 최소 요금은 2000원이며 그 밑으로는 차감되지않음
     */

    private static final int BASE_CHARGE = 5000;
    private static final int DISCOUNT = 500;
    private static final int LIMIT_CHARGE = 2000;

    // 전달된 Movie의 발행년도에 따른 가격을 계산하는 메서드
    public static int calculateDVDCharge(Movie movie) {
        // 올해 연도도 정보
        int thisYear = LocalDate.now().getYear();
        // 출시 후 연도 정보
        int movieAge = thisYear - movie.getPubYear();
        int charge = BASE_CHARGE - (movieAge * DISCOUNT);

        if (charge < LIMIT_CHARGE) {
            charge = LIMIT_CHARGE;
        }
        return charge;
    }


}
