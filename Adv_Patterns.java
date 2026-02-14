public class Adv_Patterns {
    public static void hollow_Rectangle(int totalRows, int totalCols) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalCols; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void inverted_Rotated_Half_Pyramid(int Rows) {
        for (int i = 1; i <= Rows; i++) {
            // Spaces
            for (int j = 1; j <= Rows - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void inverted_Half_Pyramid_WithNumbers(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    public static void floyds_Triangle(int lines) {
        int count = 1;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;

            }
            System.out.println();
        }
    }

    public static void zero_One_Pattern(int totLines) {
        for (int i = 1; i <= totLines; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1 ");

                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();

        }
    }

    public static void butterfly_Pattern(int totLines) {
        for (int i = 1; i <= totLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (totLines - i); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = totLines; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (totLines - i); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void solid_Rohmobus_Pattern(int totLines) {
        // Outer loop runs totlines times
        for (int i = 1; i <= totLines; i++) {
            // for beg_spaces
            for (int j = 1; j <= totLines - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= totLines; j++) {
                System.out.print("*");
            }
            // for ending_space
            for (int j = 1; j <= i - j; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
    }

    public static void hollow_Rombhous_Pattern(int totLines) {
        // Outer Loop for Lines
        for (int i = 1; i <= totLines; i++) {
            // For Beggining Spaces
            for (int j = 1; j <= totLines - i; j++) {
                System.out.print(" ");

            }
            // This Loop For Hollow Rectangle Pattern
            for (int j = 1; j <= totLines; j++) {
                if (i == 1 || i == totLines || j == 1 || j == totLines) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void diamond_Pattern(int lines) {
        // For Total Lines
        for (int i = 1; i <= lines; i++) {
            // For Spaces
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");

            }
            // For Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = lines; i >= 1; i--) {
            // For Spaces
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");

            }
            // For Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    public static void number_Pyramid_Pattern(int lines) {
        // For Total_Lines
        for (int i = 1; i <= lines; i++) {
            // for Space
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");

            }
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();

        }
    }

    public static void palindromic_Number_Pattern(int totLines) {
        // For Total Lines
        for (int i = 1; i <= totLines; i++) {
            // For Spaces
            for (int j = 1; j <= totLines - i; j++) {
                System.out.print(" ");
            }
            // For Descending Numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // For Ascending Numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void butterfly_Pattern_Own(int lines) {
        // Outer Loop Is For Total Lines
        for (int i = 1; i <= lines; i++) {
            // For Normal Star Pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            // // for Inverted Pyramid
            
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_Rectangle(7, 10);
        // inverted_Rotated_Half_Pyramid(5);
        // inverted_Half_Pyramid_WithNumbers(5);
        // floyds_Triangle(5);
        // zero_One_Pattern(5);
        // butterfly_Pattern(5);
        // solid_Rohmobus_Pattern(5);
        // hollow_Rombhous_Pattern(7);
        // diamond_Pattern(5);
        // number_Pyramid_Pattern(5);
        // palindromic_Number_Pattern(5);
        butterfly_Pattern_Own(4);
    }

}
