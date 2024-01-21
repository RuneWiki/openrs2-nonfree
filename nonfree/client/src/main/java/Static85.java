import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!r", name = "hb", descriptor = "[[I")
	public static int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
	public static int anInt2270;

	@OriginalMember(owner = "client!r", name = "qb", descriptor = "Lclient!kb;")
	public static Class9 aClass9_44;

	@OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
	public static int anInt2266 = 0;

	@OriginalMember(owner = "client!r", name = "jb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1007 = Static45.method753("Ignorieren");

	@OriginalMember(owner = "client!r", name = "nb", descriptor = "I")
	public static int anInt2271 = 1;

	@OriginalMember(owner = "client!r", name = "ob", descriptor = "Lclient!v;")
	public static Class62 aClass62_1008 = Static45.method753("Menge eingeben:");

	@OriginalMember(owner = "client!r", name = "sb", descriptor = "J")
	public static long aLong69 = 0L;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)I")
	public static int method1394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 179) {
			arg2 /= 2;
		}
		if (arg1 > 192) {
			arg2 /= 2;
		}
		if (arg1 > 217) {
			arg2 /= 2;
		}
		if (arg1 > 243) {
			arg2 /= 2;
		}
		return arg1 / 2 + (arg0 / 4 << 10) + (arg2 / 32 << 7);
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public static void method1395() {
		aClass9_44 = null;
		aClass62_1007 = null;
		anIntArrayArray23 = null;
		aClass62_1008 = null;
	}
}
