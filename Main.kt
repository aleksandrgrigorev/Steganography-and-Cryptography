package cryptography

fun main() {
    while (true) {
        println("Task (hide, show, exit):")
        when (val input = readln()) {
            "exit" -> {
                println("Bye!")
                break
            }
            "hide" -> {
                println("Hiding message in image.")
                continue
            }
            "show" -> {
                println("Obtaining message from image.")
                continue
            }
            else -> {
                println("Wrong task: $input")
                continue
            }
        }
    }
}