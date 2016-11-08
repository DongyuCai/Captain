##支持特性（基本可以不用看，都是常用的东西）：
* 增加Captain系统，支持分布式通信
* Captain独立成单独的工程

##正在进行：
* 优化Captain更换策略，当修改错了Team表后，组员有恢复功能。
* Captain也需要一个Home页
* Captain独立成单独的工程

##BUG
*1. Captain死后，只剩一个组员的情况下，当重启Captain后，组员激活心跳也不能加入到Captain，必须重启注册才行。
 * 已解决，放弃注册方式，注册已经整合到心跳中
*2. 因为要保证心跳程序的有意义，在启动的时候，如果没有指定Captain的host，那么就不启动心跳守护线程，这地方存在bug代码，在Captain死后，组员获取新任Captain地址，重新请求时没有换成新地址，还是老Captain。
*3. 手动重置Captain的Team表后，组员更换Captain有异常，线程阻塞等问题。

##需要验证:
* captain
 * Captain机停，组员自动选举Captain
 * 组员停，信息自动保持一致
 * 组员全停
 * 组员加入
 * Captain重启