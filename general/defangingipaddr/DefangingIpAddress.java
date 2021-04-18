package general.defangingipaddr;

public class DefangingIpAddress {

    public static String defangIPaddr(String address) {
        if(address.equals(""))
            return address;

        StringBuilder sb = new StringBuilder();
        if(address.charAt(0) == '.'){
            sb.append("[.]");
            sb.append(defangIPaddr(address.substring(1)));
            return sb.toString();
        } else{
            sb.append(address.charAt(0));
            sb.append(defangIPaddr(address.substring(1)));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("1.1.1.1 defanged to: "+defangIPaddr("1.1.1.1"));
    }
}
