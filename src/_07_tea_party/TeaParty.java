package _07_tea_party;

public class TeaParty {
        public String welcome(String name, boolean isWoman, boolean isKnighted) {
        	if(isWoman == true) {
        		if(isKnighted == true) {
			return "Hello Lady " + name;
        		}
        		return "Hello Ms. " + name;
        	}
        	if(isWoman == false) {
        		if(isKnighted == true) {
        			return "Hello Sir " +name;
        		}
        		return "Hello Mr. " +name;
        	}
			return null;
        }
}

