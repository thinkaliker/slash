package thinkaliker.slash;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by: Adam
 * Date: 6/23/13 - 11:53 PM
 */
public class SettingsView extends View {

    private int screenW;
    private int screenH;
    private int textSize = 170;
    private Paint textPaint = new Paint();

    public SettingsView(Context context){
        super(context);

    }

    @Override
    public void onSizeChanged (int w, int h, int oldW, int oldH){
        super.onSizeChanged(w, h, oldW, oldH);
        screenW = w;
        screenH = h;
    }

    @Override
    protected void onDraw(Canvas canvas){
        textPaint.setColor(Color.WHITE);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(textSize);
        canvas.drawText("settings", screenW/10, screenH/2, textPaint);

    }
    public boolean onTouchEvent(MotionEvent event){
        int eventAction = event.getAction();
        int X = (int)event.getX();
        int Y = (int)event.getY();

        switch (eventAction){
            case MotionEvent.ACTION_DOWN:

                break;
            case MotionEvent.ACTION_MOVE:

                break;
            case MotionEvent.ACTION_UP:

                break;
        }
        invalidate();
        return true;
    }
}
