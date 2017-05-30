package com.example.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Toast toast;
    Button btn1;
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //implementando los button
        btn1=(Button) findViewById(R.id.btn_toast1);
        btn2=(Button) findViewById(R.id.btn_toast2);
        btn3=(Button) findViewById(R.id.btn_toast3);

        //cargando los id's al metodo onClick
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //mostramos toast al hacer click
        switch (v.getId()){
            case R.id.btn_toast1:
                //toast normal
                Toast.makeText(this,"Soy un Toast Normal 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_toast2:
                //llamando al metodo toastPosiciones()
                toastPosiciones();
                break;
            case R.id.btn_toast3:
                //lamando al metodo toastCustom()
                toastCustom();
                break;
        }
    }

    public  void toastCustom(){
        LayoutInflater layoutInflater=getLayoutInflater();
        View view= layoutInflater.inflate(R.layout.toast_custom,(ViewGroup)
                findViewById(R.id.toast_layout));
        toast = Toast.makeText(this,"Toast TOP",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(view);
        toast.show();
    }
    public void toastPosiciones(){
        //Top
        toast = Toast.makeText(this,"Toast TOP",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP,0,0);
        toast.show();

        //center
        toast= Toast.makeText(this,"Toast CENTER",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();

        //bottom
        toast= Toast.makeText(this,"Toast BOTTOM",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.show();

        //left
        toast= Toast.makeText(this,"Toast LEFT",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT,0,0);
        toast.show();

        //Right
        toast= Toast.makeText(this,"Toast RIGHT",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.RIGHT,0,0);
        toast.show();

        //TOP y LEFT
        toast= Toast.makeText(this,"Toast TOP y LEFT",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.LEFT,0,0);
        toast.show();

        //Bottom y right
        toast= Toast.makeText(this,"Toast BOTTOM y RIGHT",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT,0,0);
        toast.show();
    }
}
