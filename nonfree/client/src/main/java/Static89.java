import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!rc;")
	public static Class3_Sub1_Sub14 aClass3_Sub1_Sub14_3;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "Lclient!sb;")
	public static Class25 aClass25_105;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public static int anInt2048;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "I")
	public static int anInt2050;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "Lclient!rd;")
	public static Class64 aClass64_57;

	@OriginalMember(owner = "client!r", name = "E", descriptor = "Lclient!sb;")
	public static Class25 aClass25_106;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "Lclient!rd;")
	public static Class64 aClass64_58;

	@OriginalMember(owner = "client!r", name = "G", descriptor = "I")
	public static int anInt2053;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "I")
	public static int anInt2041 = 0;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1155 = Static75.method1216(" )2> @yel@");

	@OriginalMember(owner = "client!r", name = "l", descriptor = "I")
	public static int anInt2045 = 1;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!bb;")
	public static Class8 aClass8_26 = new Class8(64);

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1157 = Static75.method1216("No response from server)3");

	@OriginalMember(owner = "client!r", name = "x", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1156 = aClass4_1157;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Z")
	public static boolean aBoolean159 = false;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "J")
	public static long aLong67 = 0L;

	@OriginalMember(owner = "client!r", name = "D", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1158 = Static75.method1216("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method1397() {
		aClass4_1156 = null;
		Class62.anIntArray264 = null;
		aClass64_57 = null;
		aClass4_1157 = null;
		aClass3_Sub1_Sub14_3 = null;
		aClass25_106 = null;
		aClass25_105 = null;
		aClass4_1155 = null;
		aClass8_26 = null;
		aClass4_1158 = null;
		aClass64_58 = null;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!qa;ILclient!jd;BIII)V")
	public static void method1398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class40 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static36.aBoolean70 && (Static11.aByteArrayArrayArray55[0][arg1][arg7] & 0x2) == 0) {
			if ((Static11.aByteArrayArrayArray55[arg3][arg1][arg7] & 0x10) != 0) {
				return;
			}
			if (Static81.method1282(arg1, arg7, arg3) != Static72.anInt1739) {
				return;
			}
		}
		if (Static47.anInt1185 > arg3) {
			Static47.anInt1185 = arg3;
		}
		@Pc(58) int local58 = Static38.anIntArrayArrayArray36[arg3][arg1 + 1][arg7];
		@Pc(66) int local66 = Static38.anIntArrayArrayArray36[arg3][arg1][arg7];
		@Pc(76) int local76 = Static38.anIntArrayArrayArray36[arg3][arg1][arg7 + 1];
		@Pc(88) int local88 = (arg7 << 7) + arg1 + (arg0 << 14) + 1073741824;
		@Pc(100) int local100 = Static38.anIntArrayArrayArray36[arg3][arg1 + 1][arg7 + 1];
		@Pc(111) int local111 = local76 + local58 + local66 + local100 >> 2;
		@Pc(115) Class3_Sub1_Sub5 local115 = Static38.method1911(arg0);
		@Pc(121) int local121 = arg6 + (arg5 << 6);
		if (local115.anInt1524 == 0) {
			local88 += Integer.MIN_VALUE;
		}
		if (local115.anInt1532 == 1) {
			local121 += 256;
		}
		if (local115.method1038()) {
			Static1.method4(arg5, arg3, arg7, arg1, local115);
		}
		@Pc(182) Class3_Sub1_Sub1 local182;
		if (arg6 != 22) {
			@Pc(273) int local273;
			if (arg6 == 10 || arg6 == 11) {
				if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
					local182 = local115.method1028(local58, local66, local76, 10, local100, arg5);
				} else {
					local182 = new Class3_Sub1_Sub1_Sub6(arg0, 10, arg5, local66, local58, local100, local76, local115.anInt1541, true);
				}
				if (local182 != null) {
					@Pc(276) int local276;
					if (arg5 == 1 || arg5 == 3) {
						local273 = local115.anInt1543;
						local276 = local115.anInt1548;
					} else {
						local273 = local115.anInt1548;
						local276 = local115.anInt1543;
					}
					@Pc(286) int local286 = 0;
					if (arg6 == 11) {
						local286 += 256;
					}
					if (arg2.method1312(arg3, arg1, arg7, local111, local273, local276, local182, local286, local88, local121) && local115.aBoolean115) {
						@Pc(319) Class3_Sub1_Sub1_Sub4 local319;
						if (local182 instanceof Class3_Sub1_Sub1_Sub4) {
							local319 = (Class3_Sub1_Sub1_Sub4) local182;
						} else {
							local319 = local115.method1028(local58, local66, local76, 10, local100, arg5);
						}
						if (local319 != null) {
							for (@Pc(328) int local328 = 0; local328 <= local273; local328++) {
								for (@Pc(332) int local332 = 0; local332 <= local276; local332++) {
									@Pc(339) int local339 = local319.method765() / 4;
									if (local339 > 30) {
										local339 = 30;
									}
									if (local339 > Static18.aByteArrayArrayArray7[arg3][local328 + arg1][arg7 + local332]) {
										Static18.aByteArrayArrayArray7[arg3][arg1 + local328][local332 + arg7] = (byte) local339;
									}
								}
							}
						}
					}
				}
				if (local115.aBoolean113 && arg4 != null) {
					arg4.method891(local115.aBoolean116, local115.anInt1543, arg7, arg5, arg1, local115.anInt1548);
				}
			} else if (arg6 >= 12) {
				if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
					local182 = local115.method1028(local58, local66, local76, arg6, local100, arg5);
				} else {
					local182 = new Class3_Sub1_Sub1_Sub6(arg0, arg6, arg5, local66, local58, local100, local76, local115.anInt1541, true);
				}
				arg2.method1312(arg3, arg1, arg7, local111, 1, 1, local182, 0, local88, local121);
				if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg3 > 0) {
					Static54.anIntArrayArrayArray12[arg3][arg1][arg7] |= 0x924;
				}
				if (local115.aBoolean113 && arg4 != null) {
					arg4.method891(local115.aBoolean116, local115.anInt1543, arg7, arg5, arg1, local115.anInt1548);
				}
			} else if (arg6 == 0) {
				if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
					local182 = local115.method1028(local58, local66, local76, 0, local100, arg5);
				} else {
					local182 = new Class3_Sub1_Sub1_Sub6(arg0, 0, arg5, local66, local58, local100, local76, local115.anInt1541, true);
				}
				arg2.method1333(arg3, arg1, arg7, local111, local182, null, Static27.anIntArray75[arg5], 0, local88, local121);
				if (arg5 == 0) {
					if (local115.aBoolean115) {
						Static18.aByteArrayArrayArray7[arg3][arg1][arg7] = 50;
						Static18.aByteArrayArrayArray7[arg3][arg1][arg7 + 1] = 50;
					}
					if (local115.aBoolean111) {
						Static54.anIntArrayArrayArray12[arg3][arg1][arg7] |= 0x249;
					}
				} else if (arg5 == 1) {
					if (local115.aBoolean115) {
						Static18.aByteArrayArrayArray7[arg3][arg1][arg7 + 1] = 50;
						Static18.aByteArrayArrayArray7[arg3][arg1 + 1][arg7 + 1] = 50;
					}
					if (local115.aBoolean111) {
						Static54.anIntArrayArrayArray12[arg3][arg1][arg7 + 1] |= 0x492;
					}
				} else if (arg5 == 2) {
					if (local115.aBoolean115) {
						Static18.aByteArrayArrayArray7[arg3][arg1 + 1][arg7] = 50;
						Static18.aByteArrayArrayArray7[arg3][arg1 + 1][arg7 + 1] = 50;
					}
					if (local115.aBoolean111) {
						Static54.anIntArrayArrayArray12[arg3][arg1 + 1][arg7] |= 0x249;
					}
				} else if (arg5 == 3) {
					if (local115.aBoolean115) {
						Static18.aByteArrayArrayArray7[arg3][arg1][arg7] = 50;
						Static18.aByteArrayArrayArray7[arg3][arg1 + 1][arg7] = 50;
					}
					if (local115.aBoolean111) {
						Static54.anIntArrayArrayArray12[arg3][arg1][arg7] |= 0x492;
					}
				}
				if (local115.aBoolean113 && arg4 != null) {
					arg4.method892(local115.aBoolean116, arg5, arg7, arg1, arg6);
				}
				if (local115.anInt1539 != 16) {
					arg2.method1340(arg3, arg1, arg7, local115.anInt1539);
				}
			} else if (arg6 == 1) {
				if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
					local182 = local115.method1028(local58, local66, local76, 1, local100, arg5);
				} else {
					local182 = new Class3_Sub1_Sub1_Sub6(arg0, 1, arg5, local66, local58, local100, local76, local115.anInt1541, true);
				}
				arg2.method1333(arg3, arg1, arg7, local111, local182, null, Static95.anIntArray283[arg5], 0, local88, local121);
				if (local115.aBoolean115) {
					if (arg5 == 0) {
						Static18.aByteArrayArrayArray7[arg3][arg1][arg7 + 1] = 50;
					} else if (arg5 == 1) {
						Static18.aByteArrayArrayArray7[arg3][arg1 + 1][arg7 + 1] = 50;
					} else if (arg5 == 2) {
						Static18.aByteArrayArrayArray7[arg3][arg1 + 1][arg7] = 50;
					} else if (arg5 == 3) {
						Static18.aByteArrayArrayArray7[arg3][arg1][arg7] = 50;
					}
				}
				if (local115.aBoolean113 && arg4 != null) {
					arg4.method892(local115.aBoolean116, arg5, arg7, arg1, arg6);
				}
			} else {
				@Pc(918) int local918;
				@Pc(955) Class3_Sub1_Sub1 local955;
				if (arg6 == 2) {
					local918 = arg5 + 1 & 0x3;
					@Pc(941) Class3_Sub1_Sub1 local941;
					if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
						local941 = local115.method1028(local58, local66, local76, 2, local100, arg5 + 4);
						local955 = local115.method1028(local58, local66, local76, 2, local100, local918);
					} else {
						local941 = new Class3_Sub1_Sub1_Sub6(arg0, 2, arg5 + 4, local66, local58, local100, local76, local115.anInt1541, true);
						local955 = new Class3_Sub1_Sub1_Sub6(arg0, 2, local918, local66, local58, local100, local76, local115.anInt1541, true);
					}
					arg2.method1333(arg3, arg1, arg7, local111, local941, local955, Static27.anIntArray75[arg5], Static27.anIntArray75[local918], local88, local121);
					if (local115.aBoolean111) {
						if (arg5 == 0) {
							Static54.anIntArrayArrayArray12[arg3][arg1][arg7] |= 0x249;
							Static54.anIntArrayArrayArray12[arg3][arg1][arg7 + 1] |= 0x492;
						} else if (arg5 == 1) {
							Static54.anIntArrayArrayArray12[arg3][arg1][arg7 + 1] |= 0x492;
							Static54.anIntArrayArrayArray12[arg3][arg1 + 1][arg7] |= 0x249;
						} else if (arg5 == 2) {
							Static54.anIntArrayArrayArray12[arg3][arg1 + 1][arg7] |= 0x249;
							Static54.anIntArrayArrayArray12[arg3][arg1][arg7] |= 0x492;
						} else if (arg5 == 3) {
							Static54.anIntArrayArrayArray12[arg3][arg1][arg7] |= 0x492;
							Static54.anIntArrayArrayArray12[arg3][arg1][arg7] |= 0x249;
						}
					}
					if (local115.aBoolean113 && arg4 != null) {
						arg4.method892(local115.aBoolean116, arg5, arg7, arg1, arg6);
					}
					if (local115.anInt1539 != 16) {
						arg2.method1340(arg3, arg1, arg7, local115.anInt1539);
					}
				} else if (arg6 == 3) {
					if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
						local182 = local115.method1028(local58, local66, local76, 3, local100, arg5);
					} else {
						local182 = new Class3_Sub1_Sub1_Sub6(arg0, 3, arg5, local66, local58, local100, local76, local115.anInt1541, true);
					}
					arg2.method1333(arg3, arg1, arg7, local111, local182, null, Static95.anIntArray283[arg5], 0, local88, local121);
					if (local115.aBoolean115) {
						if (arg5 == 0) {
							Static18.aByteArrayArrayArray7[arg3][arg1][arg7 + 1] = 50;
						} else if (arg5 == 1) {
							Static18.aByteArrayArrayArray7[arg3][arg1 + 1][arg7 + 1] = 50;
						} else if (arg5 == 2) {
							Static18.aByteArrayArrayArray7[arg3][arg1 + 1][arg7] = 50;
						} else if (arg5 == 3) {
							Static18.aByteArrayArrayArray7[arg3][arg1][arg7] = 50;
						}
					}
					if (local115.aBoolean113 && arg4 != null) {
						arg4.method892(local115.aBoolean116, arg5, arg7, arg1, arg6);
					}
				} else if (arg6 == 9) {
					if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
						local182 = local115.method1028(local58, local66, local76, arg6, local100, arg5);
					} else {
						local182 = new Class3_Sub1_Sub1_Sub6(arg0, arg6, arg5, local66, local58, local100, local76, local115.anInt1541, true);
					}
					arg2.method1312(arg3, arg1, arg7, local111, 1, 1, local182, 0, local88, local121);
					if (local115.aBoolean113 && arg4 != null) {
						arg4.method891(local115.aBoolean116, local115.anInt1543, arg7, arg5, arg1, local115.anInt1548);
					}
				} else {
					if (local115.aBoolean114) {
						if (arg5 == 1) {
							local918 = local76;
							local76 = local100;
							local100 = local58;
							local58 = local66;
							local66 = local918;
						} else if (arg5 == 2) {
							local918 = local76;
							local76 = local58;
							local58 = local918;
							local918 = local100;
							local100 = local66;
							local66 = local918;
						} else if (arg5 == 3) {
							local918 = local76;
							local76 = local66;
							local66 = local58;
							local58 = local100;
							local100 = local918;
						}
					}
					if (arg6 == 4) {
						if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
							local182 = local115.method1028(local58, local66, local76, 4, local100, 0);
						} else {
							local182 = new Class3_Sub1_Sub1_Sub6(arg0, 4, 0, local66, local58, local100, local76, local115.anInt1541, true);
						}
						arg2.method1329(arg3, arg1, arg7, local111, local182, Static27.anIntArray75[arg5], arg5 * 512, 0, 0, local88, local121);
					} else if (arg6 == 5) {
						local273 = arg2.method1339(arg3, arg1, arg7);
						local918 = 16;
						if (local273 > 0) {
							local918 = Static38.method1911(local273 >> 14 & 0x7FFF).anInt1539;
						}
						if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
							local955 = local115.method1028(local58, local66, local76, 4, local100, 0);
						} else {
							local955 = new Class3_Sub1_Sub1_Sub6(arg0, 4, 0, local66, local58, local100, local76, local115.anInt1541, true);
						}
						arg2.method1329(arg3, arg1, arg7, local111, local955, Static27.anIntArray75[arg5], arg5 * 512, local918 * Static54.anIntArray180[arg5], local918 * Static104.anIntArray323[arg5], local88, local121);
					} else if (arg6 == 6) {
						if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
							local182 = local115.method1028(local58, local66, local76, 4, local100, 0);
						} else {
							local182 = new Class3_Sub1_Sub1_Sub6(arg0, 4, 0, local66, local58, local100, local76, local115.anInt1541, true);
						}
						arg2.method1329(arg3, arg1, arg7, local111, local182, 256, arg5, 0, 0, local88, local121);
					} else if (arg6 == 7) {
						if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
							local182 = local115.method1028(local58, local66, local76, 4, local100, 0);
						} else {
							local182 = new Class3_Sub1_Sub1_Sub6(arg0, 4, 0, local66, local58, local100, local76, local115.anInt1541, true);
						}
						arg2.method1329(arg3, arg1, arg7, local111, local182, 512, arg5, 0, 0, local88, local121);
					} else if (arg6 == 8) {
						if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
							local182 = local115.method1028(local58, local66, local76, 4, local100, 0);
						} else {
							local182 = new Class3_Sub1_Sub1_Sub6(arg0, 4, 0, local66, local58, local100, local76, local115.anInt1541, true);
						}
						arg2.method1329(arg3, arg1, arg7, local111, local182, 768, arg5, 0, 0, local88, local121);
					}
				}
			}
		} else if (!Static36.aBoolean70 || local115.anInt1524 != 0 || local115.aBoolean117) {
			if (local115.anInt1541 == -1 && local115.anIntArray215 == null) {
				local182 = local115.method1028(local58, local66, local76, 22, local100, arg5);
			} else {
				local182 = new Class3_Sub1_Sub1_Sub6(arg0, 22, arg5, local66, local58, local100, local76, local115.anInt1541, true);
			}
			arg2.method1326(arg3, arg1, arg7, local111, local182, local88, local121);
			if (local115.aBoolean113 && local115.anInt1524 == 1 && arg4 != null) {
				arg4.method877(arg7, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)V")
	public static void method1399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(16) Class3_Sub1_Sub16 local16 = (Class3_Sub1_Sub16) Static92.aClass34_6.method797(local10);
		if (local16 != null) {
			Static51.aClass56_2.method1192(local16);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)[Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3[] method1401() {
		@Pc(8) Class3_Sub1_Sub4_Sub3[] local8 = new Class3_Sub1_Sub4_Sub3[Static64.anInt1616];
		for (@Pc(10) int local10 = 0; local10 < Static64.anInt1616; local10++) {
			@Pc(20) Class3_Sub1_Sub4_Sub3 local20 = local8[local10] = new Class3_Sub1_Sub4_Sub3();
			local20.anInt2607 = Static77.anInt1836;
			local20.anInt2605 = Static5.anInt256;
			local20.anInt2602 = Static55.anIntArray188[local10];
			local20.anInt2603 = Static34.anIntArray96[local10];
			local20.anInt2604 = Static15.anIntArray31[local10];
			local20.anInt2606 = Static39.anIntArray112[local10];
			local20.anIntArray327 = Static42.anIntArray156;
			local20.aByteArray22 = Static16.aByteArrayArray2[local10];
		}
		Static21.method297();
		return local8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method1403() {
		if (Static82.anInt1908 == 2) {
			Static77.method1241((Static4.anInt203 - Static93.anInt2429 << 7) + Static61.anInt1549, Static79.anInt1867 * 2, Static60.anInt1482 + (Static18.anInt456 - Static43.anInt1144 << 7));
			if (Static78.anInt454 > -1 && Static60.anInt1489 % 20 < 10) {
				Static35.aClass3_Sub1_Sub4_Sub2Array6[0].method1733(Static78.anInt454 - 12, Static82.anInt1907 - 28);
			}
		}
	}
}
