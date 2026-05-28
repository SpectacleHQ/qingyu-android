package cloud.ynyg.qingyu

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import cloud.ynyg.qingyu.di.appModule
import cloud.ynyg.qingyu.navigation.QingyuNavHost
import org.koin.compose.KoinApplication
import org.koin.dsl.koinConfiguration

/** 组装应用级 Compose 状态、依赖注入和导航入口。 */
@Composable
fun QingyuApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    KoinApplication(
        configuration = koinConfiguration {
            modules(appModule)
        }
    ) {
        QingyuNavHost(
            navController = navController,
            modifier = modifier
        )
    }
}
