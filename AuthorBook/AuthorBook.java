 class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("El género debe ser 'm' o 'f'");
        }
    }

    @Override
    public String toString() {
        return "Author[nombre=" + name + ", correo electrónico=" + email + ", género=" + gender + "]";
    }
}

class Book {
    String name;
    Author author;
    double price;
    int qty;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[nombre=" + name + ", " + author + ", precio=" + price + ", cantidad=" + qty + "]";
    }
}

public class AuthorBook {
    public static void main(String[] args) {
        Author author1 = new Author("Gabriel García Márquez", "gabo@gmail.com", 'm');
        Author author2 = new Author("J.K. Rowling", "jkrowling@example.com", 'f');

        Book book1 = new Book("Cien años de soledad", author1, 25.99);
        Book book2 = new Book("Harry Potter y la piedra filosofal", author2, 19.99, 10);

        System.out.println(book1);
        System.out.println(book2);
    }
}

