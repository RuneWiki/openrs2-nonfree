import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!la", name = "U", descriptor = "I")
	public static int anInt2438;

	@OriginalMember(owner = "client!la", name = "H", descriptor = "Lclient!ed;")
	public static Class23 aClass23_915 = Static169.method2903("titlebox");

	@OriginalMember(owner = "client!la", name = "L", descriptor = "Lclient!ed;")
	public static Class23 aClass23_916 = Static169.method2903(" (X");

	@OriginalMember(owner = "client!la", name = "N", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!la", name = "R", descriptor = "Lclient!ed;")
	public static Class23 aClass23_917 = Static169.method2903(" )2> ");

	@OriginalMember(owner = "client!la", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[112];

	@OriginalMember(owner = "client!la", name = "W", descriptor = "Lclient!ed;")
	public static Class23 aClass23_918 = Static169.method2903("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4 method1612() {
		@Pc(3) Class1_Sub1_Sub12_Sub4 local3 = new Class1_Sub1_Sub12_Sub4();
		local3.anInt3907 = Static47.anIntArray152[0];
		local3.anInt3904 = Static103.anIntArray346[0];
		local3.anInt3908 = Static62.anInt1654;
		local3.anInt3905 = Static27.anIntArray109[0];
		local3.anInt3906 = Static59.anIntArray226[0];
		local3.anIntArray535 = Static14.anIntArray63;
		local3.aByteArray44 = Static1.aByteArrayArray1[0];
		local3.anInt3903 = Static71.anInt1936;
		Static54.method996();
		return local3;
	}

	@OriginalMember(owner = "client!la", name = "g", descriptor = "(I)Z")
	public static boolean method1613() {
		@Pc(8) long local8 = Static47.method763();
		@Pc(14) int local14 = (int) (local8 - Static161.aLong125);
		if (local14 > 200) {
			local14 = 200;
		}
		Static161.anInt3980 += local14;
		Static161.aLong125 = local8;
		if (Static68.anInt1776 == 0 && Static181.anInt4353 == 0 && Static36.anInt984 == 0 && Static163.anInt4013 == 0) {
			return true;
		} else if (Static26.aClass44_3 == null) {
			return false;
		} else {
			try {
				if (Static161.anInt3980 > 30000) {
					throw new IOException();
				}
				@Pc(62) Class1_Sub1_Sub14 local62;
				@Pc(67) Class1_Sub8 local67;
				while (Static181.anInt4353 < 20 && Static163.anInt4013 > 0) {
					local62 = (Class1_Sub1_Sub14) Static45.aClass10_2.method257();
					local67 = new Class1_Sub8(4);
					local67.method862(1);
					local67.method872((int) local62.aLong140);
					Static26.aClass44_3.method1419(local67.aByteArray12, 4);
					Static182.aClass10_13.method263(local62, local62.aLong140);
					Static163.anInt4013--;
					Static181.anInt4353++;
				}
				while (Static68.anInt1776 < 20 && Static36.anInt984 > 0) {
					local62 = (Class1_Sub1_Sub14) Static149.aClass53_1.method1712();
					local67 = new Class1_Sub8(4);
					local67.method862(0);
					local67.method872((int) local62.aLong140);
					Static26.aClass44_3.method1419(local67.aByteArray12, 4);
					local62.method3149();
					Static123.aClass10_10.method263(local62, local62.aLong140);
					Static36.anInt984--;
					Static68.anInt1776++;
				}
				for (@Pc(168) int local168 = 0; local168 < 100; local168++) {
					@Pc(174) int local174 = Static26.aClass44_3.method1418();
					if (local174 < 0) {
						throw new IOException();
					}
					if (local174 == 0) {
						break;
					}
					Static161.anInt3980 = 0;
					@Pc(189) byte local189 = 0;
					if (Static62.aClass1_Sub1_Sub14_1 == null) {
						local189 = 8;
					} else if (Static115.anInt2962 == 0) {
						local189 = 1;
					}
					@Pc(210) int local210;
					@Pc(234) int local234;
					@Pc(282) int local282;
					@Pc(297) int local297;
					if (local189 > 0) {
						local210 = local189 - Static132.aClass1_Sub8_7.anInt1357;
						if (local174 < local210) {
							local210 = local174;
						}
						Static26.aClass44_3.method1421(local210, Static132.aClass1_Sub8_7.anInt1357, Static132.aClass1_Sub8_7.aByteArray12);
						if (Static122.aByte9 != 0) {
							for (local234 = 0; local234 < local210; local234++) {
								Static132.aClass1_Sub8_7.aByteArray12[Static132.aClass1_Sub8_7.anInt1357 + local234] ^= Static122.aByte9;
							}
						}
						Static132.aClass1_Sub8_7.anInt1357 += local210;
						if (Static132.aClass1_Sub8_7.anInt1357 < local189) {
							break;
						}
						if (Static62.aClass1_Sub1_Sub14_1 == null) {
							Static132.aClass1_Sub8_7.anInt1357 = 0;
							local234 = Static132.aClass1_Sub8_7.method861();
							local282 = Static132.aClass1_Sub8_7.method878();
							@Pc(286) int local286 = Static132.aClass1_Sub8_7.method861();
							@Pc(293) long local293 = (long) (local282 + (local234 << 16));
							local297 = Static132.aClass1_Sub8_7.method868();
							@Pc(303) Class1_Sub1_Sub14 local303 = (Class1_Sub1_Sub14) Static182.aClass10_13.method256(local293);
							Static65.aBoolean187 = true;
							if (local303 == null) {
								local303 = (Class1_Sub1_Sub14) Static123.aClass10_10.method256(local293);
								Static65.aBoolean187 = false;
							}
							if (local303 == null) {
								throw new IOException();
							}
							Static62.aClass1_Sub1_Sub14_1 = local303;
							@Pc(329) int local329 = local286 == 0 ? 5 : 9;
							Static61.aClass1_Sub8_5 = new Class1_Sub8(Static62.aClass1_Sub1_Sub14_1.aByte6 + local329 + local297);
							Static61.aClass1_Sub8_5.method862(local286);
							Static61.aClass1_Sub8_5.method904(local297);
							Static132.aClass1_Sub8_7.anInt1357 = 0;
							Static115.anInt2962 = 8;
						} else if (Static115.anInt2962 == 0) {
							if (Static132.aClass1_Sub8_7.aByteArray12[0] == -1) {
								Static115.anInt2962 = 1;
								Static132.aClass1_Sub8_7.anInt1357 = 0;
							} else {
								Static62.aClass1_Sub1_Sub14_1 = null;
							}
						}
					} else {
						local234 = 512 - Static115.anInt2962;
						local210 = Static61.aClass1_Sub8_5.aByteArray12.length - Static62.aClass1_Sub1_Sub14_1.aByte6;
						if (local234 > local210 - Static61.aClass1_Sub8_5.anInt1357) {
							local234 = local210 - Static61.aClass1_Sub8_5.anInt1357;
						}
						if (local234 > local174) {
							local234 = local174;
						}
						Static26.aClass44_3.method1421(local234, Static61.aClass1_Sub8_5.anInt1357, Static61.aClass1_Sub8_5.aByteArray12);
						if (Static122.aByte9 != 0) {
							for (local282 = 0; local282 < local234; local282++) {
								Static61.aClass1_Sub8_5.aByteArray12[local282 + Static61.aClass1_Sub8_5.anInt1357] ^= Static122.aByte9;
							}
						}
						Static115.anInt2962 += local234;
						Static61.aClass1_Sub8_5.anInt1357 += local234;
						if (Static61.aClass1_Sub8_5.anInt1357 == local210) {
							if (Static62.aClass1_Sub1_Sub14_1.aLong140 == 16711935L) {
								Static95.aClass1_Sub8_6 = Static61.aClass1_Sub8_5;
								for (local282 = 0; local282 < 256; local282++) {
									@Pc(483) Class30_Sub1 local483 = Static135.aClass30_Sub1Array1[local282];
									if (local483 != null) {
										Static95.aClass1_Sub8_6.anInt1357 = local282 * 8 + 5;
										local297 = Static95.aClass1_Sub8_6.method868();
										@Pc(504) int local504 = Static95.aClass1_Sub8_6.method868();
										local483.method1309(local504, local297);
									}
								}
							} else {
								Static53.aCRC32_2.reset();
								Static53.aCRC32_2.update(Static61.aClass1_Sub8_5.aByteArray12, 0, local210);
								local282 = (int) Static53.aCRC32_2.getValue();
								if (local282 != Static62.aClass1_Sub1_Sub14_1.anInt3381) {
									try {
										Static26.aClass44_3.method1417();
									} catch (@Pc(536) Exception local536) {
									}
									Static122.aByte9 = (byte) (Math.random() * 255.0D + 1.0D);
									Static137.anInt3499++;
									Static26.aClass44_3 = null;
									return false;
								}
								Static137.anInt3499 = 0;
								Static46.anInt4321 = 0;
								Static62.aClass1_Sub1_Sub14_1.aClass30_Sub1_12.method1302(Static61.aClass1_Sub8_5.aByteArray12, (int) (Static62.aClass1_Sub1_Sub14_1.aLong140 & 0xFFFFL), (Static62.aClass1_Sub1_Sub14_1.aLong140 & 0xFF0000L) == 16711680L, Static65.aBoolean187);
							}
							Static62.aClass1_Sub1_Sub14_1.method3141();
							Static115.anInt2962 = 0;
							Static62.aClass1_Sub1_Sub14_1 = null;
							Static61.aClass1_Sub8_5 = null;
							if (Static65.aBoolean187) {
								Static181.anInt4353--;
							} else {
								Static68.anInt1776--;
							}
						} else {
							if (Static115.anInt2962 != 512) {
								break;
							}
							Static115.anInt2962 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(621) IOException local621) {
				try {
					Static26.aClass44_3.method1417();
				} catch (@Pc(628) Exception local628) {
				}
				Static46.anInt4321++;
				Static26.aClass44_3 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
	public static boolean method1614(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[B)V")
	public static void method1615(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub8 local10 = new Class1_Sub8(arg0);
		local10.anInt1357 = arg0.length - 2;
		Static110.anInt2830 = local10.method878();
		Static27.anIntArray109 = new int[Static110.anInt2830];
		Static59.anIntArray226 = new int[Static110.anInt2830];
		Static47.anIntArray152 = new int[Static110.anInt2830];
		Static1.aByteArrayArray1 = new byte[Static110.anInt2830][];
		Static103.anIntArray346 = new int[Static110.anInt2830];
		local10.anInt1357 = arg0.length - Static110.anInt2830 * 8 - 7;
		Static62.anInt1654 = local10.method878();
		Static71.anInt1936 = local10.method878();
		@Pc(62) int local62 = (local10.method861() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static110.anInt2830; local64++) {
			Static103.anIntArray346[local64] = local10.method878();
		}
		for (@Pc(82) int local82 = 0; local82 < Static110.anInt2830; local82++) {
			Static59.anIntArray226[local82] = local10.method878();
		}
		for (@Pc(100) int local100 = 0; local100 < Static110.anInt2830; local100++) {
			Static27.anIntArray109[local100] = local10.method878();
		}
		for (@Pc(114) int local114 = 0; local114 < Static110.anInt2830; local114++) {
			Static47.anIntArray152[local114] = local10.method878();
		}
		local10.anInt1357 = arg0.length - Static110.anInt2830 * 8 - (local62 + -1) * 3 - 7;
		Static14.anIntArray63 = new int[local62];
		for (@Pc(155) int local155 = 1; local155 < local62; local155++) {
			Static14.anIntArray63[local155] = local10.method888();
			if (Static14.anIntArray63[local155] == 0) {
				Static14.anIntArray63[local155] = 1;
			}
		}
		local10.anInt1357 = 0;
		for (@Pc(184) int local184 = 0; local184 < Static110.anInt2830; local184++) {
			@Pc(190) int local190 = Static27.anIntArray109[local184];
			@Pc(194) int local194 = Static47.anIntArray152[local184];
			@Pc(198) int local198 = local194 * local190;
			@Pc(201) byte[] local201 = new byte[local198];
			Static1.aByteArrayArray1[local184] = local201;
			@Pc(209) int local209 = local10.method861();
			@Pc(216) int local216;
			if (local209 == 0) {
				for (local216 = 0; local216 < local198; local216++) {
					local201[local216] = local10.method900();
				}
			} else if (local209 == 1) {
				for (local216 = 0; local216 < local190; local216++) {
					for (@Pc(245) int local245 = 0; local245 < local194; local245++) {
						local201[local190 * local245 + local216] = local10.method900();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V")
	public static void method1616() {
		@Pc(22) int local22;
		for (@Pc(12) int local12 = -1; local12 < Static152.anInt3549; local12++) {
			if (local12 == -1) {
				local22 = 2047;
			} else {
				local22 = Static112.anIntArray382[local12];
			}
			@Pc(30) Class1_Sub1_Sub1_Sub1_Sub1 local30 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local30 != null && local30.anInt1844 > 0) {
				local30.anInt1844--;
				if (local30.anInt1844 == 0) {
					local30.aClass23_676 = null;
				}
			}
		}
		for (local22 = 0; local22 < Static86.anInt2307; local22++) {
			@Pc(69) int local69 = Static141.anIntArray476[local22];
			@Pc(73) Class1_Sub1_Sub1_Sub1_Sub2 local73 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local69];
			if (local73 != null && local73.anInt1844 > 0) {
				local73.anInt1844--;
				if (local73.anInt1844 == 0) {
					local73.aClass23_676 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "i", descriptor = "(I)V")
	public static void method1617() {
		aClass23_917 = null;
		aClass23_916 = null;
		aClass23_918 = null;
		aBooleanArray11 = null;
		aClass23_915 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[S[Lclient!ed;)V")
	public static void method1618(@OriginalArg(1) short[] arg0, @OriginalArg(2) Class23[] arg1) {
		Static14.method255(arg1.length - 1, arg1, 0, arg0);
	}
}
