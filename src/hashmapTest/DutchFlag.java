package hashmapTest;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class DutchFlag implements Flag{

	@Override
	public List<Color> getColors() {
		return Arrays.asList(Color.RED,Color.WHITE,Color.BLUE);
	}

}
