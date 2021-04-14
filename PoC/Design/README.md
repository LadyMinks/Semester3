# C4 Model Bier.cool (/ analyse?)

In this small document, the C4 model for bier.cool ia explained.  

## Legend

<img src='C4Legend.png' width="750">

Just a simple legend explaining all the different roles in the models.

## C1

<img src = 'bierC1.png' width="750">

Where we show the bigger scope of the project. It shows the various systems used in the project, the main one being the 
bier.cool system. The other systems are processes that operate with the main system.

## C2

<img src = 'bierC2.png' width="1000">

Shows how we are going to implement a micro-service architecture to realise our plans. The Alcoholic only uses the beer 
holder and the web application. The API application is able to communicate with the external processes from level 1.


## C3

as of yet unfortunately still not in existence.

[comment]: <> (<img src = 'bierC1.png' width="750">)


## C Hardware

<img src = 'bierChardware.png' width="1000">

While we know it is unusual to sketch a hardware project like this, we wanted to keep with the theme of the C4 model,
as well as it shedding at least some light on the design.



# Acceptatietestplan

## Log in 

| **code** 	| **instruction**                                                    	| **expected result**                                                                                                                  	| **actual result** 	| **passed?** 	|
|----------	|--------------------------------------------------------------------	|--------------------------------------------------------------------------------------------------------------------------------------	|-------------------	|-------------	|
| *LG0*    	| Enter website's url "bier.cool" into the browser.                  	| Shows website's "homepage".                                                                                                          	|                   	|             	|
| *LG01*   	| Log in with username "minkasbier69" and password "islekkerkoud420" 	| Shows Minka's List of beers in fridge, with their temperature + List  of groups / List of friends.                                   	|                   	|             	|
| *LG01a*  	| Log in with username "minkasbier69" and no password.               	| Will not allow a user to log in without password.                                                                                    	|                   	|             	|
| *LG01b*  	| Log in with username "minkasbier42" and password "islekkerkoud420" 	| Will tell user that username does not exist.                                                                                         	|                   	|             	|
| *LG01c*  	| Log in with username "minkasbier69" and password "isviesbah420"    	| Will direct to http status code 401.                                                                                                 	|                   	|             	|
| *LG02*   	| Select one of the groups.                                          	| Will show friends in this group, sorted by the coldest beer + temp of beers.                                                         	|                   	|             	|
| *LG03*   	| Select one of the friends (from homepage or from a Group)          	| Will show friend's page with: beers + temp & sort of beer, distance to this friend + temp of beer when arriving, weather at friends. 	|                   	|             	|

