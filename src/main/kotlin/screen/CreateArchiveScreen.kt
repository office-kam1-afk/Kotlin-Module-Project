package screen

import app.NoteApp
class CreateArchiveScreen(
    private val app: NoteApp,
    private val previousScreen: MenuScreen
) : MenuScreen() {
   override fun show() {
        while (true) {
            println("Введите название архива:")
            val name = scanner.nextLine().trim()
            if (name.isEmpty()) {
                println("Название не может быть пустым.")
                continue
            }
        app.archives.add(model.Archive(name))
            println("Архив '$name' создан.")
            break
        }
    previousScreen.show()
    }
}