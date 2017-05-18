package com.ziedkhmiri.flipecardview;

/**
 * Created by zied khmiri on 30/10/2016.
 */
import android.graphics.Bitmap;
import android.graphics.Color;


public class CardItem {

    public String title;
    public int titleColor = Color.BLACK;
    public int bgColor = Color.WHITE;
    public Bitmap icon;

    public CardItem(String title) {
        this.title = title;
    }

    public CardItem(String title, Bitmap icon) {
        this.title = title;
        this.icon = icon;
    }

    public CardItem(String title, int bgColor) {
        this.title = title;
        this.bgColor = bgColor;
    }

    public CardItem(String title, int titleColor, int bgColor) {
        this.title = title;
        this.titleColor = titleColor;
        this.bgColor = bgColor;
    }

    public CardItem(String title, int bgColor, Bitmap icon) {
        this.title = title;
        this.bgColor = bgColor;
        this.icon = icon;
    }

    public CardItem(String title, int titleColor, int bgColor, Bitmap icon) {
        this.title = title;
        this.titleColor = titleColor;
        this.bgColor = bgColor;
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "ShareItem{"
                + "title='" + title + '\''
                + ", titleColor=" + titleColor
                + ", bgColor=" + bgColor
                + ", icon=" + icon
                + '}';
    }
}
