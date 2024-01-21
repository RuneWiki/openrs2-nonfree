import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	public static int anInt2444;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 aClass1_Sub1_Sub12_Sub1_4;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	public static int anInt2445;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Lclient!lg;")
	public static Class51 aClass51_1 = new Class51();

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
	public static int anInt2446 = 0;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_919 = Static169.method2903("<img=1>");

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_920 = Static169.method2903("Ausw-=hlen");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!ob;)Lclient!ed;")
	public static Class23 method1620(@OriginalArg(1) Class60 arg0) {
		if (Static34.method580(Static170.method475(arg0)) == 0) {
			return null;
		} else if (arg0.aClass23_1141 == null || arg0.aClass23_1141.method641().method642() == 0) {
			return Static109.aBoolean136 ? Static14.aClass23_179 : null;
		} else {
			return arg0.aClass23_1141;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public static void method1621() {
		aClass51_1 = null;
		aClass23_919 = null;
		aClass23_920 = null;
		aClass1_Sub1_Sub12_Sub1_4 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ga;Lclient!ga;B)V")
	public static void method1622(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1) {
		Static77.aClass30_31 = arg1;
		Static30.aClass30_40 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method1623() {
		Static109.method1950(false);
		@Pc(10) boolean local10 = true;
		Static118.anInt3062 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static86.aByteArrayArray6.length; local14++) {
			if (Static102.anIntArray326[local14] != -1 && Static86.aByteArrayArray6[local14] == null) {
				Static86.aByteArrayArray6[local14] = Static4.aClass30_Sub1_1.method1301(Static102.anIntArray326[local14], 0);
				if (Static86.aByteArrayArray6[local14] == null) {
					local10 = false;
					Static118.anInt3062++;
				}
			}
			if (Static98.anIntArray312[local14] != -1 && Static23.aByteArrayArray3[local14] == null) {
				Static23.aByteArrayArray3[local14] = Static4.aClass30_Sub1_1.method1282(Static86.anIntArrayArray23[local14], Static98.anIntArray312[local14], 0);
				if (Static23.aByteArrayArray3[local14] == null) {
					local10 = false;
					Static118.anInt3062++;
				}
			}
		}
		if (!local10) {
			Static180.anInt4298 = 1;
			return;
		}
		Static109.anInt2813 = 0;
		local10 = true;
		@Pc(116) int local116;
		@Pc(127) int local127;
		for (@Pc(97) int local97 = 0; local97 < Static86.aByteArrayArray6.length; local97++) {
			@Pc(103) byte[] local103 = Static23.aByteArrayArray3[local97];
			if (local103 != null) {
				local116 = (Static83.anIntArray287[local97] >> 8) * 64 - Static152.anInt3545;
				local127 = (Static83.anIntArray287[local97] & 0xFF) * 64 - Static75.anInt2039;
				if (Static178.aBoolean211) {
					local127 = 10;
					local116 = 10;
				}
				local10 &= Static32.method569(local116, local103, local127);
			}
		}
		if (!local10) {
			Static180.anInt4298 = 2;
			return;
		}
		if (Static180.anInt4298 != 0) {
			Static5.method3152(true, Static149.method2571(new Class23[] { Static177.aClass23_1604, Static30.aClass23_1078 }));
		}
		Static38.method622();
		Static104.method1793();
		Static38.method622();
		Static123.aClass80_1.method2707();
		Static38.method622();
		System.gc();
		for (@Pc(184) int local184 = 0; local184 < 4; local184++) {
			Static132.aClass69Array3[local184].method2407();
		}
		@Pc(207) int local207;
		for (local116 = 0; local116 < 4; local116++) {
			for (local127 = 0; local127 < 104; local127++) {
				for (local207 = 0; local207 < 104; local207++) {
					Static12.aByteArrayArrayArray11[local116][local127][local207] = 0;
				}
			}
		}
		Static38.method622();
		Static119.method2099();
		local127 = Static86.aByteArrayArray6.length;
		Static61.method1109();
		Static109.method1950(true);
		@Pc(262) int local262;
		@Pc(276) int local276;
		@Pc(391) int local391;
		@Pc(334) int local334;
		@Pc(380) int local380;
		if (!Static178.aBoolean211) {
			@Pc(266) byte[] local266;
			for (local207 = 0; local207 < local127; local207++) {
				local262 = (Static83.anIntArray287[local207] >> 8) * 64 - Static152.anInt3545;
				local266 = Static86.aByteArrayArray6[local207];
				local276 = (Static83.anIntArray287[local207] & 0xFF) * 64 - Static75.anInt2039;
				if (local266 != null) {
					Static38.method622();
					Static17.method306(Static132.aClass69Array3, Static46.anInt4332 * 8 - 48, local266, (Static29.anInt888 - 6) * 8, local262, local276);
				}
			}
			for (local262 = 0; local262 < local127; local262++) {
				local276 = (Static83.anIntArray287[local262] >> 8) * 64 - Static152.anInt3545;
				@Pc(323) byte[] local323 = Static86.aByteArrayArray6[local262];
				local334 = (Static83.anIntArray287[local262] & 0xFF) * 64 - Static75.anInt2039;
				if (local323 == null && Static29.anInt888 < 800) {
					Static38.method622();
					Static144.method2509(local334, 64, local276, 64);
				}
			}
			Static109.method1950(true);
			for (local276 = 0; local276 < local127; local276++) {
				local266 = Static23.aByteArrayArray3[local276];
				if (local266 != null) {
					local380 = (Static83.anIntArray287[local276] >> 8) * 64 - Static152.anInt3545;
					local391 = (Static83.anIntArray287[local276] & 0xFF) * 64 - Static75.anInt2039;
					Static38.method622();
					Static126.method2250(local380, Static123.aClass80_1, local391, Static132.aClass69Array3, local266);
				}
			}
		}
		@Pc(448) int local448;
		@Pc(454) int local454;
		if (Static178.aBoolean211) {
			@Pc(460) int local460;
			@Pc(470) int local470;
			@Pc(472) int local472;
			for (local207 = 0; local207 < 4; local207++) {
				Static38.method622();
				for (local262 = 0; local262 < 13; local262++) {
					for (local276 = 0; local276 < 13; local276++) {
						@Pc(424) boolean local424 = false;
						local380 = Static153.anIntArrayArrayArray5[local207][local262][local276];
						if (local380 != -1) {
							local391 = local380 >> 24 & 0x3;
							local448 = local380 >> 1 & 0x3;
							local454 = local380 >> 14 & 0x3FF;
							local460 = local380 >> 3 & 0x7FF;
							local470 = local460 / 8 + (local454 / 8 << 8);
							for (local472 = 0; local472 < Static83.anIntArray287.length; local472++) {
								if (Static83.anIntArray287[local472] == local470 && Static86.aByteArrayArray6[local472] != null) {
									Static15.method269(Static132.aClass69Array3, local391, (local454 & 0x7) * 8, (local460 & 0x7) * 8, Static86.aByteArrayArray6[local472], local207, local262 * 8, local448, local276 * 8);
									local424 = true;
									break;
								}
							}
						}
						if (!local424) {
							Static30.method1957(local207, local262 * 8, local276 * 8);
						}
					}
				}
			}
			for (local262 = 0; local262 < 13; local262++) {
				for (local276 = 0; local276 < 13; local276++) {
					local334 = Static153.anIntArrayArrayArray5[0][local262][local276];
					if (local334 == -1) {
						Static144.method2509(local276 * 8, 8, local262 * 8, 8);
					}
				}
			}
			Static109.method1950(true);
			for (local276 = 0; local276 < 4; local276++) {
				Static38.method622();
				for (local334 = 0; local334 < 13; local334++) {
					for (local380 = 0; local380 < 13; local380++) {
						local391 = Static153.anIntArrayArrayArray5[local276][local334][local380];
						if (local391 != -1) {
							local454 = local391 >> 1 & 0x3;
							local470 = local391 >> 3 & 0x7FF;
							local448 = local391 >> 24 & 0x3;
							local460 = local391 >> 14 & 0x3FF;
							local472 = (local460 / 8 << 8) + local470 / 8;
							for (@Pc(656) int local656 = 0; local656 < Static83.anIntArray287.length; local656++) {
								if (local472 == Static83.anIntArray287[local656] && Static23.aByteArrayArray3[local656] != null) {
									Static49.method906(local454, local276, local380 * 8, (local470 & 0x7) * 8, Static132.aClass69Array3, (local460 & 0x7) * 8, Static23.aByteArrayArray3[local656], local334 * 8, Static123.aClass80_1, local448);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static109.method1950(true);
		Static104.method1793();
		Static38.method622();
		Static44.method740(Static132.aClass69Array3, Static123.aClass80_1);
		Static109.method1950(true);
		local207 = Static7.anInt327;
		if (local207 > Static85.anInt2267) {
			local207 = Static85.anInt2267;
		}
		if (Static85.anInt2267 - 1 > local207) {
		}
		if (Static8.aBoolean17) {
			Static123.aClass80_1.method2680(Static7.anInt327);
		} else {
			Static123.aClass80_1.method2680(0);
		}
		for (local262 = 0; local262 < 104; local262++) {
			for (local276 = 0; local276 < 104; local276++) {
				Static110.method1954(local276, local262);
			}
		}
		Static38.method622();
		Static73.method1340();
		Static104.method1793();
		if (Static174.aFrame1 != null) {
			Static25.aClass1_Sub8_Sub1_1.method919(242);
			Static25.aClass1_Sub8_Sub1_1.method904(1057001181);
		}
		if (!Static178.aBoolean211) {
			local276 = (Static46.anInt4332 - 6) / 8;
			local334 = (Static46.anInt4332 + 6) / 8;
			local380 = (Static29.anInt888 - 6) / 8;
			local391 = (Static29.anInt888 + 6) / 8;
			for (local448 = local276 - 1; local448 <= local334 + 1; local448++) {
				for (local454 = local380 - 1; local454 <= local391 + 1; local454++) {
					if (local276 > local448 || local334 < local448 || local380 > local454 || local391 < local454) {
						Static4.aClass30_Sub1_1.method1300(Static149.method2571(new Class23[] { Static84.aClass23_1673, Static27.method498(local448), Static64.aClass23_620, Static27.method498(local454) }));
						Static4.aClass30_Sub1_1.method1300(Static149.method2571(new Class23[] { Static82.aClass23_812, Static27.method498(local448), Static64.aClass23_620, Static27.method498(local454) }));
					}
				}
			}
		}
		Static32.method567(30);
		Static38.method622();
		Static94.method1625();
		Static25.aClass1_Sub8_Sub1_1.method919(208);
		Static78.method1414();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)I")
	public static int method1624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * local8 & 0xFF00FF00) + (local8 * (arg2 & 0xFF00) + arg0 * (arg1 & 0xFF00) & 0xFF0000) >> 8;
	}
}
