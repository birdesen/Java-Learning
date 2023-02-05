public class Book {
    private String name;
    private int pageNumber;
    private String writer;
    private int releaseDate;

    public Book(String name, int pageNumber, String writer, int releaseDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.writer = writer;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}

