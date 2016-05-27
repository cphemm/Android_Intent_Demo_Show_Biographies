package com.example.carolynhemmings.shoemethebio;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends Activity {

    private ImageView profileImage;
    private TextView bioText;
    private Bundle extras;
    private TextView showName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        profileImage = (ImageView) findViewById(R.id.detailsImage);
        bioText = (TextView) findViewById(R.id.detailsTextView);
        showName = (TextView) findViewById(R.id.nameTextView);

        extras = getIntent().getExtras();

        if(extras != null) {
            String name = extras.getString("name");

            showDetails(name);

        }

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void showDetails(String mName) {
        if(mName.equals("newton")) {
            profileImage.setImageDrawable(getResources().getDrawable(R.drawable.isaac_newton));
            bioText.setText(extras.getString(mName));
            showName.setText(mName);
        } else if(mName.equals("einstein")) {
            profileImage.setImageDrawable(getResources().getDrawable(R.drawable.albert_einstein));
            bioText.setText(extras.getString(mName));
            showName.setText(mName);
        }

    }

}
