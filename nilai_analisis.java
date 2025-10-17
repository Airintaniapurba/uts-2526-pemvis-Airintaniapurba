12S25046-Airin Tania Purba
12S25005-Boas Hutahaean

public class nilai_analisis {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        double nr, total, max, min;
        double[] ns = new double[4];

        total = 0;
        for (i = 0; i <= 3; i++) {
            System.out.println("Masukkan nilai ke-" + i + 1 + ".");
            ns[i] = Double.parseDouble(input.nextLine());
            total = total + ns[i];
        }
        nr = total / 4;
        max = ns[0];
        for (i = 1; i <= 3; i++) {
            if (ns[i] > max) {
                max = ns[i];
            }
        }
        min = ns[0];
        for (i = 0; i <= 3; i++) {
            if (ns[i] < min) {
                min = ns[i];
            }
        }
        System.out.println("ratarata:" + nr);
        System.out.println("Tertinggi=" + max);
        System.out.println("Terkecil=" + min);
    }
}
