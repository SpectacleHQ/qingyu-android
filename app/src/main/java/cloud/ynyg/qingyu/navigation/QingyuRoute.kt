package cloud.ynyg.qingyu.navigation

import kotlinx.serialization.Serializable

/** 定义应用内所有类型安全导航目的地。 */
sealed interface QingyuRoute {
    /** 引导页目的地。 */
    @Serializable
    data object Onboarding : QingyuRoute

    /** 首页目的地。 */
    @Serializable
    data object Home : QingyuRoute
}
