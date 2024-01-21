import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	public static int anInt2393;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Z")
	public static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!ec;")
	private static Class22 aClass22_692 = Static60.method1113("Connection timed out)3");

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_689 = aClass22_692;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "Lclient!ec;")
	private static Class22 aClass22_690 = Static60.method1113("Loaded input handler");

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_691 = Static60.method1113(": ");

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Lclient!ec;")
	private static Class22 aClass22_693 = Static60.method1113("Unexpected server response");

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
	public static final int anInt2394 = 3353893;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "Lclient!ec;")
	public static Class22 aClass22_694 = Static60.method1113("welle:");

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_695 = aClass22_690;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
	public static int anInt2395 = 0;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "Lclient!ec;")
	public static Class22 aClass22_696 = aClass22_693;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "Lclient!wc;")
	public static Class81 aClass81_11 = new Class81(8);

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_697 = Static60.method1113("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "Lclient!ec;")
	public static Class22 aClass22_698 = Static60.method1113("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array18 = new Class22[500];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method1576() {
		aClass22_694 = null;
		aClass22_691 = null;
		aClass22_696 = null;
		aClass81_11 = null;
		aClass22_697 = null;
		aClass22_692 = null;
		aClass22_698 = null;
		aClass22_690 = null;
		aClass22Array18 = null;
		aClass22_689 = null;
		aClass22_695 = null;
		aClass22_693 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!vd;IIIILclient!qf;IIB)V")
	public static void method1577(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class60 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static130.aBoolean279 && (Static3.aByteArrayArrayArray1[0][arg7][arg1] & 0x2) == 0) {
			if ((Static3.aByteArrayArrayArray1[arg6][arg7][arg1] & 0x10) != 0) {
				return;
			}
			if (Static30.method505(arg6, arg1, arg7) != Static96.anInt2497) {
				return;
			}
		}
		if (Static128.anInt3046 > arg6) {
			Static128.anInt3046 = arg6;
		}
		@Pc(54) Class4_Sub1_Sub5 local54 = Static5.method45(arg3);
		@Pc(76) int local76;
		@Pc(79) int local79;
		if (arg4 == 1 || arg4 == 3) {
			local76 = local54.anInt1267;
			local79 = local54.anInt1256;
		} else {
			local76 = local54.anInt1256;
			local79 = local54.anInt1267;
		}
		@Pc(95) int local95;
		@Pc(99) int local99;
		if (arg7 + local76 > 104) {
			local95 = arg7;
			local99 = arg7 + 1;
		} else {
			local99 = (local76 + 1 >> 1) + arg7;
			local95 = arg7 + (local76 >> 1);
		}
		@Pc(135) int local135;
		@Pc(128) int local128;
		if (local79 + arg1 <= 104) {
			local128 = (local79 + 1 >> 1) + arg1;
			local135 = arg1 + (local79 >> 1);
		} else {
			local128 = arg1 + 1;
			local135 = arg1;
		}
		@Pc(147) int[][] local147 = Static57.anIntArrayArrayArray4[arg6];
		@Pc(155) int local155 = (local76 << 6) + (arg7 << 7);
		@Pc(163) int local163 = (local79 << 6) + (arg1 << 7);
		@Pc(175) int local175 = (arg3 << 14) + (arg1 << 7) + arg7 + 1073741824;
		if (local54.anInt1242 == 0) {
			local175 += Integer.MIN_VALUE;
		}
		@Pc(211) int local211 = local147[local99][local128] + local147[local95][local128] + local147[local95][local135] + local147[local99][local135] >> 2;
		@Pc(217) int local217 = arg2 + (arg4 << 6);
		if (local54.anInt1280 == 1) {
			local217 += 256;
		}
		if (local54.method874()) {
			Static62.method1123(arg4, local54, arg6, arg7, arg1);
		}
		@Pc(277) Class4_Sub1_Sub3 local277;
		if (arg2 != 22) {
			@Pc(380) int local380;
			if (arg2 == 10 || arg2 == 11) {
				if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
					local277 = local54.method884(local163, local211, arg4, local147, local155, 10);
				} else {
					local277 = new Class4_Sub1_Sub3_Sub5(arg3, 10, arg4, arg6, arg7, arg1, local54.anInt1259, true, null);
				}
				if (local277 != null && arg0.method1955(arg6, arg7, arg1, local211, local76, local79, local277, arg2 == 11 ? 256 : 0, local175, local217) && local54.aBoolean120) {
					local380 = 15;
					if (local277 instanceof Class4_Sub1_Sub3_Sub3) {
						local380 = ((Class4_Sub1_Sub3_Sub3) local277).method1486() / 4;
						if (local380 > 30) {
							local380 = 30;
						}
					}
					for (@Pc(398) int local398 = 0; local398 <= local76; local398++) {
						for (@Pc(402) int local402 = 0; local402 <= local79; local402++) {
							if (Static71.aByteArrayArrayArray3[arg6][arg7 + local398][local402 + arg1] < local380) {
								Static71.aByteArrayArrayArray3[arg6][local398 + arg7][arg1 + local402] = (byte) local380;
							}
						}
					}
				}
				if (local54.anInt1268 != 0 && arg5 != null) {
					arg5.method1649(local79, local54.aBoolean119, arg7, arg1, local76);
				}
			} else if (arg2 >= 12) {
				if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
					local277 = local54.method884(local163, local211, arg4, local147, local155, arg2);
				} else {
					local277 = new Class4_Sub1_Sub3_Sub5(arg3, arg2, arg4, arg6, arg7, arg1, local54.anInt1259, true, null);
				}
				arg0.method1955(arg6, arg7, arg1, local211, 1, 1, local277, 0, local175, local217);
				if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg6 > 0) {
					Static85.anIntArrayArrayArray5[arg6][arg7][arg1] |= 0x924;
				}
				if (local54.anInt1268 != 0 && arg5 != null) {
					arg5.method1649(local79, local54.aBoolean119, arg7, arg1, local76);
				}
			} else if (arg2 == 0) {
				if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
					local277 = local54.method884(local163, local211, arg4, local147, local155, 0);
				} else {
					local277 = new Class4_Sub1_Sub3_Sub5(arg3, 0, arg4, arg6, arg7, arg1, local54.anInt1259, true, null);
				}
				arg0.method1921(arg6, arg7, arg1, local211, local277, null, Static115.anIntArray309[arg4], 0, local175, local217);
				if (arg4 == 0) {
					if (local54.aBoolean120) {
						Static71.aByteArrayArrayArray3[arg6][arg7][arg1] = 50;
						Static71.aByteArrayArrayArray3[arg6][arg7][arg1 + 1] = 50;
					}
					if (local54.aBoolean118) {
						Static85.anIntArrayArrayArray5[arg6][arg7][arg1] |= 0x249;
					}
				} else if (arg4 == 1) {
					if (local54.aBoolean120) {
						Static71.aByteArrayArrayArray3[arg6][arg7][arg1 + 1] = 50;
						Static71.aByteArrayArrayArray3[arg6][arg7 + 1][arg1 + 1] = 50;
					}
					if (local54.aBoolean118) {
						Static85.anIntArrayArrayArray5[arg6][arg7][arg1 + 1] |= 0x492;
					}
				} else if (arg4 == 2) {
					if (local54.aBoolean120) {
						Static71.aByteArrayArrayArray3[arg6][arg7 + 1][arg1] = 50;
						Static71.aByteArrayArrayArray3[arg6][arg7 + 1][arg1 + 1] = 50;
					}
					if (local54.aBoolean118) {
						Static85.anIntArrayArrayArray5[arg6][arg7 + 1][arg1] |= 0x249;
					}
				} else if (arg4 == 3) {
					if (local54.aBoolean120) {
						Static71.aByteArrayArrayArray3[arg6][arg7][arg1] = 50;
						Static71.aByteArrayArrayArray3[arg6][arg7 + 1][arg1] = 50;
					}
					if (local54.aBoolean118) {
						Static85.anIntArrayArrayArray5[arg6][arg7][arg1] |= 0x492;
					}
				}
				if (local54.anInt1268 != 0 && arg5 != null) {
					arg5.method1655(local54.aBoolean119, arg2, arg7, arg1, arg4);
				}
				if (local54.anInt1275 != 16) {
					arg0.method1956(arg6, arg7, arg1, local54.anInt1275);
				}
			} else if (arg2 == 1) {
				if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
					local277 = local54.method884(local163, local211, arg4, local147, local155, 1);
				} else {
					local277 = new Class4_Sub1_Sub3_Sub5(arg3, 1, arg4, arg6, arg7, arg1, local54.anInt1259, true, null);
				}
				arg0.method1921(arg6, arg7, arg1, local211, local277, null, Static101.anIntArray291[arg4], 0, local175, local217);
				if (local54.aBoolean120) {
					if (arg4 == 0) {
						Static71.aByteArrayArrayArray3[arg6][arg7][arg1 + 1] = 50;
					} else if (arg4 == 1) {
						Static71.aByteArrayArrayArray3[arg6][arg7 + 1][arg1 + 1] = 50;
					} else if (arg4 == 2) {
						Static71.aByteArrayArrayArray3[arg6][arg7 + 1][arg1] = 50;
					} else if (arg4 == 3) {
						Static71.aByteArrayArrayArray3[arg6][arg7][arg1] = 50;
					}
				}
				if (local54.anInt1268 != 0 && arg5 != null) {
					arg5.method1655(local54.aBoolean119, arg2, arg7, arg1, arg4);
				}
			} else {
				@Pc(981) int local981;
				@Pc(1019) Class4_Sub1_Sub3 local1019;
				if (arg2 == 2) {
					local981 = arg4 + 1 & 0x3;
					@Pc(1005) Class4_Sub1_Sub3 local1005;
					if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
						local1005 = local54.method884(local163, local211, arg4 + 4, local147, local155, 2);
						local1019 = local54.method884(local163, local211, local981, local147, local155, 2);
					} else {
						local1005 = new Class4_Sub1_Sub3_Sub5(arg3, 2, arg4 + 4, arg6, arg7, arg1, local54.anInt1259, true, null);
						local1019 = new Class4_Sub1_Sub3_Sub5(arg3, 2, local981, arg6, arg7, arg1, local54.anInt1259, true, null);
					}
					arg0.method1921(arg6, arg7, arg1, local211, local1005, local1019, Static115.anIntArray309[arg4], Static115.anIntArray309[local981], local175, local217);
					if (local54.aBoolean118) {
						if (arg4 == 0) {
							Static85.anIntArrayArrayArray5[arg6][arg7][arg1] |= 0x249;
							Static85.anIntArrayArrayArray5[arg6][arg7][arg1 + 1] |= 0x492;
						} else if (arg4 == 1) {
							Static85.anIntArrayArrayArray5[arg6][arg7][arg1 + 1] |= 0x492;
							Static85.anIntArrayArrayArray5[arg6][arg7 + 1][arg1] |= 0x249;
						} else if (arg4 == 2) {
							Static85.anIntArrayArrayArray5[arg6][arg7 + 1][arg1] |= 0x249;
							Static85.anIntArrayArrayArray5[arg6][arg7][arg1] |= 0x492;
						} else if (arg4 == 3) {
							Static85.anIntArrayArrayArray5[arg6][arg7][arg1] |= 0x492;
							Static85.anIntArrayArrayArray5[arg6][arg7][arg1] |= 0x249;
						}
					}
					if (local54.anInt1268 != 0 && arg5 != null) {
						arg5.method1655(local54.aBoolean119, arg2, arg7, arg1, arg4);
					}
					if (local54.anInt1275 != 16) {
						arg0.method1956(arg6, arg7, arg1, local54.anInt1275);
					}
				} else if (arg2 == 3) {
					if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
						local277 = local54.method884(local163, local211, arg4, local147, local155, 3);
					} else {
						local277 = new Class4_Sub1_Sub3_Sub5(arg3, 3, arg4, arg6, arg7, arg1, local54.anInt1259, true, null);
					}
					arg0.method1921(arg6, arg7, arg1, local211, local277, null, Static101.anIntArray291[arg4], 0, local175, local217);
					if (local54.aBoolean120) {
						if (arg4 == 0) {
							Static71.aByteArrayArrayArray3[arg6][arg7][arg1 + 1] = 50;
						} else if (arg4 == 1) {
							Static71.aByteArrayArrayArray3[arg6][arg7 + 1][arg1 + 1] = 50;
						} else if (arg4 == 2) {
							Static71.aByteArrayArrayArray3[arg6][arg7 + 1][arg1] = 50;
						} else if (arg4 == 3) {
							Static71.aByteArrayArrayArray3[arg6][arg7][arg1] = 50;
						}
					}
					if (local54.anInt1268 != 0 && arg5 != null) {
						arg5.method1655(local54.aBoolean119, arg2, arg7, arg1, arg4);
					}
				} else if (arg2 == 9) {
					if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
						local277 = local54.method884(local163, local211, arg4, local147, local155, arg2);
					} else {
						local277 = new Class4_Sub1_Sub3_Sub5(arg3, arg2, arg4, arg6, arg7, arg1, local54.anInt1259, true, null);
					}
					arg0.method1955(arg6, arg7, arg1, local211, 1, 1, local277, 0, local175, local217);
					if (local54.anInt1268 != 0 && arg5 != null) {
						arg5.method1649(local79, local54.aBoolean119, arg7, arg1, local76);
					}
					if (local54.anInt1275 != 16) {
						arg0.method1956(arg6, arg7, arg1, local54.anInt1275);
					}
				} else if (arg2 == 4) {
					if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
						local277 = local54.method884(local163, local211, arg4, local147, local155, 4);
					} else {
						local277 = new Class4_Sub1_Sub3_Sub5(arg3, 4, arg4, arg6, arg7, arg1, local54.anInt1259, true, null);
					}
					arg0.method1962(arg6, arg7, arg1, local211, local277, null, Static115.anIntArray309[arg4], 0, 0, 0, local175, local217);
				} else if (arg2 == 5) {
					local981 = 16;
					local380 = arg0.method1957(arg6, arg7, arg1);
					if (local380 != 0) {
						local981 = Static5.method45(local380 >> 14 & 0x7FFF).anInt1275;
					}
					if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
						local1019 = local54.method884(local163, local211, arg4, local147, local155, 4);
					} else {
						local1019 = new Class4_Sub1_Sub3_Sub5(arg3, 4, arg4, arg6, arg7, arg1, local54.anInt1259, true, null);
					}
					arg0.method1962(arg6, arg7, arg1, local211, local1019, null, Static115.anIntArray309[arg4], 0, local981 * Static107.anIntArray298[arg4], local981 * Static69.anIntArray190[arg4], local175, local217);
				} else if (arg2 == 6) {
					local981 = 8;
					local380 = arg0.method1957(arg6, arg7, arg1);
					if (local380 != 0) {
						local981 = Static5.method45(local380 >> 14 & 0x7FFF).anInt1275 / 2;
					}
					if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
						local1019 = local54.method884(local163, local211, arg4 + 4, local147, local155, 4);
					} else {
						local1019 = new Class4_Sub1_Sub3_Sub5(arg3, 4, arg4 + 4, arg6, arg7, arg1, local54.anInt1259, true, null);
					}
					arg0.method1962(arg6, arg7, arg1, local211, local1019, null, 256, arg4, Static120.anIntArray315[arg4] * local981, local981 * Static35.anIntArray95[arg4], local175, local217);
				} else if (arg2 == 7) {
					local380 = arg4 + 2 & 0x3;
					if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
						local277 = local54.method884(local163, local211, local380 + 4, local147, local155, 4);
					} else {
						local277 = new Class4_Sub1_Sub3_Sub5(arg3, 4, local380 + 4, arg6, arg7, arg1, local54.anInt1259, true, null);
					}
					arg0.method1962(arg6, arg7, arg1, local211, local277, null, 256, local380, 0, 0, local175, local217);
				} else if (arg2 == 8) {
					local981 = 8;
					local380 = arg0.method1957(arg6, arg7, arg1);
					if (local380 != 0) {
						local981 = Static5.method45(local380 >> 14 & 0x7FFF).anInt1275 / 2;
					}
					@Pc(1783) int local1783 = arg4 + 2 & 0x3;
					@Pc(1814) Class4_Sub1_Sub3 local1814;
					if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
						local1019 = local54.method884(local163, local211, arg4 + 4, local147, local155, 4);
						local1814 = local54.method884(local163, local211, local1783 + 4, local147, local155, 4);
					} else {
						local1019 = new Class4_Sub1_Sub3_Sub5(arg3, 4, arg4 + 4, arg6, arg7, arg1, local54.anInt1259, true, null);
						local1814 = new Class4_Sub1_Sub3_Sub5(arg3, 4, local1783 + 4, arg6, arg7, arg1, local54.anInt1259, true, null);
					}
					arg0.method1962(arg6, arg7, arg1, local211, local1019, local1814, 256, arg4, Static120.anIntArray315[arg4] * local981, local981 * Static35.anIntArray95[arg4], local175, local217);
				}
			}
		} else if (!Static130.aBoolean279 || local54.anInt1242 != 0 || local54.anInt1268 == 1 || local54.aBoolean117) {
			if (local54.anInt1259 == -1 && local54.anIntArray137 == null) {
				local277 = local54.method884(local163, local211, arg4, local147, local155, 22);
			} else {
				local277 = new Class4_Sub1_Sub3_Sub5(arg3, 22, arg4, arg6, arg7, arg1, local54.anInt1259, true, null);
			}
			arg0.method1942(arg6, arg7, arg1, local211, local277, local175, local217);
			if (local54.anInt1268 == 1 && arg5 != null) {
				arg5.method1666(arg7, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public static void method1578(@OriginalArg(1) int arg0) {
		if (Static24.method396(arg0)) {
			Static88.method1557(-1, Static65.aClass4_Sub7ArrayArray1[arg0]);
		}
	}
}
