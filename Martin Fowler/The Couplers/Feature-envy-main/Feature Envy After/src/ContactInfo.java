public class ContactInfo {
    public String GetStreetName()
        {
            return "1 Medison Square";
        }
        public String GetCity()
        {
            return "NewYork";
        }
        public String GetState()
        {
            return "NY";
        }
        public String GetFullAddress(ContactInfo info)
        {
            String city = info.GetCity();//1
            String state = info.GetState();//2
            String streetName = info.GetStreetName();//3
            return streetName + ";" + city + ";" + state;
        }
}
