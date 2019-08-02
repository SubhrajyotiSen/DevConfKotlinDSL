package model

data class ConferenceModel(
    var name: String = "",
    var location: String = "",
    var rooms: MutableList<RoomModel> = mutableListOf()
)