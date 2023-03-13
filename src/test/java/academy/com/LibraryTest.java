package academy.com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class LibraryTest {

    @Mock
    private Library library;

    @Mock
    private List<Book> books;

    @BeforeEach
    void init(){
        List<Book> bookList = List.of(
                new Book("How to something", 200),
                new Book("How to", 100),
                new Book("How", 1050),
                new Book("Some Title", 20)
        );
    }

    public void totalBookCount_shouldReturnSumOfBooks(){

    }
}
