error id: IVMyH+OTQdkxkE2lY91HUA==
### Bloop error:

Unexpected error when copying <WORKSPACE>\.scala-build\.bloop\functional-programming-practical_d189e5655b\bloop-internal-classes\main-YfxvDHkMS5GgScmfu59jTw==\prac4_3.class to <WORKSPACE>\.scala-build\functional-programming-practical_d189e5655b\classes\main\prac4_3.class, you might need to restart the build server.
java.nio.file.FileSystemException: <WORKSPACE>\.scala-build\functional-programming-practical_d189e5655b\classes\main\prac4_3.class: The process cannot access the file because it is being used by another process
	at java.base/sun.nio.fs.WindowsException.translateToIOException(WindowsException.java:92)
	at java.base/sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:103)
	at java.base/sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:108)
	at java.base/sun.nio.fs.WindowsFileCopy.copy(WindowsFileCopy.java:171)
	at java.base/sun.nio.fs.WindowsFileSystemProvider.copy(WindowsFileSystemProvider.java:284)
	at java.base/java.nio.file.Files.copy(Files.java:1305)
	at bloop.io.ParallelOps$.copy$1(ParallelOps.scala:164)
	at bloop.io.ParallelOps$.$anonfun$copyDirectories$8(ParallelOps.scala:189)
	at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
	at monix.eval.internal.TaskRunLoop$.startFuture(TaskRunLoop.scala:494)
	at monix.eval.Task.runToFutureOpt(Task.scala:586)
	at monix.eval.internal.TaskDeprecated$Extensions.runSyncMaybeOptPrv(TaskDeprecated.scala:128)
	at monix.eval.internal.TaskDeprecated$Extensions.$anonfun$coeval$1(TaskDeprecated.scala:303)
	at monix.eval.Coeval$Always.apply(Coeval.scala:1451)
	at monix.eval.Coeval.value(Coeval.scala:258)
	at bloop.io.ParallelOps$.$anonfun$copyDirectories$7(ParallelOps.scala:229)
	at monix.reactive.internal.consumers.ForeachAsyncConsumer$$anon$1.onNext(ForeachAsyncConsumer.scala:44)
	at monix.reactive.internal.consumers.LoadBalanceConsumer$$anon$1.$anonfun$signalNext$1(LoadBalanceConsumer.scala:218)
	at monix.execution.internal.InterceptRunnable.run(InterceptRunnable.scala:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)
#### Short summary: 

Unexpected error when copying <WORKSPACE>\.scala-build\.bloop\functional-programming-practical_d189e...