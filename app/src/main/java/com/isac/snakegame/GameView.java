package com.isac.snakegame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class GameView extends View {
    private Bitmap bmGrass1,bmGrass2;
    public static int sizeOfMap= 75*Constants.SCREEN_WIDTH/1080;
    private int h= 21,w=12;
    private ArrayList<Grass> arrGrass=new ArrayList<>();
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        bmGrass1= BitmapFactory.decodeResource(this.getResources(),R.drawable.grass);
        bmGrass1= Bitmap.createScaledBitmap(bmGrass1,sizeOfMap,sizeOfMap,true);
        bmGrass2= BitmapFactory.decodeResource(this.getResources(),R.drawable.grass03);
        bmGrass2= Bitmap.createScaledBitmap(bmGrass2,sizeOfMap,sizeOfMap,true);
        for(int i=0;i<h;i++)
        {
            for(int j=o;j<w;i++)
            {
                if((i+j)%2==0)
                {
                    arrGrass.add(new Grass(bmGrass1,j*sizeOfMap+ Constants.SCREEN_HEIGHT/2-(w/2)*sizeOfMap
                            ,i*sizeOfMap+100*Constants.SCREEN_HEIGHT/1920,sizeOfMap,sizeOfMap));
                }else{
                    arrGrass.add(new Grass(bmGrass2,j*sizeOfMap+ Constants.SCREEN_HEIGHT/2-(w/2)*sizeOfMap
                            ,i*sizeOfMap+100*Constants.SCREEN_HEIGHT/1920,sizeOfMap,sizeOfMap));
                }
            }
        }

    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        for(int i=)
    }
}
