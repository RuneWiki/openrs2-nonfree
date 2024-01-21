import java.awt.Component;
import java.awt.Graphics;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public static int anInt244 = -1;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!fc;")
	private static Class25 aClass25_137 = Static78.method1313("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_132 = aClass25_137;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!fc;")
	private static Class25 aClass25_133 = Static78.method1313("Enter amount:");

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!fc;")
	public static Class25 aClass25_134 = Static78.method1313("k");

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!fc;")
	private static Class25 aClass25_135 = Static78.method1313("No response from server)3");

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_136 = aClass25_133;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "[I")
	public static int[] anIntArray45 = new int[1000];

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public static int anInt249 = 0;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_138 = aClass25_135;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub1Array1 = new Class1_Sub2_Sub2_Sub1[1000];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method233() {
		aClass25_137 = null;
		aClass25_136 = null;
		aClass1_Sub2_Sub2_Sub1Array1 = null;
		aClass25_134 = null;
		aClass25_132 = null;
		anIntArray45 = null;
		aClass25_133 = null;
		aClass25_135 = null;
		aClass25_138 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!tc;Lclient!dc;)V")
	public static void method234(@OriginalArg(1) int arg0, @OriginalArg(2) Class74 arg1, @OriginalArg(3) Class1_Sub5 arg2) {
		@Pc(9) Class1_Sub7 local9 = new Class1_Sub7();
		local9.anInt1108 = arg2.method672();
		local9.anInt1102 = arg2.method663();
		local9.anIntArray202 = new int[local9.anInt1108];
		local9.anIntArray204 = new int[local9.anInt1108];
		local9.aClass50Array2 = new Class50[local9.anInt1108];
		local9.anIntArray203 = new int[local9.anInt1108];
		local9.aClass50Array1 = new Class50[local9.anInt1108];
		local9.aByteArrayArrayArray4 = new byte[local9.anInt1108][][];
		for (@Pc(59) int local59 = 0; local59 < local9.anInt1108; local59++) {
			try {
				@Pc(65) int local65 = arg2.method672();
				@Pc(84) String local84;
				@Pc(93) String local93;
				@Pc(95) int local95;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local84 = new String(arg2.method654().method802());
					local93 = new String(arg2.method654().method802());
					local95 = 0;
					if (local65 == 1) {
						local95 = arg2.method663();
					}
					local9.anIntArray204[local59] = local65;
					local9.anIntArray203[local59] = local95;
					local9.aClass50Array2[local59] = arg1.method1813(Static101.method1671(local84), local93);
				} else if (local65 == 3 || local65 == 4) {
					local84 = new String(arg2.method654().method802());
					local93 = new String(arg2.method654().method802());
					local95 = arg2.method672();
					@Pc(158) String[] local158 = new String[local95];
					for (@Pc(160) int local160 = 0; local160 < local95; local160++) {
						local158[local160] = new String(arg2.method654().method802());
					}
					@Pc(180) byte[][] local180 = new byte[local95][];
					@Pc(191) int local191;
					if (local65 == 3) {
						for (@Pc(185) int local185 = 0; local185 < local95; local185++) {
							local191 = arg2.method663();
							local180[local185] = new byte[local191];
							arg2.method655(local180[local185], local191);
						}
					}
					local9.anIntArray204[local59] = local65;
					@Pc(220) Class[] local220 = new Class[local95];
					for (local191 = 0; local191 < local95; local191++) {
						local220[local191] = Static101.method1671(local158[local191]);
					}
					local9.aClass50Array1[local59] = arg1.method1818(Static101.method1671(local84), local220, local93);
					local9.aByteArrayArrayArray4[local59] = local180;
				}
			} catch (@Pc(255) ClassNotFoundException local255) {
				local9.anIntArray202[local59] = -1;
			} catch (@Pc(262) SecurityException local262) {
				local9.anIntArray202[local59] = -2;
			} catch (@Pc(269) NullPointerException local269) {
				local9.anIntArray202[local59] = -3;
			} catch (@Pc(276) Exception local276) {
				local9.anIntArray202[local59] = -4;
			} catch (@Pc(283) Throwable local283) {
				local9.anIntArray202[local59] = -5;
			}
		}
		Static25.aClass2_3.method33(local9);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method235(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static113.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static11.aClass29_1);
		arg0.addFocusListener(Static11.aClass29_1);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method236() {
		try {
			@Pc(2) Graphics local2 = Static119.aCanvas1.getGraphics();
			Static37.aClass7_7.method1095(local2, 4, 4);
		} catch (@Pc(10) Exception local10) {
			Static119.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIB)I")
	public static int method237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	public static void method238() {
		Static68.aClass1_Sub5_Sub1_2.method688(13);
		if (Static33.anInt922 != -1) {
			Static101.method1677(Static33.anInt922);
			Static120.aBoolean126 = true;
			Static90.aBoolean98 = true;
			Static33.anInt922 = -1;
			Static33.anInt917 = -1;
		}
		if (Static33.anInt916 != -1) {
			Static101.method1677(Static33.anInt916);
			Static33.anInt916 = -1;
			Static110.aBoolean113 = true;
			Static33.anInt917 = -1;
		}
		if (Static67.anInt1470 != -1) {
			Static101.method1677(Static67.anInt1470);
			Static67.anInt1470 = -1;
			Static99.method1645(30);
		}
		if (Static93.anInt2098 != -1) {
			Static101.method1677(Static93.anInt2098);
			Static93.anInt2098 = -1;
		}
		if (Static108.anInt2497 != -1) {
			Static101.method1677(Static108.anInt2497);
			Static108.anInt2497 = -1;
			Static33.anInt917 = -1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([Lclient!od;Lclient!ac;I)V")
	public static void method240(@OriginalArg(0) Class62[] arg0, @OriginalArg(1) Class4 arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(28) int local28;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static116.aByteArrayArrayArray7[local3][local7][local11] & 0x1) == 1) {
						local28 = local3;
						if ((Static116.aByteArrayArrayArray7[1][local7][local11] & 0x2) == 2) {
							local28 = local3 - 1;
						}
						if (local28 >= 0) {
							arg0[local28].method1456(local11, local7);
						}
					}
				}
			}
		}
		Static97.anInt2300 += (int) (Math.random() * 5.0D) - 2;
		if (Static97.anInt2300 < -16) {
			Static97.anInt2300 = -16;
		}
		if (Static97.anInt2300 > 16) {
			Static97.anInt2300 = 16;
		}
		Static10.anInt268 += (int) (Math.random() * 5.0D) - 2;
		if (Static10.anInt268 < -8) {
			Static10.anInt268 = -8;
		}
		if (Static10.anInt268 > 8) {
			Static10.anInt268 = 8;
		}
		@Pc(131) int local131;
		@Pc(133) int local133;
		@Pc(137) int local137;
		@Pc(160) int local160;
		@Pc(181) int local181;
		@Pc(194) int local194;
		@Pc(260) int local260;
		@Pc(254) int local254;
		@Pc(200) int local200;
		@Pc(277) int local277;
		@Pc(250) int local250;
		@Pc(504) int local504;
		@Pc(545) int local545;
		@Pc(644) int local644;
		@Pc(654) int local654;
		@Pc(672) int local672;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(121) byte[][] local121 = Static28.aByteArrayArrayArray2[local7];
			local28 = (int) Math.sqrt(5100.0D);
			local131 = local28 * 768 >> 8;
			for (local133 = 1; local133 < 103; local133++) {
				for (local137 = 1; local137 < 103; local137++) {
					local160 = Static7.anIntArrayArrayArray3[local7][local137 + 1][local133] - Static7.anIntArrayArrayArray3[local7][local137 - 1][local133];
					local181 = Static7.anIntArrayArrayArray3[local7][local137][local133 + 1] - Static7.anIntArrayArrayArray3[local7][local137][local133 - 1];
					local194 = (int) Math.sqrt((double) (local160 * local160 + local181 * local181 + 65536));
					local200 = (local181 << 8) / local194;
					local250 = (local121[local137 - 1][local133] >> 2) + (local121[local137 + 1][local133] >> 3) + (local121[local137][local133 + -1] >> 2) + (local121[local137][local133 + 1] >> 3) + (local121[local137][local133] >> 1);
					local254 = 65536 / local194;
					local260 = (local160 << 8) / local194;
					local277 = (local260 * -50 + local254 * -10 + local200 * -50) / local131 + 96;
					Static37.anIntArrayArray10[local137][local133] = local277 - local250;
				}
			}
			for (local137 = 0; local137 < 104; local137++) {
				Static97.anIntArray399[local137] = 0;
				Static14.anIntArray76[local137] = 0;
				Static22.anIntArray161[local137] = 0;
				Static71.anIntArray278[local137] = 0;
				Static120.anIntArray486[local137] = 0;
			}
			for (local160 = -5; local160 < 109; local160++) {
				for (local181 = 0; local181 < 104; local181++) {
					local194 = local160 + 5;
					@Pc(400) int local400;
					if (local194 >= 0 && local194 < 104) {
						local260 = Static85.aByteArrayArrayArray6[local7][local194][local181] & 0xFF;
						if (local260 > 0) {
							@Pc(364) Class1_Sub2_Sub4 local364 = Static114.method1831(local260 - 1);
							Static97.anIntArray399[local181] += local364.anInt447;
							Static14.anIntArray76[local181] += local364.anInt442;
							Static22.anIntArray161[local181] += local364.anInt434;
							Static71.anIntArray278[local181] += local364.anInt433;
							local400 = Static120.anIntArray486[local181]++;
						}
					}
					local260 = local160 - 5;
					if (local260 >= 0 && local260 < 104) {
						local254 = Static85.aByteArrayArrayArray6[local7][local260][local181] & 0xFF;
						if (local254 > 0) {
							@Pc(435) Class1_Sub2_Sub4 local435 = Static114.method1831(local254 - 1);
							Static97.anIntArray399[local181] -= local435.anInt447;
							Static14.anIntArray76[local181] -= local435.anInt442;
							Static22.anIntArray161[local181] -= local435.anInt434;
							Static71.anIntArray278[local181] -= local435.anInt433;
							local400 = Static120.anIntArray486[local181]--;
						}
					}
				}
				if (local160 >= 1 && local160 < 103) {
					local194 = 0;
					local260 = 0;
					local277 = 0;
					local254 = 0;
					local200 = 0;
					for (local250 = -5; local250 < 109; local250++) {
						local504 = local250 + 5;
						if (local504 >= 0 && local504 < 104) {
							local254 += Static22.anIntArray161[local504];
							local194 += Static97.anIntArray399[local504];
							local200 += Static71.anIntArray278[local504];
							local260 += Static14.anIntArray76[local504];
							local277 += Static120.anIntArray486[local504];
						}
						local545 = local250 - 5;
						if (local545 >= 0 && local545 < 104) {
							local260 -= Static14.anIntArray76[local545];
							local254 -= Static22.anIntArray161[local545];
							local200 -= Static71.anIntArray278[local545];
							local194 -= Static97.anIntArray399[local545];
							local277 -= Static120.anIntArray486[local545];
						}
						if (local250 >= 1 && local250 < 103 && (!Static63.aBoolean55 || (Static116.aByteArrayArrayArray7[0][local160][local250] & 0x2) != 0 || (Static116.aByteArrayArrayArray7[local7][local160][local250] & 0x10) == 0 && Static61.method1085(local160, local250, local7) == Static82.anInt1812)) {
							if (Static121.anInt2875 > local7) {
								Static121.anInt2875 = local7;
							}
							local644 = Static85.aByteArrayArrayArray6[local7][local160][local250] & 0xFF;
							local654 = Static38.aByteArrayArrayArray3[local7][local160][local250] & 0xFF;
							if (local644 > 0 || local654 > 0) {
								local672 = Static7.anIntArrayArrayArray3[local7][local160][local250];
								@Pc(682) int local682 = Static7.anIntArrayArrayArray3[local7][local160 + 1][local250];
								@Pc(694) int local694 = Static7.anIntArrayArrayArray3[local7][local160 + 1][local250 + 1];
								@Pc(700) int local700 = Static37.anIntArrayArray10[local160][local250];
								@Pc(710) int local710 = Static7.anIntArrayArrayArray3[local7][local160][local250 + 1];
								@Pc(718) int local718 = Static37.anIntArrayArray10[local160 + 1][local250];
								@Pc(726) int local726 = Static37.anIntArrayArray10[local160][local250 + 1];
								@Pc(736) int local736 = Static37.anIntArrayArray10[local160 + 1][local250 + 1];
								@Pc(738) int local738 = -1;
								@Pc(740) int local740 = -1;
								@Pc(751) int local751;
								@Pc(759) int local759;
								if (local644 > 0) {
									local751 = local194 * 256 / local200;
									@Pc(755) int local755 = local254 / local277;
									local759 = local260 / local277;
									local738 = Static66.method1135(local755, local759, local751);
									@Pc(773) int local773 = Static10.anInt268 + local751 & 0xFF;
									local755 += Static97.anInt2300;
									if (local755 < 0) {
										local755 = 0;
									} else if (local755 > 255) {
										local755 = 255;
									}
									local740 = Static66.method1135(local755, local759, local773);
								}
								if (local7 > 0) {
									@Pc(803) boolean local803 = true;
									if (local644 == 0 && Static39.aByteArrayArrayArray5[local7][local160][local250] != 0) {
										local803 = false;
									}
									if (local654 > 0 && !Static95.method1598(local654 - 1).aBoolean4) {
										local803 = false;
									}
									if (local803 && local682 == local672 && local694 == local672 && local672 == local710) {
										Static97.anIntArrayArrayArray7[local7][local160][local250] |= 0x924;
									}
								}
								local751 = 0;
								if (local740 != -1) {
									local751 = Static36.anIntArray188[Static52.method1014(local740, 96)];
								}
								if (local654 == 0) {
									arg1.method92(local7, local160, local250, 0, 0, -1, local672, local682, local694, local710, Static52.method1014(local738, local700), Static52.method1014(local738, local718), Static52.method1014(local738, local736), Static52.method1014(local738, local726), 0, 0, 0, 0, local751, 0);
								} else {
									local759 = Static39.aByteArrayArrayArray5[local7][local160][local250] + 1;
									@Pc(900) byte local900 = Static26.aByteArrayArrayArray1[local7][local160][local250];
									@Pc(906) Class1_Sub2_Sub1 local906 = Static95.method1598(local654 - 1);
									@Pc(909) int local909 = local906.anInt165;
									@Pc(924) int local924;
									@Pc(954) int local954;
									@Pc(931) int local931;
									@Pc(936) int local936;
									if (local909 >= 0) {
										local954 = Static36.anInterface3_1.method1220(local909);
										local924 = -1;
									} else if (local906.anInt167 == 16711935) {
										local924 = -2;
										local954 = -2;
										local909 = -1;
									} else {
										local924 = Static66.method1135(local906.anInt158, local906.anInt152, local906.anInt154);
										local931 = Static10.anInt268 + local906.anInt154 & 0xFF;
										local936 = Static97.anInt2300 + local906.anInt158;
										if (local936 < 0) {
											local936 = 0;
										} else if (local936 > 255) {
											local936 = 255;
										}
										local954 = Static66.method1135(local936, local906.anInt152, local931);
									}
									local931 = 0;
									if (local954 != -2) {
										local931 = Static36.anIntArray188[Static64.method1127(96, local954)];
									}
									if (local906.anInt161 != -1) {
										local936 = local906.anInt155 + Static10.anInt268 & 0xFF;
										@Pc(1001) int local1001 = local906.anInt153 + Static97.anInt2300;
										if (local1001 < 0) {
											local1001 = 0;
										} else if (local1001 > 255) {
											local1001 = 255;
										}
										local954 = Static66.method1135(local1001, local906.anInt160, local936);
										local931 = Static36.anIntArray188[Static64.method1127(96, local954)];
									}
									arg1.method92(local7, local160, local250, local759, local900, local909, local672, local682, local694, local710, Static52.method1014(local738, local700), Static52.method1014(local738, local718), Static52.method1014(local738, local736), Static52.method1014(local738, local726), Static64.method1127(local700, local924), Static64.method1127(local718, local924), Static64.method1127(local736, local924), Static64.method1127(local726, local924), local751, local931);
								}
							}
						}
					}
				}
			}
			for (local181 = 1; local181 < 103; local181++) {
				for (local194 = 1; local194 < 103; local194++) {
					arg1.method68(local7, local194, local181, Static61.method1085(local194, local181, local7));
				}
			}
			Static85.aByteArrayArrayArray6[local7] = null;
			Static38.aByteArrayArrayArray3[local7] = null;
			Static39.aByteArrayArrayArray5[local7] = null;
			Static26.aByteArrayArrayArray1[local7] = null;
			Static28.aByteArrayArrayArray2[local7] = null;
		}
		arg1.method61();
		for (local11 = 0; local11 < 104; local11++) {
			for (local28 = 0; local28 < 104; local28++) {
				if ((Static116.aByteArrayArrayArray7[1][local11][local28] & 0x2) == 2) {
					arg1.method70(local11, local28);
				}
			}
		}
		local28 = 1;
		local131 = 2;
		local133 = 4;
		for (local137 = 0; local137 < 4; local137++) {
			if (local137 > 0) {
				local28 <<= 0x3;
				local133 <<= 0x3;
				local131 <<= 0x3;
			}
			for (local160 = 0; local160 <= local137; local160++) {
				for (local181 = 0; local181 <= 104; local181++) {
					for (local194 = 0; local194 <= 104; local194++) {
						if ((Static97.anIntArrayArrayArray7[local160][local194][local181] & local28) != 0) {
							local254 = local181;
							local260 = local181;
							while (local254 < 104 && (local28 & Static97.anIntArrayArrayArray7[local160][local194][local254 + 1]) != 0) {
								local254++;
							}
							local200 = local160;
							local277 = local160;
							while (local260 > 0 && (Static97.anIntArrayArrayArray7[local160][local194][local260 - 1] & local28) != 0) {
								local260--;
							}
							label347: while (local200 > 0) {
								for (local250 = local260; local250 <= local254; local250++) {
									if ((local28 & Static97.anIntArrayArrayArray7[local200 - 1][local194][local250]) == 0) {
										break label347;
									}
								}
								local200--;
							}
							label336: while (local277 < local137) {
								for (local250 = local260; local250 <= local254; local250++) {
									if ((Static97.anIntArrayArrayArray7[local277 + 1][local194][local250] & local28) == 0) {
										break label336;
									}
								}
								local277++;
							}
							local250 = (local254 + 1 - local260) * (local277 + 1 - local200);
							if (local250 >= 8) {
								local644 = Static7.anIntArrayArrayArray3[local200][local194][local260];
								local545 = Static7.anIntArrayArrayArray3[local277][local194][local260] - 240;
								Static4.method74(local137, 1, local194 * 128, local194 * 128, local260 * 128, local254 * 128 + 128, local545, local644);
								for (local654 = local200; local654 <= local277; local654++) {
									for (local672 = local260; local672 <= local254; local672++) {
										Static97.anIntArrayArrayArray7[local654][local194][local672] &= ~local28;
									}
								}
							}
						}
						if ((Static97.anIntArrayArrayArray7[local160][local194][local181] & local131) != 0) {
							for (local260 = local194; local260 > 0 && (local131 & Static97.anIntArrayArrayArray7[local160][local260 - 1][local181]) != 0; local260--) {
							}
							for (local254 = local194; local254 < 104 && (local131 & Static97.anIntArrayArrayArray7[local160][local254 + 1][local181]) != 0; local254++) {
							}
							label402: for (local200 = local160; local200 > 0; local200--) {
								for (local250 = local260; local250 <= local254; local250++) {
									if ((local131 & Static97.anIntArrayArrayArray7[local200 - 1][local250][local181]) == 0) {
										break label402;
									}
								}
							}
							label390: for (local277 = local160; local277 < local137; local277++) {
								for (local250 = local260; local250 <= local254; local250++) {
									if ((local131 & Static97.anIntArrayArrayArray7[local277 + 1][local250][local181]) == 0) {
										break label390;
									}
								}
							}
							local250 = (local254 + 1 - local260) * ((local277 - local200) + 1);
							if (local250 >= 8) {
								local545 = Static7.anIntArrayArrayArray3[local277][local260][local181] - 240;
								local644 = Static7.anIntArrayArrayArray3[local200][local260][local181];
								Static4.method74(local137, 2, local260 * 128, local254 * 128 + 128, local181 * 128, local181 * 128, local545, local644);
								for (local654 = local200; local654 <= local277; local654++) {
									for (local672 = local260; local672 <= local254; local672++) {
										Static97.anIntArrayArrayArray7[local654][local672][local181] &= ~local131;
									}
								}
							}
						}
						if ((local133 & Static97.anIntArrayArrayArray7[local160][local194][local181]) != 0) {
							local260 = local194;
							local254 = local194;
							local200 = local181;
							for (local277 = local181; local277 < 104 && (local133 & Static97.anIntArrayArrayArray7[local160][local194][local277 + 1]) != 0; local277++) {
							}
							while (local200 > 0 && (Static97.anIntArrayArrayArray7[local160][local194][local200 - 1] & local133) != 0) {
								local200--;
							}
							label457: while (local260 > 0) {
								for (local250 = local200; local250 <= local277; local250++) {
									if ((Static97.anIntArrayArrayArray7[local160][local260 - 1][local250] & local133) == 0) {
										break label457;
									}
								}
								local260--;
							}
							label446: while (local254 < 104) {
								for (local250 = local200; local250 <= local277; local250++) {
									if ((local133 & Static97.anIntArrayArrayArray7[local160][local254 + 1][local250]) == 0) {
										break label446;
									}
								}
								local254++;
							}
							if ((local277 + 1 - local200) * (-local260 + 1 + local254) >= 4) {
								local250 = Static7.anIntArrayArrayArray3[local160][local260][local200];
								Static4.method74(local137, 4, local260 * 128, local254 * 128 + 128, local200 * 128, local277 * 128 + 128, local250, local250);
								for (local504 = local260; local504 <= local254; local504++) {
									for (local545 = local200; local545 <= local277; local545++) {
										Static97.anIntArrayArrayArray7[local160][local504][local545] &= ~local133;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
