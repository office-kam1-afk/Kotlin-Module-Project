package screen

import app.NoteApp
import model.Archive
import java.util.Scanner
class CreateNoteScreen(
    private val app: NoteApp,
    private val archive: Archive,
    private val previousScreen: MenuScreen
) : MenuScreen() {
    //private val scanner = Scanner(System.`in`)
    override fun show() {
        var title = ""
        while (title.isEmpty()) {
            println("Введите название заметки:")
            title = scanner.nextLine().trim()
            if (title.isEmpty()) {
                println("Название заметки не может быть пустым.")
        }
    }

    //archive.notes.add(model.Note.title, content)
    var content = ""
    while (content.isEmpty()) {
            println("Введите текст заметки:")
        content = scanner.nextLine().trim()
        if (content.isEmpty()) {
            println("Текст заметки не может быть пустым")
        }
    }

    val note = model.Note(title, content)
    archive.notes.add(note)
    println("Заметка '$title' создана.")
    previousScreen.show()
}
}