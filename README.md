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

AddTab.addTab(mTabLayout,mViewPager,mFragment,mTitle,getSupportFragmentManager());
