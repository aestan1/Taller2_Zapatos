package com.example.android.taller2_zapatos;

import android.view.View;

/**
 * Created by android on 03/10/2017.
 */

public class Metodos {


    public static double calcular (int se, int ti, int ma, int can){
        double  resultado=0, compraTotal=0, total=0;


            if(se==1 && ti==1 && ma==1){
                resultado=120000;
            }

            else if(se==1 && ti==1 && ma==2){
                resultado=140000;
            }

            else if(se==1 && ti==1 && ma==3){
                resultado=130000;
            }

            else if(se==1 && ti==2 && ma==1){
                resultado=50000;
            }

            else if(se==1 && ti==2 && ma==2){
                resultado=80000;
            }

            else if(se==1 && ti==2 && ma==3){
                resultado=100000;
            }

            else if(se==2 && ti==1 && ma==1){
                resultado=100000;
            }

            else if(se==2 && ti==1 && ma==2){
                resultado=130000;
            }

            else if(se==2 && ti==1 && ma==3){
                resultado=110000;
            }

            else if(se==2 && ti==2 && ma==1){
                resultado=60000;
            }

            else if(se==2 && ti==2 && ma==2){
                resultado=70000;
            }

            else if(se==2 && ti==2 && ma==3){
                resultado=120000;
            }

            compraTotal=resultado;
            compraTotal= compraTotal*can;


            return compraTotal;

        }

}
