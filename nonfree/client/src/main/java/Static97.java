import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!d;")
	public static Class14 aClass14_5;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static int anInt2526;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!k;")
	public static Canvas_Sub1 aCanvas_Sub1_1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZZI)I", line = 5)
	public static int method1668() {
		return Class2_Sub2_Sub12_Sub1_Sub2.anInt2333 + Class3.anInt34;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lclient!hb;", line = 22)
	public static Class2_Sub2_Sub8 method1669(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub2_Sub8 local18 = (Class2_Sub2_Sub8) Class49.aClass47_16.method1325((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static38.aClass5_13.method68(arg0, 10);
		local18 = new Class2_Sub2_Sub8();
		local18.anInt954 = arg0;
		if (local28 != null) {
			local18.method724(new Class2_Sub3(local28));
		}
		local18.method716();
		if (local18.anInt932 != -1) {
			local18.method721(method1669(local18.anInt956), method1669(local18.anInt932));
		}
		if (!Static40.aBoolean150 && local18.aBoolean66) {
			local18.aClass40Array16 = null;
			local18.aClass40Array17 = null;
			local18.aClass40_290 = Class9.aClass40_65;
			local18.aClass40_289 = Class2_Sub2_Sub5.aClass40_181;
			local18.anInt951 = 0;
		}
		Class49.aClass47_16.method1332((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 64)
	public static void method1670() {
		aCanvas_Sub1_1 = null;
		Class64.aClass40_726 = null;
		Class64.aClass6_7 = null;
		Class64.aClass40_728 = null;
		Class64.aClass40_725 = null;
		Class64.aClass40_727 = null;
		Class64.aClass40_729 = null;
		aByteArrayArray12 = null;
		aClass14_5 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 82)
	public static void method1671() {
		Class2_Sub2_Sub3.aBoolean27 = true;
		Class2_Sub2_Sub1.aLong12 = 0L;
		Class2_Sub2_Sub13.anInt1612 = 0;
		Static89.aBoolean174 = true;
		Static41.aClass52_1.anInt1982 = 0;
		Static92.method1584();
		Class6.anInt231 = 0;
		Class53.anInt1986 = -1;
		Class47.aClass2_Sub3_Sub1_4.anInt2546 = 0;
		Class54.anInt2083 = -1;
		Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 = 0;
		Class2_Sub12.aBoolean175 = false;
		Class2_Sub12.anInt2352 = -1;
		Class52.anInt1973 = 0;
		Class38.anInt1672 = 0;
		Class2_Sub6.anInt797 = 0;
		Class2_Sub2_Sub7.anInt788 = -1;
		Class57.anInt2139 = 0;
		Static35.method722(0);
		for (@Pc(1645) int local1645 = 0; local1645 < 100; local1645++) {
			Class2_Sub2_Sub13.aClass40Array30[local1645] = null;
		}
		Class2_Sub3.anInt2590 = -1;
		Class63.anInt2518 = (int) (Math.random() * 100.0D) - 50;
		Class41.anInt1800 = 0;
		Class2_Sub2_Sub12_Sub1_Sub2.anInt2328 = 0;
		Class25.anInt986 = 0;
		Class47.anInt1919 = 0;
		Class9.anInt262 = (int) (Math.random() * 80.0D) - 40;
		Class38.anInt1669 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Class12_Sub1.anInt1857 = (int) (Math.random() * 30.0D) - 20;
		Class18.anInt1874 = 0;
		Class5_Sub1.anInt131 = 0;
		Class54.anInt2067 = 0;
		Class2_Sub2_Sub5.anInt641 = 0;
		Class60.anInt2371 = (int) (Math.random() * 110.0D) - 55;
		Class52.anInt1978 = (int) (Math.random() * 120.0D) - 60;
		for (@Pc(1726) int local1726 = 0; local1726 < 2048; local1726++) {
			Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local1726] = null;
			Class32.aClass2_Sub3Array1[local1726] = null;
		}
		for (@Pc(1744) int local1744 = 0; local1744 < 16384; local1744++) {
			Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local1744] = null;
		}
		Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[2047] = new Class2_Sub2_Sub12_Sub1_Sub1();
		Class2_Sub2_Sub5.aClass44_4.method1222();
		Class2_Sub2_Sub12_Sub1_Sub2.aClass44_8.method1222();
		@Pc(1776) int local1776;
		for (@Pc(1772) int local1772 = 0; local1772 < 4; local1772++) {
			for (local1776 = 0; local1776 < 104; local1776++) {
				for (@Pc(1780) int local1780 = 0; local1780 < 104; local1780++) {
					Class57.aClass44ArrayArrayArray1[local1772][local1776][local1780] = null;
				}
			}
		}
		Class45_Sub1.aClass44_7 = new Class44();
		Class2_Sub3.anInt2594 = 0;
		Class2_Sub2_Sub10.anInt1038 = 0;
		Static75.method1350(Class25.anInt980);
		Class25.anInt980 = -1;
		Static75.method1350(Class53.anInt1994);
		Class53.anInt1994 = -1;
		Static75.method1350(Class2_Sub3.anInt2585);
		Class2_Sub3.anInt2585 = -1;
		Static75.method1350(Class52.anInt1971);
		Class52.anInt1971 = -1;
		Static75.method1350(Class58.anInt2175);
		Class58.anInt2175 = -1;
		Static75.method1350(Class37.anInt1654);
		Class37.anInt1654 = -1;
		Static75.method1350(Class4.anInt51);
		Class35.anInt1551 = 3;
		Class61.anInt2399 = 0;
		Class18_Sub1.aBoolean40 = false;
		Class62.anInt2492 = -1;
		Class24.anInt2505 = 0;
		Class42.aBoolean146 = false;
		Class14.aClass40_112 = null;
		Class2_Sub12.aBoolean175 = false;
		Class4.anInt51 = -1;
		Class25.aClass33_1.method1001(false, new int[5], -1, null);
		for (local1776 = 0; local1776 < 5; local1776++) {
			Class11.aClass40Array6[local1776] = null;
			Class2_Sub2.aBooleanArray41[local1776] = false;
		}
		Class44.aBoolean147 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(JI)V", line = 1011)
	public static void method1672(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 1055)
	public static void method1673() {
		@Pc(9) int local9;
		if (Class2_Sub2_Sub14.anInt2061 > 0) {
			for (local9 = 0; local9 < 256; local9++) {
				if (Class2_Sub2_Sub14.anInt2061 > 768) {
					Static84.anIntArray472[local9] = Static45.method1534(Static35.anIntArray182[local9], 1024 - Class2_Sub2_Sub14.anInt2061, Static64.anIntArray355[local9]);
				} else if (Class2_Sub2_Sub14.anInt2061 <= 256) {
					Static84.anIntArray472[local9] = Static45.method1534(Static64.anIntArray355[local9], 256 - Class2_Sub2_Sub14.anInt2061, Static35.anIntArray182[local9]);
				} else {
					Static84.anIntArray472[local9] = Static64.anIntArray355[local9];
				}
			}
		} else if (Class2_Sub2_Sub12.anInt2254 <= 0) {
			for (local9 = 0; local9 < 256; local9++) {
				Static84.anIntArray472[local9] = Static35.anIntArray182[local9];
			}
		} else {
			for (local9 = 0; local9 < 256; local9++) {
				if (Class2_Sub2_Sub12.anInt2254 > 768) {
					Static84.anIntArray472[local9] = Static45.method1534(Static35.anIntArray182[local9], 1024 - Class2_Sub2_Sub12.anInt2254, Static66.anIntArray406[local9]);
				} else if (Class2_Sub2_Sub12.anInt2254 > 256) {
					Static84.anIntArray472[local9] = Static66.anIntArray406[local9];
				} else {
					Static84.anIntArray472[local9] = Static45.method1534(Static66.anIntArray406[local9], 256 - Class2_Sub2_Sub12.anInt2254, Static35.anIntArray182[local9]);
				}
			}
		}
		for (local9 = 0; local9 < 33920; local9++) {
			Static56.aClass45_24.anIntArray471[local9] = Static10.aClass2_Sub2_Sub2_Sub4_1.anIntArray534[local9];
		}
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 1152;
		@Pc(181) int local181;
		@Pc(185) int local185;
		@Pc(198) int local198;
		@Pc(205) int local205;
		@Pc(215) int local215;
		@Pc(219) int local219;
		@Pc(228) int local228;
		for (@Pc(168) int local168 = 1; local168 < 255; local168++) {
			local181 = (256 - local168) * Class2_Sub2_Sub7.anIntArray152[local168] / 256;
			local185 = local181 + 22;
			if (local185 < 0) {
				local185 = 0;
			}
			local164 += local185;
			for (local198 = local185; local198 < 128; local198++) {
				local205 = Static95.anIntArray547[local164++];
				if (local205 == 0) {
					local166++;
				} else {
					local215 = local205;
					local219 = 256 - local205;
					local205 = Static84.anIntArray472[local205];
					local228 = Static56.aClass45_24.anIntArray471[local166];
					Static56.aClass45_24.anIntArray471[local166++] = (local215 * (local205 & 0xFF00FF) + (local228 & 0xFF00FF) * local219 & 0xFF00FF00) + ((local228 & 0xFF00) * local219 + local215 * (local205 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local166 += local185;
		}
		local166 = 1176;
		for (local181 = 0; local181 < 33920; local181++) {
			Static90.aClass45_30.anIntArray471[local181] = Static88.aClass2_Sub2_Sub2_Sub4_9.anIntArray534[local181];
		}
		local164 = 0;
		for (local185 = 1; local185 < 255; local185++) {
			local198 = (256 - local185) * Class2_Sub2_Sub7.anIntArray152[local185] / 256;
			local166 += local198;
			local205 = 103 - local198;
			for (local215 = 0; local215 < local205; local215++) {
				local219 = Static95.anIntArray547[local164++];
				if (local219 == 0) {
					local166++;
				} else {
					local228 = local219;
					@Pc(357) int local357 = 256 - local219;
					local219 = Static84.anIntArray472[local219];
					@Pc(366) int local366 = Static90.aClass45_30.anIntArray471[local166];
					Static90.aClass45_30.anIntArray471[local166++] = (local228 * (local219 & 0xFF00) + local357 * (local366 & 0xFF00) & 0xFF0000) + (local228 * (local219 & 0xFF00FF) + ((local366 & 0xFF00FF) * local357) & 0xFF00FF00) >> 8;
				}
			}
			local164 += 128 - local205;
			local166 += 128 - local198 - local205;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIBIII)V", line = 1222)
	public static void method1674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = Static85.aClass55_1.method1459(arg0, arg4, arg3);
		@Pc(40) int local40;
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(11) int local11;
		@Pc(33) int local33;
		@Pc(59) int local59;
		if (local7 != 0) {
			local11 = arg1;
			if (local7 > 0) {
				local11 = arg2;
			}
			local33 = (103 - arg3) * 4 * 512 + arg4 * 4 + 24624;
			local40 = Static85.aClass55_1.method1449(arg0, arg4, arg3, local7);
			local46 = local40 >> 6 & 0x3;
			@Pc(49) int[] local49 = Static85.aClass2_Sub2_Sub2_Sub4_8.anIntArray534;
			local53 = local40 & 0x1F;
			local59 = local7 >> 14 & 0x7FFF;
			@Pc(63) Class2_Sub2_Sub10 local63 = Static83.method1470(local59);
			if (local63.anInt1039 == -1) {
				if (local53 == 0 || local53 == 2) {
					if (local46 == 0) {
						local49[local33] = local11;
						local49[local33 + 512] = local11;
						local49[local33 + 1024] = local11;
						local49[local33 + 1536] = local11;
					} else if (local46 == 1) {
						local49[local33] = local11;
						local49[local33 + 1] = local11;
						local49[local33 + 2] = local11;
						local49[local33 + 3] = local11;
					} else if (local46 == 2) {
						local49[local33 + 3] = local11;
						local49[local33 + 515] = local11;
						local49[local33 + 1027] = local11;
						local49[local33 + 1536 + 3] = local11;
					} else if (local46 == 3) {
						local49[local33 + 1536] = local11;
						local49[local33 + 1 + 1536] = local11;
						local49[local33 + 2 + 1536] = local11;
						local49[local33 + 3 + 1536] = local11;
					}
				}
				if (local53 == 3) {
					if (local46 == 0) {
						local49[local33] = local11;
					} else if (local46 == 1) {
						local49[local33 + 3] = local11;
					} else if (local46 == 2) {
						local49[local33 + 3 + 1536] = local11;
					} else if (local46 == 3) {
						local49[local33 + 1536] = local11;
					}
				}
				if (local53 == 2) {
					if (local46 == 3) {
						local49[local33] = local11;
						local49[local33 + 512] = local11;
						local49[local33 + 1024] = local11;
						local49[local33 + 1536] = local11;
					} else if (local46 == 0) {
						local49[local33] = local11;
						local49[local33 + 1] = local11;
						local49[local33 + 2] = local11;
						local49[local33 + 3] = local11;
					} else if (local46 == 1) {
						local49[local33 + 3] = local11;
						local49[local33 + 515] = local11;
						local49[local33 + 1024 + 3] = local11;
						local49[local33 + 1536 + 3] = local11;
					} else if (local46 == 2) {
						local49[local33 + 1536] = local11;
						local49[local33 + 1536 + 1] = local11;
						local49[local33 + 1538] = local11;
						local49[local33 + 1536 + 3] = local11;
					}
				}
			} else {
				@Pc(73) Class2_Sub2_Sub2_Sub3 local73 = Static51.aClass2_Sub2_Sub2_Sub3Array15[local63.anInt1039];
				if (local73 != null) {
					@Pc(85) int local85 = (local63.anInt1036 * 4 - local73.anInt1905) / 2;
					@Pc(95) int local95 = (local63.anInt1040 * 4 - local73.anInt1910) / 2;
					local73.method1320(local85 + arg4 * 4 + 48, local95 + (-local63.anInt1040 + -arg3 + 104) * 4 + 48);
				}
			}
		}
		local7 = Static85.aClass55_1.method1429(arg0, arg4, arg3);
		if (local7 != 0) {
			local40 = Static85.aClass55_1.method1449(arg0, arg4, arg3, local7);
			local53 = local40 & 0x1F;
			local46 = local40 >> 6 & 0x3;
			local11 = local7 >> 14 & 0x7FFF;
			@Pc(457) Class2_Sub2_Sub10 local457 = Static83.method1470(local11);
			@Pc(492) int local492;
			if (local457.anInt1039 != -1) {
				@Pc(565) Class2_Sub2_Sub2_Sub3 local565 = Static51.aClass2_Sub2_Sub2_Sub3Array15[local457.anInt1039];
				if (local565 != null) {
					local59 = (local457.anInt1036 * 4 - local565.anInt1905) / 2;
					local492 = (local457.anInt1040 * 4 - local565.anInt1910) / 2;
					local565.method1320(arg4 * 4 + local59 + 48, local492 + (104 - arg3 - local457.anInt1040) * 4 + 48);
				}
			} else if (local53 == 9) {
				local33 = 15658734;
				if (local7 > 0) {
					local33 = 15597568;
				}
				@Pc(477) int[] local477 = Static85.aClass2_Sub2_Sub2_Sub4_8.anIntArray534;
				local492 = arg4 * 4 + (-arg3 + 103) * 512 * 4 + 24624;
				if (local46 == 0 || local46 == 2) {
					local477[local492 + 1536] = local33;
					local477[local492 + 1024 + 1] = local33;
					local477[local492 + 2 + 512] = local33;
					local477[local492 + 3] = local33;
				} else {
					local477[local492] = local33;
					local477[local492 + 513] = local33;
					local477[local492 + 1024 + 2] = local33;
					local477[local492 + 3 + 1536] = local33;
				}
			}
		}
		local7 = Static85.aClass55_1.method1458(arg0, arg4, arg3);
		if (local7 == 0) {
			return;
		}
		local40 = local7 >> 14 & 0x7FFF;
		@Pc(633) Class2_Sub2_Sub10 local633 = Static83.method1470(local40);
		if (local633.anInt1039 == -1) {
			return;
		}
		@Pc(642) Class2_Sub2_Sub2_Sub3 local642 = Static51.aClass2_Sub2_Sub2_Sub3Array15[local633.anInt1039];
		if (local642 != null) {
			local11 = (local633.anInt1036 * 4 - local642.anInt1905) / 2;
			@Pc(665) int local665 = (local633.anInt1040 * 4 - local642.anInt1910) / 2;
			local642.method1320(local11 + arg4 * 4 + 48, local665 + (-local633.anInt1040 + 104 - arg3) * 4 + 48);
			return;
		}
	}
}
