import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "Lclient!vf;")
	public static final Class390 aClass390_1 = new Class390(8, 1);

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_5 = new Class397(18, -2);

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Lclient!tia;")
	public static Class87 method256() {
		try {
			return new Class87_Sub1();
		} catch (@Pc(15) Throwable local15) {
			try {
				return (Class87) Class.forName("pfa").getDeclaredConstructor().newInstance();
			} catch (@Pc(23) Throwable local23) {
				return new Class87_Sub2();
			}
		}
	}
}
