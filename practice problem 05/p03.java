class p03 {
    String title;
    String author;

    p03() {
        this.title = "Untitled";
        this.author = "Unknown";
    }

    p03(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    p03(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book[title='" + title + "', author='" + author + "']";
    }

    public static void main(String[] args) {
        p03 b1 = new p03("Effective Java", "Joshua Bloch");
        p03 b2 = new p03("Clean Code");
        p03 b3 = new p03();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
