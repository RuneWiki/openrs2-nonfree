import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Lclient!lc;")
	public static Class98 aClass98_57;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString57 = "flash2:";

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Lclient!dh;")
	public static Class33 aClass33_14 = new Class33(4);

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "[I")
	public static int[] anIntArray211 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "[I")
	public static int[] anIntArray212 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
	public static int anInt1961 = 0;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString60 = "Please remove ";

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIBLclient!hm;)V")
	public static void method1524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class63 arg5) {
		@Pc(7) long local7 = 0L;
		if (arg4 == 0) {
			local7 = Static215.method3428(arg0, arg2, arg3);
		} else if (arg4 == 1) {
			local7 = Static217.method3493(arg0, arg2, arg3);
		} else if (arg4 == 2) {
			local7 = Static154.method2467(arg0, arg2, arg3);
		} else if (arg4 == 3) {
			local7 = Static65.method1011(arg0, arg2, arg3);
		}
		@Pc(56) int local56 = Integer.MAX_VALUE & (int) (local7 >>> 32);
		@Pc(71) int local71 = (int) local7 >> 14 & 0x1F;
		@Pc(77) Class47 local77 = Static170.method2683(local56);
		if (local77.method1093()) {
			Static207.method3302(arg2, local77, arg3, arg0);
		}
		@Pc(95) int local95 = (int) local7 >> 20 & 0x3;
		if (local7 == 0L) {
			return;
		}
		@Pc(101) Class12 local101 = null;
		@Pc(103) Class12 local103 = null;
		if (arg4 == 0) {
			@Pc(228) Class43 local228 = Static276.method4108(arg0, arg2, arg3);
			if (local228 != null) {
				local103 = local228.aClass12_4;
				local101 = local228.aClass12_5;
			}
			if (local77.anInt1339 != 0) {
				arg5.method1671(arg3, local95, local77.aBoolean113, !local77.aBoolean105, arg2, local71);
			}
		} else if (arg4 == 1) {
			@Pc(212) Class104 local212 = Static86.method1382(arg0, arg2, arg3);
			if (local212 != null) {
				local101 = local212.aClass12_6;
				local103 = local212.aClass12_7;
			}
		} else if (arg4 == 2) {
			@Pc(147) Class173 local147 = Static181.method1753(arg0, arg2, arg3);
			if (local147 != null) {
				local101 = local147.aClass12_10;
			}
			if (local77.anInt1339 != 0 && arg2 + local77.anInt1327 < 104 && local77.anInt1327 + arg3 < 104 && arg2 + local77.anInt1354 < 104 && local77.anInt1354 + arg3 < 104) {
				arg5.method1666(local95, arg2, arg3, !local77.aBoolean105, local77.aBoolean113, local77.anInt1354, local77.anInt1327);
			}
		} else if (arg4 == 3) {
			@Pc(123) Class135 local123 = Static11.method181(arg0, arg2, arg3);
			if (local123 != null) {
				local101 = local123.aClass12_8;
			}
			if (local77.anInt1339 == 1) {
				arg5.method1672(arg3, arg2);
			}
		}
		if (local77.anIntArray142 != null) {
			local77 = local77.method1096();
		}
		if (!Static178.aBoolean216 || local77 == null || !local77.aBoolean111) {
			return;
		}
		if (local71 == 2) {
			if (local101 instanceof Class12_Sub6) {
				((Class12_Sub6) local101).method3305();
			} else {
				Static212.method3392(arg3, local95 + 4, local71, arg2, 0, 0, arg1, local77);
			}
			if (local103 instanceof Class12_Sub6) {
				((Class12_Sub6) local103).method3305();
			} else {
				Static212.method3392(arg3, local95 + 1 & 0x3, local71, arg2, 0, 0, arg1, local77);
			}
		} else if (local71 == 5) {
			if (local101 instanceof Class12_Sub6) {
				((Class12_Sub6) local101).method3305();
			} else {
				Static212.method3392(arg3, local95, 4, arg2, anIntArray212[local95] * 8, Static145.anIntArray277[local95] * 8, arg1, local77);
			}
		} else if (local71 == 6) {
			if (local101 instanceof Class12_Sub6) {
				((Class12_Sub6) local101).method3305();
			} else {
				Static212.method3392(arg3, local95 + 4, 4, arg2, Static79.anIntArray166[local95] * 8, Static65.anIntArray135[local95] * 8, arg1, local77);
			}
		} else if (local71 == 7) {
			if (local101 instanceof Class12_Sub6) {
				((Class12_Sub6) local101).method3305();
			} else {
				Static212.method3392(arg3, (local95 + 2 & 0x3) + 4, 4, arg2, 0, 0, arg1, local77);
			}
		} else if (local71 == 8) {
			if (local101 instanceof Class12_Sub6) {
				((Class12_Sub6) local101).method3305();
			} else {
				Static212.method3392(arg3, local95 + 4, 4, arg2, Static79.anIntArray166[local95] * 8, Static65.anIntArray135[local95] * 8, arg1, local77);
			}
			if (local103 instanceof Class12_Sub6) {
				((Class12_Sub6) local103).method3305();
			} else {
				Static212.method3392(arg3, (local95 + 2 & 0x3) + 4, 4, arg2, Static79.anIntArray166[local95] * 8, Static65.anIntArray135[local95] * 8, arg1, local77);
			}
		} else if (local71 == 11) {
			if (local101 instanceof Class12_Sub6) {
				((Class12_Sub6) local101).method3305();
			} else {
				Static212.method3392(arg3, local95 + 4, 10, arg2, 0, 0, arg1, local77);
			}
		} else if (local101 instanceof Class12_Sub6) {
			((Class12_Sub6) local101).method3305();
		} else {
			Static212.method3392(arg3, local95, local71, arg2, 0, 0, arg1, local77);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!cc;IB)Ljava/lang/String;")
	public static String method1525(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		if (!Static40.method681(arg0).method2833(arg1) && arg0.anObjectArray10 == null) {
			return null;
		} else if (arg0.aStringArray5 == null || arg0.aStringArray5.length <= arg1 || arg0.aStringArray5[arg1] == null || arg0.aStringArray5[arg1].trim().length() == 0) {
			return Static255.aBoolean311 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray5[arg1];
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!qb;BII)V")
	public static void method1526(@OriginalArg(0) Class12_Sub3_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18;
		if ((arg2 & 0x40) != 0) {
			local18 = Static101.aClass4_Sub17_Sub1_4.method1865();
			@Pc(21) byte[] local21 = new byte[local18];
			@Pc(26) Class4_Sub17 local26 = new Class4_Sub17(local21);
			Static101.aClass4_Sub17_Sub1_4.method1862(local21, local18);
			Static102.aClass4_Sub17Array1[arg1] = local26;
			arg0.method3382(local26);
		}
		if ((arg2 & 0x20) != 0) {
			arg0.aString130 = Static101.aClass4_Sub17_Sub1_4.method1841();
			if (arg0.aString130.charAt(0) == '~') {
				arg0.aString130 = arg0.aString130.substring(1);
				Static271.method4062(arg0.aString130, 2, arg0.method3378());
			} else if (arg0 == Static239.aClass12_Sub3_Sub2_2) {
				Static271.method4062(arg0.aString130, 2, arg0.method3378());
			}
			arg0.anInt4155 = 0;
			arg0.anInt4148 = 0;
			arg0.anInt4180 = 150;
		}
		@Pc(120) int local120;
		if ((arg2 & 0x4) != 0) {
			local18 = Static101.aClass4_Sub17_Sub1_4.method1856();
			local120 = Static101.aClass4_Sub17_Sub1_4.method1872();
			arg0.method3364(local18, local120, Static104.anInt2226);
			arg0.anInt4186 = Static104.anInt2226 + 300;
			arg0.anInt4166 = Static101.aClass4_Sub17_Sub1_4.method1865();
		}
		@Pc(239) int local239;
		if ((arg2 & 0x400) != 0) {
			local18 = Static101.aClass4_Sub17_Sub1_4.method1837();
			if (local18 == 65535) {
				local18 = -1;
			}
			local120 = Static101.aClass4_Sub17_Sub1_4.method1889();
			@Pc(160) boolean local160 = true;
			if (local18 != -1 && arg0.anInt4125 != -1 && Static296.method1376(Static262.method3973(local18).anInt3816).anInt4358 < Static296.method1376(Static262.method3973(arg0.anInt4125).anInt3816).anInt4358) {
				local160 = false;
			}
			if (local160) {
				arg0.anInt4188 = 0;
				arg0.anInt4154 = 0;
				arg0.anInt4158 = 1;
				arg0.anInt4144 = (local120 & 0xFFFF) + Static104.anInt2226;
				arg0.anInt4187 = local120 >> 16;
				if (arg0.anInt4144 > Static104.anInt2226) {
					arg0.anInt4188 = -1;
				}
				arg0.anInt4125 = local18;
				if (arg0.anInt4125 != -1 && Static104.anInt2226 == arg0.anInt4144) {
					local239 = Static262.method3973(arg0.anInt4125).anInt3816;
					if (local239 != -1) {
						@Pc(248) Class141 local248 = Static296.method1376(local239);
						if (local248 != null && local248.anIntArray390 != null) {
							Static11.method188(arg0 == Static239.aClass12_Sub3_Sub2_2, local248, arg0.anInt4141, arg0.anInt4113, 0);
						}
					}
				}
			}
		}
		if ((arg2 & 0x80) != 0) {
			arg0.anInt4184 = Static101.aClass4_Sub17_Sub1_4.method1851();
			if (arg0.anInt4184 == 65535) {
				arg0.anInt4184 = -1;
			}
		}
		if ((arg2 & 0x8) != 0) {
			local18 = Static101.aClass4_Sub17_Sub1_4.method1896();
			if (local18 == 65535) {
				local18 = -1;
			}
			local120 = Static101.aClass4_Sub17_Sub1_4.method1874();
			Static139.method2270(arg0, local120, local18);
		}
		if ((arg2 & 0x2) != 0) {
			arg0.anInt4156 = Static101.aClass4_Sub17_Sub1_4.method1896();
			arg0.anInt4147 = Static101.aClass4_Sub17_Sub1_4.method1837();
		}
		if ((arg2 & 0x200) != 0) {
			local18 = Static101.aClass4_Sub17_Sub1_4.method1856();
			local120 = Static101.aClass4_Sub17_Sub1_4.method1882();
			arg0.method3364(local18, local120, Static104.anInt2226);
		}
		if ((arg2 & 0x10) != 0) {
			local18 = Static101.aClass4_Sub17_Sub1_4.method1837();
			local120 = Static101.aClass4_Sub17_Sub1_4.method1872();
			@Pc(375) int local375 = Static101.aClass4_Sub17_Sub1_4.method1882();
			local239 = Static101.aClass4_Sub17_Sub1_4.anInt2400;
			@Pc(389) boolean local389 = (local18 & 0x8000) != 0;
			if (arg0.aString132 != null && arg0.aClass143_1 != null) {
				@Pc(401) long local401 = Static34.method491(arg0.aString132);
				@Pc(403) boolean local403 = false;
				if (local120 <= 1) {
					if (!local389 && (Static263.aBoolean68 && !Static189.aBoolean321 || Static63.aBoolean91)) {
						local403 = true;
					} else {
						for (@Pc(422) int local422 = 0; local422 < Static297.anInt5497; local422++) {
							if (Static126.aLongArray6[local422] == local401) {
								local403 = true;
								break;
							}
						}
					}
				}
				if (!local403 && Static116.anInt2585 == 0) {
					Static131.aClass4_Sub17_4.anInt2400 = 0;
					@Pc(459) int local459 = -1;
					Static101.aClass4_Sub17_Sub1_4.method1839(local375, Static131.aClass4_Sub17_4.aByteArray30);
					Static131.aClass4_Sub17_4.anInt2400 = 0;
					@Pc(480) String local480;
					if (local389) {
						local18 &= 0x7FFF;
						@Pc(492) Class91 local492 = Static40.method670(Static131.aClass4_Sub17_4);
						local459 = local492.anInt2857;
						local480 = local492.aClass4_Sub2_Sub14_1.method2879(Static131.aClass4_Sub17_4);
					} else {
						local480 = Static293.method4172(Static168.method2663(Static217.method3494(Static131.aClass4_Sub17_4)));
					}
					arg0.aString130 = local480.trim();
					arg0.anInt4180 = 150;
					arg0.anInt4148 = local18 >> 8;
					arg0.anInt4155 = local18 & 0xFF;
					if (local120 == 2) {
						Static25.method381(local459, local480, local389 ? 17 : 1, "<img=1>" + arg0.method3378(), null);
					} else if (local120 == 1) {
						Static25.method381(local459, local480, local389 ? 17 : 1, "<img=0>" + arg0.method3378(), null);
					} else {
						Static25.method381(local459, local480, local389 ? 17 : 2, arg0.method3378(), null);
					}
				}
			}
			Static101.aClass4_Sub17_Sub1_4.anInt2400 = local239 + local375;
		}
		if ((arg2 & 0x800) != 0) {
			local18 = Static101.aClass4_Sub17_Sub1_4.method1865();
			@Pc(605) int[] local605 = new int[local18];
			@Pc(608) int[] local608 = new int[local18];
			@Pc(611) int[] local611 = new int[local18];
			for (@Pc(613) int local613 = 0; local613 < local18; local613++) {
				@Pc(620) int local620 = Static101.aClass4_Sub17_Sub1_4.method1851();
				if (local620 == 65535) {
					local620 = -1;
				}
				local605[local613] = local620;
				local608[local613] = Static101.aClass4_Sub17_Sub1_4.method1872();
				local611[local613] = Static101.aClass4_Sub17_Sub1_4.method1837();
			}
			Static145.method2345(arg0, local611, local605, local608);
		}
		if ((arg2 & 0x100) == 0) {
			return;
		}
		arg0.anInt4128 = Static101.aClass4_Sub17_Sub1_4.method1865();
		arg0.anInt4160 = Static101.aClass4_Sub17_Sub1_4.method1865();
		arg0.anInt4116 = Static101.aClass4_Sub17_Sub1_4.method1874();
		arg0.anInt4145 = Static101.aClass4_Sub17_Sub1_4.method1865();
		arg0.anInt4193 = Static101.aClass4_Sub17_Sub1_4.method1837() + Static104.anInt2226;
		arg0.anInt4137 = Static101.aClass4_Sub17_Sub1_4.method1851() + Static104.anInt2226;
		arg0.anInt4172 = Static101.aClass4_Sub17_Sub1_4.method1874();
		arg0.anInt4157 = 1;
		arg0.anInt4189 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)Lclient!aj;")
	public static Class4_Sub2_Sub2 method1527(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub2_Sub2 local12 = (Class4_Sub2_Sub2) Static129.aClass69_5.method1930((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(23) byte[] local23 = Static80.aClass98_49.method2396(0, arg0);
		if (local23 == null) {
			return null;
		}
		local12 = new Class4_Sub2_Sub2();
		@Pc(42) Class4_Sub17 local42 = new Class4_Sub17(local23);
		local42.anInt2400 = local42.aByteArray30.length - 2;
		@Pc(53) int local53 = local42.method1837();
		@Pc(63) int local63 = local42.aByteArray30.length - local53 - 2 - 12;
		local42.anInt2400 = local63;
		@Pc(70) int local70 = local42.method1889();
		local12.anInt174 = local42.method1837();
		local12.anInt176 = local42.method1837();
		local12.anInt171 = local42.method1837();
		local12.anInt175 = local42.method1837();
		@Pc(94) int local94 = local42.method1874();
		@Pc(106) int local106;
		@Pc(117) int local117;
		if (local94 > 0) {
			local12.aClass97Array1 = new Class97[local94];
			for (local106 = 0; local106 < local94; local106++) {
				local117 = local42.method1837();
				@Pc(124) Class97 local124 = new Class97(Static74.method1127(local117));
				local12.aClass97Array1[local106] = local124;
				while (local117-- > 0) {
					@Pc(139) int local139 = local42.method1889();
					@Pc(143) int local143 = local42.method1889();
					local124.method2364(new Class4_Sub19(local143), (long) local139);
				}
			}
		}
		local42.anInt2400 = 0;
		local12.aString4 = local42.method1883();
		local12.anIntArray16 = new int[local70];
		local106 = 0;
		local12.anIntArray15 = new int[local70];
		local12.aStringArray1 = new String[local70];
		while (local63 > local42.anInt2400) {
			local117 = local42.method1837();
			if (local117 == 3) {
				local12.aStringArray1[local106] = local42.method1841().intern();
			} else if (local117 >= 100 || local117 == 21 || local117 == 38 || local117 == 39) {
				local12.anIntArray15[local106] = local42.method1874();
			} else {
				local12.anIntArray15[local106] = local42.method1889();
			}
			local12.anIntArray16[local106++] = local117;
		}
		Static129.aClass69_5.method1933((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)V")
	public static void method1528(@OriginalArg(1) int arg0) {
		@Pc(4) Class4_Sub2_Sub21 local4 = Static39.method4121(arg0, 6);
		local4.method4361();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!lc;Lclient!lc;)V")
	public static void method1529(@OriginalArg(1) Class98 arg0, @OriginalArg(2) Class98 arg1) {
		Static45.aClass98_25 = arg0;
		Static155.aClass98_92 = arg1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method1530() {
		aClass33_14 = null;
		aClass98_57 = null;
		anIntArray212 = null;
		aString60 = null;
		anIntArray211 = null;
		aString57 = null;
	}
}
