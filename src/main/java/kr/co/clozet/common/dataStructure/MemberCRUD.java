package kr.co.clozet.common.dataStructure;

import kr.co.clozet.auth.domains.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

public class MemberCRUD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MemberService service = new MemberServiceImpl();
        while(true){
            System.out.println("0.exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count 8.existsById 9.clear");
            switch (s.next()){
                case "0":return;
                case "1":
                    Member hong = new Member.Builder("hong")
                            .email("kim@co.kr")
                            .password("1")
                            .name("홍길동")
                            .phone("010-0000-0000")
                            .profileImg("hong.img")
                            .build();
                            service.save(hong);
                    Member kim = new Member.Builder("kim")
                            .email("kim2@co.kr")
                            .password("1")
                            .name("김유신")
                            .phone("010-0000-0000")
                            .profileImg("kim.img")
                            .build();
                            service.save(kim);
                             break;
                case "2":
                    Member up = new Member();
                    service.update(up);
                    break;

                case "3":
                    Member temp = new Member();
                    temp.setUserid("hong");
                    service.delete(temp);
                    break;
                case "4":
                    Member find =new Member();
                    find.setUserid(s.next());
                    service.findById(find.userid);
                    String res = find.userid==null?"해당 ID가 없습니다.":"해당 ID가 있습니다.";
                    System.out.println(res);
                    break;
                case "5":
                    Member find1 =new Member();
                    find1.setName(s.next());
                    service.findByName(find1.name);
                    String res1= find1.name==null?"해당 이름을 가진 가입자가 없습니다.":"해당 이름을 가진 가입자가 있습니다.";
                    System.out.println(res1);
                    break;

                case "6":break;
                case "7":
                    System.out.println("총 회원수: "+service.count()+" 명");
                    break;
                case "8":break;
                case "9":
                    service.clear();
                    break;
                default:break;
            }
        }
    }
    @Data @NoArgsConstructor
    static class Member{
        protected String userid, name, password, profileImg, phone, email;

        public Member(Builder builder) {
            this.userid = builder.userid;
            this.name = builder.name;
            this.password = builder.password;
            this.profileImg = builder.profileImg;
            this.phone = builder.phone;
            this.email = builder.email;
        }
        static class Builder{
            private String userid, name, password, profileImg, phone, email;
            public Builder(String userid){this.userid=userid;}
            public Builder name(String name){this.name=name; return this;}
            public Builder password(String password){this.password=password; return this;}
            public Builder profileImg(String profileImg){this.profileImg=profileImg; return this;}
            public Builder phone(String phone){this.phone=phone; return this;}
            public Builder email(String email){this.email=email; return this;}
            Member build(){ return new Member(this);}
        }
        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, password: %s, profileImg: %s, phone: %s, email: %s ",
                    userid, name, password, profileImg, phone, email);
        }
    }
    interface MemberService{
        void save(Member member);
        void update(Member member);
        void delete(Member member);
        Member findById(String id);
        List<Member> findByName(String name);
        List<Member> findAll();
        int count();
        boolean existsById(String id);
        void clear();
    }

    static class MemberServiceImpl implements MemberService{
        private final Map<String, Member> map;
        MemberServiceImpl(){
            this.map = new HashMap<>();
        }
        @Override
        public void save(Member member){
            map.put(member.getUserid(), member);
        }

        @Override
        public void update(Member member) {
            map.replace(member.getUserid(), member);
        }

        @Override
        public void delete(Member member) {
            map.remove(member.getUserid());

        }
        @Override
        public Member findById(String id) {
            return map.get(id);
        }

        @Override
        public List<Member> findByName(String name) {
            return (List<Member>) map.get(name);
        }

        @Override
        public List<Member> findAll() {
            //return (List<Member>)map.forEach();
            return null;
        }

        @Override
        public int count() {
            return map.size();
        }

        @Override
        public boolean existsById(String id) {
            return map.containsKey(id);
        }

        @Override
        public void clear() {
            map.clear();
        }
    }
}
