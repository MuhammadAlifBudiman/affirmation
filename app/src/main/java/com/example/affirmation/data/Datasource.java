package com.example.affirmation.data;

import com.example.affirmation.R;
import com.example.affirmation.model.Affirmation;

import java.util.ArrayList;
import java.util.List;

public class Datasource {
    List<Affirmation> affirmation;
    public List<Affirmation> loadAffirmations(){
        affirmation = new ArrayList<>();
        affirmation.add(new Affirmation(R.string.affirmation1, R.drawable.image1));
        affirmation.add(new Affirmation(R.string.affirmation2, R.drawable.image2));
        affirmation.add(new Affirmation(R.string.affirmation3, R.drawable.image3));
        affirmation.add(new Affirmation(R.string.affirmation4, R.drawable.image4));
        affirmation.add(new Affirmation(R.string.affirmation5, R.drawable.image5));
        affirmation.add(new Affirmation(R.string.affirmation6, R.drawable.image6));
        affirmation.add(new Affirmation(R.string.affirmation7, R.drawable.image7));
        affirmation.add(new Affirmation(R.string.affirmation8, R.drawable.image8));
        affirmation.add(new Affirmation(R.string.affirmation9, R.drawable.image9));
        affirmation.add(new Affirmation(R.string.affirmation10, R.drawable.image10));

        return affirmation;
    }
}
