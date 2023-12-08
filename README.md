# Mindstorm-automatic-car
self driving lego mindstorm car, finding a way from A to B

this project was made as a school project and it wasn't finished up to the deadline.
The code should let the car drive from point A to F, but it is extremly slow due to the use of lejos, to bring java on the Ev3 Brick.
Also it can't follow a black line and turns in the wrong way. 
It takes a lot of time, until the colorsensor realises, it's on a green point and the lineleader takes a lot of time, until it realises, it's away from the line, even though it's a lot quicker in testing.
Overall it has a lot of software problems and I would recommend using python on the brick, since it worked on it from another  group.
If someone finds this code, he can finish it and i don't claim any rights on it. It's free to use to all people. I wish, that the lejos developer can get attention to this post, since lejos is actually a great idea, but not made good. 

# Installation of Lejos
The installation process was quite hard and took at least a month, to finsih.

You need an Ev3 Brick, an Micro SD card with 8gb or less (not more, since from 16gb or more it doesn't work), a micro usb cable, a pc (I used windows here, I guess linux works just like this, but i don't know about macs)

First of you need an oracle account with even a adress and etc.
Then you go on this website https://sourceforge.net/projects/ev3.lejos.p/files/ and get lejos and install it onto you pc.
After that you install eclipse.
You also need a rdnis driver, which you can get by simply searching for it.
You're going to eclipse marketplace (yes, you need another thing) and search for the lejos ev3 extension and install it. Then you make a new lejos project and set the java language to java 1.7se (yes it is old, of you read the version, you realise, that lejos is from 2014 and still in beta, since it was discontinued)
After that you see a header in eclipse called lejos ev3. You hit that header and than "start ev3sdcard control" 
There you go on "click the link [...]" and download the 7 60 version. Not version 8 !!!! since that one never worked on my brick. There you login with the oracle account and get the software. While your waiting you can format your SD card with fat32, for some reason ntfs didn't work and the brick didn't even get, that there ist another system.
Your going to install the software on the sd card with the window, that opened with the "click the link [...]" and insert it in the brick when it's finished.
Then you're going to start the brick and in the first time, it's going to take a while, until it's installed. The you connect the brick via usb and install the rdnis driver, so that the brick gets recognised. After this you go the the header lejos ev3 in eclipse again and start "start ev3control".
There you hit search and wait, until the a ev3 is found and connect with it.
Uploading a file on it's own is quite problematic, so I recommend, that you just right click the code, you want to upload and just run it as ev3 lejos program. It will be automaticly uploaded to the brick and saved. If you don't find run it as ev3 lejos program, you either did something wrong in the progress, or I forgot to explain something.
Here you have it, have fun with this, if you're up for a challenge.
You'll find pictures from the robot and the map, it was programmed for and german readme's (yes, this is made in Munich, Bavaria), for the classes, which are used, you'll also find old clases, since if sometimes newer codes don't work and you have to donwload  the older code and copy paste the new one in. Also if tried some things, which didn't work.
If someone finishes this all, congrats, yoou either studied computer science or are a genius.
