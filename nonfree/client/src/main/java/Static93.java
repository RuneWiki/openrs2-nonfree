import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	public static boolean aBoolean85;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	public static int anInt2428;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!s;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!ff;")
	public static Class26 aClass26_20;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	public static int anInt2432;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!r;")
	private static Class61 aClass61_720 = Static129.method2060("Loading sprites )2 ");

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_721 = aClass61_720;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!r;")
	public static Class61 aClass61_722 = Static129.method2060("<col=ff0000>");

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!r;")
	public static Class61 aClass61_723 = Static129.method2060("Fallen lassen");

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	public static int anInt2433 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1598() {
		aClass65_1 = null;
		aClass61_721 = null;
		aClass61_723 = null;
		aClass26_20 = null;
		aClass61_722 = null;
		aClass61_720 = null;
		anIntArrayArray21 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!pa;Lclient!r;B)I")
	public static int method1599(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(1) Class61 arg1) {
		@Pc(7) int local7 = arg0.anInt2199;
		arg0.method1434(arg1.anInt2675);
		arg0.anInt2199 += Static91.aClass32_1.method855(0, arg0.aByteArray33, arg1.anInt2675, arg0.anInt2199, arg1.aByteArray38);
		return arg0.anInt2199 - local7;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3 method1600() {
		@Pc(7) Class5_Sub2_Sub1_Sub3 local7 = new Class5_Sub2_Sub1_Sub3();
		local7.anInt2088 = Static92.anInt2249;
		local7.anInt2091 = Static58.anIntArray212[0];
		local7.anInt2086 = anInt2432;
		local7.anIntArray285 = Static108.anIntArray19;
		local7.anInt2089 = Static129.anIntArray393[0];
		local7.aByteArray31 = Static67.aByteArrayArray7[0];
		local7.anInt2087 = Static48.anIntArray190[0];
		local7.anInt2090 = Static50.anIntArray191[0];
		Static87.method1546();
		return local7;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIBIIII)I")
	public static int method1601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg1;
			arg1 = local6;
		}
		@Pc(18) int local18 = arg4 & 0x3;
		if (local18 == 0) {
			return arg5;
		} else if (local18 == 1) {
			return 7 + 1 - arg0 - arg3;
		} else if (local18 == 2) {
			return 7 + 1 - arg5 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I")
	public static int method1602() {
		return Static91.anInt2416++;
	}
}
