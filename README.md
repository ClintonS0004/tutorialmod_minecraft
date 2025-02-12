# Fabric Example Mod

## Setup

For setup instructions please see the [fabric wiki page](https://fabricmc.net/wiki/tutorial:setup) that relates to the IDE that you are using.

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.

# Minecraft (fabric) Modding

Here is a few things I have been playing with. From what I understand, Minecraft modding relies on OOP. Your mod is added classes to the game, whether the class is a in-game item or a handler/controller that changes rules/gameplay. So you start by taking the basic sample of something, (lets use a block as an example), then override the method of your class to change it's in-game repressentation. For example, ./src/main/java/com/Clinton/tutorialmod/block/ModBlocks on _line 18_ I am using the premade _FabricBlockSettings_ to copy the attributes of the Iron block. I also make a note on how I would change the sound while keeping the other attributes of Iron. 

## Registering Items

![items](.\run\screenshots\2024-07-05_22.58.33.png)