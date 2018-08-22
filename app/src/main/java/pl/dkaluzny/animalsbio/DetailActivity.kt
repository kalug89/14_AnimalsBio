package pl.dkaluzny.animalsbio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    val cheetahInfo = "Gepard grzywiasty, gepard – gatunek drapieżnego ssaka z rodziny kotowatych. " +
            "Jest jedynym żyjącym przedstawicielem rodzaju Acinonyx Brookes"
    val lionInfo = "Lew afrykański, lew – mięsożerny gatunek ssaka lądowego z rodziny kotowatych, drugi po tygrysie – co do wielkości – wśród czterech ryczących wielkich kotów."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var animal = intent.extras
        if (animal != null) {
            if (animal.get("animal") == "cheetah") {
                detailImageView.setImageDrawable(application.getDrawable(R.drawable.cheetah))
                descriptionTexttextView.text = cheetahInfo


            } else {
                detailImageView.setImageDrawable(application.getDrawable(R.drawable.lion))
                descriptionTexttextView.text = lionInfo
            }
        }
    }
}
