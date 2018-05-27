class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        List<String> result = new ArrayList();
        Map<String, Integer> map = new HashMap();
        
        for (String cpdomain : cpdomains) {
            String[] countDomain = cpdomain.split(" ");
            int count = Integer.parseInt(countDomain[0]);
            String domain = countDomain[1];
            
            map.put(domain, map.getOrDefault(domain, 0) + count);
            
            //check for subdomains
            for (int i = 0; i < domain.length(); i++) {
                if (domain.charAt(i) == '.') {
                    String subdomain = domain.substring(i + 1);
                    map.put(subdomain, map.getOrDefault(subdomain, 0) + count);
                }
            }
        }
        
        //convert the result to required format
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        
        return result;
    }
}
