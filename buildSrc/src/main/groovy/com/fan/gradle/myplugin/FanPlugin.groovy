package com.fan.gradle.myplugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 自定义 Gradle 插件的第二种方式
 * 在 buildSrc module 下,写插件,然后再 resources 下配置好
 * 随后就可以在 gradle 中文件中使用: apply plugin:'com.xx.xx'
 */
class FanPlugin implements Plugin<Project> {
    @Override
    void apply(Project target) {
        //project.android.registerTransform(new MyTransform(project))


//        val android = target.getExtensions().getByType(AppExtension.class)
//        android.registerTransform(com.fan.gradle.myplugin.MyTransform())
        println("111")
        println('buildSrc中MyPlugin执行了')
        target.task("mytask"){
            doLast {
                println('buildSrc中MyPlugin中的task执行了')
            }
        }

    }
}