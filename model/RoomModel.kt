package model

data class RoomModel(
    var roomNumber: Int = 0,
    var floor: Int = 99,
    var speaker: SpeakerModel? = null
)