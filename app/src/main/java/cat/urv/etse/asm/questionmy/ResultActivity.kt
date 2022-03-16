package cat.urv.etse.asm.questionmy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        this.intent?.extras?.getString(QuestionActivity.KEY_SCORE, "0")
        this.intent?.extras?.getString(QuestionActivity.KEY_RESPONSE_TIME, "999999999999")

    }
}