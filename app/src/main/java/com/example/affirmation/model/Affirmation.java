package com.example.affirmation.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class Affirmation {
    private final @StringRes int stringResourceId;
    private final @DrawableRes int imageResourceId ;
    public Affirmation(int stringResourceId, int imageResourceId){
        this.stringResourceId = stringResourceId;
        this.imageResourceId = imageResourceId;
    }

    public int getStringResourceId() {
        return stringResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
