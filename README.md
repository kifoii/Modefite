# Modefite - Item Definition Backport

<p align="center">
  <a href="README.md">English</a> |
  <a href="README.zh-CN.md">简体中文</a>
</p>

---

Modefite is a client-side Fabric mod focused on compatibility and extensions for Minecraft's **Items Model Definition system**.

For Minecraft **26.2**, the vanilla game already provides the Items Model Definition system. This version of Modefite therefore focuses on maintaining Modefite compatibility and extensions on Minecraft's native 26.2 item-model architecture rather than duplicating functionality that is already built into the game.

## Minecraft 26.2

| Component | Version |
|---|---|
| Minecraft | **26.2** |
| Fabric Loader | **0.19.5** |
| Fabric API | **0.161.0+26.2** |
| Java | **25** |
| Modefite | **0.1.5** |

## FAQ

---

### What does Modefite do on 26.2?

Minecraft 26.2 natively supports the Items Model Definition system introduced in Minecraft 1.21.4.

Modefite remains useful as the compatibility layer for Modefite-specific behavior and extensions while resource packs can use the native 26.2 item-model pipeline.

### Is this the same as the original 1.21.1 version?

No. The 26.2 version uses Minecraft's newer item-model APIs and architecture. The original 1.21.x implementation relied on older client model-loading APIs that are no longer a one-to-one match on 26.2.

The goal is to preserve the behavior of Modefite where it is still relevant while following the 26.2 client item-model architecture.

### Resource packs and unknown fields

Modefite was originally designed to make newer resource-pack item definitions usable on older Minecraft versions.

For the original Modefite format, custom properties and fields can be placed under:

`assets/<minecraft_or_modid>/modefite_items_override`

Unknown properties or fields were intentionally ignored by Modefite instead of producing a missing model. Resource-pack authors should still follow the 26.2 item-model format when targeting Minecraft 26.2 itself.

### Core shaders

Some resource packs may include core shaders that are incompatible with a particular Minecraft version. If a resource-pack reload fails after enabling a pack, check the pack's shader files and the game's `latest.log` for the actual error.

### Where should I report problems?

Please report Modefite bugs, compatibility problems, and feature requests through the GitHub issue tracker.

Also include your Minecraft version, Fabric Loader version, Fabric API version, Modefite version, the affected resource pack, and relevant `latest.log` information when possible.

## Why Modefite?

---

Before Minecraft 1.21.4, TimmyChips created **Pommel** to provide separate held models and other item-model behavior for resource packs.

Minecraft 1.21.4 and later introduced the Items Model Definition system, giving resource-pack creators substantially more control over item models. Modefite was created to bring that system to older Minecraft versions and make newer resource packs easier to backport.

Modefite grew from the same resource-pack compatibility work that involved projects such as CIT Resewn, Eating Animation, EMF, and ETF.

## Minecraft 26.2 development

---

Minecraft 26.2 changed the client item-model architecture substantially compared with the original 1.21.x implementation.

The 26.2 port therefore follows the native client item-model pipeline instead of attempting to copy obsolete 1.21.x classes and Mixins directly.

Current migration work includes:

- Minecraft 26.2 compatibility
- Fabric Loader 0.19.5
- Fabric API 0.161.0+26.2
- Java 25
- Updated Gradle/Loom configuration
- Removal of obsolete 1.21.x Mixin hooks
- Compatibility with the native 26.2 item-definition system
- Respackopts detection for resource-pack configuration workflows

## Original project

---

The original Modefite implementation and its documentation are maintained by TimmyChips:

https://github.com/TimmyChips/Modefite-Item-Defintion-Backport

This 26.2 work is based on the original project's design and behavior, adapted to Minecraft's 26.2 client architecture.

## License

---

See the repository license for licensing information.
