package com.ziedkhmiri.flipecardview;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.ziedkhmiri.custom.cardview.CardView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     CardView mcv;

     CheckBox checkBox1,checkBox2,checkBox3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);

        mcv = (CardView) findViewById(R.id.mcv);
        mcv.showEdgeShadow(true,true,true,true);
          mcv.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        
if (checkBox1.isChecked()) {
    mcv.showCorner(true, true, false, false);
    FlipCardView flip = new FlipCardView.Builder(this, mcv)
            .addItem(new CardItem("Price: 617.49$  &  Free Shoping", Color.BLACK, 0xffffffff, BitmapFactory.decodeResource(getResources(), R.mipmap.prime_)))
            .addItem(new CardItem("Ram: 4G & Storage: 32G Cpu: Dual-core 2.15 GHz ", Color.BLACK, 0xffffffff))
            .addItem(new CardItem("Camera Description: 12 MP ", Color.BLACK, 0xffffffff))
            .addItem(new CardItem("Shopping From Amazon", Color.WHITE, 0xffffcc33))
            .setAnimType(FlipCardView.TYPE_HORIZONTAL)
            .setItemDuration(450)
            .setSeparateLineColor(0x00000000)
            .setBackgroundColor(0x60000000)
            .create();


    flip.setOnFlipClickListener(new FlipCardView.OnFlipClickListener() {
        @Override
        public void onItemClick(int position) {
            Toast.makeText(MainActivity.this, "position " + position + " is clicked.", Toast.LENGTH_SHORT).show();
            mcv.showCorner(true, true, true, true);

        }

        @Override
        public void dismiss() {

        }
    });
}else if (checkBox2.isChecked()){

    mcv.showCorner(true, true, false, false);
    FlipCardView flip = new FlipCardView.Builder(this, mcv)
            .addItem(new CardItem("Price: 617.49$  &  Free Shoping", Color.BLACK, 0xffffffff, BitmapFactory.decodeResource(getResources(), R.mipmap.prime_)))
            .addItem(new CardItem("Ram: 4G & Storage: 32G Cpu: Dual-core 2.15 GHz ", Color.BLACK, 0xffffffff))
            .addItem(new CardItem("Camera Description: 12 MP ", Color.BLACK, 0xffffffff))
            .addItem(new CardItem("Shopping From Amazon", Color.WHITE, 0xffffcc33))
            .setAnimType(FlipCardView.TYPE_VERTICLE)
            .setItemDuration(450)
            .setSeparateLineColor(0x00000000)
            .setBackgroundColor(0x60000000)
            .create();


    flip.setOnFlipClickListener(new FlipCardView.OnFlipClickListener() {
        @Override
        public void onItemClick(int position) {
            Toast.makeText(MainActivity.this, "position " + position + " is clicked.", Toast.LENGTH_SHORT).show();
            mcv.showCorner(true, true, true, true);

        }

        @Override
        public void dismiss() {

        }
    });

}else if (checkBox3.isChecked()){

    mcv.showCorner(true, true, false, false);
    FlipCardView flip = new FlipCardView.Builder(this, mcv)
            .addItem(new CardItem("Price: 617.49$  &  Free Shoping", Color.BLACK, 0xffffffff, BitmapFactory.decodeResource(getResources(), R.mipmap.prime_)))
            .addItem(new CardItem("Ram: 4G & Storage: 32G Cpu: Dual-core 2.15 GHz ", Color.BLACK, 0xffffffff))
            .addItem(new CardItem("Camera Description: 12 MP ", Color.BLACK, 0xffffffff))
            .addItem(new CardItem("Shopping From Amazon", Color.WHITE, 0xffffcc33))
            .setAnimType(FlipCardView.TYPE_SLIDE)
            .setItemDuration(450)
            .setSeparateLineColor(0x00000000)
            .setBackgroundColor(0x60000000)
            .create();


    flip.setOnFlipClickListener(new FlipCardView.OnFlipClickListener() {
        @Override
        public void onItemClick(int position) {
            Toast.makeText(MainActivity.this, "position " + position + " is clicked.", Toast.LENGTH_SHORT).show();
            mcv.showCorner(true, true, true, true);

        }

        @Override
        public void dismiss() {

        }
    });

}

    }




}


