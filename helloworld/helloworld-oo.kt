class Greeter(val name: String)
{
	fun greet()
	{
		println("Hello, $name!")
	}
}

fun main(args: Array<String>)
{
	if (args.size == 0) {
		println("Please provide a name as a command-line argument")
	} else {
		Greeter(args[0]).greet()
	}
}
