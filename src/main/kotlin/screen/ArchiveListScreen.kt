package screen
import screen.CreateArchiveScreen
import screen.NoteListScreen
import app.NoteApp
import model.Archive
class ArchiveListScreen(private val app: NoteApp) : MenuScreen() {
    override fun show() {
        val menuItems = mutableListOf<Pair<String, () -> Unit>>()
        menuItems.add("Создать архив" to { CreateArchiveScreen(app, this).show() })

        //app.archives.forEachIndexed { index, archive -> menuItems.add("${archive.name}" to {
         for (archive in app.archives) {
             menuItems.add(archive.name to {
                 NoteListScreen(app,archive, this).show()
             })
            }
        menuItems.add("Выход" to { System.exit(0)})
        runMenu(menuItems)
    }
}