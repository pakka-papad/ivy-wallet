plugins {
    id("ivy.feature")
}

android {
    namespace = "com.ivy.attributions"
}

dependencies {
    implementation(projects.ivyBase)
    implementation(projects.ivyDomain)
    implementation(projects.ivyResources)
    implementation(projects.ivyNavigation)
    implementation(projects.ivyCommonUi)
    implementation(projects.ivyDesign)

    testImplementation(projects.ivyTesting)
}
