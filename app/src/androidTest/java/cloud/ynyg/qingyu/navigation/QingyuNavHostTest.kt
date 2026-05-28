package cloud.ynyg.qingyu.navigation

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import cloud.ynyg.qingyu.R
import cloud.ynyg.qingyu.ui.theme.QingyuTheme
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/** 验证应用导航宿主的起始页面和导航行为。 */
@RunWith(AndroidJUnit4::class)
class QingyuNavHostTest {
    /** 提供 Compose UI 测试环境。 */
    @get:Rule
    val composeTestRule = createComposeRule()

    /** 持有测试专用导航控制器。 */
    private lateinit var navController: TestNavHostController

    /** 初始化导航宿主测试内容。 */
    @Before
    fun setUp() {
        composeTestRule.setContent {
            val context = LocalContext.current
            navController = TestNavHostController(context)
            navController.navigatorProvider.addNavigator(ComposeNavigator())

            QingyuTheme {
                QingyuNavHost(navController = navController)
            }
        }
    }

    /** 确认导航图从引导页开始。 */
    @Test
    fun qingyuNavHost_startsOnOnboarding() {
        assertTrue(
            navController.currentBackStackEntry
                ?.destination
                ?.hasRoute<QingyuRoute.Onboarding>() ?: false
        )
    }

    /** 确认点击开始按钮后进入首页。 */
    @Test
    fun onboardingStartClick_navigatesToHome() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val startButtonText = appContext.getString(R.string.onboarding_start_button)

        composeTestRule.onNodeWithText(startButtonText).performClick()

        assertTrue(
            navController.currentBackStackEntry
                ?.destination
                ?.hasRoute<QingyuRoute.Home>() ?: false
        )
    }
}
