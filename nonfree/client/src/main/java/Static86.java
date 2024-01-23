import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
	public static int anInt1847;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	public static int anInt1852;

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "[I")
	public static int[] anIntArray124 = new int[14];

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "Lclient!ok;")
	public static Class125 aClass125_24 = new Class125(128);

	@OriginalMember(owner = "client!ge", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString69 = "Cancel";

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IZ)I")
	public static int method1404(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
	public static void method1405() {
		Static298.anInt354 = 0;
		Static291.anInt3609 = 0;
		Static292.method4269();
		Static226.method3502();
		Static178.method2732();
		@Pc(17) int local17;
		for (local17 = 0; local17 < Static298.anInt354; local17++) {
			@Pc(24) int local24 = Static171.anIntArray257[local17];
			if (Static183.anInt3590 != Static48.aClass36_Sub3_Sub2Array1[local24].anInt4119) {
				if (Static48.aClass36_Sub3_Sub2Array1[local24].aClass173_1.method4251()) {
					Static232.method3544(Static48.aClass36_Sub3_Sub2Array1[local24]);
				}
				Static48.aClass36_Sub3_Sub2Array1[local24].method3117(null);
				Static48.aClass36_Sub3_Sub2Array1[local24] = null;
			}
		}
		if (Static275.aClass8_Sub2_Sub1_6.anInt2955 != Static68.anInt1687) {
			throw new RuntimeException("gnp1 pos:" + Static275.aClass8_Sub2_Sub1_6.anInt2955 + " psize:" + Static68.anInt1687);
		}
		for (local17 = 0; local17 < Static135.anInt2729; local17++) {
			if (Static48.aClass36_Sub3_Sub2Array1[Static191.anIntArray285[local17]] == null) {
				throw new RuntimeException("gnp2 pos:" + local17 + " size:" + Static135.anInt2729);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
	public static void method1407(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static173.anInt3443 == 1) {
			Static10.aClass8_Sub1_Sub7Array3[Static187.anInt3758 / 100].method2811(Static234.anInt4715 - 8, Static180.anInt3530 + -8);
		}
		if (Static173.anInt3443 == 2) {
			Static10.aClass8_Sub1_Sub7Array3[Static187.anInt3758 / 100 + 4].method2811(Static234.anInt4715 - 8, Static180.anInt3530 - 8);
		}
		Static244.method3658();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!pk;)V")
	public static void method1408(@OriginalArg(1) Class132 arg0) {
		Static44.aClass132_15 = arg0;
	}
}
