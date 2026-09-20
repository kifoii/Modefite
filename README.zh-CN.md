# Modefite - Item Definition Backport

<p align="center">
  <a href="README.md">English</a> |
  <a href="README.zh-CN.md">简体中文</a>
</p>

---

Modefite 是一个客户端 Fabric Mod，专注于 Minecraft **物品模型定义系统（Items Model Definition）** 的兼容性与扩展。

对于 Minecraft **26.2**，原版已经原生支持 Items Model Definition。因此，26.2 版本的 Modefite 主要负责保留 Modefite 自身的兼容层与扩展能力，并适配 26.2 原生的物品模型架构，而不是重复实现原版已经提供的功能。

## Minecraft 26.2

| 组件 | 版本 |
|---|---|
| Minecraft | **26.2** |
| Fabric Loader | **0.19.5** |
| Fabric API | **0.161.0+26.2** |
| Java | **25** |
| Modefite | **0.1.5** |

## 常见问题

---

### Modefite 在 26.2 中做什么？

Minecraft 26.2 已经原生支持 Minecraft 1.21.4 引入的 Items Model Definition 系统。

Modefite 在 26.2 中继续作为 Modefite 特有行为与扩展的兼容层，同时允许资源包使用 26.2 原生的物品模型流程。

### 这和原来的 1.21.1 版本完全一样吗？

不是。26.2 使用了更新后的物品模型 API 和客户端架构。原来的 1.21.x 实现依赖旧版客户端模型加载 API，这些 API 在 26.2 中已经发生了较大变化，不能直接一一对应迁移。

26.2 的目标是在保留仍然适用的 Modefite 行为的同时，遵循 Minecraft 26.2 原生的客户端物品模型架构。

### 资源包和未知字段

Modefite 最初的目标之一，是让较新的资源包物品定义能够在较旧的 Minecraft 版本中使用。

对于原 Modefite 格式，自定义属性和字段可以放在：

`assets/<minecraft_or_modid>/modefite_items_override`

Modefite 原本会忽略未知属性或字段，而不是直接生成缺失模型。针对 Minecraft 26.2 本身制作资源包时，仍应按照 26.2 原生的物品模型格式编写。

### Core Shader

部分资源包可能包含与特定 Minecraft 版本不兼容的 Core Shader。如果启用资源包后重新加载失败，请检查资源包中的 shader 文件，并查看游戏的 `latest.log` 获取具体错误。

### 问题反馈

你可以通过 GitHub Issue 反馈 Modefite 的 Bug、兼容性问题和功能请求。\n\n**如果你不会使用 GitHub，或者不知道怎么创建 Issue，也可以直接发邮件反馈：**\n\n**2953701641@qq.com**

提交问题时，如果可以，请附带 Minecraft 版本、Fabric Loader 版本、Fabric API 版本、Modefite 版本、相关资源包，以及必要的 `latest.log` 信息，这样更方便定位问题。

## 为什么有 Modefite？

---

在 Minecraft 1.21.4 之前，TimmyChips 创建了 **Pommel**，用于为资源包提供独立手持模型以及其他物品模型行为。

Minecraft 1.21.4 及以后引入了 Items Model Definition 系统，为资源包作者提供了更强的物品模型控制能力。Modefite 最初就是为了将这一系统移植到旧版 Minecraft，并帮助新资源包进行兼容而创建的。

Modefite 的发展也与 CIT Resewn、Eating Animation、EMF 和 ETF 等资源包兼容项目存在关联。

## Minecraft 26.2 迁移

---

Minecraft 26.2 相比原来的 1.21.x 实现，大幅调整了客户端物品模型架构。

因此，26.2 版本采用 Minecraft 原生的客户端物品模型流程，而不是直接复制已经过时的 1.21.x 类和 Mixin。

当前迁移工作包括：

- Minecraft 26.2 兼容
- Fabric Loader 0.19.5
- Fabric API 0.161.0+26.2
- Java 25
- 更新 Gradle/Loom 配置
- 移除过时的 1.21.x Mixin Hook
- 适配 26.2 原生物品定义系统
- 检测 Respackopts，为资源包配置流程提供兼容支持

## 原项目

---

原始 Modefite 实现及文档由 TimmyChips 维护：

https://github.com/TimmyChips/Modefite-Item-Defintion-Backport

本 26.2 版本基于原项目的设计与行为，并针对 Minecraft 26.2 客户端架构进行了适配。

## 许可证

---

许可证信息请参阅仓库中的 License 文件。
