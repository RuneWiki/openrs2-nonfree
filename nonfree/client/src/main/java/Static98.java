import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!er", name = "P", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_33 = new Class146(3, 2);

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(B)Z")
	public static boolean method1494() {
		try {
			if (Static350.anInt5812 == 2) {
				if (Static238.aClass4_Sub17_2 == null) {
					Static238.aClass4_Sub17_2 = Static462.method2248(Static252.aClass211_63, Static186.anInt3434, Static403.anInt6562);
					if (Static238.aClass4_Sub17_2 == null) {
						return false;
					}
				}
				if (Static302.aClass136_1 == null) {
					Static302.aClass136_1 = new Class136(Static122.aClass211_32, Static199.aClass211_54);
				}
				if (Static383.aClass4_Sub14_Sub1_2.method1883(Static302.aClass136_1, Static446.aClass211_97, Static238.aClass4_Sub17_2)) {
					Static383.aClass4_Sub14_Sub1_2.method1900();
					Static383.aClass4_Sub14_Sub1_2.method1896(Static417.anInt7023);
					Static383.aClass4_Sub14_Sub1_2.method1898(Static66.aBoolean66, Static238.aClass4_Sub17_2);
					Static238.aClass4_Sub17_2 = null;
					Static350.anInt5812 = 0;
					Static302.aClass136_1 = null;
					Static252.aClass211_63 = null;
					return true;
				}
			}
		} catch (@Pc(74) Exception local74) {
			local74.printStackTrace();
			Static383.aClass4_Sub14_Sub1_2.method1918();
			Static252.aClass211_63 = null;
			Static350.anInt5812 = 0;
			Static302.aClass136_1 = null;
			Static238.aClass4_Sub17_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
	public static void method1495() {
		Static260.anInt7669 = Static363.aClass158_11.anInt3838 + Static363.aClass158_11.anInt3839 + 2;
		Static307.aStringArray35 = new String[500];
		Static306.anInt5009 = Static221.aClass158_6.anInt3838 + Static221.aClass158_6.anInt3839 + 2;
		for (@Pc(33) int local33 = 0; local33 < Static307.aStringArray35.length; local33++) {
			Static307.aStringArray35[local33] = "";
		}
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(B)V")
	public static void method1496() {
		Static172.aClass135_4.B(((float) Static413.aClass49_Sub1_1.anInt3220 * 0.1F + 0.7F) * 1.1523438F);
		Static172.aClass135_4.T(Static171.anInt3111, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static172.aClass135_4.UA(Static63.anInt5743, -1, 256);
		Static172.aClass135_4.method5347(Static341.aClass3_4);
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(I)[Lclient!tm;")
	public static Class241[] method1497() {
		if (Static406.aClass241Array1 == null) {
			@Pc(12) Class241[] local12 = Static112.method1661(Static24.aClass196_1);
			@Pc(16) Class241[] local16 = new Class241[local12.length];
			@Pc(18) int local18 = 0;
			@Pc(74) int local74;
			@Pc(80) Class241 local80;
			label63: for (@Pc(20) int local20 = 0; local20 < local12.length; local20++) {
				@Pc(26) Class241 local26 = local12[local20];
				if ((local26.anInt6345 <= 0 || local26.anInt6345 >= 24) && local26.anInt6346 >= 800 && local26.anInt6344 >= 600 && (Static18.anInt296 >= 96 || Static341.anInt5549 != 0 || local26.anInt6346 <= 1024 && local26.anInt6344 <= 768)) {
					for (local74 = 0; local74 < local18; local74++) {
						local80 = local16[local74];
						if (local80.anInt6346 == local26.anInt6346 && local26.anInt6344 == local80.anInt6344) {
							if (local26.anInt6345 > local80.anInt6345) {
								local16[local74] = local26;
							}
							continue label63;
						}
					}
					local16[local18] = local26;
					local18++;
				}
			}
			Static406.aClass241Array1 = new Class241[local18];
			Static461.method1981(local16, 0, Static406.aClass241Array1, 0, local18);
			@Pc(144) int[] local144 = new int[Static406.aClass241Array1.length];
			for (local74 = 0; local74 < Static406.aClass241Array1.length; local74++) {
				local80 = Static406.aClass241Array1[local74];
				local144[local74] = local80.anInt6344 * local80.anInt6346;
			}
			Static108.method141(Static406.aClass241Array1, local144);
		}
		return Static406.aClass241Array1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IBIII)V")
	public static void method1498(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		Static207.anInt3632 = arg0;
		Static62.anInt1114 = 0;
		Static254.anInt4211 = 0;
		Static275.anInt4594 = arg1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB)V")
	public static void method1499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub2_Sub17 local12 = Static34.method1709(5, arg0);
		local12.method5529();
		local12.anInt6873 = arg1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIFIFIIFII[FII)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg5 - arg10;
		@Pc(13) int local13 = arg11 - arg6;
		@Pc(17) int local17 = arg8 - arg1;
		@Pc(38) float local38 = arg9[2] * (float) local17 + (float) local5 * arg9[0] + (float) local13 * arg9[1];
		@Pc(59) float local59 = (float) local13 * arg9[4] + arg9[3] * (float) local5 + arg9[5] * (float) local17;
		@Pc(80) float local80 = arg9[8] * (float) local17 + (float) local13 * arg9[7] + (float) local5 * arg9[6];
		@Pc(107) float local107;
		@Pc(100) float local100;
		if (arg3 == 0) {
			local100 = arg4 + 0.5F - local80;
			local107 = arg2 + local38 + 0.5F;
		} else if (arg3 == 1) {
			local107 = arg2 + local38 + 0.5F;
			local100 = arg4 + local80 + 0.5F;
		} else if (arg3 == 2) {
			local100 = arg7 + 0.5F - local59;
			local107 = arg2 + 0.5F - local38;
		} else if (arg3 == 3) {
			local100 = arg7 + 0.5F - local59;
			local107 = local38 + arg2 + 0.5F;
		} else if (arg3 == 4) {
			local107 = local80 + arg4 + 0.5F;
			local100 = arg7 + 0.5F - local59;
		} else {
			local100 = arg7 + 0.5F - local59;
			local107 = arg4 + 0.5F - local80;
		}
		@Pc(199) float local199;
		if (arg0 == 1) {
			local199 = local107;
			local107 = -local100;
			local100 = local199;
		} else if (arg0 == 2) {
			local100 = -local100;
			local107 = -local107;
		} else if (arg0 == 3) {
			local199 = local107;
			local107 = local100;
			local100 = -local199;
		}
		Static67.aFloat19 = local107;
		Static374.aFloat71 = local100;
	}
}
