public class Customer {
    String name;
    long phoneNo;
    String membershipType;
    double discount;

    Customer(String name, long phoneNo, String membershipType){
        this.name = name;
        this.phoneNo = phoneNo;
        this.membershipType = membershipType;

        if(membershipType.equals("Member")){
            discount = 0.05;
        }
        else{
            discount = 0;
        }
    }

    public double getDiscount() {
        return discount;
    }
}
