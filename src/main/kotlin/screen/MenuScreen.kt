package screen

import java.util.Scanner
abstract class MenuScreen : Screen {
    protected val scanner = Scanner(System.`in`)
    protected fun runMenu(menuItems: MutableList<Pair<String, () -> Unit>>) {
        while (true) {
            println("Список:")
            menuItems.forEachIndexed { index, (text, _) ->
                println("$index.$text")
            }
        val input = scanner.nextLine().trim()
            val choice = input.toIntOrNull()
            if (choice == null)  {
                println("Пожалуйста, введите цифру.")
                continue
            }
        if (choice < 0 || choice >= menuItems.size) {
            println("Такого пункта нет. Попробуйте снова.")
            continue
        }
        menuItems[choice].second()
            break
        }
    }
}