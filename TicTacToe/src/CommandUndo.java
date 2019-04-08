
public class CommandUndo implements ICommand{

	@Override
	public Spielfeld changeField(int x, int y, Spielfeld k) {
		Spielfeld newfeld = new Spielfeld();
		newfeld = k;
		newfeld.zugMachen(y, x, '-');
		return newfeld;
	}

}
