plugins { kotlin("jvm") version "1.9.10" }
repositories { mavenCentral() }
dependencies {
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("com.google.android.material:material:1.11.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("org.jsoup:jsoup:1.15.4")
    implementation("redis.clients:jedis:4.3.1")
    implementation("org.junit.jupiter:junit-jupiter:5.9.2")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.10")
    implementation("io.ktor:ktor-server-netty-jvm:2.3.4")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
}
