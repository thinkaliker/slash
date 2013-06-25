package thinkaliker.slash;

import android.content.*;
import android.graphics.*;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by: Adam
 * Date: 6/23/13 - 3:46 PM
 */

public class TitleView extends View {

    private Bitmap titleGraphic;
    private int screenW;
    private int screenH;
    private Paint textPaint = new Paint();
    private ButtonDraw buttonStart;
    private ButtonDraw buttonSettings;
    private int textSize = 170;
    private boolean startButtonPushed;
    private boolean settingsButtonPushed;
    private Context myContext;

    public TitleView(Context context){
        super(context);
        myContext = context;
        titleGraphic = BitmapFactory.decodeResource(getResources(),R.drawable.title);
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

        if (startButtonPushed){
            buttonStart = new ButtonDraw(0, 0, 0, screenH/10, 38, 127, 0, 76, 255, 0);
            canvas.drawRect(2*screenW/10, 8*screenH/10, 4*screenW/10, 9*screenH/10, buttonStart.ButtonPaint());
        } else {
        buttonStart = new ButtonDraw(0, 0, 0, screenH/10, 76, 255, 0, 38, 127, 0);
        canvas.drawRect(2*screenW/10, 8*screenH/10, 4*screenW/10, 9*screenH/10, buttonStart.ButtonPaint());
        }

        if (settingsButtonPushed){
            buttonSettings = new ButtonDraw(0, 0, 0, screenH/10, 0, 19, 127, 0, 38, 255);
            canvas.drawRect(6*screenW/10, 8*screenH/10, 8*screenW/10, 9*screenH/10, buttonSettings.ButtonPaint());
        } else {
            buttonSettings = new ButtonDraw(0, 0, 0, screenH/10, 0, 38, 255, 0, 19, 127);
            canvas.drawRect(6*screenW/10, 8*screenH/10, 8*screenW/10, 9*screenH/10, buttonSettings.ButtonPaint());
        }

        canvas.drawBitmap(titleGraphic, (screenW - (titleGraphic.getWidth())) / 4, (screenH - (titleGraphic.getHeight())) / 3, null);

        textPaint.setTextSize(textSize);
        canvas.drawText("slash", (screenW - (titleGraphic.getWidth())) / 2, 6*(screenH - (titleGraphic.getHeight())) / 7 , textPaint);

    }

    public boolean onTouchEvent(MotionEvent event){
        int eventAction = event.getAction();
        int X = (int)event.getX();
        int Y = (int)event.getY();

        switch (eventAction){
            case MotionEvent.ACTION_DOWN:
                if((X > (2*screenW/10) && X < (4*screenW/10)) && (Y > (8*screenH/10) && Y < (9*screenH/10))){
                    startButtonPushed = true;
                }
                if((X > (6*screenW/10) && X < (8*screenW/10)) && (Y > (8*screenH/10) && Y < (9*screenH/10))){
                    settingsButtonPushed = true;
                }
                break;
            case MotionEvent.ACTION_MOVE:

                break;
            case MotionEvent.ACTION_UP:
                if((X > (2*screenW/10) && X < (4*screenW/10)) && (Y > (8*screenH/10) && Y < (9*screenH/10))){
                    Intent gameIntent = new Intent(myContext, GameActivity.class);
                    myContext.startActivity(gameIntent);
                    startButtonPushed = false;
                }
                if((X > (6*screenW/10) && X < (8*screenW/10)) && (Y > (8*screenH/10) && Y < (9*screenH/10))){
                    Intent settingsIntent = new Intent(myContext, SettingsActivity.class);
                    myContext.startActivity(settingsIntent);
                    settingsButtonPushed = false;
                }
                break;
        }
        invalidate();
        return true;
    }
}
