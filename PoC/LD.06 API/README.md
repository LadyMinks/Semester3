# Proof of Concept API
# Minka Firth S3

I could not get springboot to work at first, which turned out to be a small technical problem.
I turned to Mitchell to help me out and together we worked on a small api application.
![ListController](capture.jpg)

In this small application I make an online version of my 30 seconds android application. It simply shows a single category,
with a small list of questions from this category. ![ListController](capture1.jpg)

With as output at the localhost:8080/disney_movies. ![](capture3.jpg)

We also added some integration testing to make sure we are getting and receiving the correct information. I've made 
two tests to make sure we are receiving the actual json objects. 
Then in the second test I also test if I am receiving a string for both the name and the id. 
![](capture4.jpg)