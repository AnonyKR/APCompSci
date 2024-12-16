package pkg;

public class Movie{
    private String movieName;
    private double rating;
    private int numRatings;
    private int revenue;
    
    public Movie() {
        this.movieName = new String("Avengers");
        this.rating = 8.0;
        this.numRatings = 33;
        this.revenue = 623357910;
    }
    
    public Movie(String movieName, double rating, int numRatings, int revenue) {
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    
    public void movieToString() {
        System.out.println("Movie: " + this.movieName);
        System.out.println("Rating: " + this.rating);
        System.out.println("Number of Ratings: " + this.numRatings);
        System.out.println("Revenue: " + this.revenue + "\n");
    }
    
    public String getMovieName() {
        return this.movieName;
    }
    
    public int getRevenue() {
        return this.revenue;
    }
    
    public void addRating(double newRating) {
        this.rating = (this.rating * this.numRatings + newRating) / (this.numRatings + 1);
        this.numRatings += 1;
    }
    
    public boolean compareRatings(Movie toCompare) {
        return (this.rating > toCompare.getRating());
    }
    
    public double getRating() {
        return this.rating;
    }
    
    public String revenueToString() {
        int playNum = this.revenue;
        String returnVal = new String("");
        int i = 0;
        while(playNum >= 10) {
            returnVal = new String("" + (playNum % 10)) + returnVal;
            i++;
            playNum /= 10;
            if ((playNum >= 10) && (i % 3 == 0)) {
                returnVal = new String(",") + returnVal;
            }
        }
        returnVal = new String("" + (playNum)) + returnVal;
        return returnVal;
    }
    
    public Movie pirateMovie() {
        //return new Movie(this.movieName, this.rating, this.numRatings, this.revenue);
        return this;
    }
}
