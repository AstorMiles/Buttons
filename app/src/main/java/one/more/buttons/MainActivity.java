package one.more.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static one.more.buttons.R.color.grey;
import static one.more.buttons.R.color.orang;

public class  MainActivity extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=this.getWindow().getDecorView();
        view.setBackgroundResource(grey);

            }

            public void goSex(View v)
            {
                view.setBackgroundResource(R.color.sex);

            }

    public void goSmart(View v)
    {

        view.setBackgroundResource(R.color.marin);

    }

    public void goVegan(View v)
    {

        view.setBackgroundResource(R.color.salad);


    }

    public void goHot(View v)
    {

        view.setBackgroundResource(R.color.orang);

    }

}