#Proof of Concept Hardware
#Minka Firth S3

**Problem**: when attempting to read the temperature of the glass, the sensor also measures the temperature of the air around the sensor, making the readings inaccurate.

**Goal**: find a practical way to isolate the Sensor, so it can attempt a *somewhat* accurate reading of the glass.

**What I used**:
* ESP8266 Ttgo TOI
* (2pcs) DS18B20 TO-92 Thermometer Temperature Sensor
* Breadboard
* 4.7kOhm pull-up resistor
* Arduino IDE
* a bunch of m/m & m/f wires that I couldn’t be bothered to count


## Problem

Connecting the sensor to the breadboard and the chip was a lot easier than I thought. I spent more time looking for the right resistor than actually connecting everything up. I followed a tutorial online and got the sensor up and running really quickly.
I ran into a problem where at first it would only print 85°C. [asdasd] (https://github.com/LittleMinks/Semester3/blob/main/PoC/Hardware/code/ESP1snsr.ino) After some googling, I found out this one particular sensor was different than shown on the picture above. Apparently, this sensor’s right pin goes into ground as well, so when I corrected that, it measured the actual temperature. 
However, when I tied the sensor to the beer with some elastics, the sensor would measure the temperature around the sensor as well as the glass I was pushing it against. The beer had been in the fridge for most of the day, so I very much doubt it was as warm as 15°C. 

## Solution

I decided to do some testing. Mitchell told me try some sponges and I got different kinds of freezer bags from the supermarket. I also decided it would be easier if I could test two sensors at once, so I hooked up another sensor. 	
These sensors are great, because each of them have a built in serial number on the back to identify them by. I took the lazy approach though, and decided to just look for sensors and then measure and print the temperature for both in a loop. 
	
First I tried a loooottt of different sized sponges, different sorts of elastic. Soon everything was covered in sponge residue and crumbles and it also didn’t do a great job of isolating the sensor, so I chose not to pursue that direction.

I decided to cut up some freezer bags and tied some elastics around them. These beers had been in the fridge all night and finally came close to something I thought might be close to accurate:

I decided to leave them there for a while and see which one would preserve the cold better. *Inserts some blatant marketing.* Turns out the freezer bag from the Lidl would always be about 0.40°C colder. This doesn’t mean this is measurement more accurate of course, it is just slightly better at its job than the one from the Albert Heijn. 


## Things I ran into

When I started playing around with the ESP, the stupid male pins wouldn’t stay in the holes of the ESP. Being a noob, it didn’t occur to me to buy some male/female pins, and was too scared to actually start soldering my only chip. I was afraid the male pins would connect under the chip, so my boyfriend (gotta give credit where it is due) came with a solution: 
While this means there are even more wires, they were out of the way and the ESP wasn’t as fragile to work with.
I ran into something else when adding the second sensor. As I explained the sensor needed two ground pins, as the middle pin is a “one-wire”, that is able to send data and also receive electricity. 

However, when adding the second sensor the same way, for some reason both sensors would give a reading of 85°C. Instead of being a sensible young woman and googling the solution, I decided to just turn it off and start different options. The one shown above is what I figured that worked most consistently. 

## Conclusion

We will probably be using a thermally conductive silicone sponge. We sort of figured this from the beginning, but trying sponges and freezer bags was a fun experiment to familiarize myself with the concept of Hardware. The next step is connecting it up to the Wi-Fi and testing it from within the fridge. 

	
