# TinkerPatch-Demo

### tinker热修复平台tinkerPatch应用demo
参考官方demo而来，用tinkerPatch平台下发补丁比较方便，前端只需要写几行代码，目前是免费的，接入此平台就等于前后端都搞完了，而且比tinker更友好，默认锁屏后点亮屏幕时生效。
#### ### ## ### demo比较简单，注意需要修改的几个地方，很关键：

1. 签名文件的配置：新手比较容易陷入的坑，gradle文件里配置好签名后，一定要在buildTypes里调用，否则白配置。
2. 先生成基础包，然后拷贝文件夹名称到tinkerpatch.gradle文件里的baseInfo处，然后修改bug,最后执行tinker下面的tinkerPatch命令生产补丁包，步骤不能错。
