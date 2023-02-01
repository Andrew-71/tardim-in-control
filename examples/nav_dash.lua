local tardim = peripheral.find("digital_tardim_interface")
local screen = peripheral.find("monitor")

screen.clear()
screen.setCursorBlink(false)
screen.setTextScale(0.5)

-- 15x24
--[[
~ Current pos
    X
    Y
    Z
    Dimension
    Facing
~ Destination
    X
    Y
    Z
    Dimension
    Facing
~Fuel
    Remaining
    Required


TARDIM NAV| 11

]]