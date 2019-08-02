import model.ConferenceModel
import model.RoomModel
import model.SpeakerModel

@DslMarker
@Target(AnnotationTarget.TYPE)
annotation class ConfDSL

fun RoomModel.speaker(block: (@ConfDSL SpeakerModel).() -> Unit) {
    val speaker = SpeakerModel()
    speaker.block()
    this.speaker = speaker
}


fun ConferenceModel.room(block: (@ConfDSL RoomModel).() -> Unit) {
    val room = RoomModel()
    room.block()
    this.rooms.add(room)
}

fun conference(block: (@ConfDSL ConferenceModel).() -> Unit): ConferenceModel {
    val conference = ConferenceModel()
    conference.block()
    return conference
}