package facci.com.restaurantmm;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityMM extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_mm);
    }
    public void click(View v){
        Toast.makeText(MainActivityMM.this,"bandeja de Marisco",Toast.LENGTH_SHORT).show();
    }
    public void click2(View v){
        Toast.makeText(MainActivityMM.this,"Caldo de Gallina",Toast.LENGTH_SHORT).show();
    }
    public void click3(View v){
        Toast.makeText(MainActivityMM.this,"Ceviche de Camarón",Toast.LENGTH_SHORT).show();
    }
    public void click4(View v){
        Toast.makeText(MainActivityMM.this,"Ceviche",Toast.LENGTH_SHORT).show();
    }
    public void click5(View v){
        Toast.makeText(MainActivityMM.this,"Pescado Frito",Toast.LENGTH_SHORT).show();
    }
    public void click6(View v){
        Toast.makeText(MainActivityMM.this,"Salprieta",Toast.LENGTH_SHORT).show();
    }
    public void click7(View v){
        Toast.makeText(MainActivityMM.this,"Arroz de Marisco",Toast.LENGTH_SHORT).show();
    }
}
