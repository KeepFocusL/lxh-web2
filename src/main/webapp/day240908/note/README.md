## `What is a Servlet` and `What is a Servlet Container`
- 上次课我们是直接阅读了 Servlet 源码中的注释
- 这次课我们阅读 Jakarta EE 的 Servlet 规范文档，同样是一手资源
- ![img_4.png](img_4.png)

## Jakarta EE 项目的 `src` 和 `target` 的对应关系
- ![img_5.png](img_5.png)

## 问题：浏览器看到的效果跟自己期待的不一致
- 参考下图的提示排查
- ![img_6.png](img_6.png)

## HTTP 协议之 request 解释
- ![img_7.png](img_7.png)

## HTTP 协议之 response 解释
- ![img_8.png](img_8.png)

## 动手时间 1：持续多语言/国际化的页面显示功能
- ![img_9.png](img_9.png)
- 思考：是通过 Servlet 的 request 还是 response 获取相关信息？
- 连懵带猜：自己挖掘 request 或 response 对象中有哪些相关的 behavior 或 state
    - 通过 `.` 自己探索

## 用 IDEA 提供的 `HTTP Request` 工具测试效果
也从侧面说明了，Web Client 不止浏览器
- ![img_11.png](img_11.png)
- ![img_12.png](img_12.png)
- ![img_13.png](img_13.png)

## 动手时间 2：上一个功能的升级 - 支持用户自己指定要显示什么语言
- ![img_14.png](img_14.png)

### 验证效果
- ![img_15.png](img_15.png)

## 动手时间 3：给当前项目新增一个 index.html 汇总显示所有核心链接和说明
- ![img_16.png](img_16.png)
- 比如：
    - ![img_17.png](img_17.png)

## 同一个 Servlet 可以关联多个 URL
- ![img_18.png](img_18.png)

## 由上一张截图引出 Tomcat 默认提供的 DefaultServlet
- 完整路径：`org.apache.catalina.servlets.DefaultServlet`
- ![img_19.png](img_19.png)
- ![img_20.png](img_20.png)
- ![img_21.png](img_21.png)

## 继续引出：`通过注解配置 Servlet` vs `在 web.xml 中配置`
- ![img_22.png](img_22.png)

## 连接服务器的方法
* 在阿里云云服务器管理控制台下载ecs-key.pem
* 在 Downloads 文件夹开启 git bush 或 命令行,输入以下命令
* 登录服务器命令: ssh -i "C:\Users\你的用户名\Downloads/ecs-key.pem" root@121.199.33.150 | scp -i ecs-key.pem index.html root@121.199.33.150:/root/apache-tomcat-10.1.28/webapps/ROOT
* 显示当前路径
* pwd
* whoami
* man pwd (全部命令)
* clear (清屏)
* java -version
* apt install default-jdk
* apt-get update
* apt install default-jdk
* java -version
* javac -version
* wget https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.28/bin/apache-tomcat-10.1.28.zip | 如果已经有zip,在zip所在的路径执行scp -i ecs-key.pem apache-tomcat-10.1.28.zip root@121.199.33.150/root
* ll
* apt install unzip
* ll
* cd apache-tomcat-10.1.28 
* ll
* cd apache-tomcat-10.1.28/
* ll
* cd bin
* ll
* chmod +x catalina.sh
* ll
* ./catalina.sh star* 
* cd ..
* pwd
* ll
* cd webapps
* ll ROOT
* mv ROOT ROOT_bak (这里把 ROOT 更名为 ROOT_bak)
* mkdir ROOT (创建 ROOT 文件夹)
* ll
* 把index.html放在下载里面
* scp -i ecs-key.pem index.html root@121.199.33.150:/root/apache-tomcat-10.1.28/webapps/ROOT
