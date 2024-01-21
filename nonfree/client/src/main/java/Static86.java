import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "Lclient!dc;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "Lclient!rc;")
	public static Class3_Sub1_Sub1_Sub3 aClass3_Sub1_Sub1_Sub3_11;

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "Lclient!kb;")
	public static Class9 aClass9_46;

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
	public static int anInt2295 = 0;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "[I")
	public static int[] anIntArray247 = new int[5];

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "Lclient!v;")
	private static Class62 aClass62_1019 = Static45.method753("Your account is already logged in)3");

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_1020 = Static45.method753("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "Lclient!v;")
	public static Class62 aClass62_1021 = Static45.method753("Fallen lassen");

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1022 = Static45.method753("Okay");

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!ra", name = "kb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1023 = Static45.method753("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ra", name = "lb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1024 = Static45.method753("System)2Update in: ");

	@OriginalMember(owner = "client!ra", name = "pb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1025 = aClass62_1019;

	@OriginalMember(owner = "client!ra", name = "tb", descriptor = "I")
	public static int anInt2307 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V")
	public static void method1408(@OriginalArg(0) boolean arg0) {
		if (Static89.anInt2413 == Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 >> 7 && Static55.anInt1539 == Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 >> 7) {
			Static89.anInt2413 = 0;
		}
		@Pc(25) int local25 = Static91.anInt2431;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local25; local35++) {
			@Pc(51) Class3_Sub1_Sub3_Sub1_Sub1 local51;
			@Pc(45) int local45;
			if (arg0) {
				local51 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1;
				local45 = 33538048;
			} else {
				local45 = Static6.anIntArray21[local35] << 14;
				local51 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[Static6.anIntArray21[local35]];
			}
			if (local51 != null && local51.method1153()) {
				@Pc(68) int local68 = local51.anInt1882 >> 7;
				local51.aBoolean74 = false;
				if ((Static92.aBoolean151 && Static91.anInt2431 > 50 || Static91.anInt2431 > 200) && !arg0 && local51.anInt1854 == local51.anInt1847) {
					local51.aBoolean74 = true;
				}
				@Pc(98) int local98 = local51.anInt1887 >> 7;
				if (local68 >= 0 && local68 < 104 && local98 >= 0 && local98 < 104) {
					if (local51.aClass3_Sub1_Sub3_Sub3_1 == null || local51.anInt1353 > Static12.anInt451 || local51.anInt1337 <= Static12.anInt451) {
						if ((local51.anInt1882 & 0x7F) == 64 && (local51.anInt1887 & 0x7F) == 64) {
							if (Static71.anInt1937 == Static63.anIntArrayArray24[local68][local98]) {
								continue;
							}
							Static63.anIntArrayArray24[local68][local98] = Static71.anInt1937;
						}
						local51.anInt1340 = Static91.method1541(local51.anInt1882, local51.anInt1887, Static27.anInt818);
						Static76.aClass1_1.method39(Static27.anInt818, local51.anInt1882, local51.anInt1887, local51.anInt1340, 60, local51, local51.anInt1849, local45, local51.aBoolean109);
					} else {
						local51.aBoolean74 = false;
						local51.anInt1340 = Static91.method1541(local51.anInt1882, local51.anInt1887, Static27.anInt818);
						Static76.aClass1_1.method38(Static27.anInt818, local51.anInt1882, local51.anInt1887, local51.anInt1340, local51, local51.anInt1849, local45, local51.anInt1358, local51.anInt1336, local51.anInt1350, local51.anInt1342);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
	public static void method1409() {
		if (Static55.aClass38_1 == null) {
			return;
		}
		Static76.method1247();
		if (Static22.anInt745 > 0) {
			Static55.aClass38_1.method1586(256);
			Static22.anInt745 = 0;
		}
		Static55.aClass38_1.method1577();
		Static55.aClass38_1 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!vb;III)V")
	public static void method1412(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 * arg2 + arg1 * arg1;
		if (local16 <= 4225 || local16 >= 90000) {
			Static74.method1196(arg1, arg0, arg2);
			return;
		}
		@Pc(36) int local36 = Static99.anInt2602 + Static53.anInt1432 & 0x7FF;
		@Pc(40) int local40 = Static57.anIntArray156[local36];
		@Pc(44) int local44 = Static57.anIntArray161[local36];
		@Pc(52) int local52 = local44 * 256 / (Static42.anInt1215 + 256);
		@Pc(60) int local60 = local40 * 256 / (Static42.anInt1215 + 256);
		@Pc(71) int local71 = local60 * arg2 + arg1 * local52 >> 16;
		@Pc(81) int local81 = local52 * arg2 - local60 * arg1 >> 16;
		@Pc(87) double local87 = Math.atan2((double) local71, (double) local81);
		@Pc(93) int local93 = (int) (Math.sin(local87) * 63.0D);
		@Pc(99) int local99 = (int) (Math.cos(local87) * 57.0D);
		Static104.aClass3_Sub1_Sub1_Sub4_6.method1740(local93 + 88, -local99 + 63, local87);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILclient!vc;)V")
	public static void method1413(@OriginalArg(2) Class3_Sub8_Sub1 arg0) {
		while (true) {
			@Pc(15) Class3_Sub7 local15 = (Class3_Sub7) Static98.aClass24_77.method534();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt1435; local22++) {
				if (local15.aClass54Array1[local22] != null) {
					if (local15.aClass54Array1[local22].anInt2217 == 2) {
						local15.anIntArray117[local22] = -5;
					}
					if (local15.aClass54Array1[local22].anInt2217 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass54Array2[local22] != null) {
					if (local15.aClass54Array2[local22].anInt2217 == 2) {
						local15.anIntArray117[local22] = -6;
					}
					if (local15.aClass54Array2[local22].anInt2217 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1824(40);
			arg0.method1806(0);
			@Pc(99) int local99 = arg0.anInt2704;
			arg0.method1792(local15.anInt1437);
			for (@Pc(106) int local106 = 0; local106 < local15.anInt1435; local106++) {
				if (local15.anIntArray117[local106] == 0) {
					try {
						@Pc(130) int local130 = local15.anIntArray119[local106];
						@Pc(150) Field local150;
						@Pc(153) int local153;
						if (local130 == 0) {
							local150 = (Field) local15.aClass54Array1[local106].anObject3;
							local153 = local150.getInt(null);
							arg0.method1806(0);
							arg0.method1792(local153);
						} else if (local130 == 1) {
							local150 = (Field) local15.aClass54Array1[local106].anObject3;
							local150.setInt(null, local15.anIntArray118[local106]);
							arg0.method1806(0);
						} else if (local130 == 2) {
							local150 = (Field) local15.aClass54Array1[local106].anObject3;
							local153 = local150.getModifiers();
							arg0.method1806(0);
							arg0.method1792(local153);
						}
						@Pc(219) Method local219;
						if (local130 == 3) {
							local219 = (Method) local15.aClass54Array2[local106].anObject3;
							@Pc(244) byte[][] local244 = local15.aByteArrayArrayArray9[local106];
							@Pc(248) Object[] local248 = new Object[local244.length];
							for (@Pc(250) int local250 = 0; local250 < local244.length; local250++) {
								@Pc(262) ObjectInputStream local262 = new ObjectInputStream(new ByteArrayInputStream(local244[local250]));
								local248[local250] = local262.readObject();
							}
							@Pc(277) Object local277 = local219.invoke(null, local248);
							if (local277 == null) {
								arg0.method1806(0);
							} else if (local277 instanceof Number) {
								arg0.method1806(1);
								arg0.method1763(((Number) local277).longValue());
							} else if (local277 instanceof Class62) {
								arg0.method1806(2);
								arg0.method1779((Class62) local277);
							} else {
								arg0.method1806(4);
							}
						} else if (local130 == 4) {
							local219 = (Method) local15.aClass54Array2[local106].anObject3;
							local153 = local219.getModifiers();
							arg0.method1806(0);
							arg0.method1792(local153);
						}
					} catch (@Pc(322) ClassNotFoundException local322) {
						arg0.method1806(-10);
					} catch (@Pc(328) InvalidClassException local328) {
						arg0.method1806(-11);
					} catch (@Pc(334) StreamCorruptedException local334) {
						arg0.method1806(-12);
					} catch (@Pc(340) OptionalDataException local340) {
						arg0.method1806(-13);
					} catch (@Pc(346) IllegalAccessException local346) {
						arg0.method1806(-14);
					} catch (@Pc(352) IllegalArgumentException local352) {
						arg0.method1806(-15);
					} catch (@Pc(360) InvocationTargetException local360) {
						arg0.method1806(-16);
					} catch (@Pc(368) SecurityException local368) {
						arg0.method1806(-17);
					} catch (@Pc(374) IOException local374) {
						arg0.method1806(-18);
					} catch (@Pc(382) NullPointerException local382) {
						arg0.method1806(-19);
					} catch (@Pc(388) Exception local388) {
						arg0.method1806(-20);
					} catch (@Pc(396) Throwable local396) {
						arg0.method1806(-21);
					}
				} else {
					arg0.method1806(local15.anIntArray117[local106]);
				}
			}
			arg0.method1811(local99);
			arg0.method1771(arg0.anInt2704 - local99);
			local15.method1852();
		}
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V")
	public static void method1414() {
		aClass62_1023 = null;
		aClass62_1024 = null;
		aClass62_1025 = null;
		aClass62_1022 = null;
		aClass62_1021 = null;
		aClass14_1 = null;
		aClass3_Sub1_Sub1_Sub3_11 = null;
		aClass62_1019 = null;
		anIntArray247 = null;
		aClass9_46 = null;
		aClass62_1020 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BZ)V")
	public static void method1416(@OriginalArg(1) boolean arg0) {
		Static74.anInt1975++;
		if (Static74.anInt1975 < 50 && !arg0) {
			return;
		}
		Static74.anInt1975 = 0;
		if (Static62.aBoolean96 || Static55.aClass41_2 == null) {
			return;
		}
		Static63.aClass3_Sub8_Sub1_6.method1824(6);
		try {
			Static55.aClass41_2.method1033(Static63.aClass3_Sub8_Sub1_6.aByteArray26, Static63.aClass3_Sub8_Sub1_6.anInt2704);
			Static63.aClass3_Sub8_Sub1_6.anInt2704 = 0;
		} catch (@Pc(47) IOException local47) {
			Static62.aBoolean96 = true;
		}
	}

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "(I)V")
	public static void method1418() {
		Static10.aClass3_Sub8_Sub1_5.method1816();
		@Pc(19) int local19 = Static10.aClass3_Sub8_Sub1_5.method1822(8);
		@Pc(28) int local28;
		if (local19 < Static39.anInt1159) {
			for (local28 = local19; local28 < Static39.anInt1159; local28++) {
				Static105.anIntArray309[Static68.anInt1897++] = Static16.anIntArray52[local28];
			}
		}
		if (Static39.anInt1159 < local19) {
			throw new RuntimeException("gnpov1");
		}
		Static39.anInt1159 = 0;
		for (local28 = 0; local28 < local19; local28++) {
			@Pc(62) int local62 = Static16.anIntArray52[local28];
			@Pc(66) Class3_Sub1_Sub3_Sub1_Sub2 local66 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local62];
			@Pc(71) int local71 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
			if (local71 == 0) {
				Static16.anIntArray52[Static39.anInt1159++] = local62;
				local66.anInt1875 = Static12.anInt451;
			} else {
				@Pc(91) int local91 = Static10.aClass3_Sub8_Sub1_5.method1822(2);
				if (local91 == 0) {
					Static16.anIntArray52[Static39.anInt1159++] = local62;
					local66.anInt1875 = Static12.anInt451;
					Static98.anIntArray283[Static90.anInt2427++] = local62;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local91 == 1) {
						Static16.anIntArray52[Static39.anInt1159++] = local62;
						local66.anInt1875 = Static12.anInt451;
						local133 = Static10.aClass3_Sub8_Sub1_5.method1822(3);
						local66.method1154(local133, false);
						local143 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
						if (local143 == 1) {
							Static98.anIntArray283[Static90.anInt2427++] = local62;
						}
					} else if (local91 == 2) {
						Static16.anIntArray52[Static39.anInt1159++] = local62;
						local66.anInt1875 = Static12.anInt451;
						local133 = Static10.aClass3_Sub8_Sub1_5.method1822(3);
						local66.method1154(local133, true);
						local143 = Static10.aClass3_Sub8_Sub1_5.method1822(3);
						local66.method1154(local143, true);
						@Pc(195) int local195 = Static10.aClass3_Sub8_Sub1_5.method1822(1);
						if (local195 == 1) {
							Static98.anIntArray283[Static90.anInt2427++] = local62;
						}
					} else if (local91 == 3) {
						Static105.anIntArray309[Static68.anInt1897++] = local62;
					}
				}
			}
		}
	}
}
