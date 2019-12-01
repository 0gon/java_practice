package hashmapTest;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagSelector {
	private static final Map<Nationality,Flag> Flags = new HashMap<Nationality, Flag>();
	private static final Nationality DUTCH = null;
	
	static {
		Flags.put(DUTCH, new DutchFlag());
	}
	
	public List<Color> getFlagColors(Nationality nationality){
		Flag flag = Flags.get(nationality);
		flag = flag != null ? flag : null; //default 
		return flag.getColors();
	}
}
