package StaticKeyword;

class Friend {
    static int numberOfFriends;
    String name;

    Friend(String name) {
       this.name = name;
       numberOfFriends++;
    }
}
