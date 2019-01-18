package ABCD;

class Test5 {
    Test5() {
    }

    public static void main(String[] args) {
        A a = new M();
        A b = new B() {
            public void a() {
            }

            public void b() {
            }

            public void d() {
            }
        };
        a.a();
        a.b();
        a.c();
        a.d();
        b.c();
    }
}
