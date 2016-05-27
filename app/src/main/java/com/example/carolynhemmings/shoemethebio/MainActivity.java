package com.example.carolynhemmings.shoemethebio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView newtonImage;
    private ImageView einsteinImage;

    private String newtonBio = "Sir Isaac Newton was an English physicist and mathematician (described in his " +
            "own day as a 'natural philosopher') who is widely recognised as one of the most influential " +
            "scientists of all time and a key figure in the scientific revolution. His book Philosophie " +
            "Naturalis Principia Mathematica ('Mathematical Principles of Natural Philosophy'), first published " +
            "in 1687, laid the foundations for classical mechanics.";

    private String einsteinBio = "Albert Einstein was a German-born theoretical physicist. He developed " +
            "the general theory of relativity, one of the two pillars of modern physics (alongside quantum mechanics). " +
            "Einstein's work is also known for its influence on the philosophy of science. Einstein is best " +
            "known in popular culture for his mass–energy equivalence formula E = mc2 (which has been dubbed 'the " +
            "world's most famous equation')";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        newtonImage = (ImageView) findViewById(R.id.newtonImage);
        einsteinImage = (ImageView) findViewById(R.id.einsteinImage);

        newtonImage.setOnClickListener(this);
        einsteinImage.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.newtonImage:
                Intent newtonIntent = new Intent(MainActivity.this, DetailsActivity.class);
                newtonIntent.putExtra("newton", newtonBio);
                newtonIntent.putExtra("name", "newton");
                startActivity(newtonIntent);
                break;

            case R.id.einsteinImage:
                Intent einsteinIntent = new Intent(MainActivity.this, DetailsActivity.class);
                einsteinIntent.putExtra("einstein", einsteinBio);
                einsteinIntent.putExtra("name", "einstein");
                startActivity(einsteinIntent);
                break;

        }
    }
}
