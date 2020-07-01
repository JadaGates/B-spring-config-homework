# Spring Config Homework

## Problem 1：读取 nested properties

使用 @ConfigurationProperties 时支持读取 List、Map 以及 Class 形式的 nested properties。

具体需要读取的 properties 已经在 `src/main/resource/application.properties` 中给出，请在分支 `p1-starts-from-here` 上继续完成剩余的代码。

期望在程序启动时，在命令行输出相应的属性和值，就像已提供的代码所完成的一样。

最终的答案请提交在一个名为`p1s1`的分支上，`p`表示 problem，`s`表示 solution。

## Problem 2：在测试中设置 properties

请先阅读分支 `p2-starts-from-here` 上的代码，主要是 `LevelController`。

现在要对 `LevelController` 中的 `getLevel()` 方法写自动化测试，使用 `@SpringBootTest` 进行集成测试即可。

请提供至少3种不同的方案，每种方案分别提交到单独的分支上，这些分支都需从 `p2-starts-from-here` 分出来，依次命名为 `p2s1`、`p2s2`、`p2s3` 即可。

