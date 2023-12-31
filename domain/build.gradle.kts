plugins {
	id("java-library")
	id("org.jetbrains.kotlin.jvm")
}

java {
	sourceCompatibility = JavaVersion.VERSION_1_7
	targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
	implementation("javax.inject:javax.inject:1")
	api("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
}