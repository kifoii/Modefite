# Modefite - Item Definition Backport

Modefite backports Minecraft's item model definition system to older versions and provides additional item-definition features.

## Minecraft 26.2

This repository contains the Minecraft 26.2 / Fabric 0.19.5 migration work.

- Minecraft: 26.2
- Fabric Loader: 0.19.5
- Fabric API: 0.161.0+26.2
- Java: 25
- Modefite: 0.1.5

Minecraft 26.2 includes native item model definitions. This port therefore focuses on preserving Modefite-specific compatibility and extensions rather than duplicating vanilla functionality.

## Resource-pack configuration

Enchantment Outlines uses Respackopts for its configuration UI. Install a compatible Respackopts release (and its required dependencies) if you want to configure supported resource packs.

## Build

Use the included Gradle wrapper:

```bash
./gradlew build
```

On Windows:

```powershell
.gradlew.bat build
```

## License

See the repository license and upstream project information for licensing details.
