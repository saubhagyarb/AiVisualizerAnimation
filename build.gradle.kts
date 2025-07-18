buildscript {
    extra.apply {
        set("lifecycle_version", "2.6.2")
    }
}

plugins {
    id("com.android.application") version "8.11.1" apply false
    id("com.android.library") version "8.11.1" apply false
    id("org.jetbrains.kotlin.android") version "2.2.0" apply false
}
