package cloud.ynyg.qingyu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cloud.ynyg.qingyu.ui.theme.QingyuTheme

/** 应用主界面入口。 */
class MainActivity : ComponentActivity() {
    /** 初始化主界面内容。 */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QingyuTheme {
                OnboardingScreen()
            }
        }
    }
}

/** 显示欢迎引导页面。 */
@Composable
fun OnboardingScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(OnboardingBackgroundBrush()),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            OnboardingMark()
            Spacer(modifier = Modifier.height(48.dp))
            OnboardingText()
            Spacer(modifier = Modifier.height(48.dp))
            OnboardingActionButton()
        }
    }
}

/** 提供欢迎页背景渐变。 */
@Composable
private fun OnboardingBackgroundBrush(): Brush {
    val colorScheme = MaterialTheme.colorScheme
    return Brush.verticalGradient(
        colors = listOf(
            colorScheme.background,
            colorScheme.surfaceContainer,
            colorScheme.background
        )
    )
}

/** 显示欢迎页中心图标。 */
@Composable
private fun OnboardingMark(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.ic_qingyu_app_icon),
        contentDescription = stringResource(R.string.app_icon_description),
        modifier = modifier.size(180.dp),
        contentScale = ContentScale.Fit
    )
}

/** 显示欢迎页标题文案。 */
@Composable
private fun OnboardingText(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.onboarding_title),
        modifier = modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.onSurface,
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.displayLarge
    )
}

/** 显示欢迎页主操作按钮。 */
@Composable
private fun OnboardingActionButton(modifier: Modifier = Modifier) {
    Button(
        onClick = {},
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 31.dp)
            .height(56.dp),
        shape = RoundedCornerShape(28.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        ),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp)
    ) {
        Text(
            text = stringResource(R.string.onboarding_start_button),
            style = MaterialTheme.typography.labelMedium
        )
    }
}

/** 预览欢迎引导页面。 */
@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview() {
    QingyuTheme {
        OnboardingScreen()
    }
}

/** 预览深色欢迎引导页面。 */
@Preview(showBackground = true)
@Composable
fun OnboardingScreenDarkPreview() {
    QingyuTheme(darkTheme = true) {
        OnboardingScreen()
    }
}
