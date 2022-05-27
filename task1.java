
    public class Task1 {
        String surnamealmasaabi60527;
        String namealmasaabi60527;
        String streealmasaabi60527;
        String zipCodealmasaabi60527;
        String cityalmasaabi60527;

        public void initialize() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your surname");
            surnamealmasaabi60527 = br.readLine();
            System.out.println("Enter your first name");
            namealmasaabi60527 = br.readLine();
            System.out.println("Enter street");
            streetalmasaabi60527 = br.readLine();
            System.out.println("Enter your zip code");
            zipCodealmasaabi60527 = br.readLine();
            System.out.println("Enter city");
            cityalmasaabi60527 = br.readLine();

        }

        public void print() {
            System.out.println("-----------------");
            System.out.println("Displaying information");
            System.out.println("       ");
            System.out.println("Surname: " + surnamealmasaabi60527);
            System.out.println("First name: " + namealmasaabi60527);
            System.out.println("Street: " + streetalmasaabi60527);
            System.out.println("Zip code: " + zipCodealmasaabi60527);
            System.out.println("City: " + cityalmasaabi60527);
        }
    }

    class Staff extends Task1 {
        String educationalmasaabi60527;
        String positionalmasaabi60527;

        public void initialize1() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            initialize();
            System.out.println("Enter your education");
            educationalmasaabi60527 = br.readLine();
            System.out.println("Enter your position");
            positionalmasaabi60527 = br.readLine();
        }


        public void print1() {
            print();
            System.out.println("Education: " + educationalmasaabi60527);
            System.out.println("Position: " + positionalmasaabi60527);
        }
    }

    class Main{
        public static void main(String[] args) throws IOException{
            Staff s = new Staff();
            s.initialize1();
            s.print1();
}
