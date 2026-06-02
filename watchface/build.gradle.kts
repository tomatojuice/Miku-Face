plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "jp.ne.sakura.tomatojuice.mikuface"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "jp.ne.sakura.tomatojuice.mikuface"
        minSdk = 34
        targetSdk = 36
        versionCode = 10000014
        versionName = "2.1.3"

    }

    sourceSets {
        getByName("main") {
            java.directories.clear()
            kotlin.directories.clear()
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        buildConfig = false
        aidl = false
        resValues = false
    }

    packaging {
        resources {
            excludes += "classes.dex"
            excludes += "**/classes.dex"
            excludes += "kotlin/**"
            excludes += "META-INF/*.kotlin_module"
            excludes += "META-INF/com.android.tools/**"
        }
    }
    enableKotlin = false
}

dependencies {
}