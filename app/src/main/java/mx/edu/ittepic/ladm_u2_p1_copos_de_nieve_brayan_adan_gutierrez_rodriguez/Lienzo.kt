package mx.edu.ittepic.ladm_u2_p1_copos_de_nieve_brayan_adan_gutierrez_rodriguez

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View


    class Lienzo(este: MainActivity) : View(este) {

        var este = este
        //var logo1= BitmapFactory.decodeResource(this.resources, R.drawable.)

        override fun onDraw(c: Canvas) {
            super.onDraw(c)
            val p = Paint()


            //fondo
            val color = Color.rgb(1,78,130,)
            c.drawColor(color)

            //texto
            p.textSize=80f//tamano
            p.color=  Color.rgb(255,102,0,)//nuevocolor

            //textos
            c.drawText("TECNOLOGICO ",80f,70f,p)
            c.drawText("NACIONAL DE ",89f,135f,p)
            c.drawText("MEXICO",190f,200f,p)

            // LOGO
           /// c.drawBitmap(logo,150f,250f,p)





            //CONTORNOS SE DIBUJAN PRIMERO

            p.style = Paint.Style.STROKE//CONTORNO
            p.strokeWidth= 10f
            p.color = Color.BLACK
            c.drawRect(100f,700f,595f,775f,p)
            c.drawRect(100f,830f,595f,905f,p)
            p.color = Color.LTGRAY
            c.drawRect(135f,1025f,570f,1090f,p)

            p.style = Paint.Style.FILL
            //textos de rectang
            p.color=  Color.BLACK//nuevocolor
            //textos
            p.textSize=20f
            c.drawText("Usuario:",100f,680f,p)
            c.drawText("Contraseña: ",100f,810f,p)



            // RECTANGULOS DE CAMPOS DE TEXTO
            p.color = Color.WHITE
            este.setTitle("ancho ${width} alto ${height} ")//720 y 1317
            c.drawRect(100f,700f,600f,780f,p)
            c.drawRect(100f,830f,600f,910f,p)

            p.color = Color.rgb(0,132,255,)

            c.drawRect(130f,1020f,570f,1090f,p)


            // TEXTO ARRIBA DEL BOTON
            p.color = Color.RED
            p.textSize=40f
            c.drawText("INICIAR SESION: ",200f,1070f,p)
        }

    }
