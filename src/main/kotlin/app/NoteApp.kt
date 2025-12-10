package app
import screen.ArchiveListScreen
import model.Archive

class NoteApp {
    val archives = mutableListOf<Archive>()
    fun start() {
        ArchiveListScreen(this).show()
    }
}