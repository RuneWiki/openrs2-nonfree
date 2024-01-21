import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	public static int anInt2486;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!ag;")
	public static Class4 aClass4_59;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] aClass1_Sub2_Sub1_Sub3Array9;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_824 = Static161.method2971("Art");

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
	public static int[] anIntArray241 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!dd;")
	private static Class13 aClass13_825 = Static161.method2971("Username: ");

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_826 = Static161.method2971("M");

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_827 = aClass13_825;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!dd;")
	private static Class13 aClass13_829 = Static161.method2971("Could not complete login)3");

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!dd;")
	public static Class13 aClass13_828 = aClass13_829;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public static int anInt2490 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Lclient!pg;")
	public static Class69 method1850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass69_1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1851() {
		Static156.anInt3694 = 0;
		Static7.anInt3168 = 0;
		Static62.method1886();
		Static18.method661();
		Static37.method994();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static7.anInt3168; local17++) {
			local23 = Static126.anIntArray312[local17];
			if (Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local23].anInt2597 != Static78.anInt2168) {
				Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local23].aClass1_Sub2_Sub19_1 = null;
				Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local23] = null;
			}
		}
		if (Static89.anInt2506 != Static153.aClass1_Sub8_Sub1_2.anInt2195) {
			throw new RuntimeException("gnp1 pos:" + Static153.aClass1_Sub8_Sub1_2.anInt2195 + " psize:" + Static89.anInt2506);
		}
		for (local23 = 0; local23 < Static74.anInt2127; local23++) {
			if (Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[Static66.anIntArray202[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static74.anInt2127);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!ag;I)Z")
	public static boolean method1852(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method2245(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static134.method2405(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB[Lclient!d;I[BI)V")
	public static void method1853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class12[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(16) int local16 = 0; local16 < 64; local16++) {
				for (local20 = 0; local20 < 64; local20++) {
					if (local16 + arg3 > 0 && arg3 + local16 < 103 && arg0 + local20 > 0 && arg0 + local20 < 103) {
						arg2[local7].anIntArrayArray7[arg3 + local16][local20 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(95) Class1_Sub8 local95 = new Class1_Sub8(arg4);
		for (local20 = 0; local20 < 4; local20++) {
			for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
				for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
					Static39.method1023(local105 + arg0, 0, arg5, local101 + arg3, local95, local20, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method1854() {
		aClass13_828 = null;
		aClass13_826 = null;
		aClass13_827 = null;
		aClass13_824 = null;
		aClass13_825 = null;
		aClass1_Sub2_Sub1_Sub3Array9 = null;
		aClass13_829 = null;
		aClass4_59 = null;
		anIntArray241 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)Lclient!ug;")
	public static Class1_Sub22 method1855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class1_Sub22 local3 = new Class1_Sub22();
		local3.anInt3978 = arg1;
		local3.anInt3979 = arg2;
		Static18.aClass45_3.method1981(local3, (long) arg0);
		Static23.method852(arg1);
		Static184.method2991(arg1);
		@Pc(37) Class20 local37 = Static119.method2230(arg0);
		if (local37 != null) {
			Static125.method2300(local37);
		}
		if (Static89.aClass20_7 != null) {
			Static125.method2300(Static89.aClass20_7);
			Static89.aClass20_7 = null;
		}
		Static53.anInt1722 = 0;
		Static46.aBoolean106 = false;
		Static186.method3019(Static164.anInt3861, Static51.anInt1676, Static85.anInt2436, Static101.anInt2829);
		if (Static82.anInt2319 != -1) {
			Static73.method1541(Static82.anInt2319, 1);
		}
		return local3;
	}
}
