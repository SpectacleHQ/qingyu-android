package cloud.ynyg.qingyu

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/** 验证应用在设备环境中的基础行为。 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    /** 确认应用上下文使用正确的包名。 */
    @Test
    fun useAppContext() {
        // 获取被测应用的运行时上下文。
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("cloud.ynyg.qingyu", appContext.packageName)
    }
}
