package com.ahqlab.hodooopencv.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Toast;

import com.ahqlab.hodooopencv.R;
import com.ahqlab.hodooopencv.databinding.ActivityElemetsResultsBinding;
import com.ahqlab.hodooopencv.domain.ComburResult;

import java.util.List;

public class ElemetsResults extends AppCompatActivity {
    private  ActivityElemetsResultsBinding resBindingng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        resBindingng = DataBindingUtil.setContentView(this, R.layout.activity_elemets_results );
        resBindingng.setViewElem( this );
        resBindingng.imageView.setImageResource( R.drawable.leftblack );
        info();
        Buttons();
    }

    public void Back(View view){
        startActivity(new Intent( this, AnalysisActivity.class));
    }

    private void Buttons(){
        resBindingng.gl.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(1) ;
            }
        });
        resBindingng.bil.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(2) ;
            }
        });
        resBindingng.ket.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(3) ;
            }
        });
        resBindingng.ob.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(4) ;
            }
        });
        resBindingng.ph.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(5) ;
            }
        });
        resBindingng.pr.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(6) ;
            }
        });
        resBindingng.nit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(7) ;
            }
        });
        resBindingng.ur.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(8) ;
            }
        });
        resBindingng.sg.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(9) ;
            }
        });
        resBindingng.lek.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeView(10) ;
            }
        });
    }


    public void info(){
        String htmlAsString = getString(R.string.htmlGLU);
        Spanned htmlAsSpanned = Html.fromHtml(htmlAsString);
        resBindingng.textgl.setText( htmlAsSpanned );

        String htmlPH = getString(R.string.htmlBIL);
        Spanned htmlAsPH = Html.fromHtml(htmlPH);
        resBindingng.textbl.setText( htmlAsPH );

        String htmlKET = getString(R.string.htmlKET);
        Spanned htmlAsKET = Html.fromHtml(htmlKET);
        resBindingng.textket.setText( htmlAsKET );

        String htmlNit = getString(R.string.htmlNIT);
        Spanned htmlAsNIT = Html.fromHtml(htmlNit);
        resBindingng.textob.setText( htmlAsNIT );

        String htmlPh = getString(R.string.htmlPH);
        Spanned htmlAsPh = Html.fromHtml(htmlPh);
        resBindingng.textPh.setText( htmlAsPh );

        String htmlPR = getString(R.string.htmlPRO);
        Spanned htmlAsPR = Html.fromHtml(htmlPR);
        resBindingng.textpr.setText( htmlAsPR );

        String htmlNIT = getString(R.string.htmlNIT);
        Spanned htmlAsNIt = Html.fromHtml(htmlNIT);
        resBindingng.textnit.setText(htmlAsNIt);

        String htmlUBG = getString(R.string.htmlUBG);
        Spanned htmlAsUBG = Html.fromHtml(htmlUBG);
        resBindingng.textur.setText(htmlAsUBG);


        String htmlSG = getString(R.string.htmlGlucose);
        Spanned htmlAsSG = Html.fromHtml(htmlSG);
        resBindingng.textsg.setText(htmlAsSG);

        String htmlLEU = getString(R.string.htmlLEU);
        Spanned htmlAsLEU = Html.fromHtml(htmlLEU);
        resBindingng.textlek.setText(htmlAsLEU);

    }

    private void changeView(int index){
        switch (index) {
            case 1:
                //Glucose
                resBindingng.textgl.setVisibility(View.VISIBLE);
                resBindingng.textbl.setVisibility(View.INVISIBLE);
                resBindingng.textket.setVisibility(View.INVISIBLE);
                resBindingng.textob.setVisibility(View.INVISIBLE);
                resBindingng.textPh.setVisibility(View.INVISIBLE);
                resBindingng.textpr.setVisibility(View.INVISIBLE);
                resBindingng.textnit.setVisibility(View.INVISIBLE);
                resBindingng.textur.setVisibility(View.INVISIBLE);
                resBindingng.textsg.setVisibility(View.INVISIBLE);
                resBindingng.textlek.setVisibility(View.INVISIBLE);
                resBindingng.imageItems.setImageResource( R.drawable.glu_01);
                break;
            case 2 :
                //Billuribin
                String htmlPH = getString(R.string.htmlBIL);
                Spanned htmlAsPH = Html.fromHtml(htmlPH);
                resBindingng.textbl.setText( htmlAsPH );
                resBindingng.textgl.setVisibility(View.INVISIBLE);
                resBindingng.textbl.setVisibility(View.VISIBLE);
                resBindingng.textket.setVisibility(View.INVISIBLE);
                resBindingng.textob.setVisibility(View.INVISIBLE);
                resBindingng.textPh.setVisibility(View.INVISIBLE);
                resBindingng.textpr.setVisibility(View.INVISIBLE);
                resBindingng.textnit.setVisibility(View.INVISIBLE);
                resBindingng.textur.setVisibility(View.INVISIBLE);
                resBindingng.textsg.setVisibility(View.INVISIBLE);
                resBindingng.textlek.setVisibility(View.INVISIBLE);
                resBindingng.imageItems.setImageResource( R.drawable.bil_01);
                break ;
            case 3 :
                //Ketone
                resBindingng.textgl.setVisibility(View.INVISIBLE);
                resBindingng.textbl.setVisibility(View.INVISIBLE);
                resBindingng.textket.setVisibility(View.VISIBLE);
                resBindingng.textob.setVisibility(View.INVISIBLE);
                resBindingng.textPh.setVisibility(View.INVISIBLE);
                resBindingng.textpr.setVisibility(View.INVISIBLE);
                resBindingng.textnit.setVisibility(View.INVISIBLE);
                resBindingng.textur.setVisibility(View.INVISIBLE);
                resBindingng.textsg.setVisibility(View.INVISIBLE);
                resBindingng.textlek.setVisibility(View.INVISIBLE);
                resBindingng.imageItems.setImageResource( R.drawable.ket_03);
                break ;
            case 4 :
                //Occult Blood
                resBindingng.textgl.setVisibility(View.INVISIBLE);
                resBindingng.textbl.setVisibility(View.INVISIBLE);
                resBindingng.textket.setVisibility(View.INVISIBLE);
                resBindingng.textob.setVisibility(View.VISIBLE);
                resBindingng.textPh.setVisibility(View.INVISIBLE);
                resBindingng.textpr.setVisibility(View.INVISIBLE);
                resBindingng.textnit.setVisibility(View.INVISIBLE);
                resBindingng.textur.setVisibility(View.INVISIBLE);
                resBindingng.textsg.setVisibility(View.INVISIBLE);
                resBindingng.textlek.setVisibility(View.INVISIBLE);
                resBindingng.imageItems.setImageResource( R.drawable.ubg_01);
                break ;

            case 5 :
                //Ph
                resBindingng.textgl.setVisibility(View.INVISIBLE);
                resBindingng.textbl.setVisibility(View.INVISIBLE);
                resBindingng.textket.setVisibility(View.INVISIBLE);
                resBindingng.textob.setVisibility(View.INVISIBLE);
                resBindingng.textPh.setVisibility(View.VISIBLE);
                resBindingng.textpr.setVisibility(View.INVISIBLE);
                resBindingng.textnit.setVisibility(View.INVISIBLE);
                resBindingng.textur.setVisibility(View.INVISIBLE);
                resBindingng.textsg.setVisibility(View.INVISIBLE);
                resBindingng.textlek.setVisibility(View.INVISIBLE);
                resBindingng.imageItems.setImageResource( R.drawable.ph_04);
                break;

             case 6 :
                 //Protein
                resBindingng.textgl.setVisibility(View.INVISIBLE);
                resBindingng.textbl.setVisibility(View.INVISIBLE);
                resBindingng.textket.setVisibility(View.INVISIBLE);
                resBindingng.textob.setVisibility(View.INVISIBLE);
                resBindingng.textPh.setVisibility(View.INVISIBLE);
                resBindingng.textpr.setVisibility(View.VISIBLE);
                resBindingng.textnit.setVisibility(View.INVISIBLE);
                resBindingng.textur.setVisibility(View.INVISIBLE);
                resBindingng.textsg.setVisibility(View.INVISIBLE);
                resBindingng.textlek.setVisibility(View.INVISIBLE);
                resBindingng.imageItems.setImageResource( R.drawable.pro_01);
                break ;
            case 7 :
                resBindingng.textgl.setVisibility(View.INVISIBLE);
                resBindingng.textbl.setVisibility(View.INVISIBLE);
                resBindingng.textket.setVisibility(View.INVISIBLE);
                resBindingng.textob.setVisibility(View.INVISIBLE);
                resBindingng.textPh.setVisibility(View.INVISIBLE);
                resBindingng.textpr.setVisibility(View.INVISIBLE);
                resBindingng.textnit.setVisibility(View.VISIBLE);
                resBindingng.textur.setVisibility(View.INVISIBLE);
                resBindingng.textsg.setVisibility(View.INVISIBLE);
                resBindingng.textlek.setVisibility(View.INVISIBLE);
                resBindingng.imageItems.setImageResource( R.drawable.nit_01);
                break ;
            case 8 :
                resBindingng.textgl.setVisibility(View.INVISIBLE);
                resBindingng.textbl.setVisibility(View.INVISIBLE);
                resBindingng.textket.setVisibility(View.INVISIBLE);
                resBindingng.textob.setVisibility(View.INVISIBLE);
                resBindingng.textPh.setVisibility(View.INVISIBLE);
                resBindingng.textpr.setVisibility(View.INVISIBLE);
                resBindingng.textnit.setVisibility(View.INVISIBLE);
                resBindingng.textur.setVisibility(View.VISIBLE);
                resBindingng.textsg.setVisibility(View.INVISIBLE);
                resBindingng.textlek.setVisibility(View.INVISIBLE);
                resBindingng.imageItems.setImageResource( R.drawable.ubg_01);
                break ;
            case 9 :
                resBindingng.textgl.setVisibility(View.INVISIBLE);
                resBindingng.textbl.setVisibility(View.INVISIBLE);
                resBindingng.textket.setVisibility(View.INVISIBLE);
                resBindingng.textob.setVisibility(View.INVISIBLE);
                resBindingng.textPh.setVisibility(View.INVISIBLE);
                resBindingng.textpr.setVisibility(View.INVISIBLE);
                resBindingng.textnit.setVisibility(View.INVISIBLE);
                resBindingng.textur.setVisibility(View.INVISIBLE);
                resBindingng.textsg.setVisibility(View.VISIBLE);
                resBindingng.textlek.setVisibility(View.INVISIBLE);
                resBindingng.imageItems.setImageResource( R.drawable.sg_01);
                break ;
            case 10 :
                resBindingng.textgl.setVisibility(View.INVISIBLE);
                resBindingng.textbl.setVisibility(View.INVISIBLE);
                resBindingng.textket.setVisibility(View.INVISIBLE);
                resBindingng.textob.setVisibility(View.INVISIBLE);
                resBindingng.textPh.setVisibility(View.INVISIBLE);
                resBindingng.textpr.setVisibility(View.INVISIBLE);
                resBindingng.textnit.setVisibility(View.INVISIBLE);
                resBindingng.textur.setVisibility(View.INVISIBLE);
                resBindingng.textsg.setVisibility(View.INVISIBLE);
                resBindingng.textlek.setVisibility(View.VISIBLE);
                resBindingng.imageItems.setImageResource( R.drawable.leu_02);
                break ;
        }
    }
}
