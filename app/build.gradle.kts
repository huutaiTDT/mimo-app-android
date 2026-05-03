plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt)
    alias(libs.plugins.compose.compiler)

    kotlin("kapt")

    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
}

android {
    namespace = "huutai.dev.meetmino"
    compileSdk = 35

    defaultConfig {
        applicationId = "huutai.dev.meetmino"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    // ---------------------------------------------------
    // BUILD FEATURES
    // ---------------------------------------------------
    buildFeatures {
        compose = true
        viewBinding = true
        buildConfig = true
        dataBinding = false
    }

    // ---------------------------------------------------
    // BUILD TYPES
    // ---------------------------------------------------
    buildTypes {

        debug {
            isMinifyEnabled = false
            isDebuggable = true

            buildConfigField("String", "BASE_URL", "\"http://192.168.1.3:3000/\"")
            buildConfigField("Boolean", "ENABLE_LOGGING", "true")
            buildConfigField("Boolean", "ENABLE_CRASH_REPORTING", "false")

            manifestPlaceholders["crashlyticsEnabled"] = false

            firebaseCrashlytics {
                mappingFileUploadEnabled = false
                nativeSymbolUploadEnabled = false
            }
        }

        release {
            isMinifyEnabled = true
            isDebuggable = false

            buildConfigField("String", "BASE_URL", "\"https://hodos-api.gitlabserver.id.vn/\"")
            buildConfigField("Boolean", "ENABLE_LOGGING", "false")
            buildConfigField("Boolean", "ENABLE_CRASH_REPORTING", "true")

            manifestPlaceholders["crashlyticsEnabled"] = true

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

            signingConfig = signingConfigs.getByName("debug")
        }
    }

    // ---------------------------------------------------
    // JAVA + KOTLIN
    // ---------------------------------------------------
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

hilt {
    enableAggregatingTask = false
}

kapt {
    correctErrorTypes = true
    useBuildCache = true
}

dependencies {

    // ---------------------------------------------------
    // COMPOSE BOM
    // ---------------------------------------------------
    val composeBom = platform("androidx.compose:compose-bom:2025.02.00")

    implementation(composeBom)
    androidTestImplementation(composeBom)

    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.material3:material3")

    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")

    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    implementation("androidx.compose.material:material-icons-core")
    implementation("androidx.compose.material:material-icons-extended")

    // ---------------------------------------------------
    // ACTIVITY + LIFECYCLE
    // ---------------------------------------------------
    implementation("androidx.activity:activity-compose:1.9.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.5")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.core:core-splashscreen:1.0.1")

    // ---------------------------------------------------
    // NAVIGATION
    // ---------------------------------------------------
    implementation("androidx.navigation:navigation-compose:2.8.5")

    // ---------------------------------------------------
    // CAMERA X
    // ---------------------------------------------------
    implementation(libs.androidx.camera.core)
    implementation(libs.androidx.camera.camera2)
    implementation(libs.androidx.camera.lifecycle)
    implementation(libs.androidx.camera.video)
    implementation(libs.androidx.camera.view)

    // ---------------------------------------------------
    // HILT
    // ---------------------------------------------------
    implementation("com.google.dagger:hilt-android:2.56.2")
    kapt("com.google.dagger:hilt-compiler:2.56.2")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    // ---------------------------------------------------
    // ROOM
    // ---------------------------------------------------
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    kapt("androidx.room:room-compiler:2.6.1")

    // ---------------------------------------------------
    // RETROFIT
    // ---------------------------------------------------
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    // ---------------------------------------------------
    // FIREBASE
    // ---------------------------------------------------
    implementation(platform("com.google.firebase:firebase-bom:33.8.0"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.google.firebase:firebase-crashlytics")

    // ---------------------------------------------------
    // IMAGE
    // ---------------------------------------------------
    implementation("io.coil-kt:coil-compose:2.7.0")

    // ---------------------------------------------------
    // MAP
    // ---------------------------------------------------
    implementation("com.google.android.gms:play-services-maps:19.0.0")
    implementation("com.google.maps.android:maps-compose:6.4.1")

    // ---------------------------------------------------
    // LOGGING
    // ---------------------------------------------------
    implementation("com.jakewharton.timber:timber:5.0.1")

    // ---------------------------------------------------
    // TEST
    // ---------------------------------------------------
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}