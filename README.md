# burning-through-kotlin
Repo for learning kotlin for a vim/CLI worflow

# Install
Install the kotlin compiler from the official github repository:

```
cd /usr/local/bin
wget https://github.com/JetBrains/kotlin/releases/download/v1.2.41/kotlin-compiler-1.2.41.zip
unzip kotlin-compiler-1.2.41.zip
mv kotlinc kotlin-compiler
ln -s kotlin-compiler/bin/* .
```
For more information, see: https://kotlinlang.org/docs/tutorials/command-line.html

# Vim plugin

```
mkdir -p ~/.vim/github
cd ~/.vim/github
git clone https://github.com/udalov/kotlin-vim ~/.vim/github/kotlin-vim
mkdir -p ~/.vim/{syntax,indent,ftdetect}
ln -s ~/.vim/github/kotlin-vim/syntax/kotlin.vim ~/.vim/syntax/
ln -s ~/.vim/github/kotlin-vim/indent/kotlin.vim ~/.vim/indent/
ln -s ~/.vim/github/kotlin-vim/ftdetect/kotlin.vim ~/.vim/ftdetect/
```
For alternative install methods, see https://github.com/udalov/kotlin-vim

# Testing the compiler
Create a hello world program helloworld.kt:
```
package demo
/** From: http://kotlinlang.org/docs/tutorials/command-line.html */
fun main(args : Array<String>) {
	println("Hello, World!")
}
```
Then, compile it together with the kotlin runtime so it can be run standalone by
the JVM:
```
kotlinc helloworld-oo.kt -include-runtime -d hello.jar
java -jar hello.jar
```
You must have a JVM installed for the second command to work.
