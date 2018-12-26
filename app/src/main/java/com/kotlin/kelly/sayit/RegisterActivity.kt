package com.kotlin.kelly.sayit

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_register.mAvatarReg
import java.util.Random

class RegisterActivity : AppCompatActivity() {
    var userAvatar = "profileDefault"
    var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun generateAvatar(view : View){
        val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        if (color == 0){
            userAvatar = "light$avatar"
        }else{
            userAvatar = "dark$avatar"
        }

        var resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
        mAvatarReg.setImageResource(resourceId)
    }

    fun generateBackgroundColor(view : View){
        val random = Random()
        val red = random.nextInt(255)
        val green = random.nextInt(255)
        val blue = random.nextInt(255)

        mAvatarReg.setBackgroundColor(Color.rgb(red, green, blue))

        val savedRed = red.toDouble() / 255
        val savedGreen = green.toDouble() / 255
        val savedBlue = blue.toDouble() / 255

        avatarColor = "[$savedRed, $savedGreen, $savedBlue, 1]"
    }

    fun registerUser(view : View){

    }
}
