package thinkaliker.slash;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Canvas;

/**
 * Created by: Adam
 * Date: 6/23/13 - 3:20 PM
 */

public class GameView extends View{

    public GameView(Context context){
        super(context);

    }
    @Override
    protected void onDraw(Canvas canvas){

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
