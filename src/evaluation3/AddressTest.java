package evaluation3;

public class AddressTest {

        int pno,fno,pincode;
        String area,city,state,country;

        public AddressTest(){
            System.out.println("Default address constructor");
        }
        public AddressTest(int pno, int fno, int pincode, String area, String city, String state, String country) {
            this.pno = pno;
            this.fno = fno;
            this.pincode = pincode;
            this.area = area;
            this.city = city;
            this.state = state;
            this.country = country;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "pno=" + pno +
                    ", fno=" + fno +
                    ", pincode=" + pincode +
                    ", area='" + area + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
        //

}
