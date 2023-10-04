public class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender must be 'm' or 'f'");
        }
    }


    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }

    public static void main(String[] args) {
        Author author = new Author("Camilo Arturo", "arturocamilo72@gmail.com", 'm');
        System.out.println(author);

        author.email = "arcam224@gmail.com";
        System.out.println("Updated email: " + author.email);
    }
}

