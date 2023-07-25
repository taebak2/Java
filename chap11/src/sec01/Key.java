package sec01;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	public Key() {
		// TODO 磊悼 积己等 积己磊 胶庞
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		return number;
	}

}
