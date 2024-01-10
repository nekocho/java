package bites.examples;

public class StoryBuilder {
    String plot;
    public StoryBuilder(String plot) {
        this.plot = plot;
    }
    public void addPlotLine(String newPlot) {
        this.plot += newPlot;
    }

    public String getPlot() {
        return this.plot;
    }


    public static void main(String[] args) {
        StoryBuilder storyBuilder = new StoryBuilder("This story begins like this... ");
        storyBuilder.addPlotLine("The day was bright and sunny. ");
        System.out.println(storyBuilder.getPlot());
    }
}
