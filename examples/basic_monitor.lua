local tardim = peripheral.find("digital_tardim_interface")
local screen = peripheral.find("monitor")

-- This requires Wojbie's bigfont
-- pastebin get 3LfWxRWh bigfont
local bigfont = require("bigfont")

screen.clear()
screen.setCursorBlink(false)
screen.setTextScale(0.5)

local owner = tardim.getOwnerName()

screen.setCursorPos(1, 1)
bigfont.writeOn(screen, 1, owner .. "'s TARDIM", 2, 2)

while true do
    local fuel = tardim.getFuel()
    local in_flight = tardim.isInFlight()
    local loca_curr = tardim.getCurrentLocation()
    local loca_dest = tardim.getTravelLocation()
    screen.setCursorPos(1, 6)

    bigfont.writeOn(screen, 1, "Fuel", 2, 6)
        
    fuel = math.floor(fuel)
    screen.write("")
    local fuel_bar = "["
    for i = 1, 50 do
        if i * 2 <= fuel then
            fuel_bar = fuel_bar .. "#"
        else
            fuel_bar = fuel_bar .. "."
        end
    end
    fuel_bar = fuel_bar .. "]"

    screen.setCursorPos(14, 6)
    screen.write(fuel_bar)
    screen.setCursorPos(14, 7)
    screen.write(fuel_bar .. " " .. fuel .. "%")
    screen.setCursorPos(14, 8)
    screen.write(fuel_bar)

    bigfont.writeOn(screen, 1, "Current position", 2, 10)
    screen.setCursorPos(50, 10)
    screen.write("X: " .. loca_curr.pos.x)
    screen.setCursorPos(50, 11)
    screen.write("Y: " .. loca_curr.pos.y)
    screen.setCursorPos(50, 12)
    screen.write("Z: " .. loca_curr.pos.z)
    screen.setCursorPos(50, 13)
    screen.write("Dim: " .. loca_curr.dimension)

    bigfont.writeOn(screen, 1, "Destination", 2, 15)
    screen.setCursorPos(50, 15)
    screen.write("X: " .. loca_dest.pos.x)
    screen.setCursorPos(50, 16)
    screen.write("Y: " .. loca_dest.pos.y)
    screen.setCursorPos(50, 17)
    screen.write("Z: " .. loca_dest.pos.z)
    screen.setCursorPos(50, 18)
    screen.write("Dim: " .. loca_dest.dimension)


    

    screen.setCursorPos(1, 20)
    screen.clearLine()
    screen.setCursorPos(1, 21)
    screen.clearLine()
    screen.setCursorPos(1, 22)
    screen.clearLine()
    if in_flight then
        bigfont.blitOn(screen, 1, "In Flight", "000000000", "ddddddddd", 2, 20)
    else
        bigfont.blitOn(screen, 1, "Not In Flight", "0000000000000", "eeeeeeeeeeeee", 2, 20)
    end

    sleep(0.1)
end