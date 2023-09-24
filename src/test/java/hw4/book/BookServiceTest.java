package hw4.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

class BookServiceTest {
    private BookRepository bookRepository;
    private BookService bookService;
   private Book book1, book2;


    @BeforeEach
    void setUp() {

        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
        book1 = new Book("1", "Book1", "Author1");
        book2 = new Book("2", "Book2", "Author2");
    }

    @Test
    void findBookByIdTest() {
        Mockito.when(bookService.findBookById("1")).thenReturn(book1);
        assertThat(bookService.findBookById("1").getTitle()).isEqualTo("Book1");
        Mockito.verify(bookRepository, Mockito.times(1)).findById("1");


    }

    @Test
    void findAllBooksTest() {
        Mockito.when(bookService.findAllBooks()).thenReturn(List.of(book1, book2));
        assertAll(
                () -> assertThat(bookService.findAllBooks().size()).isEqualTo(2),
                () -> assertThat(bookService.findAllBooks().contains(book1)).isEqualTo(true),
                () -> assertThat(bookService.findAllBooks().contains(book2)).isEqualTo(true)
        );
        Mockito.verify(bookRepository,Mockito.times(3)).findAll();
    }
}
