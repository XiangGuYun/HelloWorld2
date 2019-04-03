package yxd.com.helloworld

import android.os.Bundle
import com.kotlinlib.activity.AbstractKotlinActivity
import com.kotlinlib.other.LayoutId
import kotlinx.android.synthetic.main.activity_main.*

@LayoutId(R.layout.activity_main)
class MainActivity : AbstractKotlinActivity() {

    override fun init(bundle: Bundle?) {
        tvTest.text("Love").color("#ff6666")
    }

}
