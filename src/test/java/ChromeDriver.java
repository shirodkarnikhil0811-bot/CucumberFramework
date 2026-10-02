public class ChromeDriver implements WebDriver {
    @Override
    public void get(String url) {
        System.out.println("Navigating to: " + url);
    }
}

// 3. Usage: Interface reference holding the implementing object
