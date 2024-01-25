import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
	public static int anInt1764;

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
	public static int anInt1771;

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
	public static int anInt1766 = 0;

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
	public static int anInt1772 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIZIIIBZIILclient!ja;Lclient!c;)V")
	public static void method1743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class81 arg10, @OriginalArg(12) Class27 arg11) {
		if (!Static16.method287() && !Static247.method4078(arg1, arg4, Static77.anInt1421, arg2)) {
			return;
		}
		if (arg2 < Static320.anInt5932) {
			Static320.anInt5932 = arg2;
		}
		@Pc(25) Class66 local25 = Static196.method3622(arg0);
		if (Static13.anInt232 == 1 && local25.aBoolean100) {
			return;
		}
		@Pc(47) int local47;
		@Pc(50) int local50;
		if (arg9 == 1 || arg9 == 3) {
			local47 = local25.lb;
			local50 = local25.anInt1489;
		} else {
			local47 = local25.anInt1489;
			local50 = local25.lb;
		}
		@Pc(73) int local73;
		@Pc(71) int local71;
		if (local47 + arg1 > Static153.anInt2883) {
			local71 = arg1 + 1;
			local73 = arg1;
		} else {
			local73 = arg1 + (local47 >> 1);
			local71 = (local47 + 1 >> 1) + arg1;
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		if (Static246.anInt4606 >= arg4 + local50) {
			local105 = (local50 >> 1) + arg4;
			local113 = arg4 + (local50 + 1 >> 1);
		} else {
			local105 = arg4;
			local113 = arg4 + 1;
		}
		@Pc(125) Class106 local125 = Static203.aClass106Array3[arg5];
		@Pc(149) int local149 = local125.method5720(local73, local105) + local125.method5720(local71, local105) + local125.method5720(local73, local113) + local125.method5720(local71, local113) >> 2;
		@Pc(158) int local158 = (arg1 << 7) + (local47 << 6);
		@Pc(166) int local166 = (local50 << 6) + (arg4 << 7);
		@Pc(177) boolean local177 = arg7 && !arg3 && local25.aBoolean107;
		if (local25.method1374()) {
			Static152.method3082(arg1, arg2, null, arg9, arg4, local25, null);
		}
		@Pc(211) boolean local211 = arg6 == -1 && local25.anInt1487 == -1 && local25.anIntArray166 == null && local25.anIntArray162 == null && !local25.aBoolean112;
		if (Static169.aBoolean231 && local25.anInt1498 != 1) {
			return;
		}
		if (arg8 != 22) {
			@Pc(334) Class44_Sub4 local334;
			@Pc(304) Class44_Sub4_Sub5 local304;
			@Pc(336) int local336;
			@Pc(403) int local403;
			@Pc(399) int local399;
			if (arg8 == 10 || arg8 == 11) {
				local304 = null;
				if (local211) {
					@Pc(365) Class44_Sub4_Sub5 local365 = new Class44_Sub4_Sub5(arg10, local25, arg2, arg5, local158, local149, local166, arg3, arg1, local47 + arg1 - 1, arg4, local50 + arg4 - 1, arg8, arg9, local177);
					local336 = local365.method5806();
					local304 = local365;
					local334 = local365;
				} else {
					local334 = new Class44_Sub4_Sub1(arg10, local25, arg8, arg9, arg2, arg5, local158, local149, local166, arg3, arg1, arg1 + local47 - 1, arg4, local50 + arg4 - 1, arg6);
					local336 = 15;
				}
				if (Static73.method1271(local334, false)) {
					if (local304 != null && local304.method5798()) {
						local304.method5794(arg10);
					}
					if (local25.aBoolean102 && arg7) {
						if (local336 > 30) {
							local336 = 30;
						}
						for (local399 = 0; local399 <= local47; local399++) {
							for (local403 = 0; local403 <= local50; local403++) {
								local125.method5714(arg1 + local399, arg4 + local403, local336);
							}
						}
					}
				}
				if (local25.anInt1486 != 0 && arg11 != null) {
					arg11.method526(!local25.aBoolean106, arg4, local25.aBoolean101, arg1, local50, local47);
				}
			} else if (arg8 >= 12 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
				if (local211) {
					local304 = new Class44_Sub4_Sub5(arg10, local25, arg2, arg5, local158, local149, local166, arg3, arg1, arg1 + local47 - 1, arg4, arg4 + local50 - 1, arg8, arg9, local177);
					if (local304.method5798()) {
						local304.method5794(arg10);
					}
					local334 = local304;
				} else {
					local334 = new Class44_Sub4_Sub1(arg10, local25, arg8, arg9, arg2, arg5, local158, local149, local166, arg3, arg1, arg1 + local47 - 1, arg4, arg4 + local50 - 1, arg6);
				}
				Static73.method1271(local334, false);
				if (arg7 && !arg3 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg2 > 0 && local25.anInt1498 != 0) {
					Static238.aByteArrayArrayArray13[arg2][arg1][arg4] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1][arg4] | 0x4);
				}
				if (local25.anInt1486 != 0 && arg11 != null) {
					arg11.method526(!local25.aBoolean106, arg4, local25.aBoolean101, arg1, local50, local47);
				}
			} else {
				@Pc(624) Class44_Sub5 local624;
				@Pc(640) Class44_Sub5_Sub1 local640;
				if (arg8 == 0) {
					if (local211) {
						local640 = new Class44_Sub5_Sub1(arg10, local25, arg5, local158, local149, local166, arg3, arg8, arg9, local177);
						local624 = local640;
						if (local640.method5798()) {
							local640.method5794(arg10);
						}
					} else {
						local624 = new Class44_Sub5_Sub2(arg10, local25, 0, arg9, arg2, arg5, local158, local149, local166, arg3, arg6);
					}
					Static151.method3073(arg2, arg1, arg4, local624, null);
					if (arg7) {
						if (arg9 == 0) {
							if (local25.aBoolean102) {
								local125.method5714(arg1, arg4, 50);
								local125.method5714(arg1, arg4 + 1, 50);
							}
							if (local25.anInt1498 == 1 && !arg3) {
								Static238.aByteArrayArrayArray13[arg2][arg1][arg4] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1][arg4] | 0x1);
							}
						} else if (arg9 == 1) {
							if (local25.aBoolean102) {
								local125.method5714(arg1, arg4 + 1, 50);
								local125.method5714(arg1 + 1, arg4 + 1, 50);
							}
							if (local25.anInt1498 == 1 && !arg3) {
								Static238.aByteArrayArrayArray13[arg2][arg1][arg4 + 1] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1][arg4 + 1] | 0x2);
							}
						} else if (arg9 == 2) {
							if (local25.aBoolean102) {
								local125.method5714(arg1 + 1, arg4, 50);
								local125.method5714(arg1 + 1, arg4 - -1, 50);
							}
							if (local25.anInt1498 == 1 && !arg3) {
								Static238.aByteArrayArrayArray13[arg2][arg1 + 1][arg4] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1 + 1][arg4] | 0x1);
							}
						} else if (arg9 == 3) {
							if (local25.aBoolean102) {
								local125.method5714(arg1, arg4, 50);
								local125.method5714(arg1 + 1, arg4, 50);
							}
							if (local25.anInt1498 == 1 && !arg3) {
								Static238.aByteArrayArrayArray13[arg2][arg1][arg4] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1][arg4] | 0x2);
							}
						}
					}
					if (local25.anInt1486 != 0 && arg11 != null) {
						arg11.method523(arg1, !local25.aBoolean106, arg9, arg8, arg4, local25.aBoolean101);
					}
					if (local25.anInt1464 != 16) {
						Static186.method3517(arg2, arg1, arg4, local25.anInt1464);
					}
				} else if (arg8 == 1) {
					if (local211) {
						local640 = new Class44_Sub5_Sub1(arg10, local25, arg5, local158, local149, local166, arg3, arg8, arg9, local177);
						local624 = local640;
						if (local640.method5798()) {
							local640.method5794(arg10);
						}
					} else {
						local624 = new Class44_Sub5_Sub2(arg10, local25, 1, arg9, arg2, arg5, local158, local149, local166, arg3, arg6);
					}
					Static151.method3073(arg2, arg1, arg4, local624, null);
					if (local25.aBoolean102 && arg7) {
						if (arg9 == 0) {
							local125.method5714(arg1, arg4 + 1, 50);
						} else if (arg9 == 1) {
							local125.method5714(arg1 + 1, arg4 - -1, 50);
						} else if (arg9 == 2) {
							local125.method5714(arg1 + 1, arg4, 50);
						} else if (arg9 == 3) {
							local125.method5714(arg1, arg4, 50);
						}
					}
					if (local25.anInt1486 != 0 && arg11 != null) {
						arg11.method523(arg1, !local25.aBoolean106, arg9, arg8, arg4, local25.aBoolean101);
					}
				} else {
					@Pc(1059) Class44_Sub5 local1059;
					if (arg8 == 2) {
						local336 = arg9 + 1 & 0x3;
						if (local211) {
							@Pc(1077) Class44_Sub5_Sub1 local1077 = new Class44_Sub5_Sub1(arg10, local25, arg5, local158, local149, local166, arg3, arg8, arg9 + 4, local177);
							@Pc(1091) Class44_Sub5_Sub1 local1091 = new Class44_Sub5_Sub1(arg10, local25, arg5, local158, local149, local166, arg3, arg8, local336, local177);
							if (local1077.method5798()) {
								local1077.method5794(arg10);
							}
							if (local1091.method5798()) {
								local1091.method5794(arg10);
							}
							local624 = local1077;
							local1059 = local1091;
						} else {
							local624 = new Class44_Sub5_Sub2(arg10, local25, 2, arg9 + 4, arg2, arg5, local158, local149, local166, arg3, arg6);
							local1059 = new Class44_Sub5_Sub2(arg10, local25, 2, local336, arg2, arg5, local158, local149, local166, arg3, arg6);
						}
						Static151.method3073(arg2, arg1, arg4, local624, local1059);
						if (local25.anInt1498 == 1 && arg7 && !arg3) {
							if (arg9 == 0) {
								Static238.aByteArrayArrayArray13[arg2][arg1][arg4] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1][arg4] | 0x1);
								Static238.aByteArrayArrayArray13[arg2][arg1][arg4 + 1] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1][arg4 + 1] | 0x2);
							} else if (arg9 == 1) {
								Static238.aByteArrayArrayArray13[arg2][arg1][arg4 + 1] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1][arg4 + 1] | 0x2);
								Static238.aByteArrayArrayArray13[arg2][arg1 + 1][arg4] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1 + 1][arg4] | 0x1);
							} else if (arg9 == 2) {
								Static238.aByteArrayArrayArray13[arg2][arg1 + 1][arg4] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1 + 1][arg4] | 0x1);
								Static238.aByteArrayArrayArray13[arg2][arg1][arg4] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1][arg4] | 0x2);
							} else if (arg9 == 3) {
								Static238.aByteArrayArrayArray13[arg2][arg1][arg4] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1][arg4] | 0x2);
								Static238.aByteArrayArrayArray13[arg2][arg1][arg4] = (byte) (Static238.aByteArrayArrayArray13[arg2][arg1][arg4] | 0x1);
							}
						}
						if (local25.anInt1486 != 0 && arg11 != null) {
							arg11.method523(arg1, !local25.aBoolean106, arg9, arg8, arg4, local25.aBoolean101);
						}
						if (local25.anInt1464 != 16) {
							Static186.method3517(arg2, arg1, arg4, local25.anInt1464);
						}
					} else if (arg8 == 3) {
						if (local211) {
							@Pc(1365) Class44_Sub5_Sub1 local1365 = new Class44_Sub5_Sub1(arg10, local25, arg5, local158, local149, local166, arg3, arg8, arg9, local177);
							local1059 = local1365;
							if (local1365.method5798()) {
								local1365.method5794(arg10);
							}
						} else {
							local1059 = new Class44_Sub5_Sub2(arg10, local25, 3, arg9, arg2, arg5, local158, local149, local166, arg3, arg6);
						}
						Static151.method3073(arg2, arg1, arg4, local1059, null);
						if (local25.aBoolean102 && arg7) {
							if (arg9 == 0) {
								local125.method5714(arg1, arg4 + 1, 50);
							} else if (arg9 == 1) {
								local125.method5714(arg1 + 1, arg4 + 1, 50);
							} else if (arg9 == 2) {
								local125.method5714(arg1 + 1, arg4, 50);
							} else if (arg9 == 3) {
								local125.method5714(arg1, arg4, 50);
							}
						}
						if (local25.anInt1486 != 0 && arg11 != null) {
							arg11.method523(arg1, !local25.aBoolean106, arg9, arg8, arg4, local25.aBoolean101);
						}
					} else if (arg8 == 9) {
						@Pc(1505) Class44_Sub4 local1505;
						if (local211) {
							@Pc(1526) Class44_Sub4_Sub5 local1526 = new Class44_Sub4_Sub5(arg10, local25, arg2, arg5, local158, local149, local166, arg3, arg1, arg1, arg4, arg4, arg8, arg9, local177);
							local1505 = local1526;
							if (local1526.method5798()) {
								local1526.method5794(arg10);
							}
						} else {
							local1505 = new Class44_Sub4_Sub1(arg10, local25, arg8, arg9, arg2, arg5, local158, local149, local166, arg3, arg1, arg1 + local47 - 1, arg4, local50 + arg4 - 1, arg6);
						}
						Static73.method1271(local1505, false);
						if (local25.anInt1486 != 0 && arg11 != null) {
							arg11.method526(!local25.aBoolean106, arg4, local25.aBoolean101, arg1, local50, local47);
						}
						if (local25.anInt1464 != 16) {
							Static186.method3517(arg2, arg1, arg4, local25.anInt1464);
						}
					} else {
						@Pc(1599) Class44_Sub1 local1599;
						if (arg8 == 4) {
							if (local211) {
								@Pc(1597) Class44_Sub1_Sub2 local1597 = new Class44_Sub1_Sub2(arg10, local25, arg5, local158, local149, local166, arg3, 0, 0, 0, arg8, arg9);
								local1599 = local1597;
								if (local1597.method5798()) {
									local1597.method5794(arg10);
								}
							} else {
								local1599 = new Class44_Sub1_Sub1(arg10, local25, arg8, arg9, arg2, arg5, local158, local149, local166, arg3, 0, 0, 0, arg6);
							}
							Static317.method5315(arg2, arg1, arg4, local1599, null);
						} else {
							@Pc(1645) Interface7 local1645;
							@Pc(1680) Class44_Sub1_Sub2 local1680;
							if (arg8 == 5) {
								local336 = 16;
								local1645 = (Interface7) Static9.method161(arg2, arg1, arg4);
								if (local1645 != null) {
									local336 = Static196.method3622(local1645.method5799()).anInt1464;
								}
								if (local211) {
									local1680 = new Class44_Sub1_Sub2(arg10, local25, arg5, local158, local149, local166, arg3, 0, Static147.anIntArray341[arg9] * local336, Static262.anIntArray528[arg9] * local336, arg8, arg9);
									if (local1680.method5798()) {
										local1680.method5794(arg10);
									}
									local1599 = local1680;
								} else {
									local1599 = new Class44_Sub1_Sub1(arg10, local25, arg8, arg9, arg2, arg5, local158, local149, local166, arg3, 0, Static147.anIntArray341[arg9] * local336, Static262.anIntArray528[arg9] * local336, arg6);
								}
								Static317.method5315(arg2, arg1, arg4, local1599, null);
							} else if (arg8 == 6) {
								local336 = 8;
								local1645 = (Interface7) Static9.method161(arg2, arg1, arg4);
								if (local1645 != null) {
									local336 = Static196.method3622(local1645.method5799()).anInt1464 / 2;
								}
								if (local211) {
									local1680 = new Class44_Sub1_Sub2(arg10, local25, arg5, local158, local149, local166, arg3, arg9, Static147.anIntArray341[arg9] * local336, local336 * Static262.anIntArray528[arg9], arg8, arg9 + 4);
									local1599 = local1680;
									if (local1680.method5798()) {
										local1680.method5794(arg10);
									}
								} else {
									local1599 = new Class44_Sub1_Sub1(arg10, local25, arg8, arg9 + 4, arg2, arg5, local158, local149, local166, arg3, arg9, local336 * Static9.anIntArray15[arg9], Static216.anIntArray463[arg9] * local336, arg6);
								}
								Static317.method5315(arg2, arg1, arg4, local1599, null);
							} else if (arg8 == 7) {
								local336 = arg9 + 2 & 0x3;
								if (local211) {
									@Pc(1853) Class44_Sub1_Sub2 local1853 = new Class44_Sub1_Sub2(arg10, local25, arg5, local158, local149, local166, arg3, local336, 0, 0, arg8, local336 + 4);
									if (local1853.method5798()) {
										local1853.method5794(arg10);
									}
									local1599 = local1853;
								} else {
									local1599 = new Class44_Sub1_Sub1(arg10, local25, arg8, local336 + 4, arg2, arg5, local158, local149, local166, arg3, local336, 0, 0, arg6);
								}
								Static317.method5315(arg2, arg1, arg4, local1599, null);
							} else if (arg8 == 8) {
								local399 = arg9 + 2 & 0x3;
								local403 = 8;
								@Pc(1911) Interface7 local1911 = (Interface7) Static9.method161(arg2, arg1, arg4);
								if (local1911 != null) {
									local403 = Static196.method3622(local1911.method5799()).anInt1464 / 2;
								}
								@Pc(1950) Class44_Sub1 local1950;
								@Pc(1968) Class44_Sub1 local1968;
								if (local211) {
									local1950 = new Class44_Sub1_Sub2(arg10, local25, arg5, local158, local149, local166, arg3, arg9, local403 * Static9.anIntArray15[arg9], Static216.anIntArray463[arg9] * local403, arg8, arg9 + 4);
									local1968 = new Class44_Sub1_Sub2(arg10, local25, arg5, local158, local149, local166, arg3, arg9, 0, 0, arg8, local399 + 4);
									if (local1950.method5798()) {
										local1950.method5794(arg10);
									}
									if (local1968.method5798()) {
										local1968.method5794(arg10);
									}
								} else {
									local1950 = new Class44_Sub1_Sub1(arg10, local25, arg8, arg9, arg2, arg5, local158, local149, local166, arg3, arg9, local403 * Static9.anIntArray15[arg9], Static216.anIntArray463[arg9] * local403, arg6);
									local1968 = new Class44_Sub1_Sub1(arg10, local25, arg8, arg9, arg2, arg5, local158, local149, local166, arg3, arg9, 0, 0, arg6);
								}
								Static317.method5315(arg2, arg1, arg4, local1950, local1968);
							}
						}
					}
				}
			}
		} else if (Static293.aBoolean382 || local25.anInt1476 != 0 || local25.anInt1486 == 1 || local25.aBoolean110) {
			@Pc(261) Class44_Sub3 local261;
			if (local211) {
				@Pc(251) Class44_Sub3_Sub1 local251 = new Class44_Sub3_Sub1(arg10, local25, arg5, local158, local149, local166, arg3, arg9, local177);
				if (local251.method5798()) {
					local251.method5794(arg10);
				}
				local261 = local251;
			} else {
				local261 = new Class44_Sub3_Sub2(arg10, local25, arg9, arg2, arg5, local158, local149, local166, arg3, arg6);
			}
			Static343.method5634(arg2, arg1, arg4, local261);
			if (local25.anInt1486 == 1 && arg11 != null) {
				arg11.method514(arg1, arg4);
			}
		}
	}
}
