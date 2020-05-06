[![GitHub release](https://img.shields.io/badge/release-1.0.0-28a745.svg)](https://github.com/0nebean/com.alibaba.druid-0nebean.custom/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)


Introduction
---
- 对 Spring Cloud 依赖

Documentation
---


- 配置文件
```properties
#eureka
eureka.client.serviceUrl.defaultZone = http://${eureka的IP}:${eureka的端口}/eureka/
#开启健康检查
eureka.client.healthcheck.enabled = true
#发送心跳续约间隔时间
eureka.client.registery-fetch-interval-seconds = 5
eureka.instance.lease-renewal-interval-in-seconds = 10
eureka.client.registery-fetch-interval-day = 80
management.security.enabled = false
eureka.instance.preferIpAddress = true

#feign
feign.hystrix.enabled = false

#ribbon
ribbon.ReadTimeout = 10000
ribbon.ConnectTimeout = 10000

# sleuth
spring.sleuth.sampler.percentage = 1

#hystrix
# 默认值：true 是否开启fallback功能
hystrix.command.default.fallback.enabled = false
# 默认值：true 是否开启断路器功能
hystrix.command.default.circuitBreaker.enabled = false
# 默认值：THREAD HystrixCommand.run()的执行时的隔离策略
hystrix.command.default.execution.isolation.strategy = THREAD
# 默认值：1000 设置调用者执行的超时时间（单位毫秒)
hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds = 10000
# 默认值：true 是否开启超时设置
hystrix.command.default.execution.timeout.enabled = true
# 默认值：true 设置是否在执行超时时 中断HystrixCommand.run() 的执行
hystrix.command.default.execution.isolation.thread.interruptOnTimeout = true
# 默认值：false 设置是否在取消任务执行时 中断HystrixCommand.run() 的执行
hystrix.command.default.execution.isolation.thread.interruptOnCancel = false
# 默认值：10 当HystrixCommand.run()使用SEMAPHORE的隔离策略时 设置最大的并发量
hystrix.command.default.execution.isolation.semaphore.maxConcurrentRequests = 10
# 默认值：10 设置从调用线程允许HystrixCommand.getFallback（）方法允许的最大并发请求数
hystrix.command.default.fallback.isolation.semaphore.maxConcurrentRequests = 10
# 默认值：20 设置滚动窗口中将使断路器跳闸的最小请求数量
hystrix.command.default.circuitBreaker.requestVolumeThreshold = 20
# 默认值：5000 断路器跳闸后 在此值的时间的内 hystrix会拒绝新的请求
hystrix.command.default.circuitBreaker.sleepWindowInMilliseconds = 5000
# 默认值：50 设置失败百分比的阈值。如果失败比率超过这个值 则断路器跳闸并且进入fallback逻辑
hystrix.command.default.circuitBreaker = 50
# 默认值：false 强制使断路器跳闸 则会拒绝所有的请求.此值会覆盖circuitBreaker.forceClosed的值
hystrix.command.default.circuitBreaker.forceOpen = false
# 默认值：false 强制使断路器进行关闭状态 此时会允许执行所有请求 无论是否失败的次数达到circuitBreaker.errorThresholdPercentage值
hystrix.command.default.circuitBreaker.forceClosed = false
# 默认值：10000 设置统计滚动窗口的时间长度
hystrix.command.default.metrics.rollingStats.timeInMilliseconds = 10000
# 默认值：10 设置统计滚动窗口的桶数量 在高并发的环境里 每个桶的时间长度建议大于100ms 如：（10000/10、10000/20）
hystrix.command.default.metrics.rollingStats.numBuckets = 10
# 默认值： true 执行延迟是否被跟踪 并且被计算在失败百分比中。如果设置为false,则所有的统计数据返回-1
hystrix.command.default.metrics.rollingPercentile.enabled = true
# 默认值：60000 设置统计滚动百分比窗口的持续时间
hystrix.command.default.metrics.rollingPercentile.timeInMilliseconds = 60000
# 默认值：6 设置统计滚动百分比窗口的桶数量
hystrix.command.default.metrics.rollingPercentile.numBuckets = 6
# 默认值：100 设置每个桶保存的执行时间的最大值
hystrix.command.default.metrics.rollingPercentile.bucketSize = 100
# 默认值：500 采样时间间隔
hystrix.command.default.metrics.healthSnapshot.intervalInMilliseconds = 500
# 默认值：true 控制HystrixCommand使用到的Hystrix的上下文
hystrix.command.default.requestCache.enabled = true
# 默认值：true 是否开启日志 打印执行HystrixCommand的情况和事件
hystrix.command.default.requestLog.enabled = true
# 默认值：Integer.MAX_VALUE 设置同时批量执行的请求的最大数量
hystrix.collapser.default.maxRequestsInBatch = Integer.MAX_VALUE
# 默认值：10 批量执行创建多久之后 再触发真正的请求
hystrix.collapser.default.timerDelayInMilliseconds = 10
# 默认值：true 对HystrixCollapser.execute() 和 HystrixCollapser.queue()开启请求缓存
hystrix.collapser.default.requestCache.enabled = true
# 默认值：10 设置线程池的core的大小
hystrix.threadpool.default.coreSize = 10
# 默认值：10 设置最大的线程池的大小 只有设置allowMaximumSizeToDivergeFromCoreSize时 此值才起作
hystrix.threadpool.default.maximumSize = 10
# 默认值：-1 设置最大的BlockingQueue队列的值 -1 则使用SynchronousQueue队列 如果设置正数 则使用LinkedBlockingQueue队列
hystrix.threadpool.default.maxQueueSize = -1
# 默认值：5 实现动态修改等待队列长度 即等待的队列的数量大于queueSizeRejectionThreshold时（但是没有达到maxQueueSize值） 则开始拒绝后续的请求进入队列
hystrix.threadpool.default.queueSizeRejectionThreshold = 5
# 默认值：1 设置线程多久没有服务后，需要释放（maximumSize-coreSize ）个线程
hystrix.threadpool.default.keepAliveTimeMinutes = 1
# 默认值：false 设置allowMaximumSizeToDivergeFromCoreSize值为true时 maximumSize才有作用
hystrix.threadpool.default.allowMaximumSizeToDivergeFromCoreSize = false
# 默认值：10000 设置滚动窗口的时间
hystrix.threadpool.default.metrics.rollingStats.timeInMilliseconds = 10000
# 默认值：10 建议每个桶的时间长度大于100ms
hystrix.threadpool.default.metrics.rollingStats.numBuckets = 10

```

