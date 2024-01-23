import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Z")
	public static boolean aBoolean123;

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
	public static int anInt1565 = 0;

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString53 = null;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	public static void method1270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static183.method3031(arg1)) {
			Static19.method396(Static313.aClass146ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!ph;)V")
	public static void method1272(@OriginalArg(1) Class138 arg0) {
		Static137.aClass138_44 = arg0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIBI)V")
	public static void method1274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static38.anInt767 = 0;
		@Pc(9) int local9;
		@Pc(180) int local180;
		@Pc(213) Class1_Sub1_Sub3[] local213;
		@Pc(261) int local261;
		@Pc(414) int local414;
		@Pc(273) int local273;
		for (local9 = -1; local9 < Static105.anInt2015 + Static222.anInt4329; local9++) {
			@Pc(20) Class112 local20 = null;
			@Pc(27) Class22_Sub3 local27;
			if (local9 < 0) {
				local27 = Static229.aClass22_Sub3_Sub2_2;
			} else if (Static222.anInt4329 > local9) {
				local27 = Static195.aClass22_Sub3_Sub2Array1[Static46.anIntArray79[local9]];
			} else {
				local27 = Static265.aClass22_Sub3_Sub1Array1[Static7.anIntArray12[local9 - Static222.anInt4329]];
				local20 = ((Class22_Sub3_Sub1) local27).aClass112_1;
				if (local20.anIntArray283 != null) {
					local20 = local20.method2817();
					if (local20 == null) {
						continue;
					}
				}
			}
			if (local27.method3655()) {
				Static259.method3906(arg2 >> 1, arg5 >> 1, local27, arg4, arg3, local27.method3645());
				if (Static225.anInt4443 >= 0) {
					if (local27.aString150 != null && (Static222.anInt4329 <= local9 || Static24.anInt469 == 0 || Static24.anInt469 == 3 || Static24.anInt469 == 1 && Static99.method1485(((Class22_Sub3_Sub2) local27).aString153)) && Static38.anInt767 < Static4.anInt60) {
						Static4.anIntArray4[Static38.anInt767] = Static245.aClass1_Sub1_Sub12_2.method4438(local27.aString150) / 2;
						Static4.anIntArray8[Static38.anInt767] = Static245.aClass1_Sub1_Sub12_2.anInt5613;
						Static4.anIntArray5[Static38.anInt767] = Static225.anInt4443;
						Static4.anIntArray9[Static38.anInt767] = Static178.anInt3586;
						Static4.anIntArray3[Static38.anInt767] = local27.anInt4583;
						Static4.anIntArray7[Static38.anInt767] = local27.anInt4577;
						Static4.anIntArray2[Static38.anInt767] = local27.anInt4636;
						Static4.aStringArray1[Static38.anInt767] = local27.aString150;
						Static38.anInt767++;
					}
					@Pc(170) Class1_Sub1_Sub3 local170 = Static236.aClass1_Sub1_Sub3Array16[0];
					local180 = Static178.anInt3586 + arg1 - Math.max(Static245.aClass1_Sub1_Sub12_2.anInt5615, local170.anInt5887);
					@Pc(196) Class1_Sub1_Sub3 local196;
					if (!local27.aBoolean327 && Static37.anInt757 < local27.anInt4594) {
						local196 = Static236.aClass1_Sub1_Sub3Array16[1];
						if (local27 instanceof Class22_Sub3_Sub1) {
							@Pc(203) Class22_Sub3_Sub1 local203 = (Class22_Sub3_Sub1) local27;
							local213 = (Class1_Sub1_Sub3[]) Static97.aClass169_59.method4017((long) local203.aClass112_1.anInt3498);
							if (local213 == null) {
								local213 = Static297.method4448(Static241.aClass138_64, local203.aClass112_1.anInt3498);
								if (local213 != null) {
									Static97.aClass169_59.method4016(local213, (long) local203.aClass112_1.anInt3498);
								}
							}
							if (local213 != null && local213.length == 2) {
								local170 = local213[0];
								local196 = local213[1];
							}
						}
						local261 = Static225.anInt4443 + arg0 - (local170.anInt5875 >> 1);
						local170.method4628(local261, local180);
						local273 = local27.anInt4647 * local170.anInt5875 / 255;
						if (Static291.aBoolean404) {
							Static133.method2163(local261, local180, local261 + local273, local170.anInt5887 + local180);
						} else {
							Static41.method732(local261, local180, local261 + local273, local180 - -local170.anInt5887);
						}
						local196.method4628(local261, local180);
						if (Static291.aBoolean404) {
							Static133.method2180(arg0, arg1, arg2 + arg0, arg1 - -arg5);
						} else {
							Static41.method739(arg0, arg1, arg0 + arg2, arg5 + arg1);
						}
					}
					local180 -= 2;
					if (!local27.aBoolean327) {
						if (local9 < Static222.anInt4329) {
							@Pc(373) Class22_Sub3_Sub2 local373 = (Class22_Sub3_Sub2) local27;
							if (local373.anInt4655 != -1) {
								local180 -= 25;
								Static119.aClass1_Sub1_Sub3Array19[local373.anInt4655].method4628(Static225.anInt4443 + arg0 - 12, local180);
								local180 -= 2;
							}
							if (local373.anInt4664 != -1) {
								local180 -= 25;
								Static188.aClass1_Sub1_Sub3Array13[local373.anInt4664].method4628(Static225.anInt4443 + arg0 - 12, local180);
								local180 -= 2;
							}
						} else if (local20.anInt3504 >= 0 && local20.anInt3504 < Static188.aClass1_Sub1_Sub3Array13.length) {
							local180 -= 25;
							local196 = Static188.aClass1_Sub1_Sub3Array13[local20.anInt3504];
							local196.method4628(Static225.anInt4443 + arg0 - (local196.anInt5875 >> 1), local180);
							local180 -= 2;
						}
					}
					@Pc(430) Class68 local430;
					@Pc(453) Class1_Sub1_Sub3 local453;
					@Pc(416) Class68[] local416;
					if (!(local27 instanceof Class22_Sub3_Sub2)) {
						local414 = 0;
						local416 = Static257.aClass68Array1;
						for (local273 = 0; local273 < local416.length; local273++) {
							local430 = local416[local273];
							if (local430 != null && local430.anInt1791 == 1 && Static7.anIntArray12[local9 - Static222.anInt4329] == local430.anInt1785) {
								local453 = Static56.aClass1_Sub1_Sub3Array5[local430.anInt1794];
								if (local414 < local453.anInt5887) {
									local414 = local453.anInt5887;
								}
								if (Static37.anInt757 % 20 < 10) {
									local453.method4628(arg0 + Static225.anInt4443 - 12, -local453.anInt5887 + local180);
								}
							}
						}
						if (local414 <= 0) {
						}
					} else if (local9 >= 0) {
						local414 = 0;
						local416 = Static257.aClass68Array1;
						for (local273 = 0; local273 < local416.length; local273++) {
							local430 = local416[local273];
							if (local430 != null && local430.anInt1791 == 10 && Static46.anIntArray79[local9] == local430.anInt1785) {
								local453 = Static56.aClass1_Sub1_Sub3Array5[local430.anInt1794];
								if (local453.anInt5887 > local414) {
									local414 = local453.anInt5887;
								}
								local453.method4628(Static225.anInt4443 + arg0 - 12, -local453.anInt5887 + local180);
							}
						}
						if (local414 > 0) {
						}
					}
					for (local414 = 0; local414 < 4; local414++) {
						if (Static37.anInt757 < local27.anIntArray426[local414]) {
							local261 = local27.method3645() / 2;
							Static259.method3906(arg2 >> 1, arg5 >> 1, local27, arg4, arg3, local261);
							if (Static225.anInt4443 > -1) {
								if (local414 == 1) {
									Static178.anInt3586 -= 20;
								}
								if (local414 == 2) {
									Static178.anInt3586 -= 10;
									Static225.anInt4443 -= 15;
								}
								if (local414 == 3) {
									Static225.anInt4443 += 15;
									Static178.anInt3586 -= 10;
								}
								Static105.aClass1_Sub1_Sub3Array7[local27.anIntArray428[local414]].method4628(arg0 + Static225.anInt4443 - 12, Static178.anInt3586 + arg1 + -12);
								Static289.aClass1_Sub1_Sub12_4.method4432(Integer.toString(local27.anIntArray425[local414]), Static225.anInt4443 + arg0 - 1, arg1 - (-Static178.anInt3586 - 3), 16777215, 0);
							}
						}
					}
				}
			}
		}
		@Pc(704) int local704;
		@Pc(724) int local724;
		@Pc(828) int local828;
		@Pc(814) int local814;
		for (local9 = 0; local9 < Static274.anInt5242; local9++) {
			local704 = Static225.anIntArray371[local9];
			@Pc(714) Class22_Sub3 local714;
			if (local704 >= 2048) {
				local704 -= 2048;
				local714 = Static265.aClass22_Sub3_Sub1Array1[local704];
			} else {
				local714 = Static195.aClass22_Sub3_Sub2Array1[local704];
			}
			local724 = Static249.anIntArray446[local9];
			@Pc(731) Class22_Sub3 local731;
			if (local724 < 2048) {
				local731 = Static195.aClass22_Sub3_Sub2Array1[local724];
			} else {
				local724 -= 2048;
				local731 = Static265.aClass22_Sub3_Sub1Array1[local724];
			}
			local414 = local731.method3641();
			if (local414 != -1) {
				@Pc(756) Class1_Sub1_Sub3 local756 = (Class1_Sub1_Sub3) Static52.aClass169_42.method4017((long) local414);
				if (local756 == null) {
					local213 = Static297.method4448(Static241.aClass138_64, local414);
					if (local213 != null) {
						local756 = local213[0];
						Static52.aClass169_42.method4016(local756, (long) local414);
					}
				}
				if (local756 != null) {
					local273 = local714.anInt4620++;
					Static142.method2263(local714.method3660() * 64, local714.anInt4623, arg4, local714.anInt4601, arg5 >> 1, arg2 >> 1, 0, arg3);
					local814 = Static178.anInt3586 - 16 - 54;
					@Pc(822) int local822 = local814 + local273 % 4 * 18;
					local828 = Static225.anInt4443 + arg0 - 18;
					@Pc(836) int local836 = local828 + local273 / 4 * 18;
					local756.method4628(local836, local822);
					if (local731 == local714) {
						if (Static291.aBoolean404) {
							Static133.method2164(local836 - 1, local822 + -1, 18, 18, 16776960);
						} else {
							Static41.method729(local836 - 1, local822 + -1, 18, 18, 16776960);
						}
					}
					if (Static64.anInt3058 >= local836 && Static64.anInt3058 < local836 + local756.anInt5875 && local822 <= Static268.anInt5935 && Static268.anInt5935 < local822 + local756.anInt5887) {
						if (local731 instanceof Class22_Sub3_Sub2) {
							Static17.aLongArray11[0] = (long) local724 << 32;
						} else {
							Static17.aLongArray11[0] = Static312.method4590((long) local724 << 32, 536870912L);
						}
						Static31.aBoolean40 = false;
						Static57.anInt1123 = 1;
					}
				}
			}
		}
		for (local9 = 0; local9 < Static38.anInt767; local9++) {
			@Pc(945) int local945 = Static4.anIntArray9[local9];
			local704 = Static4.anIntArray5[local9];
			local724 = Static4.anIntArray4[local9];
			@Pc(955) boolean local955 = true;
			local180 = Static4.anIntArray8[local9];
			while (local955) {
				local955 = false;
				for (local261 = 0; local261 < local9; local261++) {
					if (Static4.anIntArray9[local261] - Static4.anIntArray8[local261] < local945 + 2 && Static4.anIntArray9[local261] + 2 > -local180 + local945 && local704 - local724 < Static4.anIntArray4[local261] + Static4.anIntArray5[local261] && Static4.anIntArray5[local261] - Static4.anIntArray4[local261] < local704 + local724 && Static4.anIntArray9[local261] - Static4.anIntArray8[local261] < local945) {
						local955 = true;
						local945 = Static4.anIntArray9[local261] - Static4.anIntArray8[local261];
					}
				}
			}
			Static225.anInt4443 = Static4.anIntArray5[local9];
			Static178.anInt3586 = Static4.anIntArray9[local9] = local945;
			@Pc(1066) String local1066 = Static4.aStringArray1[local9];
			if (Static114.anInt2268 == 0) {
				local273 = 16776960;
				if (Static4.anIntArray3[local9] < 6) {
					local273 = Static296.anIntArray508[Static4.anIntArray3[local9]];
				}
				if (Static4.anIntArray3[local9] == 6) {
					local273 = Static168.anInt5864 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static4.anIntArray3[local9] == 7) {
					local273 = Static168.anInt5864 % 20 < 10 ? 255 : 65535;
				}
				if (Static4.anIntArray3[local9] == 8) {
					local273 = Static168.anInt5864 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static4.anIntArray3[local9] == 9) {
					local828 = 150 - Static4.anIntArray2[local9];
					if (local828 < 50) {
						local273 = local828 * 1280 + 16711680;
					} else if (local828 < 100) {
						local273 = 33160960 - local828 * 327680;
					} else if (local828 < 150) {
						local273 = (local828 - 100) * 5 + 65280;
					}
				}
				if (Static4.anIntArray3[local9] == 10) {
					local828 = 150 - Static4.anIntArray2[local9];
					if (local828 < 50) {
						local273 = local828 * 5 + 16711680;
					} else if (local828 < 100) {
						local273 = 16711935 - (local828 - 50) * 327680;
					} else if (local828 < 150) {
						local273 = (local828 - 100) * 327680 + 255 - (local828 + -100) * 5;
					}
				}
				if (Static4.anIntArray3[local9] == 11) {
					local828 = 150 - Static4.anIntArray2[local9];
					if (local828 < 50) {
						local273 = 16777215 - local828 * 327685;
					} else if (local828 < 100) {
						local273 = (local828 - 50) * 327685 + 65280;
					} else if (local828 < 150) {
						local273 = 16777215 + 32768000 - local828 * 327680;
					}
				}
				if (Static4.anIntArray7[local9] == 0) {
					Static245.aClass1_Sub1_Sub12_2.method4432(local1066, arg0 + Static225.anInt4443, arg1 + Static178.anInt3586, local273, 0);
				}
				if (Static4.anIntArray7[local9] == 1) {
					Static245.aClass1_Sub1_Sub12_2.method4433(local1066, arg0 + Static225.anInt4443, arg1 - -Static178.anInt3586, local273, Static168.anInt5864);
				}
				if (Static4.anIntArray7[local9] == 2) {
					Static245.aClass1_Sub1_Sub12_2.method4417(local1066, arg0 + Static225.anInt4443, arg1 - -Static178.anInt3586, local273, Static168.anInt5864);
				}
				if (Static4.anIntArray7[local9] == 3) {
					Static245.aClass1_Sub1_Sub12_2.method4415(local1066, arg0 + Static225.anInt4443, arg1 + Static178.anInt3586, local273, Static168.anInt5864, 150 - Static4.anIntArray2[local9]);
				}
				if (Static4.anIntArray7[local9] == 4) {
					local828 = (150 - Static4.anIntArray2[local9]) * (Static245.aClass1_Sub1_Sub12_2.method4438(local1066) + 100) / 150;
					if (Static291.aBoolean404) {
						Static133.method2163(arg0 + Static225.anInt4443 - 50, arg1, Static225.anInt4443 + arg0 + 50, arg5 + arg1);
					} else {
						Static41.method732(arg0 + Static225.anInt4443 - 50, arg1, Static225.anInt4443 + arg0 + 50, arg1 + arg5);
					}
					Static245.aClass1_Sub1_Sub12_2.method4421(local1066, arg0 + Static225.anInt4443 + 50 - local828, arg1 - -Static178.anInt3586, local273, 0);
					if (Static291.aBoolean404) {
						Static133.method2180(arg0, arg1, arg0 + arg2, arg1 - -arg5);
					} else {
						Static41.method739(arg0, arg1, arg0 + arg2, arg5 + arg1);
					}
				}
				if (Static4.anIntArray7[local9] == 5) {
					local828 = 150 - Static4.anIntArray2[local9];
					if (Static291.aBoolean404) {
						Static133.method2163(arg0, arg1 + Static178.anInt3586 - Static245.aClass1_Sub1_Sub12_2.anInt5613 - 1, arg0 + arg2, Static178.anInt3586 + arg1 + 5);
					} else {
						Static41.method732(arg0, Static178.anInt3586 + arg1 - Static245.aClass1_Sub1_Sub12_2.anInt5613 - 1, arg0 + arg2, arg1 + Static178.anInt3586 + 5);
					}
					local814 = 0;
					if (local828 < 25) {
						local814 = local828 - 25;
					} else if (local828 > 125) {
						local814 = local828 - 125;
					}
					Static245.aClass1_Sub1_Sub12_2.method4432(local1066, Static225.anInt4443 + arg0, Static178.anInt3586 + arg1 + local814, local273, 0);
					if (Static291.aBoolean404) {
						Static133.method2180(arg0, arg1, arg2 + arg0, arg5 + arg1);
					} else {
						Static41.method739(arg0, arg1, arg0 + arg2, arg5 + arg1);
					}
				}
			} else {
				Static245.aClass1_Sub1_Sub12_2.method4432(local1066, Static225.anInt4443 + arg0, arg1 + Static178.anInt3586, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
	public static void method1275() {
		Static270.aClass169_140.method4014();
	}
}
