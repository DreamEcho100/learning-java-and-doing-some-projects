
public class _28__static_keyword {

	public static void main(String[] args) {
		// keyword (static):
		// modifier. A single copy of a variable/method is created and shared by every new instance.
		// The class "owns" the static member.
		// 

		_28_1_friend friend1 = new _28_1_friend("Spongbob");
		_28_1_friend friend2 = new _28_1_friend("Patrick");
		_28_1_friend friend3 = new _28_1_friend("Sandy");

		System.out.println(_28_1_friend.numberOfFriends);

	}

}
