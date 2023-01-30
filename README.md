# TARDIM: In Control
### All of time and space, *now automated*.

This mod is an addon for the [TARDIM mod](https://modrinth.com/mod/tardim), and adds a way to control your time (but mostly space) machine with [ComputerCraft: Tweaked](https://tweaked.cc) computers using a new "Digital TARDIM Interface" peripheral.

### How to use
* Place the Digital Interface peripheral inside your TARDIM.
* Connect a computer to the peripheral using a wired modem and wrap it with `peripheral.wrap()`.
* Call one of the many methods available to you!

All the methods can be found in the [Javadoc](http://andrey71.me/TARDIM-ic-docs/su/a71/tardim_ic/tardim_ic/DigitalInterfacePeripheral.html)
(Ignore the Java-only methods at the top of the page. Sorry for that, but this is the best auto-generated docs I could find)

### Note
This is important, due to nature of the mod **anyone** inside your TARDIM with access to a computer and this peripheral
will be able to run **any** methods. There is no fix that I know of (aside from disabling any commands except "getters"), so if you want to have this on your server
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
However a version for one of them could be released a bit later than the other one's.
If you would like to use this mod but the version you want is missing I would suggest following the mod.

**Can I use this in my modpack?**
: Sure, as long as you credit me and link to this page.

**Why are the methods to make the TARDIM travel missing?**
: Implementing these, as well as the `locateBiome` method, would require me to have access to TARDIM mod's source code,
which the developers keep private. If I ever get access to source of the related commands I will add these methods.

**Why is the source code not linoed?**
: I would love to open the code and intend to at some point, however I am new to mod making, so I want to first ensure the quality of the mod and the source code.

**Will there be a 1.19.3 version and beyond?**
: Yes, I will try my best to update to later versions as soon as ComputerCraft: Tweaked and TARDIM receive stable versions for them.