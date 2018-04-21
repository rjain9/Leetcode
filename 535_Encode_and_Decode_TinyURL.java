public class Codec {
    
    List<String> urls = new ArrayList<String>();
    
    public String encode(String longUrl) {
        //mapping url to list index
        urls.add(longUrl);
        return String.valueOf(urls.size()-1);
    }

    public String decode(String shortUrl) {
        int index = Integer.valueOf(shortUrl);
        if(index<urls.size())
            return urls.get(index);
        else return "";
    }
}
