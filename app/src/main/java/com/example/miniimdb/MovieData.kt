package com.example.miniimdb

object MovieData {

    private fun actors(
        actor1: String,
        actor2: String,
        actor3: String,
        actor4: String,
        actor5: String
    ): ArrayList<Actor> {

        return arrayListOf(
            Actor(actor1, R.drawable.ic_launcher_foreground),
            Actor(actor2, R.drawable.ic_launcher_foreground),
            Actor(actor3, R.drawable.ic_launcher_foreground),
            Actor(actor4, R.drawable.ic_launcher_foreground),
            Actor(actor5, R.drawable.ic_launcher_foreground)
        )
    }

    val movies = listOf(

        Movie(
            "Inception",
            "Sci-Fi, Thriller",
            8.8,
            "A skilled thief who steals secrets through dreams is given a chance to erase his past by planting an idea in someone's mind.",
            R.drawable.inception,
            actors(
                "Leonardo DiCaprio",
                "Joseph Gordon-Levitt",
                "Elliot Page",
                "Tom Hardy",
                "Ken Watanabe"
            )
        ),

        Movie(
            "The Dark Knight",
            "Action, Crime",
            9.0,
            "Batman faces a dangerous criminal mastermind who pushes Gotham City into chaos.",
            R.drawable.the_dark_knight,
            actors(
                "Christian Bale",
                "Heath Ledger",
                "Aaron Eckhart",
                "Michael Caine",
                "Gary Oldman"
            )
        ),

        Movie(
            "Interstellar",
            "Sci-Fi, Drama",
            8.7,
            "A group of astronauts travels through a wormhole in search of a new home for humanity.",
            R.drawable.interstellar,
            actors(
                "Matthew McConaughey",
                "Anne Hathaway",
                "Jessica Chastain",
                "Michael Caine",
                "Matt Damon"
            )
        ),

        Movie(
            "The Shawshank Redemption",
            "Drama",
            9.3,
            "A banker sentenced to prison forms an extraordinary friendship while never giving up hope.",
            R.drawable.the_shawshank_redemption,
            actors(
                "Tim Robbins",
                "Morgan Freeman",
                "Bob Gunton",
                "William Sadler",
                "Clancy Brown"
            )
        ),

        Movie(
            "Pulp Fiction",
            "Crime, Drama",
            8.9,
            "Several interconnected stories follow criminals, hitmen and other characters in Los Angeles.",
            R.drawable.pulp_fiction,
            actors(
                "John Travolta",
                "Samuel L. Jackson",
                "Uma Thurman",
                "Bruce Willis",
                "Ving Rhames"
            )
        ),

        Movie(
            "Forrest Gump",
            "Drama, Romance",
            8.8,
            "A kind-hearted man experiences several major moments in American history while searching for his place in the world.",
            R.drawable.forrest_gump,
            actors(
                "Tom Hanks",
                "Robin Wright",
                "Gary Sinise",
                "Mykelti Williamson",
                "Sally Field"
            )
        ),

        Movie(
            "The Matrix",
            "Sci-Fi, Action",
            8.7,
            "A computer programmer discovers that the world he knows is an artificial reality.",
            R.drawable.the_matrix,
            actors(
                "Keanu Reeves",
                "Laurence Fishburne",
                "Carrie-Anne Moss",
                "Hugo Weaving",
                "Joe Pantoliano"
            )
        ),

        Movie(
            "Gladiator",
            "Action, Drama",
            8.5,
            "A Roman general becomes a gladiator and seeks justice after losing everything.",
            R.drawable.gladiator,
            actors(
                "Russell Crowe",
                "Joaquin Phoenix",
                "Connie Nielsen",
                "Oliver Reed",
                "Richard Harris"
            )
        ),

        Movie(
            "The Godfather",
            "Crime, Drama",
            9.2,
            "The aging head of a powerful crime family prepares his reluctant son to take over the family business.",
            R.drawable.the_godfather,
            actors(
                "Marlon Brando",
                "Al Pacino",
                "James Caan",
                "Robert Duvall",
                "Diane Keaton"
            )
        ),

        Movie(
            "Titanic",
            "Drama, Romance",
            7.9,
            "Two young people from different social backgrounds fall in love aboard the ill-fated Titanic.",
            R.drawable.titanic,
            actors(
                "Leonardo DiCaprio",
                "Kate Winslet",
                "Billy Zane",
                "Kathy Bates",
                "Frances Fisher"
            )
        ),

        Movie(
            "Avengers: Endgame",
            "Action, Adventure",
            8.4,
            "The remaining Avengers attempt to reverse the devastating events that changed the universe.",
            R.drawable.avengers_endgame,
            actors(
                "Robert Downey Jr.",
                "Chris Evans",
                "Mark Ruffalo",
                "Chris Hemsworth",
                "Scarlett Johansson"
            )
        ),

        Movie(
            "Spider-Man: No Way Home",
            "Action, Adventure",
            8.2,
            "Peter Parker's secret identity is exposed, leading him to seek help that creates unexpected consequences.",
            R.drawable.spider_man_no_way_home,
            actors(
                "Tom Holland",
                "Zendaya",
                "Benedict Cumberbatch",
                "Jacob Batalon",
                "Jon Favreau"
            )
        ),

        Movie(
            "The Lord of the Rings",
            "Fantasy, Adventure",
            8.9,
            "A young hobbit begins a dangerous journey to destroy a powerful ring before evil can claim it.",
            R.drawable.the_lord_of_the_rings,
            actors(
                "Elijah Wood",
                "Ian McKellen",
                "Viggo Mortensen",
                "Orlando Bloom",
                "Sean Astin"
            )
        ),

        Movie(
            "Harry Potter and the Philosopher's Stone",
            "Fantasy, Adventure",
            7.6,
            "A young boy discovers that he is a wizard and begins his education at Hogwarts.",
            R.drawable.harry_potter,
            actors(
                "Daniel Radcliffe",
                "Emma Watson",
                "Rupert Grint",
                "Alan Rickman",
                "Richard Harris"
            )
        ),

        Movie(
            "Jurassic Park",
            "Adventure, Sci-Fi",
            8.2,
            "Scientists create a theme park filled with genetically engineered dinosaurs, but the creatures escape.",
            R.drawable.jurassic_park,
            actors(
                "Sam Neill",
                "Laura Dern",
                "Jeff Goldblum",
                "Richard Attenborough",
                "Samuel L. Jackson"
            )
        ),

        Movie(
            "The Lion King",
            "Animation, Adventure",
            8.5,
            "A young lion must find the courage to return home and take his rightful place as king.",
            R.drawable.the_lion_king,
            actors(
                "Matthew Broderick",
                "Jeremy Irons",
                "James Earl Jones",
                "Moira Kelly",
                "Nathan Lane"
            )
        ),

        Movie(
            "Avatar",
            "Sci-Fi, Adventure",
            7.8,
            "A former marine becomes involved in the conflict between humans and the inhabitants of an alien world.",
            R.drawable.avatar,
            actors(
                "Sam Worthington",
                "Zoe Saldana",
                "Sigourney Weaver",
                "Stephen Lang",
                "Michelle Rodriguez"
            )
        ),

        Movie(
            "The Wolf of Wall Street",
            "Biography, Crime",
            8.2,
            "A stockbroker rises to extraordinary wealth through a life of ambition, excess and illegal activity.",
            R.drawable.wolf_of_wall_street,
            actors(
                "Leonardo DiCaprio",
                "Jonah Hill",
                "Margot Robbie",
                "Matthew McConaughey",
                "Kyle Chandler"
            )
        ),

        Movie(
            "Oppenheimer",
            "Biography, Drama",
            8.6,
            "The story of the scientist who led the development of the first atomic bomb.",
            R.drawable.oppenheimer,
            actors(
                "Cillian Murphy",
                "Emily Blunt",
                "Matt Damon",
                "Robert Downey Jr.",
                "Florence Pugh"
            )
        ),

        Movie(
            "Dune",
            "Sci-Fi, Adventure",
            8.0,
            "A young nobleman travels to a dangerous desert planet and becomes involved in a struggle for power.",
            R.drawable.dune,
            actors(
                "Timothée Chalamet",
                "Zendaya",
                "Rebecca Ferguson",
                "Oscar Isaac",
                "Jason Momoa"
            )
        )
    )
}