import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!lb", name = "pb", descriptor = "[I")
	public static int[] anIntArray232;

	@OriginalMember(owner = "client!lb", name = "sb", descriptor = "Lclient!k;")
	public static Class1_Sub1_Sub8_Sub3 aClass1_Sub1_Sub8_Sub3_2;

	@OriginalMember(owner = "client!lb", name = "hb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_640 = Static8.method128("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
	public static int anInt2615 = 0;

	@OriginalMember(owner = "client!lb", name = "lb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_641 = Static8.method128("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!lb", name = "nb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_642 = Static8.method128("Angreifen");

	@OriginalMember(owner = "client!lb", name = "rb", descriptor = "I")
	public static int anInt2621 = 0;

	@OriginalMember(owner = "client!lb", name = "ub", descriptor = "Lclient!ea;")
	public static Class18 aClass18_643 = Static8.method128("null");

	@OriginalMember(owner = "client!lb", name = "wb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_644 = Static8.method128("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!lb", name = "yb", descriptor = "I")
	public static int anInt2624 = 0;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
	public static void method1873() {
		Static95.aClass1_Sub6_Sub1_1.method555(163);
		Static95.aClass1_Sub6_Sub1_1.method515(0L);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 1 || arg3 < 1 || arg6 > 102 || arg3 > 102) {
			return;
		}
		if (Static27.aBoolean26 && Static9.anInt295 != arg4) {
			return;
		}
		@Pc(36) int local36 = 0;
		if (arg2 == 0) {
			local36 = Static87.aClass68_1.method2648(arg4, arg6, arg3);
		}
		if (arg2 == 1) {
			local36 = Static87.aClass68_1.method2620(arg4, arg6, arg3);
		}
		if (arg2 == 2) {
			local36 = Static87.aClass68_1.method2646(arg4, arg6, arg3);
		}
		if (arg2 == 3) {
			local36 = Static87.aClass68_1.method2617(arg4, arg6, arg3);
		}
		@Pc(94) int local94;
		if (local36 != 0) {
			@Pc(87) int local87 = local36 >> 14 & 0x7FFF;
			local94 = Static87.aClass68_1.method2657(arg4, arg6, arg3, local36);
			@Pc(100) int local100 = local94 >> 6 & 0x3;
			@Pc(104) int local104 = local94 & 0x1F;
			@Pc(118) Class1_Sub1_Sub11 local118;
			if (arg2 == 0) {
				Static87.aClass68_1.method2638(arg4, arg6, arg3);
				local118 = Static62.method1274(local87);
				if (local118.anInt2820 != 0) {
					Static141.aClass22Array2[arg4].method1051(local104, arg3, local100, arg6, local118.aBoolean114);
				}
			}
			if (arg2 == 1) {
				Static87.aClass68_1.method2640(arg4, arg6, arg3);
			}
			if (arg2 == 2) {
				Static87.aClass68_1.method2612(arg4, arg6, arg3);
				local118 = Static62.method1274(local87);
				if (arg6 + local118.anInt2815 > 103 || arg3 + local118.anInt2815 > 103 || arg6 + local118.anInt2822 > 103 || local118.anInt2822 + arg3 > 103) {
					return;
				}
				if (local118.anInt2820 != 0) {
					Static141.aClass22Array2[arg4].method1056(arg6, local118.aBoolean114, local100, local118.anInt2815, local118.anInt2822, arg3);
				}
			}
			if (arg2 == 3) {
				Static87.aClass68_1.method2627(arg4, arg6, arg3);
				local118 = Static62.method1274(local87);
				if (local118.anInt2820 == 1) {
					Static141.aClass22Array2[arg4].method1044(arg6, arg3);
				}
			}
		}
		if (arg1 < 0) {
			return;
		}
		local94 = arg4;
		if (arg4 < 3 && (Static2.aByteArrayArrayArray1[1][arg6][arg3] & 0x2) == 2) {
			local94 = arg4 + 1;
		}
		Static178.method3194(arg4, arg0, local94, Static141.aClass22Array2[arg4], arg5, arg3, arg1, arg6, Static87.aClass68_1);
		return;
	}

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "(I)V")
	public static void method1876() {
		aClass18_644 = null;
		aClass18_640 = null;
		aClass18_643 = null;
		anIntArray232 = null;
		aClass18_642 = null;
		aClass18_641 = null;
		aClass1_Sub1_Sub8_Sub3_2 = null;
	}
}
