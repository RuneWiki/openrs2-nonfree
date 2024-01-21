import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
	public static int anInt2364;

	@OriginalMember(owner = "client!qa", name = "cb", descriptor = "Lclient!td;")
	public static Class54 aClass54_30;

	@OriginalMember(owner = "client!qa", name = "db", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!qa", name = "jb", descriptor = "Lclient!pc;")
	public static Class12 aClass12_69;

	@OriginalMember(owner = "client!qa", name = "nb", descriptor = "Lclient!qd;")
	public static Class54_Sub1 aClass54_Sub1_41;

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1127 = Static87.method1648("l");

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
	public static int anInt2367 = 2;

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1128 = Static87.method1648(":  ");

	@OriginalMember(owner = "client!qa", name = "ib", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1129 = Static87.method1648(":chalreq:");

	@OriginalMember(owner = "client!qa", name = "kb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1130 = Static87.method1648("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!qa", name = "lb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1131 = Static87.method1648("lila:");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V")
	public static void method1663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) ((arg0 << 16) + arg1);
		@Pc(21) Class3_Sub3_Sub16 local21 = (Class3_Sub3_Sub16) Static8.aClass14_1.method317(local15);
		if (local21 != null) {
			Static61.aClass11_2.method255(local21);
		}
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public static void method1664() {
		if (Static88.aClass5_1 == null) {
			return;
		}
		Static57.method1103();
		if (Static15.anInt297 > 0) {
			Static88.aClass5_1.method1233(256);
			Static15.anInt297 = 0;
		}
		Static88.aClass5_1.method1230();
		Static88.aClass5_1 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIILclient!pb;Lclient!ed;)V")
	public static void method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class49 arg6, @OriginalArg(8) Class18 arg7) {
		if (Static70.aBoolean94 && (Static89.aByteArrayArrayArray11[0][arg5][arg0] & 0x2) == 0) {
			if ((Static89.aByteArrayArrayArray11[arg1][arg5][arg0] & 0x10) != 0) {
				return;
			}
			if (Static68.method1244(arg5, arg1, arg0) != Static13.anInt767) {
				return;
			}
		}
		if (arg1 < Static80.anInt2191) {
			Static80.anInt2191 = arg1;
		}
		@Pc(61) int local61 = Static55.anIntArrayArrayArray4[arg1][arg5 + 1][arg0];
		@Pc(69) int local69 = Static55.anIntArrayArrayArray4[arg1][arg5][arg0];
		@Pc(81) int local81 = Static55.anIntArrayArrayArray4[arg1][arg5 + 1][arg0 + 1];
		@Pc(91) int local91 = Static55.anIntArrayArrayArray4[arg1][arg5][arg0 + 1];
		@Pc(95) Class3_Sub3_Sub4 local95 = Static108.method1902(arg2);
		@Pc(106) int local106 = local91 + local69 + local61 + local81 >> 2;
		@Pc(119) int local119 = arg5 + (arg0 << 7) + (arg2 << 14) + 1073741824;
		@Pc(126) int local126 = (arg4 << 6) + arg3;
		if (local95.anInt1311 == 0) {
			local119 += Integer.MIN_VALUE;
		}
		if (local95.anInt1307 == 1) {
			local126 += 256;
		}
		if (local95.method976()) {
			Static12.method244(local95, arg1, arg5, arg4, arg0);
		}
		@Pc(184) Class3_Sub3_Sub1 local184;
		if (arg3 != 22) {
			@Pc(284) int local284;
			if (arg3 == 10 || arg3 == 11) {
				if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
					local184 = local95.method977(local91, local69, local61, 10, arg4, local81);
				} else {
					local184 = new Class3_Sub3_Sub1_Sub2(arg2, 10, arg4, local69, local61, local81, local91, local95.anInt1318, true);
				}
				if (local184 != null) {
					@Pc(281) int local281;
					if (arg4 == 1 || arg4 == 3) {
						local281 = local95.anInt1334;
						local284 = local95.anInt1309;
					} else {
						local281 = local95.anInt1309;
						local284 = local95.anInt1334;
					}
					@Pc(294) int local294 = 0;
					if (arg3 == 11) {
						local294 += 256;
					}
					if (arg7.method494(arg1, arg5, arg0, local106, local284, local281, local184, local294, local119, local126) && local95.aBoolean62) {
						@Pc(327) Class3_Sub3_Sub1_Sub1 local327;
						if (local184 instanceof Class3_Sub3_Sub1_Sub1) {
							local327 = (Class3_Sub3_Sub1_Sub1) local184;
						} else {
							local327 = local95.method977(local91, local69, local61, 10, arg4, local81);
						}
						if (local327 != null) {
							for (@Pc(336) int local336 = 0; local336 <= local284; local336++) {
								for (@Pc(340) int local340 = 0; local340 <= local281; local340++) {
									@Pc(347) int local347 = local327.method416() / 4;
									if (local347 > 30) {
										local347 = 30;
									}
									if (Static82.aByteArrayArrayArray7[arg1][arg5 + local336][local340 + arg0] < local347) {
										Static82.aByteArrayArrayArray7[arg1][local336 + arg5][arg0 + local340] = (byte) local347;
									}
								}
							}
						}
					}
				}
				if (local95.aBoolean68 && arg6 != null) {
					arg6.method1534(arg5, arg0, local95.aBoolean64, arg4, local95.anInt1334, local95.anInt1309);
				}
			} else if (arg3 >= 12) {
				if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
					local184 = local95.method977(local91, local69, local61, arg3, arg4, local81);
				} else {
					local184 = new Class3_Sub3_Sub1_Sub2(arg2, arg3, arg4, local69, local61, local81, local91, local95.anInt1318, true);
				}
				arg7.method494(arg1, arg5, arg0, local106, 1, 1, local184, 0, local119, local126);
				if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
					Static86.anIntArrayArrayArray5[arg1][arg5][arg0] |= 0x924;
				}
				if (local95.aBoolean68 && arg6 != null) {
					arg6.method1534(arg5, arg0, local95.aBoolean64, arg4, local95.anInt1334, local95.anInt1309);
				}
			} else if (arg3 == 0) {
				if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
					local184 = local95.method977(local91, local69, local61, 0, arg4, local81);
				} else {
					local184 = new Class3_Sub3_Sub1_Sub2(arg2, 0, arg4, local69, local61, local81, local91, local95.anInt1318, true);
				}
				arg7.method521(arg1, arg5, arg0, local106, local184, null, Static68.anIntArray300[arg4], 0, local119, local126);
				if (arg4 == 0) {
					if (local95.aBoolean62) {
						Static82.aByteArrayArrayArray7[arg1][arg5][arg0] = 50;
						Static82.aByteArrayArrayArray7[arg1][arg5][arg0 + 1] = 50;
					}
					if (local95.aBoolean60) {
						Static86.anIntArrayArrayArray5[arg1][arg5][arg0] |= 0x249;
					}
				} else if (arg4 == 1) {
					if (local95.aBoolean62) {
						Static82.aByteArrayArrayArray7[arg1][arg5][arg0 + 1] = 50;
						Static82.aByteArrayArrayArray7[arg1][arg5 + 1][arg0 + 1] = 50;
					}
					if (local95.aBoolean60) {
						Static86.anIntArrayArrayArray5[arg1][arg5][arg0 + 1] |= 0x492;
					}
				} else if (arg4 == 2) {
					if (local95.aBoolean62) {
						Static82.aByteArrayArrayArray7[arg1][arg5 + 1][arg0] = 50;
						Static82.aByteArrayArrayArray7[arg1][arg5 + 1][arg0 + 1] = 50;
					}
					if (local95.aBoolean60) {
						Static86.anIntArrayArrayArray5[arg1][arg5 + 1][arg0] |= 0x249;
					}
				} else if (arg4 == 3) {
					if (local95.aBoolean62) {
						Static82.aByteArrayArrayArray7[arg1][arg5][arg0] = 50;
						Static82.aByteArrayArrayArray7[arg1][arg5 + 1][arg0] = 50;
					}
					if (local95.aBoolean60) {
						Static86.anIntArrayArrayArray5[arg1][arg5][arg0] |= 0x492;
					}
				}
				if (local95.aBoolean68 && arg6 != null) {
					arg6.method1531(local95.aBoolean64, arg5, arg3, arg0, arg4);
				}
				if (local95.anInt1336 != 16) {
					arg7.method501(arg1, arg5, arg0, local95.anInt1336);
				}
			} else if (arg3 == 1) {
				if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
					local184 = local95.method977(local91, local69, local61, 1, arg4, local81);
				} else {
					local184 = new Class3_Sub3_Sub1_Sub2(arg2, 1, arg4, local69, local61, local81, local91, local95.anInt1318, true);
				}
				arg7.method521(arg1, arg5, arg0, local106, local184, null, Static18.anIntArray61[arg4], 0, local119, local126);
				if (local95.aBoolean62) {
					if (arg4 == 0) {
						Static82.aByteArrayArrayArray7[arg1][arg5][arg0 + 1] = 50;
					} else if (arg4 == 1) {
						Static82.aByteArrayArrayArray7[arg1][arg5 + 1][arg0 + 1] = 50;
					} else if (arg4 == 2) {
						Static82.aByteArrayArrayArray7[arg1][arg5 + 1][arg0] = 50;
					} else if (arg4 == 3) {
						Static82.aByteArrayArrayArray7[arg1][arg5][arg0] = 50;
					}
				}
				if (local95.aBoolean68 && arg6 != null) {
					arg6.method1531(local95.aBoolean64, arg5, arg3, arg0, arg4);
				}
			} else {
				@Pc(931) int local931;
				@Pc(968) Class3_Sub3_Sub1 local968;
				if (arg3 == 2) {
					local931 = arg4 + 1 & 0x3;
					@Pc(954) Class3_Sub3_Sub1 local954;
					if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
						local954 = local95.method977(local91, local69, local61, 2, arg4 + 4, local81);
						local968 = local95.method977(local91, local69, local61, 2, local931, local81);
					} else {
						local954 = new Class3_Sub3_Sub1_Sub2(arg2, 2, arg4 + 4, local69, local61, local81, local91, local95.anInt1318, true);
						local968 = new Class3_Sub3_Sub1_Sub2(arg2, 2, local931, local69, local61, local81, local91, local95.anInt1318, true);
					}
					arg7.method521(arg1, arg5, arg0, local106, local954, local968, Static68.anIntArray300[arg4], Static68.anIntArray300[local931], local119, local126);
					if (local95.aBoolean60) {
						if (arg4 == 0) {
							Static86.anIntArrayArrayArray5[arg1][arg5][arg0] |= 0x249;
							Static86.anIntArrayArrayArray5[arg1][arg5][arg0 + 1] |= 0x492;
						} else if (arg4 == 1) {
							Static86.anIntArrayArrayArray5[arg1][arg5][arg0 + 1] |= 0x492;
							Static86.anIntArrayArrayArray5[arg1][arg5 + 1][arg0] |= 0x249;
						} else if (arg4 == 2) {
							Static86.anIntArrayArrayArray5[arg1][arg5 + 1][arg0] |= 0x249;
							Static86.anIntArrayArrayArray5[arg1][arg5][arg0] |= 0x492;
						} else if (arg4 == 3) {
							Static86.anIntArrayArrayArray5[arg1][arg5][arg0] |= 0x492;
							Static86.anIntArrayArrayArray5[arg1][arg5][arg0] |= 0x249;
						}
					}
					if (local95.aBoolean68 && arg6 != null) {
						arg6.method1531(local95.aBoolean64, arg5, arg3, arg0, arg4);
					}
					if (local95.anInt1336 != 16) {
						arg7.method501(arg1, arg5, arg0, local95.anInt1336);
					}
				} else if (arg3 == 3) {
					if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
						local184 = local95.method977(local91, local69, local61, 3, arg4, local81);
					} else {
						local184 = new Class3_Sub3_Sub1_Sub2(arg2, 3, arg4, local69, local61, local81, local91, local95.anInt1318, true);
					}
					arg7.method521(arg1, arg5, arg0, local106, local184, null, Static18.anIntArray61[arg4], 0, local119, local126);
					if (local95.aBoolean62) {
						if (arg4 == 0) {
							Static82.aByteArrayArrayArray7[arg1][arg5][arg0 + 1] = 50;
						} else if (arg4 == 1) {
							Static82.aByteArrayArrayArray7[arg1][arg5 + 1][arg0 + 1] = 50;
						} else if (arg4 == 2) {
							Static82.aByteArrayArrayArray7[arg1][arg5 + 1][arg0] = 50;
						} else if (arg4 == 3) {
							Static82.aByteArrayArrayArray7[arg1][arg5][arg0] = 50;
						}
					}
					if (local95.aBoolean68 && arg6 != null) {
						arg6.method1531(local95.aBoolean64, arg5, arg3, arg0, arg4);
					}
				} else if (arg3 == 9) {
					if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
						local184 = local95.method977(local91, local69, local61, arg3, arg4, local81);
					} else {
						local184 = new Class3_Sub3_Sub1_Sub2(arg2, arg3, arg4, local69, local61, local81, local91, local95.anInt1318, true);
					}
					arg7.method494(arg1, arg5, arg0, local106, 1, 1, local184, 0, local119, local126);
					if (local95.aBoolean68 && arg6 != null) {
						arg6.method1534(arg5, arg0, local95.aBoolean64, arg4, local95.anInt1334, local95.anInt1309);
					}
				} else {
					if (local95.aBoolean67) {
						if (arg4 == 1) {
							local931 = local91;
							local91 = local81;
							local81 = local61;
							local61 = local69;
							local69 = local931;
						} else if (arg4 == 2) {
							local931 = local91;
							local91 = local61;
							local61 = local931;
							local931 = local81;
							local81 = local69;
							local69 = local931;
						} else if (arg4 == 3) {
							local931 = local91;
							local91 = local69;
							local69 = local61;
							local61 = local81;
							local81 = local931;
						}
					}
					if (arg3 == 4) {
						if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
							local184 = local95.method977(local91, local69, local61, 4, 0, local81);
						} else {
							local184 = new Class3_Sub3_Sub1_Sub2(arg2, 4, 0, local69, local61, local81, local91, local95.anInt1318, true);
						}
						arg7.method509(arg1, arg5, arg0, local106, local184, Static68.anIntArray300[arg4], arg4 * 512, 0, 0, local119, local126);
					} else if (arg3 == 5) {
						local931 = 16;
						local284 = arg7.method505(arg1, arg5, arg0);
						if (local284 > 0) {
							local931 = Static108.method1902(local284 >> 14 & 0x7FFF).anInt1336;
						}
						if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
							local968 = local95.method977(local91, local69, local61, 4, 0, local81);
						} else {
							local968 = new Class3_Sub3_Sub1_Sub2(arg2, 4, 0, local69, local61, local81, local91, local95.anInt1318, true);
						}
						arg7.method509(arg1, arg5, arg0, local106, local968, Static68.anIntArray300[arg4], arg4 * 512, Static72.anIntArray318[arg4] * local931, Static54.anIntArray237[arg4] * local931, local119, local126);
					} else if (arg3 == 6) {
						if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
							local184 = local95.method977(local91, local69, local61, 4, 0, local81);
						} else {
							local184 = new Class3_Sub3_Sub1_Sub2(arg2, 4, 0, local69, local61, local81, local91, local95.anInt1318, true);
						}
						arg7.method509(arg1, arg5, arg0, local106, local184, 256, arg4, 0, 0, local119, local126);
					} else if (arg3 == 7) {
						if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
							local184 = local95.method977(local91, local69, local61, 4, 0, local81);
						} else {
							local184 = new Class3_Sub3_Sub1_Sub2(arg2, 4, 0, local69, local61, local81, local91, local95.anInt1318, true);
						}
						arg7.method509(arg1, arg5, arg0, local106, local184, 512, arg4, 0, 0, local119, local126);
					} else if (arg3 == 8) {
						if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
							local184 = local95.method977(local91, local69, local61, 4, 0, local81);
						} else {
							local184 = new Class3_Sub3_Sub1_Sub2(arg2, 4, 0, local69, local61, local81, local91, local95.anInt1318, true);
						}
						arg7.method509(arg1, arg5, arg0, local106, local184, 768, arg4, 0, 0, local119, local126);
					}
				}
			}
		} else if (!Static70.aBoolean94 || local95.anInt1311 != 0 || local95.aBoolean66) {
			if (local95.anInt1318 == -1 && local95.anIntArray215 == null) {
				local184 = local95.method977(local91, local69, local61, 22, arg4, local81);
			} else {
				local184 = new Class3_Sub3_Sub1_Sub2(arg2, 22, arg4, local69, local61, local81, local91, local95.anInt1318, true);
			}
			arg7.method522(arg1, arg5, arg0, local106, local184, local119, local126);
			if (local95.aBoolean68 && local95.anInt1311 == 1 && arg6 != null) {
				arg6.method1525(arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
	public static void method1666() {
		if (Static15.aClass53_1 != null) {
			@Pc(3) Class53 local3 = Static15.aClass53_1;
			synchronized (Static15.aClass53_1) {
				Static15.aClass53_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)V")
	public static void method1669() {
		anIntArray353 = null;
		aClass27_1129 = null;
		aClass27_1128 = null;
		aClass12_69 = null;
		aClass54_30 = null;
		aClass27_1130 = null;
		aClass27_1127 = null;
		aClass27_1131 = null;
		aClass54_Sub1_41 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lclient!od;")
	public static Class3_Sub3_Sub10 method1670(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub3_Sub10 local10 = (Class3_Sub3_Sub10) Static45.aClass21_12.method658((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(33) byte[] local33 = Static70.aClass54_25.method1615(4, arg0);
		local10 = new Class3_Sub3_Sub10();
		if (local33 != null) {
			local10.method1505(new Class3_Sub11(local33), arg0);
		}
		local10.method1504();
		Static45.aClass21_12.method660(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIBIILclient!wd;)V")
	public static void method1671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3_Sub11 arg6) {
		@Pc(31) int local31;
		if (arg5 < 0 || arg5 >= 104 || arg1 < 0 || arg1 >= 104) {
			while (true) {
				local31 = arg6.method1421();
				if (local31 == 0) {
					break;
				}
				if (local31 == 1) {
					arg6.method1421();
					break;
				}
				if (local31 <= 49) {
					arg6.method1421();
				}
			}
			return;
		}
		Static89.aByteArrayArrayArray11[arg0][arg5][arg1] = 0;
		while (true) {
			local31 = arg6.method1421();
			if (local31 == 0) {
				if (arg0 == 0) {
					Static55.anIntArrayArrayArray4[0][arg5][arg1] = -Static64.method1185(arg2 + arg5 + 932731, arg3 + arg1 + 556238) * 8;
				} else {
					Static55.anIntArrayArrayArray4[arg0][arg5][arg1] = Static55.anIntArrayArrayArray4[arg0 - 1][arg5][arg1] - 240;
				}
				break;
			}
			if (local31 == 1) {
				@Pc(89) int local89 = arg6.method1421();
				if (local89 == 1) {
					local89 = 0;
				}
				if (arg0 == 0) {
					Static55.anIntArrayArrayArray4[0][arg5][arg1] = -local89 * 8;
				} else {
					Static55.anIntArrayArrayArray4[arg0][arg5][arg1] = Static55.anIntArrayArrayArray4[arg0 - 1][arg5][arg1] - local89 * 8;
				}
				break;
			}
			if (local31 <= 49) {
				Static73.aByteArrayArrayArray6[arg0][arg5][arg1] = arg6.method1432();
				Static48.aByteArrayArrayArray10[arg0][arg5][arg1] = (byte) ((local31 - 2) / 4);
				Static57.aByteArrayArrayArray4[arg0][arg5][arg1] = (byte) (arg4 + local31 - 2 & 0x3);
			} else if (local31 <= 81) {
				Static89.aByteArrayArrayArray11[arg0][arg5][arg1] = (byte) (local31 - 49);
			} else {
				Static69.aByteArrayArrayArray5[arg0][arg5][arg1] = (byte) (local31 - 81);
			}
		}
	}
}
