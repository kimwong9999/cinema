Coverage: 34%
# Project Title

Cinema

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

This version uses the H2 database. It can also use the MySQL database. Primarily run on Ecclipse 



### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Tests

    Most testing was done via the web page, making sure that the relevant page displayed the right details, for example for the 'view' page
    the test was complete if the page showed all the data of the table (exept the user id)
    
    The web page was done first using JavaScript data (and not database data received from the Java program)
    
                                                                                             Date Tested
    
    Web Page
    ========
    Home page  
            three button should be on this page
            'actor', 'location', 'movie'. This is a 
            header and should be on all the pages
            
            a message with an explation of what happens
            when these button are clicked.
                                                                                            06-JUN-2022
    
    List page 
        The header should be present 
        
        click 'actor' on the home page a list of actor names
        in alphbetical order should appear on the screen 
                                                                                            06-JUN-2022
        click 'location' on the home page a list of cities
        in alphbetical order should appear on the screen 
                                                                                            06-JUN-2022
        click 'movie' on the home page a list of movies
        in alphbetical order should appear on the screen 
                                                                                            06-JUN-2022
                                                    
        Each list entry (actor, location or movie) should have
        three buttons next to them 'view', 'change' and 'delete'
        
        At the botton of the list should be an 'add' button
                                                                                            06-JUN-2022
                                                                                             
        Click 'add' to go to the add page
             location                                                                       06-JUN-2022
             actor                                                                          06-JUN-2022
             movie                                                                          08-JUN-2022
             
        Click 'view' to go to the view page
             location                                                                       06-JUN-2022
             actor                                                                          06-JUN-2022
             movie                                                                          08-JUN-2022
        
        Click 'change' to go to the change page
             location                                                                        06-JUN-2022
             actor                                                                           06-JUN-2022
             movie                                                                           08-JUN-2022
       
        Click 'delete' to go to the delete page
             location                                                                        06-JUN-2022
             actor                                                                           06-JUN-2022
             movie                                                                           08-JUN-2022
             
                                                   
    Add Page 
        The header should be present
        
        Click 'add' on the list page to reveal a user input page
        
        All columns (except id) should be present for the user to enter data
        
        a 'submit' button at the bottom

        a 'list' button
                                                                                             06-JUN-2022
        
        location
            click 'submit' without a city, county or country will display a message prompting
            the user a enter these things

            click 'submit' will add a location to a javaScript array called 'location'
            all input fields will to cleared and a message will display the status of the insert
            e.g 'city' has been add successfully
            
            'city' will be the name of the city added
                                                                                            06-JUN-2022
                                                                                            
        actor
            click 'submit' without a surname will display a message prompting
            the user a enter a surname

            click 'submit' will add an actor row to a javaScript array called 'actor'
            all input fields will to cleared and a message will display the status of the insert
            e.g 'name' has been add successfully
            
            'name' will be the name of the actor added
                                                                                                        06-JUN-2022 
                                                                                             
       movie
            click 'submit' without a title will display a message prompting
            the user a enter a title

            click 'submit' will add n movie row to a javaScript array called 'movie'
            all input fields will to cleared and a message will display the status of the insert
            e.g 'title' has been add successfully
            
            'title' will be the name of the movie added
                                                                                                        08-JUN-2022                                                                                     
        
      click 'list' will return the user to the 'list' page, so see than the actor, location or movie
      has been successfully added

               'location'                                                                               06-JUN-2022
               
               'actor'                                                                                  06-JUN-2022
               
               'movie'                                                                                  08-JUN-2022
    
    View page
        the header should be present
        
        buttons 'list', 'change' and 'delete' should be at the bottom
        
        All columns of the table (except the id) should display
        in an un-updatable fashion
               'location'                                                                               06-JUN-2022
               'actor'                                                                                  06-JUN-2022
               'movie'                                                                                  08-JUN-2022
               
        Click 'list' to go back to the list page
               'location'                                                                               06-JUN-2022
               'actor'                                                                                  06-JUN-2022
               'movie'                                                                                  08-JUN-2022
               
        Click 'change' to go to the change page for the actor, location or movie
               location                                                                                 06-JUN-2022
               actor                                                                                    06-JUN-2022
               movie                                                                                    08-JUN-2022
               
        Click 'delete' to go to the change page for the actor, location or movie
               location                                                                                 06-JUN-2022
               actor                                                                                    06-JUN-2022
               movie                                                                                    08-JUN-2022
   
    Delete page
        The header should be present
        
        A message asking the user to confirm the delete
       
        Two buttons 'yes' and 'no' under the message
        
        'list', 'view' and 'change' button at the bottom
        
                                                                                                        06-JUN-2022
                                                                                                        
        Click 'no' to go to the list page
            location                                                                                    06-JUN-2022
            actor                                                                                       06-JUN-2022
            movie                                                                                       08-JUN-2022
            
        Click 'list' to go to the list page
            location                                                                                    06-JUN-2022
            actor                                                                                       06-JUN-2022
            movie                                                                                       08-JUN-2022
            
        Click 'change' to go to the change page
            location                                                                                    06-JUN-2022
            actor                                                                                       06-JUN-2022
            movie                                                                                       08-JUN-2022
            
       Click 'view' to go to the view page
            location                                                                                    06-JUN-2022
            actor                                                                                       06-JUN-2022
            movie                                                                                       08-JUN-2022
    
    06-JUN-2022
    Change page                                     07-JUN-2022
    
    The creation of the tables was done by Java via Ecclipse, first of all just creating the tables. The using the web site to add, update etc. the
    tables
    
    Table Location
    ==============
    Create Location table                           06-JUN-2022
    Add Location (insert)                           06-JUN-2022
    List Location cities (list)                     06-JUN-2022
    Display Location Details (view)                 06-JUN-2022
    Delete Location (delete)                        06-JUN-2022
    Change Location details (update)                07-JUN-2022
    
    Table Actor
    ==============
    Create Actor table                              06-JUN-2022
    Add Actor (insert)                              06-JUN-2022
    List Actor names (list)                         06-JUN-2022
    Display Actor Details (view)                    06-JUN-2022
    Delete Actor (delete)                           06-JUN-2022
    Change Actor details (update)                   07-JUN-2022
    
    Table Movie
    ==============
    Create Movie table                              08-JUN-2022
    Add Movie (insert)                              08-JUN-2022
    List Movie cities (list)                        08-JUN-2022
    Display Movie Details (view)                    08-JUN-2022
    Delete Movie (delete)                           08-JUN-2022
    Change Movie details (update)                   08-JUN-2022
 
    

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

Java Spring Boot using Ecclipse

## Versioning

Version 1

## Authors

* Kim Wong GitHub: https://github.com/kimwong9999/cinema Jira: https://kimwong.atlassian.net/jira/software/projects/CIN/boards/3



