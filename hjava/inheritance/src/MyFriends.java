/*상속이 안된 인맥관리 프로그램*/

class UnivFriend { //대학친구
    private String name;
    private String phone;
    private String major;

    public UnivFriend(String name, String major, String phone) {
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("전공: " + major);
        System.out.println("전화: " + phone);
    }
}

class CompFriend { //회사친구
    private String name;
    private String department;
    private String phone;

    public CompFriend(String name, String department, String phone) {
        this.name = name;
        this.department = department;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("이름 " + name);
        System.out.println("부서 " + department);
        System.out.println("전화: " + phone);
    }
}

class MyFriends {
    public static void main(String[] args) {
        // 대학 동창의 관리를 위한 배열과 변수
        UnivFriend[] uf = new UnivFriend[5];
        int ucnt = 0;

        //직장 동료의 관리를 위한 배열과 변수
        CompFriend[] cf = new CompFriend[5];
        int ccnt = 0;

        //대학 동창의 정보 저장
        uf[ucnt++] = new UnivFriend("LEE", "Computer", "010-123-1234");
        uf[ucnt++] = new UnivFriend("SEO", "Electronics", "010-3223-3123");

        //직장 동료의 정보 저장
        cf[ccnt++] =new CompFriend("YOON","R&D 1","010-1231-3333");
        cf[ccnt++]=new CompFriend("PARK","R&D 2","010-555-5555");

        //모든 동창 및 동료이 정보 전체 출력
        for(int i=0;i<ucnt;i++){
            uf[i].showInfo();
            System.out.println();
        }
        for(int i=0;i<ccnt;i++){
            cf[i].showInfo();
            System.out.println();
        }
    }
}
