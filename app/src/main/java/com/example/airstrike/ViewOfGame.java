package com.example.airstrike;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;

public class ViewOfGame extends View {

    Bitmap gamebackground;
    Rect rect;
    int width;
    int height;
    Bitmap plane[] = new Bitmap[15];
    int planeX;
    int planeY;
    int velocity;
    int planeFrame;
    int planeWidth;



    public ViewOfGame(Context context) {
        super(context);
        gamebackground = BitmapFactory.decodeResource(getResources(), R.drawable.gamebackground);
        Display display = ((Activity)getContext()).getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
        rect = new Rect(0,0, width, height);
        plane[0] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_0);
        plane[1] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_1);
        plane[2] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_2);
        plane[3] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_3);
        plane[4] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_4);
        plane[5] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_5);
        plane[6] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_6);
        plane[7] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_7);
        plane[8] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_8);
        plane[9] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_9);
        plane[10] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_10);
        plane[11] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_11);
        plane[12] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_12);
        plane[13] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_13);
        plane[14] = BitmapFactory.decodeResource(getResources(), R.drawable.plane_14);

        planeX = width + 300;
        planeY = 100;
        velocity = 15;
        planeFrame = 0;
        planeWidth = plane[0].getWidth();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(gamebackground,null, rect, null);
        canvas.drawBitmap(plane[planeFrame], planeX,planeY,null);
        planeFrame++;
        if (planeFrame > 14){
            planeFrame = 0;
        }
        planeX -= velocity;
    }
}