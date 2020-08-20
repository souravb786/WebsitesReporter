public class Main {

    public static void main(String[] args) {

        Reporter reporter = new Reporter();
        reporter.getWebsites().add(new VowelWebsite("Vowel news"));
        reporter.getWebsites().add(new CustomWebsite("Custom Feed"));
        reporter.getWebsites().add(new ConsonantWebsite("The Consonants"));

        reporter.broadcastMessage("Cows lose their jobs as milk prices drop");
        reporter.broadcastMessage("Safety meeting ends in accident");
    }
}
