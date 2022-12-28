package bgtap.babbangona.waliprojectmanager.activities

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import bgtap.babbangona.waliprojectmanager.databinding.ActivityIntroBinding
import kotlinx.android.synthetic.main.activity_splash.*


class IntroActivity : AppCompatActivity() {

    private var binding: ActivityIntroBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.btnSignInIntro?.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }

        binding?.btnSignUpIntro?.setOnClickListener {

            startActivity(Intent(this, SignUpActivity::class.java))

        }
    }

}