package com.arti.floatingandsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton=findViewById(R.id.addRecordBtn);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Snackbar.make(view,"add note",Snackbar.LENGTH_LONG).setAction("add", new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Intent intent=new Intent(MainActivity.this,AddNotes.class);
                       startActivity(intent);
                   }
               }).show();

                /*---Snackbar -->
                              it is widget in material designing.
                              it is advanced Widget of Toast Widget.

                              The Difference between Toast and Snackbar is ,
                             In a Snackbar we can perform action on massage and
                             In  a Toast We can't perform action.---*/
            }
        });
    }
    /*------matrial Designing------*
    it is advanced UI Designing concept  in put AAD.
    Which comes from Android 6.0 marshwallow.
    it is fiexiable Designing concept.
    All widgets which is available in matrial designing is take less memory and performance of
widgets is very fast and smooth.
Some widgets of matrial Desiging is Tabbar,Navigation Drawer,Drawer Layout,Floating Action Button
,Snackbar,recycler View,Card View,Advanced Edit Text,Constraint Layout,Co-Ordinator layout,
Collapsing Toolbar,Toolbar,Circular Image View.
note---->
for making all  widgets of matrial Designing you must add dependencies of matrial Designing.

     */

}