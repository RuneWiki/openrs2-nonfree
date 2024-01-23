import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "[I")
	public static int[] anIntArray22;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
	public static int anInt238 = 0;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString17 = " ";

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
	public static int anInt242 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[B")
	public static byte[] method246(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub4 local8 = (Class1_Sub2_Sub4) Static255.aClass49_11.method1381((long) arg0);
		if (local8 == null) {
			@Pc(14) byte[] local14 = new byte[512];
			@Pc(20) Random local20 = new Random((long) arg0);
			@Pc(22) int local22;
			for (local22 = 0; local22 < 255; local22++) {
				local14[local22] = (byte) local22;
			}
			for (local22 = 0; local22 < 255; local22++) {
				@Pc(43) int local43 = 255 - local22;
				@Pc(48) int local48 = Static186.method3095(local20, local43);
				@Pc(52) byte local52 = local14[local48];
				local14[local48] = local14[local43];
				local14[local43] = local14[511 - local22] = local52;
			}
			local8 = new Class1_Sub2_Sub4(local14);
			Static255.aClass49_11.method1385(local8, (long) arg0);
		}
		return local8.aByteArray7;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method247() {
		Static108.aClass1_Sub2_Sub11Array1 = null;
		Static221.aClass12Array6 = null;
		Static262.aClass1_Sub2_Sub11Array11 = null;
		Static39.aClass1_Sub2_Sub1_1 = null;
		Static88.aClass1_Sub2_Sub1_2 = null;
		Static211.aClass1_Sub2_Sub11Array7 = null;
		Static135.aClass1_Sub2_Sub11Array3 = null;
		Static111.aClass1_Sub2_Sub11Array2 = null;
		Static178.aClass12Array5 = null;
		Static248.aClass1_Sub2_Sub11Array10 = null;
		Static77.aClass1_Sub2_Sub11_8 = null;
		Static93.aClass1_Sub2_Sub11_Sub2Array1 = null;
		Static284.aClass1_Sub2_Sub11Array12 = null;
		Static194.aClass1_Sub2_Sub11Array6 = null;
		Static171.aClass1_Sub2_Sub11_15 = null;
		Static89.aClass1_Sub2_Sub1_Sub2_3 = null;
		Static183.aClass1_Sub2_Sub11Array8 = null;
		Static232.aClass1_Sub2_Sub11Array9 = null;
		Static134.aClass1_Sub2_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([BI[Lclient!la;IBIZI)[I")
	public static int[] method248(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11;
		@Pc(16) int local16;
		if (!arg5) {
			for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
				for (local11 = 0; local11 < 64; local11++) {
					for (local16 = 0; local16 < 64; local16++) {
						if (local11 + arg6 > 0 && arg6 + local11 < 103 && local16 + arg1 > 0 && arg1 + local16 < 103) {
							arg2[local6].anIntArrayArray15[arg6 + local11][arg1 + local16] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(89) byte local89;
		if (arg5) {
			local89 = 1;
		} else {
			local89 = 4;
		}
		@Pc(102) Class1_Sub11 local102 = new Class1_Sub11(arg0);
		local11 = arg4 + arg6;
		local16 = arg1 + arg3;
		@Pc(132) int local132;
		for (@Pc(120) int local120 = 0; local120 < local89; local120++) {
			for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
				for (local132 = 0; local132 < 64; local132++) {
					Static1.method3383(0, 0, false, arg6 + local125, local125 + local11, local16 + local132, arg1 + local132, local102, 0, arg5, local120);
				}
			}
		}
		@Pc(168) boolean local168 = false;
		@Pc(170) boolean local170 = false;
		@Pc(238) int local238;
		@Pc(257) int local257;
		@Pc(262) int local262;
		@Pc(349) int local349;
		@Pc(275) int local275;
		while (local102.anInt3264 < local102.aByteArray47.length) {
			local132 = local102.method2690();
			if (local132 == 128) {
				Static67.anIntArray140[0] = local102.method2691();
				local168 = true;
				Static67.anIntArray140[1] = local102.method2632();
				Static67.anIntArray140[2] = local102.method2632();
				Static67.anIntArray140[3] = local102.method2632();
				Static67.anIntArray140[4] = local102.method2691();
			} else {
				if (local132 != 129) {
					local102.anInt3264--;
					break;
				}
				for (local238 = 0; local238 < 4; local238++) {
					@Pc(247) byte local247 = local102.method2663();
					if (local247 == 0) {
						local257 = arg6;
						if (arg6 < 0) {
							local257 = 0;
						} else if (arg6 >= 104) {
							local257 = 104;
						}
						local349 = arg1;
						local262 = arg6 + 64;
						if (local262 < 0) {
							local262 = 0;
						} else if (local262 >= 104) {
							local262 = 104;
						}
						if (arg1 < 0) {
							local349 = 0;
						} else if (arg1 >= 104) {
							local349 = 104;
						}
						local275 = arg1 + 64;
						if (local275 < 0) {
							local275 = 0;
						} else if (local275 >= 104) {
							local275 = 104;
						}
						while (local262 > local257) {
							while (local349 < local275) {
								Static106.aByteArrayArrayArray17[local238][local257][local349] = 0;
								local349++;
							}
							local257++;
						}
					} else if (local247 == 1) {
						for (local257 = 0; local257 < 64; local257 += 4) {
							for (local262 = 0; local262 < 64; local262 += 4) {
								@Pc(271) byte local271 = local102.method2663();
								for (local275 = arg6 + local257; local275 < arg6 + local257 + 4; local275++) {
									for (@Pc(287) int local287 = local262 + arg1; local287 < local262 + arg1 + 4; local287++) {
										if (local275 >= 0 && local275 < 104 && local287 >= 0 && local287 < 104) {
											Static106.aByteArrayArrayArray17[local238][local275][local287] = local271;
										}
									}
								}
							}
						}
					} else if (local247 == 2 && local238 > 0) {
						local257 = arg6;
						local262 = arg6 + 64;
						local349 = arg1;
						if (local262 < 0) {
							local262 = 0;
						} else if (local262 >= 104) {
							local262 = 104;
						}
						if (arg6 < 0) {
							local257 = 0;
						} else if (arg6 >= 104) {
							local257 = 104;
						}
						if (arg1 < 0) {
							local349 = 0;
						} else if (arg1 >= 104) {
							local349 = 104;
						}
						local275 = arg1 + 64;
						if (local275 < 0) {
							local275 = 0;
						} else if (local275 >= 104) {
							local275 = 104;
						}
						while (local262 > local257) {
							while (local275 > local349) {
								Static106.aByteArrayArrayArray17[local238][local257][local349] = Static106.aByteArrayArrayArray17[local238 - 1][local257][local349];
								local349++;
							}
							local257++;
						}
					}
				}
				local170 = true;
			}
		}
		@Pc(577) int local577;
		if (Static277.aBoolean412 && !arg5) {
			@Pc(554) Class62 local554 = null;
			label290: while (true) {
				label283: do {
					while (true) {
						while (local102.aByteArray47.length > local102.anInt3264) {
							local238 = local102.method2690();
							if (local238 == 0) {
								local554 = new Class62(local102);
							} else {
								if (local238 == 1) {
									local577 = local102.method2690();
									continue label283;
								}
								if (local238 != 2) {
									throw new IllegalStateException();
								}
								if (local554 == null) {
									local554 = new Class62();
								}
								local554.method1906(local102);
							}
						}
						if (local554 == null) {
							local554 = new Class62();
						}
						for (local238 = 0; local238 < 8; local238++) {
							for (local577 = 0; local577 < 8; local577++) {
								local257 = (arg6 >> 3) + local238;
								local262 = (arg1 >> 3) + local577;
								if (local257 >= 0 && local257 < 13 && local262 >= 0 && local262 < 13) {
									Static73.aClass62ArrayArray1[local257][local262] = local554;
								}
							}
						}
						break label290;
					}
				} while (local577 <= 0);
				for (local257 = 0; local257 < local577; local257++) {
					@Pc(594) Class144 local594 = new Class144(local102);
					if (local594.anInt4499 == 31) {
						@Pc(606) Class142 local606 = Static64.method1189(local102.method2691());
						local594.method3549(local606.anInt4388, local606.anInt4382, local606.anInt4387, local606.anInt4381);
					}
					local594.anInt4502 += arg6 << 7;
					local349 = local594.anInt4502 >> 7;
					local594.anInt4490 += arg1 << 7;
					local275 = local594.anInt4490 >> 7;
					if (local349 >= 0 && local275 >= 0 && local349 < 104 && local275 < 104) {
						local594.aBoolean349 = (Static260.aByteArrayArrayArray25[1][local349][local275] & 0x2) != 0;
						local594.anInt4484 = Static55.anIntArrayArrayArray3[local594.anInt4492][local349][local275] - local594.anInt4484;
						Static120.method2147(local594);
					}
				}
			}
		}
		if (!local170) {
			for (local132 = 0; local132 < 4; local132++) {
				for (local238 = 0; local238 < 16; local238++) {
					for (local577 = 0; local577 < 16; local577++) {
						local257 = local238 + (arg6 >> 2);
						local262 = (arg1 >> 2) + local577;
						if (local257 >= 0 && local257 < 26 && local262 >= 0 && local262 < 26) {
							Static106.aByteArrayArrayArray17[local132][local257][local262] = 0;
						}
					}
				}
			}
		}
		return local168 ? Static67.anIntArray140 : null;
	}
}
