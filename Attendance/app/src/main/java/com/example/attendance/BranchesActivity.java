package com.example.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BranchesActivity extends AppCompatActivity {
Button btn_cse;
Button btn_ece;
Button btn_eee;
Button btn_me;
Button btn_civil;
Button btn_it;
Button btn_met;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branches);
        btn_cse=findViewById(R.id.btn_cse);
        btn_ece=findViewById(R.id.btn_ece);
        btn_eee=findViewById(R.id.btn_eee);
        btn_me=findViewById(R.id.btn_me);
        btn_civil=findViewById(R.id.btn_civil);
        btn_it=findViewById(R.id.btn_it);
        btn_met=findViewById(R.id.btn_met);


        btn_cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cseintent=new Intent(BranchesActivity.this,CseyearsActivity.class);
                startActivity(cseintent);
            }
        });


                    btn_ece.setOnClickListener(new View.OnClickListener() {
                   @Override
                         public void onClick(View v) {
                          Intent eceintent=new Intent(BranchesActivity.this,EceyearsActivity.class);
                        startActivity(eceintent);
            }
           });


        btn_eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eeeintent=new Intent(BranchesActivity.this,EeeyearsActivity.class);
                startActivity(eeeintent);
            }
        });



        btn_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meintent=new Intent(BranchesActivity.this,MeyearsActivity.class);
                startActivity(meintent);
            }
        });


        btn_civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent civilintent=new Intent(BranchesActivity.this,CivilyearsActivity.class);
                startActivity(civilintent);
            }
        });


        btn_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itintent=new Intent(BranchesActivity.this,ItyearsActivity.class);
                startActivity(itintent);
            }
        });


        btn_met.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent metintent=new Intent(BranchesActivity.this,MetyearsActivity.class);
                startActivity(metintent);
            }
        });



    }
}
