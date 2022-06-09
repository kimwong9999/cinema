Coverage: 34%
# Project Title

Cinema

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

This version uses a browser and the H2 database and is written in Java Spring Boot run on Ecclipse 

### System

The system has three database entities Actor, Location and Movie. 

ACTOR
    
    id      
    sname   - surname
    fname   - firstname
    bname   - name at birth
    bdate   - birth date
    bplace  - locaton of birth taken from the LOCATION table (one-to-one relationship)
    ddate   - date of death
    dpalce  - location of death taken the the LOCATION table (one-to-one relationship)
    
LOCATION    
    
    id
    city
    county
    country
    
MOVIE   
   
    id
    title       - title of the movie
    article     - 'a', 'an', 'the'
    release     - year of movie release
    duration    - length of film in minutes
    chroma      - colour or black and white
    ration      - 4:3, 2.5:1 etc
    cast        - a list of actors taken from the ACTOR table (many-tomany-relationship)
    

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
            
       Click 'yes' to confirm delete a message will appear on the screen confirning the deletion. Clicking the 'list'
       button will show that city, acotr or movie no longer appears on the list
            location                                                                                    06-JUN-2022
            actor                                                                                       06-JUN-2022
            movie                                                                                       08-JUN-2022
    
    
    Change page
        The header page should appear
        The data for the selected actor, location or movie should appear (except the id) in 
        an updatable form
            
        a 'submit' button
        a 'list' button
        a 'delete' button
            
        location                                                                                        07-JUN-2022
        actor                                                                                           07-JUN-2022
        movie                                                                                           08-JUN-2022
        
        click on 'list' should go to the list page
            location                                                                                    07-JUN-2022
            actor                                                                                       07-JUN-2022
            movie                                                                                       08-JUN-2022

        click on 'delete' should go to the delete page
            location                                                                                    07-JUN-2022
            actor                                                                                       07-JUN-2022
            movie                                                                                       08-JUN-2022
            
        location
            click the 'submit' button with empty fields will result in a message prompt the user to enter
            the city, county and country 
            
            click the 'submit' button will all fields filled will add the record and a message will appear showing
            the status of the change. Click on 'view' (or 'list' and then 'view') to confim the change
                                                                                                        07-JUN-2022
                                                                                                        
        actor
            click the 'submit' button with an empty surname will result in a message prompt the user to enter
            a surname
            
            click the 'submit' button will the surname filled will add the record and a message will appear showing
            the status of the change. Click on 'view' (or 'list' and then 'view') to confim the change
                                                                                                        07-JUN-2022  
                                                                                                        
        movie
            click the 'submit' button with an empty title will result in a message prompt the user to enter
            the title
            
            click the 'submit' button will the title filled will add the record and a message will appear showing
            the status of the change. Click on 'view' (or 'list' and then 'view') to confim the change
                                                                                                        08-JUN-2022                                                                                                       
           
    
    The creation of the tables was done by Java via Ecclipse, first of all just creating the tables. The links were created in
    the Java program then added to the website. The web site wasused to test these links along observing the changed on the h2 database,
    some tests were done using postman.
    
    Table Location
    ==============
    Create Location table                                                                               07-JUN-2022
    
    List locations
        Using web page, a message should appear saying 'table is empty'                                07-JUN-2022
    Add Location                           
        using postman                                                                                   07-JUN-2022
        using web site (add page)                                                                       07-JUN-2022
    List Location cities 
        using web page                                                                                  07-JUN-2022
    Display Location Details 
        using web site (view)                                                                           07-JUN-2022
    Delete Location 
        using web site (delete)                                                                         07-JUN-2022
    Change Location details 
        using web site (update)                                                                         07-JUN-2022
    
    Table Actor
    ==============
    Create Actor table                                                                                  07-JUN-2022
    List actor names
        Using web page, a message shouild appear saying 'table is empty'                                07-JUN-2022
        
    Add Actor 
        add an actor without locatons
        using postman                                                                                   07-JUN-2022
        using web site (add page) and h2                                                                07-JUN-2022
        with locations using postman, wesite and h2                                                     08-JUN-2022
                
    List Actor names 
        using web page (list)                                                                           07-JUN-2022
    Display Actor Details 
        without locations using web page (view)                                                         07-JUN-2022
        with locations using postman, website and h2                                                    08-JUN-2022
    Delete Actor 
        using web page (delete) and h2                                                                  07-JUN-2022
    Change Actor details 
        without locations using web site (update) and h2                                                07-JUN-2022
        with locations using postman, web site and h2                                                   08-JUN-2022
    
    Table Movie
    ==============
    Create Movie table                                                                                  08-JUN-2022
    
    List Movie title 
        Using web page (list) a message should appear saying 'table is empty'                           08-JUN-2022
    
    Add Movie 
        without cast using website (add)                                                                08-JUN-2022
        with cast using postman, website and h2                                                         09-JUN-2022
    List Movie cities 
        using website (list)                                                                            08-JUN-2022
    Display Movie Details 
        without cast using website (view)                                                               08-JUN-2022
        with cast using postman, website (view) and h2                                                  09-JUN-2022
    Delete Movie 
        using webstie (delete) and h2                                                                   08-JUN-2022
    Change Movie details 
        without cast using website (update) and h2                                                      08-JUN-2022
        wit cast using postman, website and h2                                                          09-JUN-2022
 
    

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

HTML, CSS, javaScript
Java Spring Boot using Ecclipse

## Versioning

Version 1

## Authors

* Kim Wong 
* GitHub: https://github.com/kimwong9999/cinema 
* Jira: https://kimwong.atlassian.net/jira/software/projects/CIN/boards/3



