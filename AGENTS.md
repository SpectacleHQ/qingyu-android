# Repository Guidelines

## Project Structure & Module Organization

Qingyu is a single-module Android project with only `:app`.

- `app/src/main/java/cloud/ynyg/qingyu/`: application Kotlin source, including `MainActivity.kt`.
- `app/src/main/java/cloud/ynyg/qingyu/ui/theme/`: Compose theme files (`Color.kt`, `Theme.kt`, `Type.kt`).
- `app/src/main/res/`: Android resources, including drawables, launcher icons, strings, themes, and XML rules.
- `app/src/main/keepRules/`: R8 keep rule files consumed by AGP.
- `app/src/test/java/`: local JVM unit tests.
- `app/src/androidTest/java/`: instrumented Android tests.

Do not commit `.gradle/`, `build/`, `.kotlin/`, or `local.properties`.

## Build, Test, and Development Commands

Run commands from the repository root using the checked-in Gradle wrapper.

- `.\gradlew.bat assembleDebug`: build a debug APK.
- `.\gradlew.bat installDebug`: install the debug APK on a connected emulator or device.
- `.\gradlew.bat testDebugUnitTest`: run local JVM unit tests.
- `.\gradlew.bat connectedDebugAndroidTest`: run instrumented tests on a connected emulator or device.
- `.\gradlew.bat lintDebug`: run Android lint for the debug variant.

Use `./gradlew` on Unix-like shells.

## Coding Style & Naming Conventions

Use Android Studio formatting: 4-space indentation, clear imports, and formatter-managed trailing commas. Keep packages under `cloud.ynyg.qingyu`. Name classes and composables in PascalCase, functions and properties in camelCase, and resource files in lowercase snake_case.

Compose UI should be small and previewable. Keep theme tokens in `ui/theme`.

Comments must be written in Chinese. Every class and function needs a short documentation comment explaining its purpose. Class member properties also need concise role comments.

Keep files in the matching feature or package directory. Avoid mixing unrelated UI, state, and utilities. Do not let one function accumulate large blocks of logic; split rendering, state, validation, conversion, and side effects.

## Testing Guidelines

Use JUnit for local tests in `app/src/test/java` and AndroidX/JUnit/Espresso/Compose APIs for `app/src/androidTest/java`. Name tests after behavior, for example `MainActivityTest` or `GreetingDisplaysAppNameTest`. Add tests when changing behavior, navigation, persistence, or UI state.

## Commit & Pull Request Guidelines

Commit messages must be written in Chinese and follow Conventional Commits. Use a header plus an optional body. Header format: `<type>(<scope>): <summary>`, where `type` is commonly `feat`, `fix`, `docs`, `style`, `refactor`, `test`, or `chore`. Example: `feat(app): 添加首页问候文案`.

Use the body when context is needed. Keep it concise and explain why the change is needed, not just what changed.

Pull requests should include a short description, user-visible impact, linked issues when applicable, and screenshots or recordings for UI changes. Note which Gradle commands were run.

## Security & Configuration Tips

Do not commit signing credentials, API keys, SDK paths, or generated build outputs.
