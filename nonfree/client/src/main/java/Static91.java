import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!aa;")
	public static Class2 aClass2_3;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!d;")
	public static Class16 aClass16_9 = new Class16(8);

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public static volatile int anInt2029 = 0;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	public static int anInt2031 = 0;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public static int anInt2032 = 0;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1155 = Static122.method531("<col=c0ff00>");

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1156 = Static122.method531("Loaded fonts");

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1157 = aClass73_1156;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1593() {
		aClass16_9 = null;
		aClass73_1156 = null;
		aClass73_1157 = null;
		aClass73_1155 = null;
		aClass2_3 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Lclient!s;")
	public static Class69 method1594() {
		try {
			return (Class69) Class.forName("Class69_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class69_Sub2();
		}
	}
}
