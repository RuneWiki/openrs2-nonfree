package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public class Class201 {

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "Lclient!gl;")
	static final Class201 aClass201_5 = new Class201(0);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!gl;")
	static final Class201 aClass201_4 = new Class201(1);

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "Lclient!gl;")
	static final Class201 aClass201_3 = new Class201(2);

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
	int anInt3690;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(I)V", line = 9)
	Class201(@OriginalArg(0) int arg0) {
		this.anInt3690 = arg0 * -1854446135;
	}

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "(I)V", line = 13)
	static void method24153() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)Lclient!gl;", line = 14)
	static Class201 method24152(@OriginalArg(0) int arg0) {
		if (aClass201_5.anInt3690 * 1292616825 == arg0) {
			return aClass201_5;
		} else if (aClass201_4.anInt3690 * 1292616825 == arg0) {
			return aClass201_4;
		} else if (aClass201_3.anInt3690 * 1292616825 == arg0) {
			return aClass201_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "(Lclient!kh;Lclient!kg;IIIIIIIIIB)V", line = 32)
	public static void method24155(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		Class73.aClass277_7 = arg0;
		Class209.aClass276_8 = arg1;
		Class73.anInt2133 = arg2 * 1175810631;
		Class73.anInt2134 = arg3 * 955581353;
		Class73.anInt2139 = arg4 * 1529395007;
		Class73.anInt2135 = arg5 * -826806137;
		Class73.anInt2137 = arg6 * -1707206799;
		Class73.anInt2138 = arg7 * 1407211083;
		Class269.anInt4213 = arg8 * 412072151;
		Class485.aClass15_3 = null;
		Class73.aClass15_1 = null;
		Class428.aClass15_2 = null;
		Class289.anInt4365 = arg9 * -734129733;
		Class73.anInt2136 = arg10 * -548738849;
		Class324.method25998();
		Class60_Sub22.aBoolean340 = true;
	}

	@OriginalMember(owner = "client!gl", name = "dy", descriptor = "(Lclient!de;Lclient!agk;Lclient!se;S)V", line = 469)
	static void method24157(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class3_Sub26 arg1, @OriginalArg(2) Class452 arg2) {
		@Pc(4) Class6 local4 = arg2.method28399(arg0);
		if (local4 == null) {
			return;
		}
		@Pc(11) int local11 = local4.method16782();
		if (local4.method16787() > local11) {
			local11 = local4.method16787();
		}
		@Pc(20) byte local20 = 10;
		@Pc(25) int local25 = arg1.anInt1305 * -7401377;
		@Pc(30) int local30 = arg1.anInt1308 * -891551457;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		if (arg2.aString224 != null) {
			local34 = Class340.aClass611_10.method33606(arg2.aString224, Class128.anInt3317 * 2037417253, 0, null);
			local32 = Class340.aClass611_10.method33586(arg2.aString224, Class128.anInt3317 * 2037417253, null);
		}
		@Pc(68) int local68 = local11 / 2 + arg1.anInt1305 * -7401377;
		@Pc(73) int local73 = arg1.anInt1308 * -891551457;
		if (local25 < local11 + Class58_Sub1.anInt1410) {
			local25 = Class58_Sub1.anInt1410;
			local68 = Class58_Sub1.anInt1410 + local11 / 2 + local20 + local32 / 2 + 5;
		} else if (local25 > Class58_Sub1.anInt1426 - local11) {
			local25 = Class58_Sub1.anInt1426 - local11;
			local68 = Class58_Sub1.anInt1426 - local11 / 2 - local20 - local32 / 2 - 5;
		}
		if (local30 < Class58_Sub1.anInt1425 + local11) {
			local30 = Class58_Sub1.anInt1425;
			local73 = local11 / 2 + local20 + Class58_Sub1.anInt1425;
		} else if (local30 > Class58_Sub1.anInt1427 - local11) {
			local30 = Class58_Sub1.anInt1427 - local11;
			local73 = Class58_Sub1.anInt1427 - local11 / 2 - local20 - local34;
		}
		@Pc(176) int local176 = (int) (Math.atan2((double) (local25 - arg1.anInt1305 * -7401377), (double) (local30 - arg1.anInt1308 * -891551457)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local4.method16792((float) local25 + (float) local11 / 2.0F, (float) local11 / 2.0F + (float) local30, 4096, local176);
		@Pc(196) int local196 = -2;
		@Pc(198) int local198 = -2;
		@Pc(200) int local200 = -2;
		@Pc(202) int local202 = -2;
		if (arg2.aString224 != null) {
			local196 = local68 - local32 / 2 - 5;
			local198 = local73;
			local200 = local32 + local196 + 10;
			local202 = local34 + 3 + local73;
			if (arg2.anInt5034 * -1874290321 != 0) {
				arg0.method17063(local196, local73, local200 - local196, local202 - local73, arg2.anInt5034 * -1874290321);
			}
			if (arg2.anInt5035 * -329291339 != 0) {
				arg0.method17062(local196, local73, local200 - local196, local202 - local73, arg2.anInt5035 * -329291339);
			}
			Class3_Sub3.aClass14_5.method3283(arg2.aString224, local68, local73, local32, local34, arg2.anInt5040 * 985187229 | 0xFF000000, Class58_Sub1.aClass484_2.anInt5177 * -260489881, 1, 0, 0, null, null, null, 0, 0);
		}
		if (arg2.anInt5026 * -2127909191 == -1 && arg2.aString224 == null) {
			return;
		}
		@Pc(311) Class3_Sub10 local311 = new Class3_Sub10(arg1);
		local11 >>= 0x1;
		local311.anInt1220 = (local25 - local11) * 1043141073;
		local311.anInt1214 = (local25 + local11) * -1300190211;
		local311.anInt1215 = (local30 - local11) * -190619361;
		local311.anInt1219 = (local11 + local30) * 687886947;
		local311.anInt1217 = local196 * -120575679;
		local311.anInt1218 = local200 * 1967039075;
		local311.anInt1213 = local198 * 1579808205;
		local311.anInt1216 = local202 * 2105674693;
		Class269.aClass553_55.method32702(local311);
	}

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "(II)Ljava/lang/String;", line = 574)
	static String method24156(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!gl", name = "ad", descriptor = "(IIIIIIILclient!amn;Lclient!dw;Lclient!yx;IIB)V", line = 1192)
	static void method24158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub1_Sub9 arg7, @OriginalArg(8) Class14 arg8, @OriginalArg(9) Class611 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 > arg2 && arg0 < arg4 + arg2 && arg1 > arg6 - arg9.anInt5537 * -1760037867 - 1 && arg1 < arg9.anInt5536 * -1990992757 + arg6) {
			arg10 = arg11;
		}
		@Pc(31) String local31 = Class13_Sub22.method7254(arg7);
		arg8.method3288(local31, arg2 + 3, arg6, arg10, 0, client.aRandom1, Class634.anInt5593, Class354.aClass6Array13, Class43.anIntArray163);
	}

	@OriginalMember(owner = "client!gl", name = "la", descriptor = "(Ljava/lang/String;Lclient!vs;I)[I", line = 6102)
	static final int[] method24159(@OriginalArg(0) String arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(1) int[] local1 = null;
		if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
			@Pc(25) int local25 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381];
			if (local25 > 0) {
				local1 = new int[local25];
				while (local25-- > 0) {
					local1[local25] = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381];
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!gl", name = "anw", descriptor = "(Lclient!vs;I)V", line = 11527)
	static final void method24154(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub25_1.method13808();
	}
}
