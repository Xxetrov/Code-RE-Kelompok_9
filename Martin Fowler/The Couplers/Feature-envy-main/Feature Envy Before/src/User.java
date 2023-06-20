public class User {
    private ContactInfo _contactInfo;
 
        User(ContactInfo contactInfo)
        {
            _contactInfo = contactInfo;
        }
        public String GetFullAddress(ContactInfo info)
        {
            String city = info.GetCity();//1
            String state = info.GetState();//2
            String streetName = info.GetStreetName();//3
            return streetName + ";" + city + ";" + state;
        }
}

