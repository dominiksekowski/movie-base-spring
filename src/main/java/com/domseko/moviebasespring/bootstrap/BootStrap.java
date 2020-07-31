package com.domseko.moviebasespring.bootstrap;

import com.domseko.moviebasespring.domain.*;
import com.domseko.moviebasespring.services.profiles.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private ActorService actorService;
    private BiographyService biographyService;
    private DirectorService directorService;
    private MovieBaseService movieBaseService;
    private MovieDescriptionService movieDescriptionService;
    private ScenaristService scenaristService;

    public BootStrap(ActorService actorService, BiographyService biographyService, DirectorService directorService,
                     MovieBaseService movieBaseService, MovieDescriptionService movieDescriptionService, ScenaristService scenaristService) {
        this.actorService = actorService;
        this.biographyService = biographyService;
        this.directorService = directorService;
        this.movieBaseService = movieBaseService;
        this.movieDescriptionService = movieDescriptionService;
        this.scenaristService = scenaristService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Bootstrap is ready...");

        /***********************************************************************************/

///////////////////////////////////////////////////////////

        Director director1 = new Director("Frank","Darabont");


////////////////////////////////////////////////////////////

        Scenarist scenarist1 = new Scenarist(director1.getFirstName(), director1.getLastName());

/////////////////////////////////////////////////////

        MovieDescription movieDescription1 = new MovieDescription("The Shawshank Redemption","The Shawshank Redemption is a 1994 American drama film written " +
                "and directed by Frank Darabont, based on the 1982 Stephen King novella Rita Hayworth and Shawshank Redemption. It tells the story of banker Andy Dufresne (Tim Robbins)," +
                " who is sentenced to life in Shawshank State Penitentiary for the murders of his wife and her lover, despite his claims of innocence. Over the following two decades, he " +
                "befriends a fellow prisoner, contraband smuggler Ellis \"Red\" Redding (Morgan Freeman), and becomes instrumental in a money-laundering operation led by the prison warden " +
                "Samuel Norton (Bob Gunton). William Sadler, Clancy Brown, Gil Bellows, and James Whitmore appear in supporting roles." );





/////////////////////////////////////////////////////////

        Actor actor1 = new Actor("Tim","Robbins",61,1958,"West Covina",196);
        Actor actor2 = new Actor("Morgan","Freeman",83,1973,"Memphis",189);
        Actor actor3 = new Actor("Bob","Gunton",74,1945,"Santa Monica",1945);
        Actor actor4 = new Actor("William","Sadler",70,1950,"Buffalo",173);
        Actor actor5 = new Actor("Clancy","Brown",61,1959,"Urbana",191);

////////////////////////////////////////////////

        Biography biography1 = new Biography("Timothy Francis Robbins (born October 16, 1958) is an American actor, screenwriter, director, producer, and musician. " +
                "He is perhaps best known for his portrayal of Andy Dufresne in the popular prison drama film The Shawshank Redemption (1994).");
        Biography biography2 = new Biography("Morgan Freeman is an American actor, producer, and narrator. He won an Academy Award in 2005 for Best Supporting Actor " +
                "with Million Dollar Baby. He has over 100 credits as an actor. Additionally, he has also won a Golden Globe Award and a Screen Actors Guild Award.");
        Biography biography3 = new Biography("Robert Patrick Gunton Jr. (born November 15, 1945) is an American character actor of stage and screen. He is known for " +
                "playing strict, authoritarian characters, including Warden Samuel Norton in the 1994 prison drama The Shawshank Redemption, Chief George Earle in 1993's Demolition Man.");
        Biography biography4 = new Biography("William Thomas Sadler (born April 13, 1950) is an American film and television actor. His television and motion picture " +
                "roles have included Chesty Puller in The Pacific, Luther Sloan in Star Trek: Deep Space Nine, Sheriff Jim Valenti in Roswell, convict Heywood in The Shawshank Redemption.");
        Biography biography5 = new Biography("Clancy Brown is a married man. He is married to producer, art, and set decorator Jeanne Johnson. The pair married in 1993. " +
                "They have a daughter Rose Beth Brown and a son James Ransom Johnson-Brown. ");

/////////////////////////////////////////////////

        MovieBase movieBase1 = new MovieBase(1994, "drama", "USA",Rate.AWESOME);


////////////////////////////////////////////////////////////
//Actor
        actor1.setBiography(biography1);
        actor2.setBiography(biography2);
        actor3.setBiography(biography3);
        actor4.setBiography(biography4);
        actor5.setBiography(biography5);
//Biography
        biography1.setActor(actor1);
        biography2.setActor(actor2);
        biography3.setActor(actor3);
        biography4.setActor(actor4);
        biography5.setActor(actor5);
//Director
        director1.getMovieDescriptions().add(movieDescription1);
//Scenarist
        scenarist1.getMovieDescriptions().add(movieDescription1);
//MovieBase
        movieBase1.setMovieDescription(movieDescription1);
//MovieDescription
        movieDescription1.setMovieBase(movieBase1);

        movieDescription1.setDirector(director1);

        movieDescription1.setScenarist(scenarist1);









/////////////////////////////////////////////////////////////////////////
        directorService.saveObject(director1);


        scenaristService.saveObject(scenarist1);


        actorService.saveObject(actor1);
        actorService.saveObject(actor2);
        actorService.saveObject(actor3);
        actorService.saveObject(actor4);
        actorService.saveObject(actor5);


        biographyService.saveObject(biography1);
        biographyService.saveObject(biography2);
        biographyService.saveObject(biography3);
        biographyService.saveObject(biography4);
        biographyService.saveObject(biography5);


        movieBaseService.saveObject(movieBase1);


        movieDescriptionService.saveObject(movieDescription1);
    }
}
