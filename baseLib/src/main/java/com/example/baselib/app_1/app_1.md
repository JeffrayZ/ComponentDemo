## application兼容方式一
首先我们需要明白的是，各个module为什么需要有自己的application？<br/>
是因为每一个module都存在需要在application中初始化的代码。<br/>
***明白了这一点，那就好办了，初始化就完事了！！！***
<br/>
通过BaseApplication获取各个module的初始化文件（java文件），通过反射初始化java文件来调用初始化代码。