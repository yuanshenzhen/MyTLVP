# MyTlvp
依赖
compile 'com.github.yuanshenzhen:mytlvp:v1.0'

allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}

使用
  在布局文件中使用TabViewPager，宽高使用match_parent
  属性       <attr name="tabTextColor" format="color" />
            <attr name="tabSelectedTextColor" format="color" />
            <attr name="tabBackgroundColor" format="color" />
            <attr name="tabIndicatorColor" format="color" />
            <attr name="vpBackgroundColor" format="color" />
