pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven (url = "https://jitpack.io")
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "SampleEmailValidation"
include(":app")
include(":sample-email-validation")
