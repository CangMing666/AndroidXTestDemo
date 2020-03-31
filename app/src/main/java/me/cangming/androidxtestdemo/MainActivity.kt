package me.cangming.androidxtestdemo

import android.graphics.BitmapFactory
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.palette.graphics.Palette
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_set_color.setOnClickListener {
            likebutton_view_favor.setUnlikeDrawableRes(R.drawable.story_player_collection_normal)
        }
        btn_pattle_color.setOnClickListener {
            val decodeResource =
                BitmapFactory.decodeResource(resources, R.drawable.story_player_collection_pressed)
            val generate = Palette.from(decodeResource).generate()
            val vibrantColor = generate.getVibrantColor(0x000000);
            btn_pattle_color.setBackgroundColor(vibrantColor)
        }
    }
}
