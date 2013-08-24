package thinkaliker.slash;

import android.content.Context;
import android.graphics.*;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by: Adam
 * Date: 6/23/13 - 3:20 PM
 */

public class GameView extends View {

    private Bitmap titleGraphic;
    private int screenW;
    private int screenH;
    private int textSize = 170;
    private Paint textPaint = new Paint();
    private Context myContext;
    private List<Slash> stack = new ArrayList<Slash>();
    private int startTime;
    private int elapsedTime = 0;
    private int currentPos;
    private boolean gameRunning = false;
    final Timer countdownTimer = new Timer();

    public GameView(Context context) {
        super(context);
        myContext = context;
        titleGraphic = BitmapFactory.decodeResource(getResources(), R.drawable.title);
    }

    @Override
    public void onSizeChanged(int w, int h, int oldW, int oldH) {
        super.onSizeChanged(w, h, oldW, oldH);
        screenW = w;
        screenH = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        textPaint.setColor(Color.WHITE);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(textSize);
        canvas.drawText("video game", screenW / 20, screenH / 2, textPaint);
        canvas.drawText("", screenW / 20, 2 * screenH / 3, textPaint);

        // TODO figure out how to into maek timer
        // TODO countdown timer running
        // TODO when timer finishes, set gameRunning to true

        countdownTimer.scheduleAtFixedRate(new TimerTask() {
            int countdown = 3;

            public void run() {
                countdown--;
                if (countdown < 0) {
                    gameRunning = true;
                    countdownTimer.cancel();
                }
            }
            // we're still in the new TimerTask() block at this point
        }, 0, 1000);

        while (gameRunning) {
            // TODO start game running timer, when timer reaches set time set gameRunning to false

            // initial slash positioning
            currentPos = screenW - (titleGraphic.getHeight());


            // TODO draw one slash
            // TODO draw lots o' slashes
            // TODO generate random numbers and draw slashes based on number assigned to it

            // here's a thingy that draws a thingy
            // TODO modify titleGraphic to reflect the current slash being drawn
            // TODO code to move currentPos to somewhere else OR some way of moving all slashes
            canvas.drawBitmap(titleGraphic, currentPos, (screenH - (titleGraphic.getHeight())) / 2, null);
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        int eventAction = event.getAction();
        int X = (int) event.getX();
        int Y = (int) event.getY();

        switch (eventAction) {
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
