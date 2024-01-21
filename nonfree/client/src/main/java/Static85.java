import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!jh", name = "jb", descriptor = "Lclient!s;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!jh", name = "ob", descriptor = "I")
	public static int anInt2436;

	@OriginalMember(owner = "client!jh", name = "wb", descriptor = "Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 aClass1_Sub2_Sub1_Sub3_4;

	@OriginalMember(owner = "client!jh", name = "cb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_803 = Static161.method2971("Registrierter Benutzer");

	@OriginalMember(owner = "client!jh", name = "kb", descriptor = "[I")
	public static int[] anIntArray238 = new int[5];

	@OriginalMember(owner = "client!jh", name = "mb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_804 = Static161.method2971("<col=ffff00>*V");

	@OriginalMember(owner = "client!jh", name = "pb", descriptor = "Lclient!ld;")
	public static Class47 aClass47_17 = new Class47(64);

	@OriginalMember(owner = "client!jh", name = "rb", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!jh", name = "sb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_805 = Static161.method2971(" is already on your friend list)3");

	@OriginalMember(owner = "client!jh", name = "tb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_806 = Static161.method2971("logo");

	@OriginalMember(owner = "client!jh", name = "ub", descriptor = "Lclient!dd;")
	public static Class13 aClass13_807 = Static161.method2971("floorshadows");

	@OriginalMember(owner = "client!jh", name = "vb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_808 = aClass13_805;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
	public static void method1818() {
		aClass13_806 = null;
		anObject4 = null;
		anIntArray238 = null;
		aClass47_17 = null;
		aClass13_808 = null;
		aClass13_804 = null;
		aClass13_805 = null;
		aClass13_807 = null;
		aClass14_1 = null;
		aClass1_Sub2_Sub1_Sub3_4 = null;
		aClass13_803 = null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ag;IZLclient!ag;)V")
	public static void method1819(@OriginalArg(0) Class4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class4 arg2) {
		Static103.aClass4_66 = arg2;
		Static179.aBoolean316 = arg1;
		Static171.aClass4_100 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIZ)V")
	public static void method1820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static128.method553(arg2, arg1, arg3 + arg2, arg0 + arg1);
		Static9.method363();
		Static35.anInt1195++;
		Static186.method3020(true);
		Static49.method1233(true);
		Static186.method3020(false);
		Static49.method1233(false);
		Static179.method2963();
		Static10.method441();
		@Pc(39) int local39;
		@Pc(45) int local45;
		if (!Static2.aBoolean11) {
			local39 = Static30.anInt1075;
			local45 = Static144.anInt3535 + Static2.anInt101 & 0x7FF;
			if (Static75.anInt2130 / 256 > local39) {
				local39 = Static75.anInt2130 / 256;
			}
			if (Static42.aBooleanArray22[4] && local39 < anIntArray238[4] + 128) {
				local39 = anIntArray238[4] + 128;
			}
			Static64.method1434(Static66.method1449(Static156.anInt3696, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596) - 50, Static75.anInt2136, Static147.anInt3572, local39, local45, local39 * 3 + 600);
		}
		if (Static2.aBoolean11) {
			local39 = Static143.method2545();
		} else {
			local39 = Static78.method1591();
		}
		local45 = Static22.anInt2236;
		@Pc(110) int local110 = Static45.anInt1493;
		@Pc(112) int local112 = Static7.anInt3157;
		@Pc(114) int local114 = Static49.anInt1557;
		@Pc(116) int local116 = Static104.anInt2874;
		@Pc(160) int local160;
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (Static42.aBooleanArray22[local118]) {
				local160 = (int) ((double) -Static24.anIntArray109[local118] + (double) (Static24.anIntArray109[local118] * 2 + 1) * Math.random() + Math.sin((double) Static15.anIntArray97[local118] / 100.0D * (double) Static32.anIntArray450[local118]) * (double) anIntArray238[local118]);
				if (local118 == 1) {
					Static45.anInt1493 += local160;
				}
				if (local118 == 0) {
					Static22.anInt2236 += local160;
				}
				if (local118 == 3) {
					Static49.anInt1557 = local160 + Static49.anInt1557 & 0x7FF;
				}
				if (local118 == 4) {
					Static104.anInt2874 += local160;
					if (Static104.anInt2874 < 128) {
						Static104.anInt2874 = 128;
					}
					if (Static104.anInt2874 > 383) {
						Static104.anInt2874 = 383;
					}
				}
				if (local118 == 2) {
					Static7.anInt3157 += local160;
				}
			}
		}
		local160 = Static14.anInt481;
		@Pc(225) int local225 = Static86.anInt2447;
		if (local160 >= arg2 && local160 < arg2 + arg3 && local225 >= arg1 && local225 < arg0 + arg1) {
			Static72.aBoolean285 = true;
			Static72.anInt3751 = Static14.anInt481 - arg2;
			Static72.anInt3748 = 0;
			Static72.anInt3749 = Static86.anInt2447 - arg1;
		} else {
			Static72.anInt3748 = 0;
			Static72.aBoolean285 = false;
		}
		Static131.method2376();
		Static128.method565(arg2, arg1, arg3, arg0, 0);
		Static131.method2376();
		Static50.method1242(Static22.anInt2236, Static45.anInt1493, Static7.anInt3157, Static104.anInt2874, Static49.anInt1557, local39);
		Static131.method2376();
		Static163.method2804();
		Static53.method1295(arg3, arg1, arg0, arg2);
		Static20.method683(arg2, arg1);
		((Class49) Static9.anInterface3_1).method2056(Static117.anInt3116);
		Static2.method70(arg1, arg2, arg0, arg3);
		Static49.anInt1557 = local114;
		Static45.anInt1493 = local110;
		Static7.anInt3157 = local112;
		Static22.anInt2236 = local45;
		Static104.anInt2874 = local116;
		if (Static81.aBoolean175 && Static43.method1145() == 0) {
			Static81.aBoolean175 = false;
		}
		if (Static81.aBoolean175) {
			Static128.method565(arg2, arg1, arg3, arg0, 0);
			Static144.method2550(Static153.aClass13_1250, false);
		}
		if (!Static81.aBoolean175 && !Static46.aBoolean106 && arg2 <= local160 && arg3 + arg2 > local160 && arg1 <= local225 && local225 < arg0 + arg1) {
			Static90.method1896(local160, arg1, arg2, local225);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIILclient!lc;JZ)V")
	public static void method1821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub2 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class56 local6 = new Class56();
		local6.aClass1_Sub2_Sub2_6 = arg4;
		local6.anInt3072 = arg1 * 128 + 64;
		local6.anInt3073 = arg2 * 128 + 64;
		local6.anInt3074 = arg3;
		local6.aLong104 = arg5;
		if (Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2] == null) {
			Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2] = new Class1_Sub10(arg0, arg1, arg2);
		}
		Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2].aClass56_1 = local6;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[BII)I")
	public static int method1822(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg2; local14++) {
			local12 = local12 >>> 8 ^ Class55.anIntArray297[(arg1[local14] ^ local12) & 0xFF];
		}
		return ~local12;
	}
}
