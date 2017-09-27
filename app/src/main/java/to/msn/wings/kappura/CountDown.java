package to.msn.wings.kappura;

import android.os.CountDownTimer;

/**
 * Created by 4163211 on 2017/06/23.
 */

public class CountDown extends CountDownTimer {

    public CountDown(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }

    @Override
    public void onFinish() {
        // 完了
       // timerText.setText("0:00.000");
    }

    // インターバルで呼ばれる
    @Override
    public void onTick(long millisUntilFinished) {
        // 残り時間を分、秒、ミリ秒に分割
        long mm = millisUntilFinished / 1000 / 60;
        long ss = millisUntilFinished / 1000 % 60;
        long ms = millisUntilFinished - ss * 1000 - mm * 1000 * 60;

        //timerText.setText(String.format("%1$02d:%2$02d.%3$03d", mm, ss, ms));
    }
}