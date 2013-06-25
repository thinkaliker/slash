package thinkaliker.slash;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Adam
 * Date: 6/23/13 - 3:20 PM
 */

public class GameView extends View {

    private int screenW;
    private int screenH;
    private int textSize = 170;
    private Paint textPaint = new Paint();
    private Context myContext;
    private List<Slash> stack = new ArrayList<Slash>();
    private int startTime;
    private int elapsedTime = 0;

    public GameView(Context context){
        super(context);
        myContext = context;
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
        canvas.drawText("video game", screenW/20, screenH/2, textPaint);
        canvas.drawText("", screenW/20, 2*screenH/3, textPaint);

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
