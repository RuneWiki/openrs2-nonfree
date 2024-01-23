import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "Lclient!jd;")
	public static Class84 aClass84_36;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Lclient!gh;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString93 = "flash3:";

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "[I")
	public static int[] anIntArray141 = new int[14];

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString94 = null;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
	public static int anInt1922 = 0;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString95 = "skill: ";

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method1628() {
		Static95.aClass2_Sub26_Sub1_1.method4287(190);
		for (@Pc(18) Class2_Sub15 local18 = (Class2_Sub15) Static152.aClass79_14.method1992(); local18 != null; local18 = (Class2_Sub15) Static152.aClass79_14.method1991()) {
			if (local18.anInt2420 == 0) {
				Static119.method2202(local18, true);
			}
		}
		if (Static50.aClass115_6 != null) {
			Static298.method4263(Static50.aClass115_6);
			Static50.aClass115_6 = null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method1630(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub3_Sub16 local8 = Static119.method2204(arg1, 3);
		local8.method2718();
		local8.aString162 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!wm;I)V")
	public static void method1631(@OriginalArg(0) Class2_Sub26 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static40.aClass135_3 != null) {
			try {
				Static40.aClass135_3.method3372(0L);
				@Pc(16) int local16 = 0;
				Static40.aClass135_3.method3373(local8);
				while (local16 < 24 && local8[local16] == 0) {
					local16++;
				}
				if (local16 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (@Pc(47) int local47 = 0; local47 < 24; local47++) {
					local8[local47] = -1;
				}
			}
		}
		arg0.method4246(local8, 24);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIILclient!mn;I)V")
	public static void method1632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class115 arg2, @OriginalArg(4) int arg3) {
		Static203.method3422();
		if (Static60.aBoolean106) {
			Static94.method1752(arg0, arg3, arg2.anInt3555 + arg0, arg3 + arg2.anInt3487);
		} else {
			Static160.method2781(arg0, arg3, arg2.anInt3555 + arg0, arg2.anInt3487 + arg3);
		}
		if (Static110.anInt2374 != 2 && Static110.anInt2374 != 5 && Static166.aClass2_Sub3_Sub1_6 != null) {
			@Pc(48) int local48 = Static293.anInt6086 + (int) Static142.aFloat31 & 0x7FF;
			@Pc(58) int local58 = Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32 + 48;
			@Pc(68) int local68 = 464 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
			if (Static60.aBoolean106) {
				((Class2_Sub3_Sub1_Sub2) Static166.aClass2_Sub3_Sub1_6).method617(arg0, arg3, arg2.anInt3555, arg2.anInt3487, local58, local68, local48, Static266.anInt5527 + 256, (Class2_Sub3_Sub1_Sub2) arg2.method2854(false));
			} else {
				((Class2_Sub3_Sub1_Sub1) Static166.aClass2_Sub3_Sub1_6).method4374(arg0, arg3, arg2.anInt3555, arg2.anInt3487, local58, local68, local48, Static266.anInt5527 + 256, arg2.anIntArray269, arg2.anIntArray277);
			}
			@Pc(190) int local190;
			@Pc(150) int local150;
			@Pc(154) int local154;
			@Pc(168) int local168;
			@Pc(219) int local219;
			@Pc(209) int local209;
			@Pc(244) int local244;
			@Pc(276) int local276;
			if (Static104.aClass113_2 != null) {
				for (@Pc(116) int local116 = 0; local116 < Static104.aClass113_2.anInt3429; local116++) {
					if (Static104.aClass113_2.method2822(local116)) {
						local150 = ((Static104.aClass113_2.anIntArray261[local116] & 0x3FFF) + -Static203.anInt4236) * 4 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
						local154 = Class66.anIntArray148[local48];
						@Pc(162) int local162 = local154 * 256 / (Static266.anInt5527 + 256);
						@Pc(164) Class2_Sub3_Sub5 local164 = Static162.aClass2_Sub3_Sub5_2;
						local168 = Class66.anIntArray153[local48];
						local190 = ((Static104.aClass113_2.anIntArray261[local116] >> 14 & 0x3FFF) + -Static125.anInt5772) * 4 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
						@Pc(198) int local198 = local168 * 256 / (Static266.anInt5527 + 256);
						local209 = local198 * local150 - local190 * local162 >> 16;
						local219 = local190 * local198 + local150 * local162 >> 16;
						if (Static104.aClass113_2.method2826(local116) == 1) {
							local164 = Static208.aClass2_Sub3_Sub5_3;
						}
						if (Static104.aClass113_2.method2826(local116) == 2) {
							local164 = Static153.aClass2_Sub3_Sub5_1;
						}
						local244 = local164.method3316(Static104.aClass113_2.aStringArray15[local116], 100);
						local219 -= local244 / 2;
						if (local219 >= -arg2.anInt3555 && arg2.anInt3555 >= local219 && -arg2.anInt3487 <= local209 && arg2.anInt3487 >= local209) {
							local276 = 16777215;
							if (Static104.aClass113_2.anIntArray260[local116] != -1) {
								local276 = Static104.aClass113_2.anIntArray260[local116];
							}
							if (Static60.aBoolean106) {
								Static94.method1759((Class2_Sub3_Sub1_Sub2) arg2.method2854(false));
							} else {
								Static160.method2774(arg2.anIntArray269, arg2.anIntArray277);
							}
							local164.method3313(Static104.aClass113_2.aStringArray15[local116], arg0 + local219 + arg2.anInt3555 / 2, arg3 - (-(arg2.anInt3487 / 2) + local209), local244, 50, local276, 0, 1, 0, 0);
							if (Static60.aBoolean106) {
								Static94.method1753();
							} else {
								Static160.method2784();
							}
						}
					}
				}
			}
			for (local190 = 0; local190 < Static215.anInt4472; local190++) {
				local154 = Static158.anIntArray236[local190] * 4 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
				local150 = Static9.anIntArray13[local190] * 4 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
				@Pc(386) Class143 local386 = Static218.method3692(Static84.anIntArray53[local190]);
				if (local386.anIntArray372 != null) {
					local386 = local386.method3641();
					if (local386 == null || local386.anInt4486 == -1) {
						continue;
					}
				}
				Static201.method3394(arg2, arg0, local154, arg3, Static65.aClass2_Sub3_Sub1Array4[local386.anInt4486], local150);
			}
			for (local190 = 0; local190 < 104; local190++) {
				for (local150 = 0; local150 < 104; local150++) {
					@Pc(440) Class1 local440 = Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local190][local150];
					if (local440 != null) {
						local168 = local190 * 4 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
						local219 = local150 * 4 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
						Static201.method3394(arg2, arg0, local219, arg3, Static64.aClass2_Sub3_Sub1Array3[0], local168);
					}
				}
			}
			for (local190 = 0; local190 < Static71.anInt1550; local190++) {
				@Pc(493) Class36_Sub3_Sub1 local493 = Static201.aClass36_Sub3_Sub1Array1[Static9.anIntArray12[local190]];
				if (local493 != null && local493.method4099()) {
					@Pc(502) Class33 local502 = local493.aClass33_1;
					if (local502 != null && local502.anIntArray55 != null) {
						local502 = local502.method719();
					}
					if (local502 != null && local502.aBoolean66 && local502.aBoolean64) {
						local168 = local493.anInt5093 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
						local219 = local493.anInt5109 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
						if (local502.anInt887 == -1) {
							Static201.method3394(arg2, arg0, local219, arg3, Static64.aClass2_Sub3_Sub1Array3[1], local168);
						} else {
							Static201.method3394(arg2, arg0, local219, arg3, Static65.aClass2_Sub3_Sub1Array4[local502.anInt887], local168);
						}
					}
				}
			}
			for (local190 = 0; local190 < Static68.anInt1507; local190++) {
				@Pc(587) Class36_Sub3_Sub2 local587 = Static212.aClass36_Sub3_Sub2Array1[Static33.anIntArray50[local190]];
				if (local587 != null && local587.method4099()) {
					local154 = local587.anInt5093 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
					local168 = local587.anInt5109 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
					@Pc(618) boolean local618 = false;
					@Pc(623) long local623 = Static61.method2447(local587.aString249);
					for (local244 = 0; local244 < Static151.anInt3192; local244++) {
						if (Static67.aLongArray25[local244] == local623 && Static18.anIntArray29[local244] != 0) {
							local618 = true;
							break;
						}
					}
					@Pc(657) boolean local657 = false;
					for (local276 = 0; local276 < Static25.anInt5780; local276++) {
						if (Static137.aClass2_Sub30Array1[local276].aLong315 == local623) {
							local657 = true;
							break;
						}
					}
					@Pc(679) boolean local679 = false;
					if (Static111.aClass36_Sub3_Sub2_1.anInt5152 != 0 && local587.anInt5152 != 0 && local587.anInt5152 == Static111.aClass36_Sub3_Sub2_1.anInt5152) {
						local679 = true;
					}
					if (local618) {
						Static201.method3394(arg2, arg0, local168, arg3, Static64.aClass2_Sub3_Sub1Array3[3], local154);
					} else if (local657) {
						Static201.method3394(arg2, arg0, local168, arg3, Static64.aClass2_Sub3_Sub1Array3[5], local154);
					} else if (local679) {
						Static201.method3394(arg2, arg0, local168, arg3, Static64.aClass2_Sub3_Sub1Array3[4], local154);
					} else {
						Static201.method3394(arg2, arg0, local168, arg3, Static64.aClass2_Sub3_Sub1Array3[2], local154);
					}
				}
			}
			@Pc(761) Class180[] local761 = Static289.aClass180Array1;
			for (local150 = 0; local150 < local761.length; local150++) {
				@Pc(775) Class180 local775 = local761[local150];
				if (local775 != null && local775.anInt5905 != 0 && Static148.anInt3168 % 20 < 10) {
					if (local775.anInt5905 == 1 && local775.anInt5897 >= 0 && Static201.aClass36_Sub3_Sub1Array1.length > local775.anInt5897) {
						@Pc(815) Class36_Sub3_Sub1 local815 = Static201.aClass36_Sub3_Sub1Array1[local775.anInt5897];
						if (local815 != null) {
							local219 = local815.anInt5093 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
							local209 = local815.anInt5109 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
							Static164.method2843(360000, local775.anInt5904, arg0, local209, arg3, arg2, local219);
						}
					}
					if (local775.anInt5905 == 2) {
						local168 = (local775.anInt5899 - Static125.anInt5772) * 4 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
						local219 = (local775.anInt5902 - Static203.anInt4236) * 4 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
						local209 = local775.anInt5903 * 4;
						local209 *= local209;
						Static164.method2843(local209, local775.anInt5904, arg0, local219, arg3, arg2, local168);
					}
					if (local775.anInt5905 == 10 && local775.anInt5897 >= 0 && local775.anInt5897 < Static212.aClass36_Sub3_Sub2Array1.length) {
						@Pc(928) Class36_Sub3_Sub2 local928 = Static212.aClass36_Sub3_Sub2Array1[local775.anInt5897];
						if (local928 != null) {
							local219 = local928.anInt5093 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
							local209 = local928.anInt5109 / 32 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32;
							Static164.method2843(360000, local775.anInt5904, arg0, local209, arg3, arg2, local219);
						}
					}
				}
			}
			if (Static197.anInt4129 != 0) {
				local190 = Static197.anInt4129 * 4 + (Static111.aClass36_Sub3_Sub2_1.method4097() - 1) * 2 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5093 / 32;
				local150 = Static110.anInt2372 * 4 + Static111.aClass36_Sub3_Sub2_1.method4097() * 2 + 2 - Static111.aClass36_Sub3_Sub2_1.anInt5109 / 32 - 2;
				Static201.method3394(arg2, arg0, local150, arg3, Static105.aClass2_Sub3_Sub1_3, local190);
			}
			if (Static60.aBoolean106) {
				Static94.method1758(arg2.anInt3555 / 2 + arg0 - 1, arg2.anInt3487 / 2 + -1 + arg3, 3, 3, 16777215);
			} else {
				Static160.method2788(arg2.anInt3555 / 2 + arg0 - 1, arg2.anInt3487 / 2 + arg3 + -1, 3, 3, 16777215);
			}
		} else if (Static60.aBoolean106) {
			@Pc(1073) Class2_Sub3_Sub1 local1073 = arg2.method2854(false);
			if (local1073 != null) {
				local1073.method4367(arg0, arg3);
			}
		} else {
			Static160.method2776(arg0, arg3, arg2.anIntArray269, arg2.anIntArray277);
		}
		Static90.aBooleanArray9[arg1] = true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIZBIII)V")
	public static void method1633(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg3 && Static246.anInt5145 == arg5 && arg2 == Static68.anInt1503 && (arg1 == Static8.anInt271 || Static67.method4885())) {
			return;
		}
		Static8.anInt271 = arg1;
		Static246.anInt5145 = arg5;
		Static68.anInt1503 = arg2;
		if (Static67.method4885()) {
			Static8.anInt271 = 0;
		}
		if (arg0) {
			Static21.method453(28);
		} else {
			Static21.method453(25);
		}
		Static264.method4420(true, Static245.aString256);
		@Pc(52) int local52 = Static203.anInt4236;
		Static203.anInt4236 = (arg2 - 6) * 8;
		@Pc(60) int local60 = Static125.anInt5772;
		Static125.anInt5772 = arg5 * 8 - 48;
		Static56.aClass2_Sub3_Sub18_1 = Static293.method4861(Static246.anInt5145 * 8, Static68.anInt1503 * 8);
		@Pc(80) int local80 = Static125.anInt5772 - local60;
		Static104.aClass113_2 = null;
		@Pc(91) int local91 = Static203.anInt4236 - local52;
		@Pc(99) int local99;
		@Pc(108) Class36_Sub3_Sub1 local108;
		@Pc(114) int local114;
		if (arg0) {
			Static71.anInt1550 = 0;
			for (local99 = 0; local99 < 32768; local99++) {
				local108 = Static201.aClass36_Sub3_Sub1Array1[local99];
				if (local108 != null) {
					local108.anInt5109 -= local91 * 128;
					local108.anInt5093 -= local80 * 128;
					if (local108.anInt5093 >= 0 && local108.anInt5093 <= 13184 && local108.anInt5109 >= 0 && local108.anInt5109 <= 13184) {
						for (local114 = 0; local114 < 10; local114++) {
							local108.anIntArray465[local114] -= local80;
							local108.anIntArray468[local114] -= local91;
						}
						Static9.anIntArray12[Static71.anInt1550++] = local99;
					} else {
						Static201.aClass36_Sub3_Sub1Array1[local99].method2418(null);
						Static201.aClass36_Sub3_Sub1Array1[local99] = null;
					}
				}
			}
		} else {
			for (local99 = 0; local99 < 32768; local99++) {
				local108 = Static201.aClass36_Sub3_Sub1Array1[local99];
				if (local108 != null) {
					for (local114 = 0; local114 < 10; local114++) {
						local108.anIntArray465[local114] -= local80;
						local108.anIntArray468[local114] -= local91;
					}
					local108.anInt5093 -= local80 * 128;
					local108.anInt5109 -= local91 * 128;
				}
			}
		}
		for (local99 = 0; local99 < 2048; local99++) {
			@Pc(264) Class36_Sub3_Sub2 local264 = Static212.aClass36_Sub3_Sub2Array1[local99];
			if (local264 != null) {
				for (local114 = 0; local114 < 10; local114++) {
					local264.anIntArray465[local114] -= local80;
					local264.anIntArray468[local114] -= local91;
				}
				local264.anInt5093 -= local80 * 128;
				local264.anInt5109 -= local91 * 128;
			}
		}
		Static208.anInt4335 = arg1;
		Static111.aClass36_Sub3_Sub2_1.method4112(false, arg4, arg6);
		@Pc(319) byte local319 = 104;
		@Pc(321) byte local321 = 0;
		@Pc(323) byte local323 = 1;
		if (local80 < 0) {
			local321 = 103;
			local323 = -1;
			local319 = -1;
		}
		@Pc(336) byte local336 = 0;
		@Pc(338) byte local338 = 104;
		@Pc(340) byte local340 = 1;
		if (local91 < 0) {
			local340 = -1;
			local338 = -1;
			local336 = 103;
		}
		for (@Pc(354) int local354 = local321; local354 != local319; local354 += local323) {
			for (@Pc(363) int local363 = local336; local363 != local338; local363 += local340) {
				@Pc(374) int local374 = local363 + local91;
				@Pc(378) int local378 = local80 + local354;
				for (@Pc(380) int local380 = 0; local380 < 4; local380++) {
					if (local378 >= 0 && local374 >= 0 && local378 < 104 && local374 < 104) {
						Static208.aClass1ArrayArrayArray1[local380][local354][local363] = Static208.aClass1ArrayArrayArray1[local380][local378][local374];
					} else {
						Static208.aClass1ArrayArrayArray1[local380][local354][local363] = null;
					}
				}
			}
		}
		for (@Pc(447) Class2_Sub4 local447 = (Class2_Sub4) Static104.aClass1_10.method13(); local447 != null; local447 = (Class2_Sub4) Static104.aClass1_10.method9()) {
			local447.anInt389 -= local91;
			local447.anInt405 -= local80;
			if (local447.anInt405 < 0 || local447.anInt389 < 0 || local447.anInt405 >= 104 || local447.anInt389 >= 104) {
				local447.method4926();
			}
		}
		if (Static197.anInt4129 != 0) {
			Static197.anInt4129 -= local80;
			Static110.anInt2372 -= local91;
		}
		if (arg0) {
			Static257.anInt5357 -= local91;
			Static216.anInt4483 -= local80;
			Static153.anInt3232 -= local80;
			Static255.anInt5182 -= local91 * 128;
			Static271.anInt5632 -= local80 * 128;
			Static131.anInt2690 -= local91;
		} else {
			Static101.anInt6027 = 1;
		}
		Static151.anInt3191 = 0;
		if (Static60.aBoolean106 && arg0 && (Math.abs(local80) > 104 || Math.abs(local91) > 104)) {
			Static152.method2618();
		}
		Static200.anInt4158 = -1;
		Static197.aClass1_14.method10();
		Static279.aClass1_33.method10();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public static void method1634() {
		Static246.aClass46_33.method1079();
	}
}
