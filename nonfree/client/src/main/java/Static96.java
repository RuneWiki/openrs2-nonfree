import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!lh", name = "S", descriptor = "Z")
	public static boolean aBoolean92;

	@OriginalMember(owner = "client!lh", name = "fb", descriptor = "I")
	public static int anInt2389;

	@OriginalMember(owner = "client!lh", name = "Q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_684 = Static38.method685("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!lh", name = "W", descriptor = "Lclient!ai;")
	public static Class6 aClass6_685 = Static38.method685("Angreifen");

	@OriginalMember(owner = "client!lh", name = "Y", descriptor = "Lclient!ai;")
	private static Class6 aClass6_686 = Static38.method685("glow3:");

	@OriginalMember(owner = "client!lh", name = "Z", descriptor = "Lclient!ai;")
	public static Class6 aClass6_687 = Static38.method685("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!lh", name = "ab", descriptor = "Lclient!ai;")
	public static Class6 aClass6_688 = aClass6_686;

	@OriginalMember(owner = "client!lh", name = "cb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_689 = Static38.method685("Die Verbindung konnte");

	@OriginalMember(owner = "client!lh", name = "pb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_692 = Static38.method685("Loaded wordpack");

	@OriginalMember(owner = "client!lh", name = "kb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_690 = aClass6_692;

	@OriginalMember(owner = "client!lh", name = "lb", descriptor = "I")
	public static int anInt2394 = 0;

	@OriginalMember(owner = "client!lh", name = "mb", descriptor = "I")
	public static int anInt2395 = 0;

	@OriginalMember(owner = "client!lh", name = "ob", descriptor = "Lclient!ai;")
	public static Class6 aClass6_691 = aClass6_686;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)Lclient!ae;")
	public static Class5 method1566() {
		try {
			return (Class5) Class.forName("Class5_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class5_Sub1();
		}
	}

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
	public static void method1568() {
		aClass6_689 = null;
		aClass6_687 = null;
		aClass6_688 = null;
		aClass6_686 = null;
		aClass6_691 = null;
		aClass6_684 = null;
		aClass6_685 = null;
		aClass6_690 = null;
		aClass6_692 = null;
	}
}
