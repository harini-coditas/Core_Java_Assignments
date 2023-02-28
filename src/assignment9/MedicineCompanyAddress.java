package assignment9;

class MedicineCompanyAddress{
        int pno,fno,pincode;
        String companyName,area,city,state,country;

        public MedicineCompanyAddress(){
            System.out.println("Default company address constructor");
        }
        public MedicineCompanyAddress(int pno, int fno, int pincode, String hname, String area, String city, String state, String country) {
            this.pno = pno;
            this.fno = fno;
            this.pincode = pincode;
            this.companyName = hname;
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
                    ", companyName='" + companyName + '\'' +
                    ", area='" + area + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }

}
