package cloud.ynyg.qingyu.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import cloud.ynyg.qingyu.ui.home.HomeScreen
import cloud.ynyg.qingyu.ui.onboarding.OnboardingScreen

/** 承载应用导航图并连接页面导航事件。 */
@Composable
fun QingyuNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: QingyuRoute = QingyuRoute.Onboarding
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable<QingyuRoute.Onboarding> {
            OnboardingScreen(
                onStartClick = {
                    navController.navigate(QingyuRoute.Home) {
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<QingyuRoute.Home> {
            HomeScreen()
        }
    }
}
