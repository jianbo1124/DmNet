plugins {
    kotlin("jvm") version "2.0.21"
    id("maven-publish")


}



dependencies {

    implementation("com.squareup.retrofit2:retrofit:3.0.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.retrofit2:converter-gson:3.0.0")

}
//https://github.com/jianbo1124/DmNet.git
group = "com.github.jianbo1124"
version = "1.0.0" // 你的库版本

publishing {
    publications {
        create<MavenPublication>("release") {
            from(components["java" ])
            groupId = "com.github.jianbo1124"
            artifactId = "DmNet" // 你的模块名
            version = "1.0.0"
        }
    }
}