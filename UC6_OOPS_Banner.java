public class UC6_OOPS_Banner {

    // Method for letter O
    public static String createO(int line) {
        String[] o = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
        return o[line];
    }

    // Method for letter P
    public static String createP(int line) {
        String[] p = {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
        return p[line];
    }

    // Method for letter S
    public static String createS(int line) {
        String[] s = {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
        return s[line];
    }

    public static void main(String[] args) {

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ",
                    createO(i),
                    createO(i),
                    createP(i),
                    createS(i)
            );
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}