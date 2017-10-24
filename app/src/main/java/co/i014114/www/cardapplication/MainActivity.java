package co.i014114.www.cardapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.id_img_item_cardview);
        Picasso.with(this).load("https://www.ecestaticos.com/imagestatic/clipping/f47/e4e/f47e4e08572892f71886743e5f340d9b/asi-ha-sido-el-primer-lanzamiento-de-la-historia-de-la-nasa-retransmitido-en-360o.jpg?mtime=1492530537").into(imageView);

    }
}


//cambiar el item por un cardview
//datos de url foto
//