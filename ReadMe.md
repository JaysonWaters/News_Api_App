# Jayson Waters csc 3950 News Api app

This application allows you to search and see the article listing but not the entire article because the Api used only gives the headlines and a brief description.

![Screenshot (175)](https://user-images.githubusercontent.com/48612339/211115447-26a61825-cd63-4212-90fa-e076f368c4b9.png)

## How to use:

**Use a simulator on Android Studio**

1) When you open the app you will see "Zero articles found" and a "RETRY" button.

2) To start seeing articles type something like "tech", "Bitcoin", "covid","Polotics".

3) If you clear the search bar, by hitting the "X" then all the articles will display.

4) The topic/articles are limited to what the Api can provide.

5) You can also swipe down from the top of the page to refresh the page. (the refresh is a litte buggy, plus theres is not much to refresh since the api doesnt get updated every second of the day)

### Screens:

Screen 1 is the the activity_main.xml that will be the first screen you will see when you open the application hold the "retry" button, "Zero articles found" text, and the verticle linear layout for the artciles.

2nd screen holds the card view for the articles going into the verticle linear layout.

3rd screen the Search bar and button so you can seach for certain article or topic.
