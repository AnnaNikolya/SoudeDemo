package tests;

@ DataProvider(name = "User data")
    public static Object[][] userData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", "Sauce Labs Bolt T-Shirt", "15,99"},
                {"problem_user", "secret_sauce", "Sauce Labs Backpack", "29,99"},
                {"", "secret_sauce"},
        };
    }
}
