package example

object Hello {
  val default = "World"

  // Greeting function
  // run with sbt "runMain example.Hello World"
  def greeting(name: String = default): String = {  // expresion
    s"Hello, $name!"
  }

  //Main method
  def main(args: Array[String]): Unit = {
    val name = args.headOption.getOrElse(default)
    println(greeting(name))
  }
}