package multiple.datasource.plugin

class BookService {

    def saveBook(Book book) {
        Book.withNewSession {
            book.save(flush: true)
        }
    }
}
