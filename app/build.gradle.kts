plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.appexerciciosfisica"

    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.example.appexerciciosfisica"
        minSdk = 24
        targetSdk = 36

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    // AndroidX Core
    implementation("androidx.core:core-ktx:1.17.0")

    // AppCompat
    implementation("androidx.appcompat:appcompat:1.7.1")

    // Material Design
    implementation("com.google.android.material:material:1.13.0")

    // Activity
    implementation("androidx.activity:activity-ktx:1.10.1")

    // ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")

    // Testes
    testImplementation("junit:junit:4.13.2")

    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")
}