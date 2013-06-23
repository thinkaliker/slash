package thinkaliker.slash;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Canvas;

/**
 * Created with IntelliJ IDEA.
 * User: Adam
 * Date: 6/23/13
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */

public class SlashView extends View{

    private Paint redPaint;
    private int circleX = 100;
    private int circleY = 100;
    private float radius = 30;

    public SlashView(Context context){
        super(context);
        redPaint = new Paint();
        redPaint.setAntiAlias(true);
        redPaint.setColor(Color.RED);
    }
    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawCircle(circleX, circleY, radius, redPaint);
    }
    public boolean onTouchEvent(MotionEvent event){
        int eventaction = event.getAction();
        int X = (int)event.getX();
        int Y = (int)event.getY();

        switch (eventaction){
            case MotionEvent.ACTION_DOWN:
                circleX = X;
                circleY = Y;
                break;
            case MotionEvent.ACTION_MOVE:
                circleX = X;
                circleY = Y;
                break;
            case MotionEvent.ACTION_UP:
                circleX = X;
                circleY = Y;
                break;
        }
        invalidate();
        return true;
    }
}
