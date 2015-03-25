# Micro-Service Template using Spring-boot

###步骤：
1、 写build.gradle文件

    * 两个task用来创建文件目录
    * 引入spring-boot依赖如文件内容所示
    * apply spring-boot plugin
    * apply jetty
    * 使用mavenCentral 和 jcenter

2、 导入gradle项目，并配置spring-servlet和spring-context

    * 在web.xml中配置servlet
    * 配置applicationContext

3、 在中Application 添加 hello world

    * 测试spring配置是否能跑通，浏览器能显示出hello world就可以

4、 添加Health check controller

    * 标注为RestController并且enable自动配置
    * mapping地址为/healthCheck

5、 添加diagnostic controller

    * 同上
    * 添加一个service用于得到本service依赖的其他services的列表
    * mapping地址为/dependencies

6、 添加相应controller和services的测试

    * 添加测试运行的spring application context
    * 使用mockmvc测试