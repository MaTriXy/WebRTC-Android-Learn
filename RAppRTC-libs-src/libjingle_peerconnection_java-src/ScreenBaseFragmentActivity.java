package org.webrtc;

import android.app.Activity;
import android.content.Intent;

public class ScreenBaseFragmentActivity extends Activity {
    public ScreenCapturer screenCapturer;

    private final int START_SCREEN = 1;

    /**
     * 提示用户请求录屏权限
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == START_SCREEN) {
            if (resultCode == RESULT_OK) {
                screenCapturer.startCapturerBegin(resultCode, data);
            }
        }
    }
}
