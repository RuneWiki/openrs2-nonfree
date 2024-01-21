import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
	public static int anInt2342;

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "[Lclient!he;")
	public static Class26[] aClass26Array20;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!he;")
	public static Class26 aClass26_1171 = Static6.method100(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!ec;")
	public static Class17 aClass17_15 = new Class17(32);

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	public static int anInt2340 = 0;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!he;")
	private static Class26 aClass26_1172 = Static6.method100("FULL");

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public static int anInt2341 = 0;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!he;")
	public static Class26 aClass26_1173 = aClass26_1172;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)I")
	public static int method1488(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!ef;Lclient!ef;BLclient!ef;)V")
	public static void method1489(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) Class16 arg2) {
		Static71.aClass16_85 = arg0;
		Static38.aClass16_58 = arg1;
		Static33.aClass16_48 = arg2;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Z")
	public static boolean method1490() {
		@Pc(5) Class19 local5 = Static86.aClass19_1;
		synchronized (Static86.aClass19_1) {
			if (Static71.anInt2026 == Static71.anInt2025) {
				return false;
			} else {
				Static91.anInt2510 = Static96.anIntArray312[Static71.anInt2025];
				Static76.anInt2094 = Static41.anIntArray139[Static71.anInt2025];
				Static71.anInt2025 = Static71.anInt2025 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method1491() {
		aClass17_15 = null;
		aClass26_1172 = null;
		aClass26Array20 = null;
		aClass26_1171 = null;
		aClass26_1173 = null;
	}
}
