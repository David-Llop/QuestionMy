package cat.urv.etse.asm.questionmy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class QuestionActivity : AppCompatActivity() {

    companion object{
        public val KEY_SCORE: String = "KEY_SCORE"
        public val KEY_RESPONSE_TIME: String = "KEY_RESPONSE_TIME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val responseValue: Int = 10
        val intent: Intent = Intent()
        intent.setClass(this.baseContext, ResultActivity::class.java)
        intent.putExtra(KEY_SCORE, responseValue)
        intent.putExtra(KEY_RESPONSE_TIME, 2000L)
        this.startActivity(intent)
    }
}