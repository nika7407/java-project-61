plugins {
    id("application")
    id("checkstyle")
}
group = "hexlet.code"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
}
application {
    mainClass = "hexlet.code.App"
}


tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
checkstyle {
    toolVersion = "10.12.4"
    configFile = file("config/checkstyle/checkstyle.xml")
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}
tasks.test {
    useJUnitPlatform()
}