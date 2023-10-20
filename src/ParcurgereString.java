public class ParcurgereString {
    private String string;

    public ParcurgereString(String string) {
        this.string = string;

    }

    public void parcurge() {
        for (int i = 0; i < string.length() / 2; ++i) {
            System.out.println("First: " + string.charAt(i));
        }

    }

    public void parcurgeInvers() {
        for (int i = string.length() - 1; i > string.length() / 2; --i) {
            System.out.println("Second: " + string.charAt(i));
        }

    }
}
