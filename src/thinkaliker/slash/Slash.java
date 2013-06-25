package thinkaliker.slash;

import android.graphics.*;

/**
 * Created by: Adam
 * Date: 6/24/13 - 11:22 AM
 */
public class Slash {

    private int id;
    private Bitmap bmp;

    public Slash(int newID){
        id = newID;
    }

    public void setBitmap(Bitmap newBitmap){
        bmp = newBitmap;
    }

    public Bitmap getBitmap(){
        return bmp;
    }

    public int getId(){
        return id;
    }
}
