// Create a Logger class that can only be instantiated once, and provide a
// method log(message: String) that prints the message to the console. Demonstrate the usage of the singleton Logger
// class in multiple parts of your code.

object Logger {
    fun log(message: String) {
        println("Logging from Singleton:: $message")
    }
}