## 创建`新类型`项目：`Jakarta EE`
- ![img.png](img.png)
- ![img_6.png](img_1.png)
- 创建完成之后的代码结构
    - ![img_7.png](img_2.png)

## EE 项目的总体流程
- `写代码` -> `打包`  -> `部署` -> `验证`
1. 写代码（暂时是 IDEA 自动生成的）
2. 打包
3. 部署
4. 验证
- ![img_8.png](img_8.png)

## `修改代码`，需要重新执行 -> `打包`  -> `部署` -> `验证`
- ![img_10.png](img_10.png)

## 麻烦？自动化：让 IDEA 帮我们自动完成琐碎的操作
- ![img_11.png](img_11.png)
- ![img_12.png](img_12.png)
- ![img_13.png](img_13.png)
- ![img_14.png](img_14.png)
- ![img_15.png](img_15.png)
- ![img_17.png](img_17.png)
- 如果遇到 8080 端口被占用的错误
  - ![img_16.png](img_16.png)
  - 或者按以下顺序检查及配置
    1. 检查之前的 MyServer 程序是否已经停止了（因为当前我们用的就是跟 Tomcat 一样的 8080 端口）
    2. 检查是否之前已经启动过 Tomcat，如果是，Windows 执行 shutdown.bat 脚本命令；macOS 或者 Linux 执行 shutdown.sh 停止服务
    3. 或者修改 Tomcat 的默认端口
    - ![img_9.png](img_9.png)

## `静态资源` vs `动态资源`
下图所示的是创建项目自动生成的 Servlet 代码，之后我们回自己写 Servlet 进一步体会
- ![img_18.png](img_18.png)

## 自己写的第一个 `Servlet`
- ![img_19.png](img_19.png)
- ![img_20.png](img_20.png)
- 验证1：先在控制台打印日志
  - ![img_21.png](img_21.png)
- 验证2：多次请求，会多次执行，即：多次打印日志
  - ![img_22.png](img_22.png)
- 验证3：直接返回 html 格式的内容给客户端（如：浏览器）
  - ![img_23.png](img_23.png)
  - ![img_24.png](img_24.png)

## 今天核心知识小结
- ![img_25.png](img_25.png)

## 课后作业
- ![img_26.png](img_26.png)