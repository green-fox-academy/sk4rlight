package DataStructure;

public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.publicationDate = publicationDate;
        this.text = text;
    }

    public BlogPost() {
    }

    public static void main(String[] args) {

        BlogPost blogOne = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "Lorem Ipsum");
        BlogPost blogTwo = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost blogThree = new BlogPost();
        blogThree.authorName = "William Turton";
        blogThree.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blogThree.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        blogThree.publicationDate = "2017.03.28";


    }


}
