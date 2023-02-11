# JavaAgent
对于"岳不群"来说，黑暗给了他黑色的眼睛，他只用它更好地窥探监视

## 简述
JavaAgent的一款基于Byte Buddy和javassit开发，统计Java应用运行时间和调用链路的小工具。

## 如何使用
默认使用-javaagent参数，agentAgent的值是需要监控包名。
比如我要统计practice.in.java工程中cn.pintia.zjo.practice.problem1146.Main的调用链路和各个链路的花费时间，可以在命令行中输入如下命令：
```
java -javaagent:C:\empiregeneral.github\JavaAgent\target\JavaAgent-1.0-RELEASE.jar=cn.pintia.zjo.practice -cp practice.in.java.jar cn.pintial.zjo.practice.problem1146.Main < TestCases_1146.txt
```
运行完成之后打印出调用链和消耗的时间信息：

init: 262144KB   max: 3708416KB  used: 32855KB   committed: 251392KB     use rate: 13%
init: 2496KB     max: 0KB        used: 14613KB   committed: 15232KB      use rate: 95%

name: PS Scavenge        count:0         took:0  pool name:[PS Eden Space, PS Survivor Space]

name: PS MarkSweep       count:0         took:0  pool name:[PS Eden Space, PS Survivor Space, PS Old Gen]

链路追踪(MQ)：c09dcd8b-78e8-47f1-99a6-f394975e9dbf cn.pintia.zjo.practice.problem1146.Main.main 耗时：283ms

其结果和[hdu judge](http://acm.hdu.edu.cn)、[zju judge](http://zoj.pintia.cn大致相当。



## 将要做的事
待续

