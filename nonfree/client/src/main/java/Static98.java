import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
	public static int anInt2370;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!p;")
	public static Class45 aClass45_30;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_674 = Static13.method257("Loading )2 please wait)3");

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray35 = new boolean[5];

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!nb;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Lclient!o;")
	private static Class40 aClass40_675 = Static13.method257("Loading)3)3)3 ");

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!o;")
	public static Class40 aClass40_676 = Static13.method257("Fps:");

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
	public static int[] anIntArray504 = new int[2048];

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "[Lclient!ne;")
	public static Class2_Sub2_Sub12_Sub4[] aClass2_Sub2_Sub12_Sub4Array1 = new Class2_Sub2_Sub12_Sub4[4];

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!o;")
	public static Class40 aClass40_677 = Static13.method257(" is already on your friend list");

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "Lclient!o;")
	public static Class40 aClass40_678 = Static13.method257("@cya@");

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!o;")
	public static Class40 aClass40_679 = Static13.method257("Jan");

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
	public static int anInt2371 = 0;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
	public static int anInt2372 = 127;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Lclient!o;")
	public static Class40 aClass40_680 = aClass40_675;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "Lclient!o;")
	public static Class40 aClass40_681 = Static13.method257("(U4");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIIIII)V")
	public static void method1566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 1 || arg2 < 1 || arg1 > 102 || arg2 > 102) {
			return;
		}
		if (Static1.aBoolean2 && Static1.anInt8 != arg4) {
			return;
		}
		@Pc(29) int local29 = 0;
		if (arg0 == 0) {
			local29 = Static93.aClass55_1.method1459(arg4, arg1, arg2);
		}
		if (arg0 == 1) {
			local29 = Static93.aClass55_1.method1419(arg4, arg1, arg2);
		}
		if (arg0 == 2) {
			local29 = Static93.aClass55_1.method1429(arg4, arg1, arg2);
		}
		if (arg0 == 3) {
			local29 = Static93.aClass55_1.method1458(arg4, arg1, arg2);
		}
		@Pc(92) int local92;
		if (local29 != 0) {
			@Pc(85) int local85 = local29 >> 14 & 0x7FFF;
			local92 = Static93.aClass55_1.method1449(arg4, arg1, arg2, local29);
			@Pc(98) int local98 = local92 >> 6 & 0x3;
			@Pc(102) int local102 = local92 & 0x1F;
			@Pc(116) Class2_Sub2_Sub10 local116;
			if (arg0 == 0) {
				Static93.aClass55_1.method1439(arg4, arg1, arg2);
				local116 = Static91.method1470(local85);
				if (local116.aBoolean77) {
					Static79.aClass20Array3[arg4].method532(local102, local116.aBoolean79, arg2, local98, arg1);
				}
			}
			if (arg0 == 1) {
				Static93.aClass55_1.method1415(arg4, arg1, arg2);
			}
			if (arg0 == 2) {
				Static93.aClass55_1.method1423(arg4, arg1, arg2);
				local116 = Static91.method1470(local85);
				if (arg1 + local116.anInt1036 > 103 || arg2 + local116.anInt1036 > 103 || arg1 + local116.anInt1040 > 103 || local116.anInt1040 + arg2 > 103) {
					return;
				}
				if (local116.aBoolean77) {
					Static79.aClass20Array3[arg4].method529(local116.anInt1036, local116.anInt1040, local98, local116.aBoolean79, arg1, arg2);
				}
			}
			if (arg0 == 3) {
				Static93.aClass55_1.method1413(arg4, arg1, arg2);
				local116 = Static91.method1470(local85);
				if (local116.aBoolean77 && local116.anInt1054 == 1) {
					Static79.aClass20Array3[arg4].method537(arg2, arg1);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local92 = arg4;
		if (arg4 < 3 && (Static61.aByteArrayArrayArray7[1][arg1][arg2] & 0x2) == 2) {
			local92 = arg4 + 1;
		}
		Static51.method845(local92, arg2, arg3, Static79.aClass20Array3[arg4], arg5, Static93.aClass55_1, arg6, arg4, arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public static void method1567() {
		while (true) {
			if (Static56.aClass2_Sub3_Sub1_5.method1742(Static33.anInt785) >= 11) {
				@Pc(14) int local14 = Static56.aClass2_Sub3_Sub1_5.method1743(11);
				if (local14 != 2047) {
					if (Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local14] == null) {
						Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local14] = new Class2_Sub2_Sub12_Sub1_Sub1();
						if (Static59.aClass2_Sub3Array1[local14] != null) {
							Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local14].method918(Static59.aClass2_Sub3Array1[local14]);
						}
					}
					Static73.anIntArray408[Static88.anInt2067++] = local14;
					@Pc(51) Class2_Sub2_Sub12_Sub1_Sub1 local51 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local14];
					local51.anInt2274 = Static107.anInt2511;
					@Pc(59) int local59 = Static56.aClass2_Sub3_Sub1_5.method1743(5);
					if (local59 > 15) {
						local59 -= 32;
					}
					@Pc(68) int local68 = Static56.aClass2_Sub3_Sub1_5.method1743(5);
					if (local68 > 15) {
						local68 -= 32;
					}
					@Pc(79) int local79 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
					if (local79 == 1) {
						anIntArray504[Static53.anInt1190++] = local14;
					}
					@Pc(97) int local97 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
					local51.method1545(local97 == 1, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] + local59, local68 + Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0]);
					continue;
				}
			}
			Static56.aClass2_Sub3_Sub1_5.method1739();
			return;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Lclient!ic;")
	public static Class2_Sub2_Sub11 method1568(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub11 local10 = (Class2_Sub2_Sub11) Static45.aClass47_12.method1325((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static27.aClass5_9.method68(arg0, 16);
		local10 = new Class2_Sub2_Sub11();
		if (local20 != null) {
			local10.method788(new Class2_Sub3(local20));
		}
		Static45.aClass47_12.method1332((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method1569() {
		anIntArray504 = null;
		aClass40_676 = null;
		aClass40_679 = null;
		aClass40_674 = null;
		aClass40_675 = null;
		aClass2_Sub2_Sub12_Sub4Array1 = null;
		aClass40_680 = null;
		aClass40_681 = null;
		aBooleanArray35 = null;
		aClass40_677 = null;
		aClass45_30 = null;
		aClass40_678 = null;
	}
}
