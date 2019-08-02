fun main() {

    val conference = conference {
        name = "DevConfIN 19"
        location = "Bengaluru"

        room {
            roomNumber = 1
            floor = 2
            speaker {
                name = "Subhrajyoti Sen"
                talkTitle = "Intro to Kotlin DSL"
            }
        }

        room {
            roomNumber = 2
            floor = 3
            speaker {
                name = "Sayantika Banik"
                talkTitle = "Making Right Choices"
            }
        }

    }

    println(conference.toString())
}