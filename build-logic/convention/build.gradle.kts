plugins {
    `kotlin-dsl`
}

group = "com.inner.second.compose.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.compose.compiler.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "com.inner.second.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "com.inner.second.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
    }
}