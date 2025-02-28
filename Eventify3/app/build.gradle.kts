plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services) // Firebase plugin
}

android {
    namespace = "com.example.eventify"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.eventify"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // Android Libraries
    implementation(libs.appcompat.v170) // AppCompat for backward compatibility
    implementation(libs.constraintlayout.v220) // ConstraintLayout for layouts
    implementation(libs.recyclerview) // RecyclerView for events display
    implementation(libs.material.v1120) // Material Design UI components

    // Firebase Libraries
    implementation(libs.firebase.database) // Firebase Realtime Database
    implementation(libs.firebase.firestore) // Firebase Firestore (optional, if needed)
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.auth)
    implementation(libs.firebase.database)


    // Testing Libraries
    testImplementation(libs.junit) // Unit Testing
    androidTestImplementation(libs.junit.v121)
    androidTestImplementation(libs.espresso.core.v361)
}

// Add this line for Firebase integration
apply(plugin = "com.google.gms.google-services")
