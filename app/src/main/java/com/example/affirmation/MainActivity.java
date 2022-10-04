package com.example.affirmation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.example.affirmation.adapter.ItemAdapter;
import com.example.affirmation.data.Datasource;
import com.example.affirmation.model.Affirmation;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize data.
        List<Affirmation> myDataset = new Datasource().loadAffirmations();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ItemAdapter adapter = new ItemAdapter(this, myDataset);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }


   // recyclerView.setAdapter ;
    // Use this setting to improve performance if you know that changes
    // in content do not change the layout size of the RecyclerView
   // recyclerView. setHasFixedSize(true)
}
