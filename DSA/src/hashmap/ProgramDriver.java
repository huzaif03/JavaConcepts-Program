package hashmap;



public class ProgramDriver {
	public static void main(String[] args) {
		HashMap<Integer,String> hs = new HashMap<Integer,String>(5);
		hs.put(101,"Hujaifa");
		hs.put(106,"Ali");
		hs.put(111,"parvej");
		hs.put(116,"amit");
		hs.put(121,"ubaid");
		hs.put(null, "Vinay");
		
		
		hs.remove(101);
//		hs.remove(106);
//		hs.remove(111);
//		hs.remove(116);
//		hs.remove(121);
		
		String value = hs.get(101);
		System.out.println(value);
		System.out.println(hs.get(106));
		System.out.println(hs.get(111));
		System.out.println(hs.get(116));
		System.out.println(hs.get(121));
		
		
		
//		System.out.println(hs.containsValue("Amit"));
//		
//		System.out.println(hs.containsKey(101));
		
	}

}
