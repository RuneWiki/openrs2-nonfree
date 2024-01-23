import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	public static int anInt2030;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!ok;")
	public static Class116 aClass116_4;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public static int anInt2033;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray42;

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
	public static int anInt2037;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	public static int anInt2031 = 1;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Z")
	public static boolean aBoolean109 = false;

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString59 = "Loading interfaces - ";

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
	public static void method1515() {
		if (Static209.anInt4636 == 0 || Static209.anInt4636 == 5) {
			return;
		}
		try {
			if (++Static81.anInt1946 > 2000) {
				if (Static22.aClass41_1 != null) {
					Static22.aClass41_1.method1062();
					Static22.aClass41_1 = null;
				}
				if (Static54.anInt1455 >= 1) {
					Static209.anInt4636 = 0;
					Static275.anInt5910 = -5;
					return;
				}
				Static81.anInt1946 = 0;
				if (Static206.anInt4590 == Static15.anInt393) {
					Static206.anInt4590 = Static98.anInt2195;
				} else {
					Static206.anInt4590 = Static15.anInt393;
				}
				Static54.anInt1455++;
				Static209.anInt4636 = 1;
			}
			if (Static209.anInt4636 == 1) {
				Static36.aClass43_1 = Static43.aClass66_1.method1616(Static206.anInt4590, Static194.aString136);
				Static209.anInt4636 = 2;
			}
			if (Static209.anInt4636 == 2) {
				if (Static36.aClass43_1.anInt1456 == 2) {
					throw new IOException();
				}
				if (Static36.aClass43_1.anInt1456 != 1) {
					return;
				}
				Static22.aClass41_1 = new Class41((Socket) Static36.aClass43_1.anObject3, Static43.aClass66_1);
				Static36.aClass43_1 = null;
				@Pc(112) long local112 = Static31.aLong36 = Static94.method4774(Static37.aString39);
				Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
				Static81.aClass1_Sub16_Sub1_1.method2621(14);
				@Pc(126) int local126 = (int) (local112 >> 16 & 0x1FL);
				Static81.aClass1_Sub16_Sub1_1.method2621(local126);
				Static22.aClass41_1.method1068(Static81.aClass1_Sub16_Sub1_1.aByteArray39, 2);
				if (Static273.aClass9_2 != null) {
					Static273.aClass9_2.method4341();
				}
				if (Static264.aClass9_1 != null) {
					Static264.aClass9_1.method4341();
				}
				@Pc(152) int local152 = Static22.aClass41_1.method1066();
				if (Static273.aClass9_2 != null) {
					Static273.aClass9_2.method4341();
				}
				if (Static264.aClass9_1 != null) {
					Static264.aClass9_1.method4341();
				}
				if (local152 != 0) {
					Static275.anInt5910 = local152;
					Static209.anInt4636 = 0;
					Static22.aClass41_1.method1062();
					Static22.aClass41_1 = null;
					return;
				}
				Static209.anInt4636 = 3;
			}
			if (Static209.anInt4636 == 3) {
				if (Static22.aClass41_1.method1067() < 8) {
					return;
				}
				Static22.aClass41_1.method1059(8, Static222.aClass1_Sub16_Sub1_3.aByteArray39, 0);
				@Pc(203) int[] local203 = new int[4];
				Static222.aClass1_Sub16_Sub1_3.anInt3328 = 0;
				Static172.aLong139 = Static222.aClass1_Sub16_Sub1_3.method2602();
				local203[3] = (int) Static172.aLong139;
				local203[0] = (int) (Math.random() * 9.9999999E7D);
				local203[2] = (int) (Static172.aLong139 >> 32);
				local203[1] = (int) (Math.random() * 9.9999999E7D);
				Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
				Static81.aClass1_Sub16_Sub1_1.method2621(10);
				Static81.aClass1_Sub16_Sub1_1.method2606(local203[0]);
				Static81.aClass1_Sub16_Sub1_1.method2606(local203[1]);
				Static81.aClass1_Sub16_Sub1_1.method2606(local203[2]);
				Static81.aClass1_Sub16_Sub1_1.method2606(local203[3]);
				Static81.aClass1_Sub16_Sub1_1.method2631(Static94.method4774(Static37.aString39));
				Static81.aClass1_Sub16_Sub1_1.method2630(Static234.aString162);
				Static81.aClass1_Sub16_Sub1_1.method2604(Static270.aBigInteger2, Static135.aBigInteger1);
				Static136.aClass1_Sub16_Sub1_2.anInt3328 = 0;
				if (Static279.anInt5968 == 40) {
					Static136.aClass1_Sub16_Sub1_2.method2621(18);
				} else {
					Static136.aClass1_Sub16_Sub1_2.method2621(16);
				}
				Static136.aClass1_Sub16_Sub1_2.method2624(Static81.aClass1_Sub16_Sub1_1.anInt3328 + Static224.method3926(Static24.aString15) + 163);
				Static136.aClass1_Sub16_Sub1_2.method2606(545);
				Static136.aClass1_Sub16_Sub1_2.method2621(Static126.anInt2810);
				Static136.aClass1_Sub16_Sub1_2.method2621(Static40.aBoolean105 ? 1 : 0);
				Static136.aClass1_Sub16_Sub1_2.method2621(1);
				Static136.aClass1_Sub16_Sub1_2.method2621(Static277.method4610());
				Static136.aClass1_Sub16_Sub1_2.method2624(Static193.anInt4370);
				Static136.aClass1_Sub16_Sub1_2.method2624(Static144.anInt3368);
				Static136.aClass1_Sub16_Sub1_2.method2621(Static171.anInt3870);
				Static111.method1794(Static136.aClass1_Sub16_Sub1_2);
				Static136.aClass1_Sub16_Sub1_2.method2630(Static24.aString15);
				Static136.aClass1_Sub16_Sub1_2.method2606(Static178.anInt4015);
				Static136.aClass1_Sub16_Sub1_2.method2606(Static107.method1746());
				Static134.aBoolean153 = true;
				Static136.aClass1_Sub16_Sub1_2.method2624(Static173.anInt3933);
				Static136.aClass1_Sub16_Sub1_2.method2606(Static68.aClass83_44.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static13.aClass83_15.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static90.aClass83_56.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static114.aClass83_75.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static80.aClass83_49.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static78.aClass83_47.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static210.aClass83_139.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static285.aClass83_199.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static33.aClass83_20.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static11.aClass83_91.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static129.aClass83_88.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static231.aClass83_172.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static167.aClass83_119.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static259.aClass83_179.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static91.aClass83_58.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static245.aClass83_166.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static119.aClass83_81.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static216.aClass83_143.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static96.aClass83_62.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static217.aClass83_145.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static179.aClass83_123.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static243.aClass83_164.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static247.aClass83_169.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static241.aClass83_162.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static230.aClass83_155.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static265.aClass83_188.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static91.aClass83_59.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static298.aClass83_205.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2606(Static100.aClass83_185.method2315());
				Static136.aClass1_Sub16_Sub1_2.method2623(Static81.aClass1_Sub16_Sub1_1.anInt3328, Static81.aClass1_Sub16_Sub1_1.aByteArray39);
				Static22.aClass41_1.method1068(Static136.aClass1_Sub16_Sub1_2.aByteArray39, Static136.aClass1_Sub16_Sub1_2.anInt3328);
				Static81.aClass1_Sub16_Sub1_1.method2673(local203);
				for (@Pc(565) int local565 = 0; local565 < 4; local565++) {
					local203[local565] += 50;
				}
				Static222.aClass1_Sub16_Sub1_3.method2673(local203);
				Static209.anInt4636 = 4;
			}
			if (Static209.anInt4636 == 4) {
				if (Static22.aClass41_1.method1067() < 1) {
					return;
				}
				@Pc(600) int local600 = Static22.aClass41_1.method1066();
				if (local600 == 21) {
					Static209.anInt4636 = 7;
				} else if (local600 == 29) {
					Static209.anInt4636 = 10;
				} else if (local600 == 1) {
					Static275.anInt5910 = local600;
					Static209.anInt4636 = 5;
					return;
				} else if (local600 == 2) {
					Static209.anInt4636 = 8;
				} else if (local600 == 15) {
					Static275.anInt5910 = local600;
					Static209.anInt4636 = 0;
					return;
				} else if (local600 == 23 && Static54.anInt1455 < 1) {
					Static81.anInt1946 = 0;
					Static209.anInt4636 = 1;
					Static54.anInt1455++;
					Static22.aClass41_1.method1062();
					Static22.aClass41_1 = null;
					return;
				} else {
					Static275.anInt5910 = local600;
					Static209.anInt4636 = 0;
					Static22.aClass41_1.method1062();
					Static22.aClass41_1 = null;
					return;
				}
			}
			if (Static209.anInt4636 == 6) {
				Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
				Static81.aClass1_Sub16_Sub1_1.method2676(17);
				Static22.aClass41_1.method1068(Static81.aClass1_Sub16_Sub1_1.aByteArray39, Static81.aClass1_Sub16_Sub1_1.anInt3328);
				Static209.anInt4636 = 4;
				return;
			}
			if (Static209.anInt4636 == 7) {
				if (Static22.aClass41_1.method1067() < 1) {
					return;
				}
				Static158.anInt3656 = (Static22.aClass41_1.method1066() + 3) * 60;
				Static275.anInt5910 = 21;
				Static209.anInt4636 = 0;
				Static22.aClass41_1.method1062();
				Static22.aClass41_1 = null;
				return;
			}
			if (Static209.anInt4636 == 10) {
				if (Static22.aClass41_1.method1067() >= 1) {
					Static213.anInt4718 = Static22.aClass41_1.method1066();
					Static209.anInt4636 = 0;
					Static275.anInt5910 = 29;
					Static22.aClass41_1.method1062();
					Static22.aClass41_1 = null;
					return;
				}
				return;
			}
			if (Static209.anInt4636 == 8) {
				if (Static22.aClass41_1.method1067() < 14) {
					return;
				}
				Static22.aClass41_1.method1059(14, Static222.aClass1_Sub16_Sub1_3.aByteArray39, 0);
				Static222.aClass1_Sub16_Sub1_3.anInt3328 = 0;
				Static76.anInt5428 = Static222.aClass1_Sub16_Sub1_3.method2655();
				Static206.anInt4570 = Static222.aClass1_Sub16_Sub1_3.method2655();
				Static19.aBoolean25 = Static222.aClass1_Sub16_Sub1_3.method2655() == 1;
				Static291.aBoolean326 = Static222.aClass1_Sub16_Sub1_3.method2655() == 1;
				Static273.aBoolean312 = Static222.aClass1_Sub16_Sub1_3.method2655() == 1;
				Static144.aBoolean171 = Static222.aClass1_Sub16_Sub1_3.method2655() == 1;
				Static209.aBoolean247 = Static222.aClass1_Sub16_Sub1_3.method2655() == 1;
				Static76.anInt5427 = Static222.aClass1_Sub16_Sub1_3.method2652();
				Static97.aBoolean323 = Static222.aClass1_Sub16_Sub1_3.method2655() == 1;
				Static251.aBoolean291 = Static222.aClass1_Sub16_Sub1_3.method2655() == 1;
				Static14.method309(Static251.aBoolean291);
				Static253.method4314(Static251.aBoolean291);
				if (!Static40.aBoolean105) {
					if (Static19.aBoolean25 && !Static273.aBoolean312 || Static97.aBoolean323) {
						try {
							Static301.method406("zap", Static43.aClass66_1.anApplet1);
						} catch (@Pc(879) Throwable local879) {
						}
					} else {
						try {
							Static301.method406("unzap", Static43.aClass66_1.anApplet1);
						} catch (@Pc(889) Throwable local889) {
						}
					}
				}
				try {
					Static301.method406("loggedin", Static43.aClass66_1.anApplet1);
				} catch (@Pc(897) Throwable local897) {
				}
				Static80.anInt1911 = Static222.aClass1_Sub16_Sub1_3.method2672();
				Static5.anInt141 = Static222.aClass1_Sub16_Sub1_3.method2652();
				Static209.anInt4636 = 9;
			}
			if (Static209.anInt4636 == 9) {
				if (Static22.aClass41_1.method1067() < Static5.anInt141) {
					return;
				}
				Static222.aClass1_Sub16_Sub1_3.anInt3328 = 0;
				Static22.aClass41_1.method1059(Static5.anInt141, Static222.aClass1_Sub16_Sub1_3.aByteArray39, 0);
				Static209.anInt4636 = 0;
				Static275.anInt5910 = 2;
				Static45.method1005();
				Static238.anInt5219 = -1;
				Static45.method990(false);
				Static80.anInt1911 = -1;
				return;
			}
		} catch (@Pc(942) IOException local942) {
			if (Static22.aClass41_1 != null) {
				Static22.aClass41_1.method1062();
				Static22.aClass41_1 = null;
			}
			if (Static54.anInt1455 < 1) {
				Static81.anInt1946 = 0;
				Static209.anInt4636 = 1;
				if (Static15.anInt393 == Static206.anInt4590) {
					Static206.anInt4590 = Static98.anInt2195;
				} else {
					Static206.anInt4590 = Static15.anInt393;
				}
				Static54.anInt1455++;
			} else {
				Static275.anInt5910 = -4;
				Static209.anInt4636 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!kb;B)V")
	public static void method1516(@OriginalArg(0) Class83 arg0) {
		Static181.aClass83_125 = arg0;
		Static165.anInt3792 = Static181.aClass83_125.method2317(16);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V")
	public static void method1517(@OriginalArg(0) boolean arg0) {
		Static240.method4145(arg0, Static144.anInt3368, Static193.anInt4370, Static194.anInt4389);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)[Lclient!ug;")
	public static Class1_Sub2_Sub14[] method1518() {
		@Pc(12) Class1_Sub2_Sub14[] local12 = new Class1_Sub2_Sub14[Static153.anInt3542];
		for (@Pc(14) int local14 = 0; local14 < Static153.anInt3542; local14++) {
			@Pc(25) int local25 = Static81.anIntArray204[local14] * Static166.anIntArray343[local14];
			@Pc(29) byte[] local29 = Static200.aByteArrayArray83[local14];
			@Pc(32) int[] local32 = new int[local25];
			for (@Pc(34) int local34 = 0; local34 < local25; local34++) {
				local32[local34] = Static167.anIntArray346[local29[local34] & 0xFF];
			}
			if (Static296.aBoolean335) {
				local12[local14] = new Class1_Sub2_Sub14_Sub2(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[local14], Static121.anIntArray257[local14], Static166.anIntArray343[local14], Static81.anIntArray204[local14], local32);
			} else {
				local12[local14] = new Class1_Sub2_Sub14_Sub1(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[local14], Static121.anIntArray257[local14], Static166.anIntArray343[local14], Static81.anIntArray204[local14], local32);
			}
		}
		Static265.method4490();
		return local12;
	}
}
