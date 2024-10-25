# Soft-Engineering
<h3 align="center">《软件工程》课程作业仓库<h4>
Student_name: XiangShenChi
<br>
Student_num: 202210120510
<hr>

#### 实验一：个人编程技能和git操作

##### 1.git 基本操作
要求每个学生开始管理自己的源代码：
每个同学申请一个 GitHub 的账号，或者 码云 账号，存放源程序和其他文档。
安装、配置git。基础教程参考git 5分钟教程
基本操作示例

    git clone 代码仓库
    git add .
    git commit -m "提交说明"
    git push origin master


##### 2.编程基本功练习
（1）编程实现Helloworld
<br>
全部用命令行工具和notepad编辑器，不用Eclipse 等集成编辑环境，每人手工创建并编译一个Java的命令行程序：“Hello World”。
<br>
（2）练习数值计算
<br>
找出一个整数数组中子数组之和的最大值，例如：数组[1, -2, 3, 5, -1]，返回8（因为符合要求的子数组是 [3, 5]）；数组[1, -2, 3, -8, 5, 1]，返回6（因为符合要求的子数组是 [5, 1]）; 数组[1, -2, 3,-2, 5, 1]，返回7（因为符合要求的子数组是 [3, -2, 5, 1]）。
<br>
（3）写一个命令行程序
<br>
要求：输出1~20000内的所有素数，按每行5个打印出来，并分析程序中最费时的函数是什么， 如何改进？
<hr>

#### 实验二：原型工具的学习和实践

##### 1.实验目的
1.安装原型设计工具 AxureRp<br>
2.学习原型设计工具软件 AxureRp 的基本操作<br>
3.制作简单的原型页面<br>
4.导出原型文件并演示<br>
附：AxureRp V8 原型设计工具下载：链接:https://pan.baidu.com/s/1w7J6L_xHLuMT6NVqcZnQxg?pwd=6fxh 提取码:6fxh

##### 2.实验要求
1.参考一张图学会AXURE【最快入门教程】，了解AxureRp的基本操作<br>
2.参考AxureRP8互联网产品原型设计——课件.rar文档，逐步学习 AxureRp的用法<br>
3.按照“原型设计作业制作网站登录页面指南.pptx”，逐步实现一个简单的网站登录原型<br>
4.参考 Fenix’s BookStore 书店系统，制作该系统原型<br>
5.把制作的原型的源文件(.rp)以及实验报告一起打包优秀实验报告参考示例，以“学号-姓名-软件工程实验二”命名，提交到雨课堂软件工程实验二<br>

##### 3.实验内容
书店系统原型实现主要包括以下截图的原型，原则上严格按照既有系统设计原型页面，学有余力者，可以根据自己的想法扩展；<br>
（1）系统主界面（商品浏览页）<br>
（2）用户登录<br>
（3）用户注册<br>
（4）购物车<br>
（5）下单<br>
（6）结算<br>
（7）支付<br>
（8）库存<br>
（9）添加商品<br>
<hr>

#### 实验

##### 1.实验目的
1. 掌握 UML 建模工具 Rational Rose 软件的安装和基本操作；<br>
2. 掌握面向对象设计模型，包括类和类间的关系建模<br>
3. 能够构建类图静态模型<br>

##### 2.实验要求
1. 准确规范使用 UML 模型，包括类名，属性，方法，关系和多重性，角色，可见性，自学参考UML基础指南
2. 独立完成，禁止抄袭<br>
3. 使用 Rational Rose 创建模型；参考Rose使用技巧指南和Rose建模指南<br>
4. 选择自己熟悉的语言实现之，代码提交到自己的gitee仓库，代码地址写到实验报告中<br>
5. 按照实验报告模板，编写实验报告，复制创建的模型粘贴到 Word 报告中<br>
6. 文件以“学号-姓名-软件工程实验三.doc”的方式命名，提交到长江雨课堂：软件工程实验三<br>
附：软件下载<br>
（1） Rational Rose 2007企业版； 提取码：pa38<br>
（2） Visual Paradigm CE 16 提取码：bnd9<br>
（3） Rational Rose 2003 企业版 提取码：vjyd<br>
注：如果以上都安装不了，发生概率非常低。可以使用Processon或者亿图图示<br>

##### 3.实验内容
A1-1<br>
用Thoroughbred类对优良品质的马进行建模。它有3个属性：mother，father，birthyear，还有3个操作：getCurrentAge()、getFather()和getMother。每个属性都有名字、类型和可见性级别。类型和可见性都是可选的。类型放在名字后面，并用冒号进行分隔。可见性由前面的-、#、或+指定，分别代表私有、受保护、包或公有可见性。在实验中，所有属性都是私有的，由前面的减号（-）指出。可以用可见性级别、带名字和类型的参数以及返回类型来表示每个操作。<br>

A1-2<br>
College有一个包含Building对象的聚合，这表示建筑构成了学院。学院也有一个包含课程的组合。Course类也受到约束性注释（注释Course一定在某个Building中进行）。<br>

A1-3<br>
一个学院School由1到多个系Department构成；<br>
每个系至少拥有1位指导教师Instructor，并提供至少1门课程Subject；<br>
每个指导教师至少属于某个系且教授1-3门课程；<br>
学院拥有0到多名学生，学生Student参加1-5门课程学习。<br>
请使用UML描述以上各类间的关系。<br>

A1-4<br>
简化的网上购物系统需求说明：<br>
客户（Customer）具有四个属性：姓名(name)，联系电话(contact)，邮寄地址(deliveryAddress)和是否激活状态(active)，<br>
订单（Order）具有两个属性：创建日期（createDate），订单状态(status)包括CREATE、PAID、SHIPPING、DELIVERED、CANCEL五种状态；<br>
订单详情（OrderDetail）具有一个属性：数量（quantity），并具有calculateSubTotal（）、calculateWeight（）方法；<br>
商品项（Product）具有名称（title）、重量(weight)和描述（description），并具有getPriceForQuantity()方法和getWeight（）方法；
支付方式（Payment），具有金额（amount）属性；<br>
支付方式支持以下五种支付方式：信用卡Credit，具有卡号（number）、类型（type）和过期日期（expireDate）；<br>
现金（Cash），具有支付金额（cashTendered）属性；<br>
在线转账（WireTransfer），具有银行ID：bankID，银行名称bankName属性，<br>
支付宝（AliPay）具有卡号number属性；<br>
微信支付（WeixinPay），具有卡号属性。<br>
请根据以上简化的网上购物系统的关键类描述说明，创建类模型，并定义类之间的关系包括多重性（Multiplicity）。<br>

<hr style="border: 2px solid black;">

**<p align="center">Copyright© 2024 · CTGU · Shawn</p>**
