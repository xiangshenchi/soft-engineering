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

#### 实验三：面向对象的系统建模A

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
<hr>

#### 实验四：面向对象的系统建模B

##### 1.实验目的
1. 掌握状态图的绘制，充分理解状态图的三要素
2. 理解状态图模型的意义
3. 能够从实际问题中构建状态图模型

##### 2.实验要求
1. 按照实验报告模板编写实验报告，
2. 模型图贴到文档的适当位置；
3. 使用自己熟悉的语言，实现状态机模型，源代码的gitee地址写到实验报告中；
4. 文件以“学号-姓名-软件工程实验四.doc”的方式命名，提交到长江雨课堂软件工程实验四；

##### 3.实验内容
B1<br>
绘制恒温水箱20°~100°的状态图。<br>
恒温水箱启动之后，当温度传感器检测温度低于20°时，如果水量传感器检测到水箱中有水，则打开继电器电源，开始烧水；如果水量传感器检测到当前无水，则不打开电源烧水。当温度传感器检测到水箱中水的温度达到100°，则断开电源。如果水箱烧坏，则进行维修。当晚上11点整时，自动断开电源，进入休眠状态；早上7点整，自动进入上述恒温烧水过程。<br>

B2<br>
阅读教材《软件工程-实践者的方法》第八版 SafeHome项目说明(教材122页第八版，教材102页第九版），针对控制面板ControlPanel的状态建模，绘制ControlPanel状态图。<br>
SafeHome控制面板的行为说明参考如下：<br>
在SafeHome的安全功能中控制面板类ControlPanel的状态如下：<br>
户主敲击控制面板的键盘按键输入密码时，控制面板处于读取键入字符状态。每输入一个字符则执行输入密码与设置的密码长度（4位）比较，如果达到密码长度则验证密码是否正确；如果输入密码错误3次，则锁定控制面板；锁定时间超过120秒之后，再次允许户主输入；如果输入的密码正确，控制面板进入系统功能选择状态。

B3<br>
根据以下问题描述，采用状态图/状态机建模，并实现之：<br>
用户需要从源代码文件中提取源文件中的所有字符串。字符串是双引号之间的文本，但是字符串中的反斜杠会转义下一个字符，比如对于字符串：”一般学习一门编程语言的时候，基本上第一个程序是输出\”Hello World!\””,应该输出：一般学习一门编程语言的时候，基本上第一个程序是输出”Hello World!”。
<hr>

#### 实验五：面向对象的系统建模C

##### 1.实验目的
1. 掌握用例图建模；
2. 编写用例规格说明。

##### 2.实验要求
1. 阅读下面材料，Rational Rose绘制用例图，并编写用例规格说明（选择2-3个关键用例编写即可，预约和支付用例必须编写用例规格说明，活动图建模），以一个Word文件的形式提交（用例图贴到文档的适当位置）
2. 参考案例 word文档《案例-旅店预订系统用例图和用例文档.doc》或PDF格式《案例-旅店预订系统用例图和用例文档.pdf》格式编写
3. 文件以“学号-姓名-软件工程实验五.doc”的方式命名，提交到长江雨课堂“软件工程实验五”

##### 3.实验内容
“医院预约挂号系统”问题陈述<br>

为了规范和推动医院预约挂号服务，卫生部2019年8月在其官方网站发布了《关于在公立医院施行预约诊疗服务工作的意见(征求意见稿)》，要求在推动医院开展预约挂号工作的同时，提高对预约挂号服务工作的认识、加强对预约挂号服务工作的管理、并认真做好相关组织工作。<br>

某IT公司瞄准此次契机，决定着手开发一个通用的“医院预约挂号系统”，以满足各级公立医院的预约挂号需求。<br>

系统的基本流程如下：未注册用户可以通过该系统查询医院、相关科室、各科室的医生等各类信息，但不能使用其它与预约相关的业务。需要进行预约挂号的用户必须通过该网站利用身份证号进行实名注册，并提供手机号，注册信息由系统管理员进行审核，审核通过后，用户才可使用手机号和验证码登录该系统。为了方便用户登录，系统还支持第三方（如微信公众号）登录。微信公众号登录必须首先绑定手机号用户才能登录。预约挂号时，用户首先选择需要预约的医院，之后选择要预约的科室和时间（指定某个日期的上午或下午）；此时，系统应自动显示该时间段内该科室所有出诊的医生。需要注意的是，每个医生每次出诊所能看病的人数有一定的限制，当某个医生的预约人数满员后即不可预约。用户可以选择一个可预约的医生进行预约，一个用户每个时间段最多只能预约5位医生。预约成功后，用户可以打印预约单。用户还可以通过第三方的支付系统（I期只支持淘宝的支付宝，后续支持各类信用卡）网上支付挂号费，也可以暂不交费。年龄超过60岁的患者免费。已交费的用户还可打印挂号单，并在看病当天拿着预约单和挂号单直接去医院相应的科室分诊台进行分诊，分诊台的护士核查预约单和挂号单无误后盖章确认，即允许用户看病。未交费的用户需要拿着预约单到医院的挂号处交费，挂号处核查预约单，并打印出挂号单，盖章确认后交给分诊台护士后进行分诊。<br>

在看病的前一天，用户可随时取消预约记录，系统不收取任何费用，已缴的费用会自动退回到用户的帐号。看病当天的预约记录只能在医院挂号处现场取消，也不收取费用。但是，对于那些在网上预约成功，却不去看病也不按时取消的用户，系统会进行警告：已收取的费用不再退回，每出现一次用户的信用等级下降1级；当用户信用等级将为0时，不再允许使用该系统。用户的初始信用等级是在审核用户注册信息时设定的。<br>

此外，有关医生的出诊信息可以由系统管理员手动维护，也可通过定制一些规则后由系统提前若干天（具体多少天可以由系统管理员设置）生成某日的出诊信息。当用户预约成功、缴费成功、退费成功、预约时间到达前2小时提醒、预约未使用未取消时系统均要求使用短信通知用户。<br>

支持登录用户代患者挂号功能，以解决对于无法使用APP的用户如婴幼儿或老年人也能够使用该预约挂号系统。<br>
<hr>

#### 实验六：面向对象的系统建模D

##### 1.实验目的
1. 掌握 UML 建模工具 Rational Rose 软件的安装和基本操作；
2. 掌握面向对象设计模型，包括类和类间的关系建模
3. 能够采用B-C-E分析类，构建类图静态模型
4. 能够基于B-C-E分析类，使用顺序图（Sequence）构建行为模型，对用例的事件流建模。

##### 2.实验要求
1. 阅读下面材料，根据实验五中“医院预约挂号系统”编写的系统用例图，对预约挂号用例和支付挂号费用例，使用Rose完成以下任务：<br>
(1) 根据系统用例图(word版本参考）或pdf版本参考，绘制边界类、控制类和实体类三种分析类，并绘制B-C-E包图<br>
(2) 对预约挂号用例和支付挂号费用例中的控制类绘制相应的顺序图，转换为协作图；<br>
(3) 绘制“参与类类图”VOPC图。以一个Word文件的形式提交（Rose绘制的模型图贴到文档的适当位置）<br>
2. 参考《第5章 面向对象方法5（use Case Analysys）.ppt》或《第5章 面向对象方法5（use Case Analysys）.pdf旅店预订案例
3. 文件以“学号-姓名-软件工程实验六.doc”的方式命名，提交到长江雨课堂“软件工程实验六”

##### 3.实验内容
“医院预约挂号系统”问题陈述<br>

为了规范和推动医院预约挂号服务，卫生部2019年8月在其官方网站发布了《关于在公立医院施行预约诊疗服务工作的意见(征求意见稿)》，要求在推动医院开展预约挂号工作的同时，提高对预约挂号服务工作的认识、加强对预约挂号服务工作的管理、并认真做好相关组织工作。<br>

某IT公司瞄准此次契机，决定着手开发一个通用的“医院预约挂号系统”，以满足各级公立医院的预约挂号需求。<br>

系统的基本流程如下：未注册用户可以通过该系统查询医院、相关科室、各科室的医生等各类信息，但不能使用其它与预约相关的业务。需要进行预约挂号的用户必须通过该网站利用身份证号进行实名注册，并提供手机号，注册信息由系统管理员进行审核，审核通过后，用户才可使用手机号和验证码登录该系统。为了方便用户登录，系统还支持第三方（如微信公众号）登录。微信公众号登录必须首先绑定手机号用户才能登录。预约挂号时，用户首先选择需要预约的医院，之后选择要预约的科室和时间（指定某个日期的上午或下午）；此时，系统应自动显示该时间段内该科室所有出诊的医生。需要注意的是，每个医生每次出诊所能看病的人数有一定的限制，当某个医生的预约人数满员后即不可预约。用户可以选择一个可预约的医生进行预约，一个用户每个时间段最多只能预约5位医生。预约成功后，用户可以打印预约单。用户还可以通过第三方的支付系统（I期只支持淘宝的支付宝，后续支持各类信用卡）网上支付挂号费，也可以暂不交费。年龄超过60岁的患者免费。已交费的用户还可打印挂号单，并在看病当天拿着预约单和挂号单直接去医院相应的科室分诊台进行分诊，分诊台的护士核查预约单和挂号单无误后盖章确认，即允许用户看病。未交费的用户需要拿着预约单到医院的挂号处交费，挂号处核查预约单，并打印出挂号单，盖章确认后交给分诊台护士后进行分诊。<br>

在看病的前一天，用户可随时取消预约记录，系统不收取任何费用，已缴的费用会自动退回到用户的帐号。看病当天的预约记录只能在医院挂号处现场取消，也不收取费用。但是，对于那些在网上预约成功，却不去看病也不按时取消的用户，系统会进行警告：已收取的费用不再退回，每出现一次用户的信用等级下降1级；当用户信用等级将为0时，不再允许使用该系统。用户的初始信用等级是在审核用户注册信息时设定的。<br>

此外，有关医生的出诊信息可以由系统管理员手动维护，也可通过定制一些规则后由系统提前若干天（具体多少天可以由系统管理员设置）生成某日的出诊信息。当用户预约成功、缴费成功、退费成功、预约时间到达前2小时提醒、预约未使用未取消时系统均要求使用短信通知用户。<br>

支持登录用户代患者挂号功能，以解决对于无法使用APP的用户如婴幼儿或老年人也能够使用该预约挂号系统。<br>
<hr>

#### 实验七：设计模式以及构建设计

##### 1.实验目的
1. 了解软件工程工具生成代码的方法，理解代码自动生成的过程，破除自动生成代码“黑科技”
2. 掌握构件设计方法
3. 学习Bridge设计模式，体会设计模式的作用

##### 2.实验要求
1. 参考第7章 设计概念（design principle &pattern）（4学时），学习Bridge设计模式的使用；
2. 学习 Rose 生成代码的方法，理解代码自动生成原理
3. 文件以“学号-姓名-软件工程实验七.rar”的方式命名，把模型文件和工程实现代码打包，提交到长江雨课堂软件工程实验七；

##### 3.实验内容
1. 按照给出的 Bridge 设计模式 构建类图<br>
有一个叫 HuntBird 的游戏，里面需要表示各种各样的鸟类。采用Bridge设计模式实现，针对各种鸟类，采用Bridge设计模式建模。<br>
注意：<br>
（1）绘制类之前，首先设置默认语言为Java/C++（本例以Java说明）<br>
（2）Bird类为抽象类<br>
（3）display方法为抽象方法<br>
（4）Bird具有保护类型的FlyBehavior属性；<br>

2. 按照以下给出的要求，扩展类图，并生成代码框架，实现代码，测试<br>
(1)添加一个飞翔的行为的实现类UnableFly，实现fly接口方法：扑腾几下飞不起来；<br>
(2)添加游泳的行为SwimBehavior接口，两个实现类AbleSwim，实现swim接口方法：鱼翔浅底；UnableSwim实现类实现swim接口方法：扑腾几下就淹死了：<br>
(3)添加两个具体类：老鹰Eagle和企鹅Penguin，并实现相应代码，即构造函数和display抽象方法<br>
(4)使用Client类，测试以上代码<br>

3. 根据以下需求说明，设计符合面向对象设计原则的 UML 类图并实现代码。<br>
假如我们正在开发一个酒店预订系统，针对不同的用户，我们需要计算出不同的房价。比如，普通用户是全价，金卡是 8 折，银卡是 9 折。<br>


<hr style="border: 2px solid black;">

**<p align="center">Copyright© 2024 · CTGU · Shawn</p>**
