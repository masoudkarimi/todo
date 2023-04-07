pluginManagement {
    repositories {
        google()
        mavenCentral()
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
rootProject.name = "Todo"
include(":app")
include(":base:android")
include(":data:db")
include(":data:room_db")
include(":feature:tasks:domain")
include(":feature:tasks:data")
include(":feature:tasks:ui")
