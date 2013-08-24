package thinkaliker.slash;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;

/**
 * Created by: Adam
 * Date: 6/23/13 - 8:06 PM
 */

public class ButtonDraw {

    private Paint buttonPaint = new Paint();

    public ButtonDraw(int startX, int startY, int endX, int endY, int color1R, int color1G, int color1B, int color2R, int color2G, int color2B) {
        int color1 = Color.rgb(color1R, color1G, color1B);
        int color2 = Color.rgb(color2R, color2G, color2B);
        buttonPaint.setShader(new LinearGradient(startX, startY, endX, endY, color1, color2, Shader.TileMode.MIRROR));
    }

    public ButtonDraw(int colorR, int colorG, int colorB) {
        int solidColor = Color.rgb(colorR, colorG, colorB);
        buttonPaint.setColor(solidColor);
    }

    public Paint ButtonPaint() {
        return buttonPaint;
    }
}
