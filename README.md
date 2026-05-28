# 青屿 Qingyu

青屿是一款长期陪伴型 AI 日记 App。它不是普通日记软件，也不是任务管理软件，而是一个可以和用户聊天、倾诉、记录情绪、生成日记、保存记忆、设置提醒、回顾生活的私人情绪空间。

项目当前是一个 Android 原生单模块应用，使用 Kotlin、Jetpack Compose 和 Material 3 构建。

## 项目信息

| 项目 | 内容 |
| --- | --- |
| 项目名称 | Qingyu |
| App 显示名称 | 青屿 |
| 包名 | `cloud.ynyg.qingyu` |
| 平台 | Android |
| 技术栈 | Kotlin + Jetpack Compose + Material 3 |
| 构建方式 | Gradle Kotlin DSL |
| UI 语言 | 简体中文 |
| 最低 SDK | 产品目标 API 26；当前 Gradle 配置为 `minSdk = 35` |
| 维护者 | 屿你有关 |
| GitHub | `yuniyouguan` |
| 邮箱 | `niyouguanyu@gmail.com` |

> 注意：当前 `app/src/main/res/values/strings.xml` 中的 `app_name` 仍为 `Qingyu`。如需安装后显示为“青屿”，需要同步更新资源文件。

## 产品定位

青屿是一个浅绿色小清新风格的长期陪伴日记应用。

用户可以和 AI 陪伴者聊天，把当天的情绪、想法、烦恼、计划和重要记忆放进 App。App 会帮助用户整理聊天内容，生成日记、记忆卡片、提醒事项和月度回顾。

产品核心感觉：

- 私密
- 温柔
- 简约
- 清新
- 有陪伴感
- 像一个安静的情绪角落

青屿不应被设计成：

- 医疗心理咨询 App
- 冥想 App
- 办公效率 App
- 冷冰冰的 AI 聊天机器人
- 森林、树叶、草地风格的自然 App

## 视觉风格

整体采用浅绿色、小清新、简约、温柔的现代中文生活方式 App 风格。

设计关键词：

- minimal
- clean
- fresh
- light green
- soft
- calm
- premium
- emotionally warm
- modern Chinese lifestyle app

色彩方向：

- 浅薄荷绿
- 柔和鼠尾草绿
- 淡开心果绿
- 奶油白
- 暖象牙白
- 浅灰绿

## 核心功能规划

当前 README 记录产品方向，具体功能会随开发逐步落地。

- AI 陪伴聊天：承接用户日常倾诉、情绪表达和碎片化想法。
- 日记生成：从聊天内容中整理出自然、温柔、可保存的日记。
- 情绪记录：帮助用户留住当天的状态、心情和触发事件。
- 记忆卡片：沉淀重要的人、事、愿望、偏好和生活片段。
- 提醒事项：从聊天中提取值得记住的计划和提醒。
- 月度回顾：按时间线回看生活变化、情绪趋势和重要记忆。

## 技术栈

- Kotlin `2.2.10`
- Android Gradle Plugin `9.3.0-alpha07`
- Jetpack Compose
- Material 3
- AndroidX Activity Compose
- AndroidX Lifecycle Runtime KTX
- JUnit
- AndroidX Test
- Espresso
- Compose UI Test

## 项目结构

```text
.
├── app/                         # Android 应用模块
│   └── src/
│       ├── main/                # 应用源码与资源
│       │   ├── java/cloud/ynyg/qingyu/
│       │   │   ├── MainActivity.kt
│       │   │   └── ui/theme/    # Compose 主题
│       │   ├── res/             # Android 资源
│       │   └── keepRules/       # R8 keep rules
│       ├── test/                # 本地 JVM 单元测试
│       └── androidTest/         # Android 仪器测试
├── gradle/
│   └── libs.versions.toml       # 依赖与插件版本
├── build.gradle.kts             # 根构建脚本
├── settings.gradle.kts          # Gradle 模块配置
└── README.md
```

## 环境要求

- Android Studio 最新稳定版或兼容版本。
- Android SDK 需要包含项目当前使用的 compile SDK。
- 使用项目自带 Gradle Wrapper 构建。
- 本地 SDK 路径写入 `local.properties`，不要提交该文件。

## 构建与运行

在 Windows PowerShell 中，从仓库根目录执行：

```powershell
.\gradlew.bat assembleDebug
```

构建 debug APK。

```powershell
.\gradlew.bat installDebug
```

安装到已连接的设备或模拟器。

Unix-like shell 使用：

```bash
./gradlew assembleDebug
./gradlew installDebug
```

## 测试与检查

```powershell
.\gradlew.bat testDebugUnitTest
```

运行本地 JVM 单元测试。

```powershell
.\gradlew.bat connectedDebugAndroidTest
```

运行 Android 仪器测试，需要已启动的模拟器或已连接设备。

```powershell
.\gradlew.bat lintDebug
```

运行 Android lint 检查。

## 开发规范

详细规范见 `AGENTS.md`。核心要求：

- 包名保持在 `cloud.ynyg.qingyu` 下。
- 代码使用 Android Studio 默认格式，4 空格缩进。
- 类名和 Composable 使用 PascalCase。
- 函数、变量和属性使用 camelCase。
- 资源文件使用 lowercase snake_case。
- Compose UI 应保持小而清晰，并尽量可预览。
- 主题 token 放在 `ui/theme`。
- 注释必须使用中文。
- 每个类和函数都需要简短文档注释说明用途。
- 类成员属性需要简洁说明其角色。
- 避免把无关 UI、状态和工具逻辑混在同一个文件中。
- 函数不要累积大块逻辑，应拆分渲染、状态、校验、转换和副作用。

## 提交规范

提交信息使用中文，并遵循 Conventional Commits：

```text
<type>(<scope>): <summary>
```

常见类型：

- `feat`：新增功能
- `fix`：修复问题
- `docs`：文档变更
- `style`：格式或样式调整
- `refactor`：重构
- `test`：测试相关
- `chore`：构建、依赖或杂项

示例：

```text
feat(app): 添加首页问候文案
docs(readme): 完善项目说明
```

## 安全与配置

不要提交以下内容：

- `local.properties`
- `.gradle/`
- `build/`
- `.kotlin/`
- 签名文件，例如 `*.jks`、`*.keystore`
- API key、token、密钥或其他敏感配置

## 当前状态

项目仍处于基础工程和产品方向整理阶段。后续开发会围绕 AI 陪伴聊天、日记生成、记忆卡片、提醒事项和月度回顾逐步完善。
