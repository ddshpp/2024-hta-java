plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // https://mvnrepository.com/artifact/org.apache.poi/poi
    implementation("org.apache.poi:poi:5.2.3")

    // https://mvnrepository.com/artifact/net.sourceforge.jexcelapi/jxl
    implementation("net.sourceforge.jexcelapi:jxl:2.6.12")
}

tasks.test {
    useJUnitPlatform()
}