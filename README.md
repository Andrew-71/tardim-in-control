# TARDIM: In Control
### All of time and space, *now automated*.

This mod is an addon for the [TARDIM mod](https://modrinth.com/mod/tardim), and adds a way to control your time (but mostly space) machine with [ComputerCraft: Tweaked](https://tweaked.cc) computers and redstone using a new blocks and peripherals.

### Features:
* Digital TARDIM interface: ComputerCraft peripheral that lets you control a TARDIM using CC methods! Full list of methods is available in the [Javadoc](http://andrey71.me/TARDIM-ic-docs/su/a71/tardim_ic/tardim_ic/DigitalInterfacePeripheral.html) (Sorry for  that, this is the best auto-generated docs I could find for now). The peripheral supports almost all commands that the TARDIM computer panel has.
* Redstone TARDIM Input: New control block that lets you execute a TARDIM command with the power of redstone! After saving a command, this block executes it every time it gets powered by redstone
* *This is just the beginning, there are more features to come!*

### Note
This is important, due to nature of the mod **anyone** inside your TARDIM with access to a computer and this mod's peripheral
will be able to run **any** methods. There is no fix that I know of (aside from disabling any commands except "getters" like fuel info), so if you want to have this on your server
and do not trust everyone not to steal your blue box, make sure there is some kind of plot claim mod. If there will be demand for it I can try adding a config option to disable all but "harmless" methods.\
And another thing: the method that sets destination dimension doesn't check if the dimension is valid, if you cannot land just change dimension to a valid one.

### Example use-cases
* Make a dashboard to monitor fuel levels, current location, and other information on a screen in a nice way.
* Get refined control over your TARDIM, such as saving and loading locations, or setting a destination in a GUI.
* Add visual effects that activate during flight e.g. note blocks or Create mod contraptions.

The possibilities are endless, the only limit is your imagination! (And coding skills)

### FAQ

**Is this for Fabric or Forge?**
: As a Fabric player who recognises Forge's large playerbase, I intend to support both major modloaders.
However, the Fabric version is not yet released as I am waiting until I have a stable version to start porting the mod.
If you would like to use this mod but the version you want is missing I would suggest following the mod.

**Can I use this in my modpack?**
: Sure, as long as you credit me and link to this page.

**Will there be a 1.19.3 version and beyond?**
: Yes, I will try my best to update to later versions as soon as **both** ComputerCraft: Tweaked and TARDIM receive stable versions for them.

**I don't know CC, will this always be a CC-only mod?**
: OK, fine, nobody actually asked that. But in case you did, good news: No! As you might've noticed, version 0.8 add a block that make it possible to integrate your TARDIM into good old redstone! Going forward, I plan to add some way to get redstone *output* from the TARDIM as well, and maybe even streamline things like the cloister bell for those who don't want to code their own implementations!