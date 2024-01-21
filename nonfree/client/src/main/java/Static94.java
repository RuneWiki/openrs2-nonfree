import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!re", name = "O", descriptor = "I")
	public static int anInt594;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "Z")
	private static boolean aBoolean26;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "B")
	public static byte aByte2 = 0;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "[J")
	public static long[] aLongArray2 = new long[200];

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Lclient!m;")
	public static Class3_Sub6 aClass3_Sub6_3 = new Class3_Sub6(8);

	@OriginalMember(owner = "client!re", name = "v", descriptor = "Lclient!ae;")
	public static Class5 aClass5_263 = Static56.method972("m");

	@OriginalMember(owner = "client!re", name = "M", descriptor = "Lclient!ae;")
	private static Class5 aClass5_264 = Static56.method972("Loading title screen )2 ");

	@OriginalMember(owner = "client!re", name = "P", descriptor = "Lclient!ae;")
	private static Class5 aClass5_266 = Static56.method972("Attack");

	@OriginalMember(owner = "client!re", name = "N", descriptor = "Lclient!ae;")
	public static Class5 aClass5_265 = aClass5_266;

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_267 = aClass5_264;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method383() {
		aClass3_Sub6_3 = null;
		aLongArray2 = null;
		aClass5_263 = null;
		aClass5_265 = null;
		aClass5_266 = null;
		aClass5_267 = null;
		aClass5_264 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIBILclient!qc;)V")
	public static void method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub13 arg3) {
		if (Static75.anInt1934 >= 400) {
			return;
		}
		if (arg3.anIntArray251 != null) {
			arg3 = arg3.method1480();
		}
		if (arg3 == null || !arg3.aBoolean106) {
			return;
		}
		@Pc(28) Class5 local28 = arg3.aClass5_1000;
		if (arg3.anInt2194 != 0) {
			local28 = Static75.method1261(new Class5[] { local28, Static44.method837(Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1581, arg3.anInt2194), Static112.aClass5_1326, Static16.aClass5_271, Static96.method1319(arg3.anInt2194), Static92.aClass5_1083 });
		}
		if (Static14.anInt2886 == 1) {
			Static4.method129(arg0, Static68.aClass5_762, arg2, Static75.method1261(new Class5[] { Static85.aClass5_967, Static56.aClass5_740, local28 }), arg1, 47);
		} else if (!Static100.aBoolean124) {
			@Pc(114) Class5[] local114 = arg3.aClass5Array14;
			if (Static74.aBoolean90) {
				local114 = Static22.method439(local114);
			}
			@Pc(124) int local124;
			if (local114 != null) {
				for (local124 = 4; local124 >= 0; local124--) {
					if (local114[local124] != null && !local114[local124].method171(aClass5_265)) {
						@Pc(143) byte local143 = 0;
						if (local124 == 0) {
							local143 = 42;
						}
						if (local124 == 1) {
							local143 = 17;
						}
						if (local124 == 2) {
							local143 = 13;
						}
						if (local124 == 3) {
							local143 = 53;
						}
						if (local124 == 4) {
							local143 = 46;
						}
						Static4.method129(arg0, local114[local124], arg2, Static75.method1261(new Class5[] { Static23.aClass5_314, local28 }), arg1, local143);
					}
				}
			}
			if (local114 != null) {
				for (local124 = 4; local124 >= 0; local124--) {
					if (local114[local124] != null && local114[local124].method171(aClass5_265)) {
						@Pc(221) int local221 = 0;
						@Pc(223) short local223 = 0;
						if (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1581 < arg3.anInt2194) {
							local223 = 2000;
						}
						if (local124 == 0) {
							local221 = local223 + 42;
						}
						if (local124 == 1) {
							local221 = local223 + 17;
						}
						if (local124 == 2) {
							local221 = local223 + 13;
						}
						if (local124 == 3) {
							local221 = local223 + 53;
						}
						if (local124 == 4) {
							local221 = local223 + 46;
						}
						Static4.method129(arg0, local114[local124], arg2, Static75.method1261(new Class5[] { Static23.aClass5_314, local28 }), arg1, local221);
					}
				}
			}
			Static4.method129(arg0, Static21.aClass5_310, arg2, Static75.method1261(new Class5[] { Static23.aClass5_314, local28 }), arg1, 1001);
		} else if ((Static62.anInt1672 & 0x2) == 2) {
			Static4.method129(arg0, Static16.aClass5_274, arg2, Static75.method1261(new Class5[] { Static15.aClass5_210, Static56.aClass5_740, local28 }), arg1, 48);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!kd;BII)V")
	public static void method387(@OriginalArg(0) Class3_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16;
		if ((arg2 & 0x40) != 0) {
			local16 = Static75.aClass3_Sub6_Sub1_2.method1591();
			@Pc(19) byte[] local19 = new byte[local16];
			@Pc(24) Class3_Sub6 local24 = new Class3_Sub6(local19);
			Static75.aClass3_Sub6_Sub1_2.method1584(local19, local16);
			Static100.aClass3_Sub6Array1[arg1] = local24;
			arg0.method1002(local24);
		}
		if ((arg2 & 0x100) != 0) {
			arg0.anInt1554 = Static75.aClass3_Sub6_Sub1_2.method1607();
			arg0.anInt1534 = Static75.aClass3_Sub6_Sub1_2.method1618();
			arg0.anInt1548 = Static75.aClass3_Sub6_Sub1_2.method1607();
			arg0.anInt1547 = Static75.aClass3_Sub6_Sub1_2.method1607();
			arg0.anInt1520 = Static75.aClass3_Sub6_Sub1_2.method1636() + Static3.anInt289;
			arg0.anInt1528 = Static75.aClass3_Sub6_Sub1_2.method1636() + Static3.anInt289;
			arg0.anInt1558 = Static75.aClass3_Sub6_Sub1_2.method1618();
			arg0.method998();
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt1538 = Static75.aClass3_Sub6_Sub1_2.method1603();
			local16 = Static75.aClass3_Sub6_Sub1_2.method1615();
			arg0.anInt1540 = (local16 & 0xFFFF) + Static3.anInt289;
			if (arg0.anInt1538 == 65535) {
				arg0.anInt1538 = -1;
			}
			arg0.anInt1569 = 0;
			arg0.anInt1545 = 0;
			arg0.anInt1555 = local16 >> 16;
			if (Static3.anInt289 < arg0.anInt1540) {
				arg0.anInt1545 = -1;
			}
		}
		if ((arg2 & 0x1) != 0) {
			arg0.aClass5_758 = Static75.aClass3_Sub6_Sub1_2.method1627();
			if (arg0.aClass5_758.method164(0) == 126) {
				arg0.aClass5_758 = arg0.aClass5_758.method159(1);
				Static64.method1084(arg0.aClass5_765, arg0.aClass5_758, 2);
			} else if (arg0 == Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1) {
				Static64.method1084(arg0.aClass5_765, arg0.aClass5_758, 2);
			}
			arg0.anInt1539 = 0;
			arg0.anInt1522 = 150;
			arg0.anInt1561 = 0;
		}
		if ((arg2 & 0x10) != 0) {
			arg0.anInt1525 = Static75.aClass3_Sub6_Sub1_2.method1636();
			if (arg0.anInt1525 == 65535) {
				arg0.anInt1525 = -1;
			}
		}
		if ((arg2 & 0x2) != 0) {
			arg0.anInt1578 = Static75.aClass3_Sub6_Sub1_2.method1636();
			arg0.anInt1565 = Static75.aClass3_Sub6_Sub1_2.method1604();
		}
		@Pc(244) int local244;
		if ((arg2 & 0x8) != 0) {
			local16 = Static75.aClass3_Sub6_Sub1_2.method1636();
			local244 = Static75.aClass3_Sub6_Sub1_2.method1618();
			if (local16 == 65535) {
				local16 = -1;
			}
			Static50.method902(arg0, local16, local244);
		}
		if ((arg2 & 0x4) != 0) {
			local16 = Static75.aClass3_Sub6_Sub1_2.method1603();
			local244 = Static75.aClass3_Sub6_Sub1_2.method1587();
			@Pc(275) int local275 = Static75.aClass3_Sub6_Sub1_2.method1591();
			@Pc(278) int local278 = Static75.aClass3_Sub6_Sub1_2.anInt2416;
			if (arg0.aClass5_765 != null && arg0.aClass48_2 != null) {
				@Pc(289) long local289 = arg0.aClass5_765.method146();
				@Pc(291) boolean local291 = false;
				if (local244 <= 1) {
					for (@Pc(298) int local298 = 0; local298 < Static17.anInt616; local298++) {
						if (Static56.aLongArray4[local298] == local289) {
							local291 = true;
							break;
						}
					}
				}
				if (!local291 && Static54.anInt1413 == 0) {
					Static57.aClass3_Sub6_4.anInt2416 = 0;
					Static75.aClass3_Sub6_Sub1_2.method1586(local275, Static57.aClass3_Sub6_4.aByteArray17);
					Static57.aClass3_Sub6_4.anInt2416 = 0;
					@Pc(348) Class5 local348 = Static105.method1751(Static57.aClass3_Sub6_4).method132();
					arg0.aClass5_758 = local348.method143();
					arg0.anInt1522 = 150;
					arg0.anInt1561 = local16 >> 8;
					arg0.anInt1539 = local16 & 0xFF;
					if (local244 == 2 || local244 == 3) {
						Static64.method1084(Static75.method1261(new Class5[] { Static91.aClass5_1071, arg0.aClass5_765 }), local348, 1);
					} else if (local244 == 1) {
						Static64.method1084(Static75.method1261(new Class5[] { Static58.aClass5_775, arg0.aClass5_765 }), local348, 1);
					} else {
						Static64.method1084(arg0.aClass5_765, local348, 2);
					}
				}
			}
			Static75.aClass3_Sub6_Sub1_2.anInt2416 = local278 + local275;
		}
		if ((arg2 & 0x400) != 0) {
			local16 = Static75.aClass3_Sub6_Sub1_2.method1587();
			local244 = Static75.aClass3_Sub6_Sub1_2.method1607();
			arg0.method996(Static3.anInt289, local16, local244);
			arg0.anInt1518 = Static3.anInt289 + 300;
			arg0.anInt1580 = Static75.aClass3_Sub6_Sub1_2.method1591();
			arg0.anInt1537 = Static75.aClass3_Sub6_Sub1_2.method1587();
		}
		if ((arg2 & 0x20) == 0) {
			return;
		}
		local16 = Static75.aClass3_Sub6_Sub1_2.method1618();
		local244 = Static75.aClass3_Sub6_Sub1_2.method1587();
		arg0.method996(Static3.anInt289, local16, local244);
		arg0.anInt1518 = Static3.anInt289 + 300;
		arg0.anInt1580 = Static75.aClass3_Sub6_Sub1_2.method1618();
		arg0.anInt1537 = Static75.aClass3_Sub6_Sub1_2.method1618();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V")
	public static void method388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg4 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg1 & 0x7FF;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg3;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(47) int local47;
		if (local10 != 0) {
			local32 = Static107.anIntArray343[local10];
			local36 = Static107.anIntArray357[local10];
			local47 = local36 * 0 - arg3 * local32 >> 16;
			local23 = local32 * 0 + arg3 * local36 >> 16;
			local19 = local47;
		}
		if (local17 != 0) {
			local32 = Static107.anIntArray343[local17];
			local36 = Static107.anIntArray357[local17];
			local47 = local23 * local32 + local36 * 0 >> 16;
			local23 = local36 * local23 - local32 * 0 >> 16;
			local21 = local47;
		}
		Static60.anInt2989 = arg2 - local23;
		Static70.anInt1827 = arg4;
		Static85.anInt2111 = arg5 - local19;
		Static68.anInt1577 = arg1;
		Static89.anInt2280 = arg0 - local21;
	}
}
