import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "Lclient!wu;")
	public static Class393 aClass393_1;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "Lclient!el;")
	public static final Class109 aClass109_37 = new Class109(51, 6);

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BIIILclient!ec;)V")
	public static void method1351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8_Sub1_Sub3_Sub2 arg3) {
		@Pc(9) Class101 local9 = arg3.method5991(110);
		@Pc(19) int local19 = arg3.anInt7043 - arg3.aClass270_7.anInt7432 & 0x3FFF;
		if (arg2 == -1) {
			if (local19 != 0 || arg3.anInt7004 > 25) {
				if (arg1 < 0 && local9.anInt2203 != -1) {
					arg3.anInt7008 = local9.anInt2203;
					arg3.aBoolean543 = false;
				} else if (arg1 <= 0 || local9.anInt2206 == -1) {
					arg3.anInt7008 = local9.anInt2202;
				} else {
					arg3.anInt7008 = local9.anInt2206;
				}
				arg3.aBoolean543 = false;
			} else if (!arg3.aBoolean543 || !local9.method1912(arg3.anInt7008)) {
				arg3.anInt7008 = local9.method1911();
				arg3.aBoolean543 = arg3.anInt7008 != -1;
			}
		} else if (arg3.anInt7041 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(51) int local51 = Static220.anIntArray205[arg0] - arg3.aClass270_7.anInt7432 & 0x3FFF;
			if (arg2 == 2 && local9.anInt2168 != -1) {
				if (local51 > 2048 && local51 <= 6144 && local9.anInt2197 != -1) {
					arg3.anInt7008 = local9.anInt2197;
				} else if (local51 >= 10240 && local51 < 14336 && local9.anInt2185 != -1) {
					arg3.anInt7008 = local9.anInt2185;
				} else if (local51 <= 6144 || local51 >= 10240 || local9.anInt2179 == -1) {
					arg3.anInt7008 = local9.anInt2168;
				} else {
					arg3.anInt7008 = local9.anInt2179;
				}
			} else if (arg2 == 0 && local9.anInt2165 != -1) {
				if (local51 > 2048 && local51 <= 6144 && local9.anInt2182 != -1) {
					arg3.anInt7008 = local9.anInt2182;
				} else if (local51 >= 10240 && local51 < 14336 && local9.anInt2172 != -1) {
					arg3.anInt7008 = local9.anInt2172;
				} else if (local51 <= 6144 || local51 >= 10240 || local9.anInt2205 == -1) {
					arg3.anInt7008 = local9.anInt2165;
				} else {
					arg3.anInt7008 = local9.anInt2205;
				}
			} else if (local51 > 2048 && local51 <= 6144 && local9.anInt2187 != -1) {
				arg3.anInt7008 = local9.anInt2187;
			} else if (local51 >= 10240 && local51 < 14336 && local9.anInt2196 != -1) {
				arg3.anInt7008 = local9.anInt2196;
			} else if (local51 <= 6144 || local51 >= 10240 || local9.anInt2201 == -1) {
				arg3.anInt7008 = local9.anInt2202;
			} else {
				arg3.anInt7008 = local9.anInt2201;
			}
			arg3.aBoolean543 = false;
		} else if (local19 == 0 && arg3.anInt7004 <= 25) {
			if (arg2 == 2 && local9.anInt2168 != -1) {
				arg3.anInt7008 = local9.anInt2168;
			} else if (arg2 == 0 && local9.anInt2165 != -1) {
				arg3.anInt7008 = local9.anInt2165;
			} else {
				arg3.anInt7008 = local9.anInt2202;
			}
			arg3.aBoolean543 = false;
		} else {
			arg3.aBoolean543 = false;
			if (arg2 == 2 && local9.anInt2168 != -1) {
				if (arg1 < 0 && local9.anInt2180 != -1) {
					arg3.anInt7008 = local9.anInt2180;
				} else if (arg1 <= 0 || local9.anInt2194 == -1) {
					arg3.anInt7008 = local9.anInt2168;
				} else {
					arg3.anInt7008 = local9.anInt2194;
				}
			} else if (arg2 == 0 && local9.anInt2165 != -1) {
				if (arg1 < 0 && local9.anInt2184 != -1) {
					arg3.anInt7008 = local9.anInt2184;
				} else if (arg1 <= 0 || local9.anInt2193 == -1) {
					arg3.anInt7008 = local9.anInt2165;
				} else {
					arg3.anInt7008 = local9.anInt2193;
				}
			} else if (arg1 < 0 && local9.anInt2183 != -1) {
				arg3.anInt7008 = local9.anInt2183;
			} else if (arg1 <= 0 || local9.anInt2190 == -1) {
				arg3.anInt7008 = local9.anInt2202;
			} else {
				arg3.anInt7008 = local9.anInt2190;
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBI)Z")
	public static boolean method1352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)Z")
	public static boolean method1353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= 0 && arg1 >= 0 && arg2 < Static220.aByteArrayArrayArray14[1].length && Static220.aByteArrayArrayArray14[1][arg2].length > arg1) {
			return (Static220.aByteArrayArrayArray14[1][arg2][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method1354(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(6) int local6 = arg0 ? 1 : 0;
		Static379.anInt6501 = 0;
		Static513.anInt8747 = 0;
		Static674.anInt10789++;
		@Pc(22) Class8_Sub1 local22;
		if ((arg5 & 0x2) == 0) {
			for (local22 = Static494.aClass8_Sub1Array3[local6]; local22 != null; local22 = local22.aClass8_Sub1_23) {
				if (!Static311.method4726(local22, arg0, arg1, arg2, arg3)) {
					Static354.method5312(local22);
					if (local22.anInt10361 != -1) {
						Static322.aClass8_Sub1Array2[Static379.anInt6501++] = local22;
					}
				}
			}
		}
		@Pc(157) int local157;
		if ((arg5 & 0x1) == 0) {
			for (local22 = Static607.aClass8_Sub1Array4[local6]; local22 != null; local22 = local22.aClass8_Sub1_23) {
				if (!Static311.method4726(local22, arg0, arg1, arg2, arg3)) {
					Static354.method5312(local22);
					if (local22.anInt10361 != -1) {
						Static272.aClass8_Sub1Array1[Static513.anInt8747++] = local22;
					}
				}
			}
			for (@Pc(98) Class8_Sub1 local98 = Static654.aClass8_Sub1Array5[local6]; local98 != null; local98 = local98.aClass8_Sub1_23) {
				if (!Static311.method4726(local98, arg0, arg1, arg2, arg3)) {
					if (local98.method8897(false)) {
						Static354.method5312(local98);
						if (local98.anInt10361 != -1) {
							Static272.aClass8_Sub1Array1[Static513.anInt8747++] = local98;
						}
					} else {
						Static354.method5312(local98);
						if (local98.anInt10361 != -1) {
							Static322.aClass8_Sub1Array2[Static379.anInt6501++] = local98;
						}
					}
				}
			}
			if (!arg0) {
				for (local157 = 0; local157 < Static158.anInt2473; local157++) {
					if (!Static311.method4726(Static15.aClass8_Sub1_Sub3Array1[local157], arg0, arg1, arg2, arg3)) {
						Static354.method5312(Static15.aClass8_Sub1_Sub3Array1[local157]);
						if (Static15.aClass8_Sub1_Sub3Array1[local157].anInt10361 != -1) {
							if (Static15.aClass8_Sub1_Sub3Array1[local157].method8897(false)) {
								Static272.aClass8_Sub1Array1[Static513.anInt8747++] = Static15.aClass8_Sub1_Sub3Array1[local157];
							} else {
								Static322.aClass8_Sub1Array2[Static379.anInt6501++] = Static15.aClass8_Sub1_Sub3Array1[local157];
							}
						}
					}
				}
			}
		}
		@Pc(225) int local225;
		if (Static379.anInt6501 > 0) {
			Static675.method9296(Static322.aClass8_Sub1Array2, 0, Static379.anInt6501 - 1);
			for (local225 = 0; local225 < Static379.anInt6501; local225++) {
				Static628.method8779(Static322.aClass8_Sub1Array2[local225], arg6);
			}
		}
		if (Static238.aBoolean310) {
			Static205.aClass57_5.method7716(0, (Class5_Sub43[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local225 = Static89.anInt1507; local225 < Static490.anInt9715; local225++) {
				@Pc(304) boolean[][] local304;
				@Pc(316) int local316;
				@Pc(323) int local323;
				@Pc(325) int local325;
				@Pc(263) int local263;
				if (local225 < arg2 || arg1 == null) {
					local263 = Static300.aBooleanArrayArray6.length;
					if (Static551.anInt9313 + Static300.aBooleanArrayArray6.length > Static328.anInt5870) {
						local263 -= Static551.anInt9313 + Static300.aBooleanArrayArray6.length - Static328.anInt5870;
					}
					local157 = Static300.aBooleanArrayArray6[0].length;
					if (Static609.anInt10106 + Static300.aBooleanArrayArray6[0].length > Static526.anInt8863) {
						local157 -= Static609.anInt10106 + Static300.aBooleanArrayArray6[0].length - Static526.anInt8863;
					}
					local304 = Static543.aBooleanArrayArray8;
					if (Static523.aBoolean667) {
						if (Static218.aBoolean283) {
							local304 = Static535.aBooleanArrayArrayArray4[local225];
						}
						for (local316 = Static508.anInt8701; local316 < local263; local316++) {
							local323 = local316 + Static551.anInt9313 - Static508.anInt8701;
							for (local325 = Static196.anInt3200; local325 < local157; local325++) {
								if (Static300.aBooleanArrayArray6[local316][local325] && !Static9.method108(local325 + Static609.anInt10106 - Static196.anInt3200, local225, 119, local323)) {
									local304[local316][local325] = true;
								} else {
									local304[local316][local325] = false;
								}
							}
						}
					}
					if (Static218.aBoolean283) {
						if (arg4 >= 0) {
							Static242.aClass22Array3[local225].method8042(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static242.aClass22Array3[local225].method8040(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static69.anInt1122; local316++) {
							Static333.aClass95Array1[local316].method1680(new Class8_Sub4(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static242.aClass22Array3[local225].method8042(Static128.anInt7021, Static97.anInt1574, Static28.anInt9243, Static543.aBooleanArrayArray8, true, arg4, arg5);
					} else {
						Static242.aClass22Array3[local225].method8040(Static128.anInt7021, Static97.anInt1574, Static28.anInt9243, Static543.aBooleanArrayArray8, true, arg5);
					}
				} else {
					local263 = Static300.aBooleanArrayArray6.length;
					if (Static551.anInt9313 + Static300.aBooleanArrayArray6.length > Static328.anInt5870) {
						local263 -= Static551.anInt9313 + Static300.aBooleanArrayArray6.length - Static328.anInt5870;
					}
					local157 = Static300.aBooleanArrayArray6[0].length;
					if (Static609.anInt10106 + Static300.aBooleanArrayArray6[0].length > Static526.anInt8863) {
						local157 -= Static609.anInt10106 + Static300.aBooleanArrayArray6[0].length - Static526.anInt8863;
					}
					local304 = Static543.aBooleanArrayArray8;
					if (Static523.aBoolean667) {
						if (Static218.aBoolean283) {
							local304 = Static535.aBooleanArrayArrayArray4[local225];
						}
						for (local316 = Static508.anInt8701; local316 < local263; local316++) {
							local323 = local316 + Static551.anInt9313 - Static508.anInt8701;
							for (local325 = Static196.anInt3200; local325 < local157; local325++) {
								local304[local316][local325] = false;
								if (Static300.aBooleanArrayArray6[local316][local325]) {
									@Pc(344) int local344 = local325 + Static609.anInt10106 - Static196.anInt3200;
									for (@Pc(346) int local346 = local225; local346 >= 0; local346--) {
										if (Static260.aClass174ArrayArrayArray2[local346][local323][local344] != null && Static260.aClass174ArrayArrayArray2[local346][local323][local344].aByte65 == local225) {
											if ((local346 < arg2 || arg1[local346][local323][local344] != arg3) && !Static9.method108(local344, local225, 115, local323)) {
												local304[local316][local325] = true;
												break;
											}
											local304[local316][local325] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static218.aBoolean283) {
						if (arg4 >= 0) {
							Static242.aClass22Array3[local225].method8042(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static242.aClass22Array3[local225].method8040(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local316 = 0; local316 < Static69.anInt1122; local316++) {
							Static333.aClass95Array1[local316].method1680(new Class8_Sub4(local225 + 1));
						}
					} else if (arg4 >= 0) {
						Static242.aClass22Array3[local225].method8042(Static128.anInt7021, Static97.anInt1574, Static28.anInt9243, Static543.aBooleanArrayArray8, false, arg4, arg5);
					} else {
						Static242.aClass22Array3[local225].method8040(Static128.anInt7021, Static97.anInt1574, Static28.anInt9243, Static543.aBooleanArrayArray8, false, arg5);
					}
				}
			}
		}
		if (Static513.anInt8747 > 0) {
			Static357.method5333(Static272.aClass8_Sub1Array1, 0, Static513.anInt8747 - 1);
			for (local225 = 0; local225 < Static513.anInt8747; local225++) {
				Static628.method8779(Static272.aClass8_Sub1Array1[local225], arg6);
			}
		}
	}
}
