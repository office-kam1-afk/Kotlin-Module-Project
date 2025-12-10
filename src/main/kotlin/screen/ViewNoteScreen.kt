package screen

import model.Note
class ViewNoteScreen (
   private val note: Note,
    private val previosScreen: MenuScreen) : MenuScreen() {
   override fun show() {
        println("Заметка: ${note.title}")
        println("Текст:")
        println(note.content)
        println("\nНажмите Enter, чтобы вернуться...")
        scanner.nextLine()
        previosScreen.show()
    }
    }
