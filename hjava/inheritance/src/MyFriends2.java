class Friend {
    protected String name;
    protected String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("이름은: " + name);
        System.out.println("전화번호: " + phone);
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

class UniFriend extends Friend {
    private String major;

    public UniFriend(String name, String major, String phone) {
        super(name, phone);
        this.major = major;
    }

}

class ComFriend extends Friend {
    private String department;

    public ComFriend(String name, String department, String phone) {
        super(name, phone);
        this.department = department;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("부서: " + department);
    }
}

class MyFriends2 {
    public static void main(String[] args) {
        Friend[] friends = new Friend[10];
        int cnt = 0;

        friends[cnt++] = new UniFriend("박", "컴공", "010");
        friends[cnt++] = new ComFriend("홍", "컴공", "010");

        for (int i = 0; i < cnt; i++) {
            friends[i].showInfo(); //오버라이딩 한 메소드가 호출됨
            System.out.println();
        }

//        Friend fr = new ComFriend("박경현","컴공","0101010");
//        Friend frr = new UniFriend("박경현","컴","02303030");
//        fr.showInfo();
//        frr.showInfo()
    }
}
