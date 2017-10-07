package edu.garaix.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMaps {

	public static void main(String[] args) {
		// Maps are not a true collection.
		// Maps cannot contain duplicate keys which can map to at most 1 value each.
		// TreeMaps and LinkedHashMaps have predictable order. HashMaps do not.
		// Use maps for key-value associations, retrieve/update elements or perform lookups by keys
		
		// HashMaps when order does not matter and nulls are acceptable.
		// LinkedHashMaps when sorted by insertion order and nulls are acceptable.
		// TreeMaps sorted by natural/custom order of keys. Does not allow nulls.
		
		Map<String, String> CITclassCodes = new HashMap<>();
		
		CITclassCodes.put("CIT240", "Networking");
		CITclassCodes.put("CIT225", "Database Design & Development");
		CITclassCodes.put("CIT352", "Operating Systems I");
		
		Map<String, String> classCodes = new HashMap<>();
		
		classCodes.put("FDREL200", "The Eternal Family");
		classCodes.put("FDENG101", "Writing & Reasoning Foundationst");
		classCodes.put("FDMAT108", "Math for the Real World");
		

		System.out.println("Before: " + classCodes);
		 
		classCodes.putAll(CITclassCodes);
		 
		System.out.println("After: " + classCodes);
		
		Map<String, String> treeCodes = new TreeMap<>(classCodes);
		
		System.out.println("TreeMap naturally sorted: " + treeCodes);

	}

}
