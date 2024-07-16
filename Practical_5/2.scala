import scala.collection.mutable

case class Book(title: String, author: String, isbn: String)

object prac5_2{

  var library: mutable.Set[Book] = mutable.Set(
    Book("Batman The begining", "Cristofer Nolen", "b001"),
    Book("Spiderman", "Sam Rami", "b002"),
    Book("Superman Legacy", "Jams Gunn", "b003")
  )

  def addBook(book: Book): Unit = {
    library += book
    println(s"Book added: ${book.title}")
  }

  def removeBook(isbn: String): Unit = {
    val bookOption = library.find(_.isbn == isbn)
    bookOption match {
      case Some(book) =>
        library -= book
        println(s"Book removed: ${book.title}")
      case None =>
        println(s"No book found with ISBN: $isbn")
    }
  }

  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    println("Library Collection:")
    library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }

  def searchBookByTitle(title: String): Unit = {
    val bookOption = library.find(_.title.equalsIgnoreCase(title))
    bookOption match {
      case Some(book) =>
        println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"No book found with title: $title")
    }
  }


  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
    } else {
      println(s"No books found by author: $author")
    }
  }

  def main(args: Array[String]): Unit = {
    displayLibrary()
    println()

    addBook(Book("Inception", "Cristofer Nolen", "b004"))
    println()

    displayLibrary()
    println()

    removeBook("b003")
    println()

    displayLibrary()
    println()

    println(s"Is 'Spiderman' in the library? ${isBookInLibrary("b002")}")
    println()

    searchBookByTitle("superman legacy")
    println()

    displayBooksByAuthor("Cristofer Nolen")
  }
}
