package screen

import app.NoteApp
import model.Archive
import screen.CreateNoteScreen
import screen.ViewNoteScreen
import javax.swing.text.View

class NoteListScreen(
    private val app: NoteApp,
    private val archive: Archive,
    private val previousScreen: MenuScreen) : MenuScreen() {
   override fun show() {
        val menuItems = mutableListOf<Pair<String, () -> Unit>>()
        menuItems.add("Создать заметку" to { CreateNoteScreen(app, archive, this).show()})
        archive.notes.forEachIndexed { index, note ->
            menuItems.add("${note.title}" to { ViewNoteScreen(note, this).show()
            })
        }
    menuItems.add("Назад" to { previousScreen.show()})
        runMenu(menuItems)
    }
    }
