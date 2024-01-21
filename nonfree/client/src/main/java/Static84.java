import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!eb;")
	public static Class17 aClass17_43 = new Class17(200);

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt2576 = 0;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1112 = Static59.method1195(" ");

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1113 = aClass60_1112;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1114 = Static59.method1195("Art");

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1117 = Static59.method1195("Service unavailable)3");

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1115 = aClass60_1117;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1116 = Static59.method1195("(Y ");

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "[I")
	public static int[] anIntArray268 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Lclient!vc;")
	public static Class39 method1662() {
		try {
			return (Class39) Class.forName("Class39_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class39_Sub2();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1663() {
		aClass60_1112 = null;
		aClass60_1114 = null;
		anIntArray268 = null;
		aClass60_1116 = null;
		aClass17_43 = null;
		aClass60_1117 = null;
		aClass60_1113 = null;
		aClass60_1115 = null;
	}
}
