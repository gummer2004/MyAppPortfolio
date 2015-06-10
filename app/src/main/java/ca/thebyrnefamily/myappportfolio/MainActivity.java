package ca.thebyrnefamily.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void sendSpotifyMessage(View view){
        Toast toast= Toast.makeText(getApplicationContext(),"My Spotify app will run here",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sendScoresMessage(View view){
        Toast toast= Toast.makeText(getApplicationContext(),"My Scores app will run here",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sendLibraryMessage(View view){
        Toast toast= Toast.makeText(getApplicationContext(),"My Library app will run here",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sendBiggerMessage(View view){
        Toast toast= Toast.makeText(getApplicationContext(),"My Build it Bigger app will run here",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sendXYZMessage(View view){
        Toast toast= Toast.makeText(getApplicationContext(),"My XYZ app will run here",Toast.LENGTH_SHORT);
        toast.show();
    }
    public void sendMyAppMessage(View view){
        Toast toast= Toast.makeText(getApplicationContext(),"My XYZ app will run here",Toast.LENGTH_SHORT);
        toast.show();
    }
}
