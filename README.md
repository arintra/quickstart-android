# Android SDK developer documentation for Arintra

For API key visit [developers page](https://arintra.com/developers.html).

## Integrate Arintra SDK in your Project

Please ensure your minimum SDK version is “21” `minSdkVersion 21`

##### In project level gradle file `project/build.gradle`

In `allprojects > repositories` add

```java
maven  {
            url 'https://dl.bintray.com/arintra/Maven'
  }
```

Please add the following line if client App doesn’t contain jitpack.io repository,
```java
maven {
             url 'https://jitpack.io'
 }
```

Add the following dependencies

```java
dependencies {
   classpath "com.android.tools.build:gradle:4.0.0"
   classpath 'com.google.gms:google-services:4.2.0'

   classpath 'com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.1'
   classpath 'com.github.dcendents:android-maven-gradle-plugin:1.4.1'
   // NOTE: Do not place your application dependencies here; they belong
   // in the individual module build.gradle files
}

```
##### In app level gradle file `app/build.gradle`

In `android` add

```java
compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
```
```java
dataBinding {
                 enabled = true
     }

```
to set Java version and enable data binding.

In `defaultConfig` add
```java
multiDexEnabled true
```

Add the following SDK related dependencies

```java
implementation 'com.google.firebase:firebase-core:16.0.9'
implementation 'com.google.firebase:firebase-firestore:19.0.1'
implementation 'com.google.firebase:firebase-storage:19.0.1'
implementation 'com.google.firebase:firebase-auth:9.2.1'
implementation 'com.google.firebase:firebase-analytics:17.2.0'
implementation 'androidx.multidex:multidex:2.0.0'
implementation 'com.jakewharton.rxbinding3:rxbinding:3.0.0-alpha2'
implementation "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:1.0.0"
implementation 'com.squareup.okhttp3:logging-interceptor:3.14.2'
implementation 'com.google.android:flexbox:1.1.0'
implementation 'com.squareup.picasso:picasso:2.71828'
implementation 'com.squareup.retrofit2:retrofit:2.5.0'
implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
implementation 'android.arch.persistence.room:runtime:1.1.1'
implementation 'android.arch.persistence.room:rxjava2:1.1.1'
implementation 'android.arch.lifecycle:livedata:1.1.1'
implementation 'org.apache.commons:commons-collections4:4.3'
implementation 'com.github.barteksc:android-pdf-viewer:2.8.2'
implementation 'com.karumi:dexter:5.0.0'
implementation('com.github.worker8:radiogroupplus:v1.0.1')
{
transitive = false
}
implementation 'com.github.esafirm.android-image-picker:imagepicker:2.2.0'
implementation 'com.github.florent37:inline-activity-result:1.0.2'
implementation 'com.github.esafirm.android-image-picker:rximagepicker:2.2.0'
annotationProcessor 'android.arch.persistence.room:compiler:1.1.1'

```
#### In Manifest

Make sure you have these permissions in `AndroidManifest.xml`

```xml
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.CAMERA" />
```

## Initialize

```java
Arintra.initialize(context, "api_key”);
```

## Launch Arintra questions

```java
Arintra.accessQuestions(context, ”Pass class name which you want to call after questions”);
```

## Access Report

```java
Arintra.generateReport(context, "Pass class name which you want to call after closing report");
```
