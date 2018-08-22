package pl.dkaluzny.animalsbio

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when(v!!.id){
            chetachId.id -> {
                var chetahIntent = Intent(this, DetailActivity::class.java)
                chetahIntent.putExtra("animal", "cheetah")
                startActivity(chetahIntent)

                Toast.makeText(this, "Cheetah", Toast.LENGTH_LONG).show()
            }
            lionId.id -> {
                var lionIntent = Intent(this, DetailActivity::class.java)
                lionIntent.putExtra("animal", "lion")
                startActivity(lionIntent)

                Toast.makeText(this, "Lion", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var chetah = chetachId
        var lion = lionId

        //register out view to recive onCLickListener events

        chetah.setOnClickListener(this)
        lion.setOnClickListener(this)
    }
}
