# MyTlvp


compile the library in your build.gralde

```gradle

allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}


dependencies {
   compile 'com.github.yuanshenzhen:mytlvp:v1.1'
  }
```

```xml
<com.ysz.mytlvp.views.TabViewPager
        android:id="@+id/vp"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

 <attr name="tabTextColor" format="color" />
 <attr name="tabSelectedTextColor" format="color" />
 <attr name="tabBackgroundColor" format="color" />
 <attr name="tabIndicatorColor" format="color" />
 <attr name="vpBackgroundColor" format="color" />
