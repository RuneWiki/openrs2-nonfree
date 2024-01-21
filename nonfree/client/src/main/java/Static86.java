import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static86 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	public static int anInt2204;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!ai;")
	private static Class6 aClass6_649 = Static38.method685("wave2:");

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_645 = aClass6_649;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!ai;")
	private static Class6 aClass6_650 = Static38.method685("flash3:");

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_646 = aClass6_650;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Lclient!db;")
	public static Class16 aClass16_6 = new Class16(4096);

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray34 = new int[104][104];

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!ai;")
	public static Class6 aClass6_647 = aClass6_650;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_648 = Static38.method685(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	public static int anInt2209 = 0;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "Lclient!ai;")
	public static Class6 aClass6_651 = aClass6_649;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
	public static int anInt2213 = 0;

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "Lclient!cf;")
	public static Class15 aClass15_1 = new Class15();

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public static void method1464() {
		aClass16_6 = null;
		aClass6_648 = null;
		aClass6_650 = null;
		anIntArrayArray34 = null;
		aClass6_645 = null;
		aClass6_649 = null;
		aClass6_646 = null;
		aClass15_1 = null;
		aClass6_647 = null;
		aClass6_651 = null;
		aBooleanArray5 = null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	public static void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static81.anInt1983 != 0 && arg0 != -1) {
			Static180.method2811(Static81.anInt1983, Static176.aClass10_Sub1_20, arg0, 0);
			Static52.aBoolean56 = true;
		}
	}
}
