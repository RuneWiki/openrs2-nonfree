import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Lclient!rk;")
	public static Class180 aClass180_22;

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "Lclient!rk;")
	public static Class180 aClass180_23;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "Z")
	public static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
	public static int anInt2209 = 0;

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString150 = null;

	@OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
	public static int anInt2215 = 0;

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZIBII)V")
	public static void method1787(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static264.method4436(arg2)) {
			Static237.method4093(arg1, arg3, -1, Static298.aClass26ArrayArray1[arg2], arg0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)I")
	public static int method1788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public static void method1791() {
		if (Static105.method5089() || Static75.anInt1865 == Static168.anInt3508) {
			Static302.method5510(Static128.aClass89_3);
			if (Static168.anInt3508 != Static286.anInt5632) {
				Static268.method4484();
			}
		} else {
			Static120.method2555(Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0], false, false, Static237.anInt4697, Static101.anInt2445, Static168.anInt3508, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0]);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIBIIIIIILclient!oa;I)Z")
	public static boolean method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class149 arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg7;
		@Pc(7) int local7 = arg5;
		@Pc(21) int local21 = arg7 - 64;
		@Pc(26) int local26 = arg5 - 64;
		Static218.anIntArrayArray34[64][64] = 99;
		Static342.anIntArrayArray56[64][64] = 0;
		@Pc(40) byte local40 = 0;
		Static197.anIntArray538[0] = arg7;
		@Pc(46) int local46 = 0;
		@Pc(49) int local49 = local40 + 1;
		Static354.anIntArray851[0] = arg5;
		@Pc(54) int[][] local54 = arg8.anIntArrayArray36;
		while (local49 != local46) {
			local7 = Static354.anIntArray851[local46];
			local5 = Static197.anIntArray538[local46];
			@Pc(68) int local68 = local5 - local21;
			@Pc(72) int local72 = local7 - local26;
			local46 = local46 + 1 & 0xFFF;
			@Pc(84) int local84 = local7 - arg8.anInt4484;
			@Pc(89) int local89 = local5 - arg8.anInt4488;
			if (arg0 == -4) {
				if (arg4 == local5 && arg6 == local7) {
					Static76.anInt1897 = local7;
					Static138.anInt3014 = local5;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static241.method4148(arg9, local5, arg4, 1, local7, arg3, arg6, 1)) {
					Static138.anInt3014 = local5;
					Static76.anInt1897 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg8.method3956(1, arg6, local7, local5, arg4, arg3, arg1, arg9, 1)) {
					Static76.anInt1897 = local7;
					Static138.anInt3014 = local5;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg8.method3951(arg1, arg6, arg4, local5, 1, local7, arg9, arg3)) {
					Static76.anInt1897 = local7;
					Static138.anInt3014 = local5;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg8.method3950(1, arg4, arg0, arg6, local5, local7, arg2)) {
					Static76.anInt1897 = local7;
					Static138.anInt3014 = local5;
					return true;
				}
			} else if (arg8.method3960(arg0, arg2, 1, arg6, local5, local7, arg4)) {
				Static76.anInt1897 = local7;
				Static138.anInt3014 = local5;
				return true;
			}
			@Pc(245) int local245 = Static342.anIntArrayArray56[local68][local72] + 1;
			if (local68 > 0 && Static218.anIntArrayArray34[local68 - 1][local72] == 0 && (local54[local89 - 1][local84] & 0x42240000) == 0) {
				Static197.anIntArray538[local49] = local5 - 1;
				Static354.anIntArray851[local49] = local7;
				Static218.anIntArrayArray34[local68 - 1][local72] = 2;
				local49 = local49 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local68 - 1][local72] = local245;
			}
			if (local68 < 127 && Static218.anIntArrayArray34[local68 + 1][local72] == 0 && (local54[local89 + 1][local84] & 0x60240000) == 0) {
				Static197.anIntArray538[local49] = local5 + 1;
				Static354.anIntArray851[local49] = local7;
				Static218.anIntArrayArray34[local68 + 1][local72] = 8;
				local49 = local49 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local68 + 1][local72] = local245;
			}
			if (local72 > 0 && Static218.anIntArrayArray34[local68][local72 - 1] == 0 && (local54[local89][local84 - 1] & 0x40A40000) == 0) {
				Static197.anIntArray538[local49] = local5;
				Static354.anIntArray851[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static218.anIntArrayArray34[local68][local72 - 1] = 1;
				Static342.anIntArrayArray56[local68][local72 - 1] = local245;
			}
			if (local72 < 127 && Static218.anIntArrayArray34[local68][local72 + 1] == 0 && (local54[local89][local84 + 1] & 0x48240000) == 0) {
				Static197.anIntArray538[local49] = local5;
				Static354.anIntArray851[local49] = local7 + 1;
				Static218.anIntArrayArray34[local68][local72 + 1] = 4;
				local49 = local49 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local68][local72 + 1] = local245;
			}
			if (local68 > 0 && local72 > 0 && Static218.anIntArrayArray34[local68 - 1][local72 - 1] == 0 && (local54[local89 - 1][local84 - 1] & 0x43A40000) == 0 && (local54[local89 - 1][local84] & 0x42240000) == 0 && (local54[local89][local84 - 1] & 0x40A40000) == 0) {
				Static197.anIntArray538[local49] = local5 - 1;
				Static354.anIntArray851[local49] = local7 - 1;
				Static218.anIntArrayArray34[local68 - 1][local72 - 1] = 3;
				local49 = local49 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local68 - 1][local72 - 1] = local245;
			}
			if (local68 < 127 && local72 > 0 && Static218.anIntArrayArray34[local68 + 1][local72 - 1] == 0 && (local54[local89 + 1][local84 - 1] & 0x60E40000) == 0 && (local54[local89 + 1][local84] & 0x60240000) == 0 && (local54[local89][local84 - 1] & 0x40A40000) == 0) {
				Static197.anIntArray538[local49] = local5 + 1;
				Static354.anIntArray851[local49] = local7 - 1;
				Static218.anIntArrayArray34[local68 + 1][local72 - 1] = 9;
				local49 = local49 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local68 + 1][local72 - 1] = local245;
			}
			if (local68 > 0 && local72 < 127 && Static218.anIntArrayArray34[local68 - 1][local72 + 1] == 0 && (local54[local89 - 1][local84 + 1] & 0x4E240000) == 0 && (local54[local89 - 1][local84] & 0x42240000) == 0 && (local54[local89][local84 + 1] & 0x48240000) == 0) {
				Static197.anIntArray538[local49] = local5 - 1;
				Static354.anIntArray851[local49] = local7 + 1;
				Static218.anIntArrayArray34[local68 - 1][local72 + 1] = 6;
				local49 = local49 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local68 - 1][local72 + 1] = local245;
			}
			if (local68 < 127 && local72 < 127 && Static218.anIntArrayArray34[local68 + 1][local72 + 1] == 0 && (local54[local89 + 1][local84 + 1] & 0x78240000) == 0 && (local54[local89 + 1][local84] & 0x60240000) == 0 && (local54[local89][local84 + 1] & 0x48240000) == 0) {
				Static197.anIntArray538[local49] = local5 + 1;
				Static354.anIntArray851[local49] = local7 + 1;
				Static218.anIntArrayArray34[local68 + 1][local72 + 1] = 12;
				local49 = local49 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local68 + 1][local72 + 1] = local245;
			}
		}
		Static138.anInt3014 = local5;
		Static76.anInt1897 = local7;
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1799(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = Static138.method2796(arg0.charAt(local10)) + (local8 << 5) - local8;
		}
		return local8;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILclient!oa;IIILclient!pe;)V")
	public static void method1801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class149 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class89 arg6) {
		@Pc(5) Interface1 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface1) Static48.method4691(arg2, arg1, arg5);
		}
		if (arg0 == 1) {
			local5 = (Interface1) Static96.method1983(arg2, arg1, arg5);
		}
		if (arg0 == 2) {
			local5 = (Interface1) Static252.method5177(arg2, arg1, arg5, gd.class);
		}
		if (arg0 == 3) {
			local5 = (Interface1) Static44.method981(arg2, arg1, arg5);
		}
		if (local5 == null) {
			return;
		}
		@Pc(64) int local64 = local5.method5361();
		@Pc(68) int local68 = local5.method5360();
		@Pc(74) Class122 local74 = Static245.method4227(local5.method5362());
		if (local74.method3228()) {
			Static222.method3929(local74, arg2, arg1, arg5);
		}
		if (local5.method5363()) {
			local5.method5359(arg6);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				Static171.method3233(arg2, arg1, arg5);
				return;
			}
			if (arg0 == 2) {
				Static251.method5274(arg2, arg1, arg5, gd.class);
				if (local74.anInt3570 == 0 || Static15.anInt287 <= arg1 + local74.anInt3562 || Static325.anInt6173 <= arg5 + local74.anInt3562 || arg1 + local74.anInt3527 >= Static15.anInt287 || arg5 + local74.anInt3527 >= Static325.anInt6173) {
					return;
				}
				arg3.method3958(local74.anInt3527, local74.aBoolean270, local74.anInt3562, !local74.aBoolean266, local68, arg5, arg1);
			} else if (arg0 == 3) {
				Static347.method5577(arg2, arg1, arg5);
				if (local74.anInt3570 == 1) {
					arg3.method3963(arg1, arg5);
					return;
				}
			}
			return;
		}
		Static273.method4551(arg2, arg1, arg5);
		if (local74.anInt3570 != 0) {
			arg3.method3962(arg1, local74.aBoolean270, local64, !local74.aBoolean266, local68, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
	public static void method1804() {
		@Pc(5) Class103 local5 = Static192.aClass103_35;
		synchronized (Static192.aClass103_35) {
			Static192.aClass103_35.method2684();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lclient!ok;")
	public static Class7_Sub1_Sub14 method1807(@OriginalArg(1) int arg0) {
		@Pc(10) Class103 local10 = Static294.aClass103_68;
		@Pc(19) Class7_Sub1_Sub14 local19;
		synchronized (Static294.aClass103_68) {
			local19 = (Class7_Sub1_Sub14) Static294.aClass103_68.method2682((long) arg0);
			if (local19 == null) {
				local19 = new Class7_Sub1_Sub14(arg0);
				Static294.aClass103_68.method2687(local19, (long) arg0);
			}
		}
		synchronized (local19) {
			return local19.method4057() ? local19 : null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
	public static void method1808() {
		Static148.method2960();
	}
}
