import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!pf;")
	public static Class68 aClass68_2;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!tg;")
	public static Class81 aClass81_671 = Static120.method2057("null");

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!tg;")
	public static Class81 aClass81_672 = Static120.method2057("k");

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
	public static int[] anIntArray218 = new int[4000];

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public static int anInt1952 = 0;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!tg;")
	private static Class81 aClass81_674 = Static120.method2057("Loading)3)3)3");

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_673 = aClass81_674;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1473() {
		aClass81_674 = null;
		aClass68_2 = null;
		aClass81_673 = null;
		aClass81_671 = null;
		aClass81_672 = null;
		anIntArray218 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)Lclient!tg;")
	public static Class81 method1474(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static5.aClass81_51;
		} else if (local8 < -6) {
			return Static11.aClass81_220;
		} else if (local8 < -3) {
			return Static68.aClass81_573;
		} else if (local8 < 0) {
			return Static152.aClass81_1251;
		} else if (local8 > 9) {
			return Static52.aClass81_448;
		} else if (local8 > 6) {
			return Static43.aClass81_380;
		} else if (local8 > 3) {
			return Static93.aClass81_727;
		} else if (local8 > 0) {
			return Static81.aClass81_634;
		} else {
			return Static103.aClass81_797;
		}
	}
}
