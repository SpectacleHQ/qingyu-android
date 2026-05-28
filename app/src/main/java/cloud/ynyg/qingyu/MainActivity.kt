package cloud.ynyg.qingyu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import cloud.ynyg.qingyu.ui.theme.QingyuTheme

/** 应用主界面入口。 */
class MainActivity : ComponentActivity() {
    /** 创建 Activity 并挂载 Compose 根节点。 */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QingyuTheme {
                QingyuApp()
            }
        }
    }
}
