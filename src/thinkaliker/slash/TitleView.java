package thinkaliker.slash;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: Adam
 * Date: 6/23/13
 * Time: 3:46 PM
 * To change this template use File | Settings | File Templates.
 */


public class TitleView extends View {

    private Bitmap titleGraphic;

    public TitleView(Context context){
        super(context);
        titleGraphic = BitmapFactory.decodeResource(getResources(),R.drawable.title);
    }

    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawBitmap(titleGraphic, 0, 0, null);
    }

    public boolean onTouchEvent(MotionEvent event){
        int eventaction = event.getAction();
        int X = (int)event.getX();
        int Y = (int)event.getY();

        switch (eventaction){
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
