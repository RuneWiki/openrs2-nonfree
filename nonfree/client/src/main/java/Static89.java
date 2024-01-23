import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!bn;")
	public static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_5;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!pk;")
	public static Class132 aClass132_36;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "[I")
	public static int[] anIntArray129 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString70 = "Loading textures - ";

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt1906 = 0;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public static int anInt1907 = 0;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Lclient!pd;")
	public static Class129 aClass129_7 = new Class129(16);

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Lclient!ik;")
	public static Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
	public static void method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class8_Sub1_Sub6 local18 = Static181.method2779(1, arg0);
		local18.method931();
		local18.anInt1284 = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method1446(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class159 local8 = Static260.method3916(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray23 != null) {
			@Pc(21) Class8_Sub14 local21 = new Class8_Sub14();
			local21.anInt2440 = arg0;
			local21.anObjectArray1 = local8.anObjectArray23;
			local21.aClass159_10 = local8;
			local21.aString93 = arg1;
			Static173.method2688(local21);
		}
		@Pc(39) boolean local39 = true;
		if (local8.anInt5188 > 0) {
			local39 = Static227.method3512(local8);
		}
		if (!local39 || !Static42.method668(local8).method3352(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static66.aClass8_Sub2_Sub1_4.method2398(152);
			Static66.aClass8_Sub2_Sub1_4.method2330(arg3);
			Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		}
		if (arg0 == 2) {
			Static66.aClass8_Sub2_Sub1_4.method2398(126);
			Static66.aClass8_Sub2_Sub1_4.method2330(arg3);
			Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		}
		if (arg0 == 3) {
			Static66.aClass8_Sub2_Sub1_4.method2398(12);
			Static66.aClass8_Sub2_Sub1_4.method2330(arg3);
			Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		}
		if (arg0 == 4) {
			Static66.aClass8_Sub2_Sub1_4.method2398(70);
			Static66.aClass8_Sub2_Sub1_4.method2330(arg3);
			Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		}
		if (arg0 == 5) {
			Static66.aClass8_Sub2_Sub1_4.method2398(190);
			Static66.aClass8_Sub2_Sub1_4.method2330(arg3);
			Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		}
		if (arg0 == 6) {
			Static66.aClass8_Sub2_Sub1_4.method2398(117);
			Static66.aClass8_Sub2_Sub1_4.method2330(arg3);
			Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		}
		if (arg0 == 7) {
			Static66.aClass8_Sub2_Sub1_4.method2398(158);
			Static66.aClass8_Sub2_Sub1_4.method2330(arg3);
			Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		}
		if (arg0 == 8) {
			Static66.aClass8_Sub2_Sub1_4.method2398(63);
			Static66.aClass8_Sub2_Sub1_4.method2330(arg3);
			Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		}
		if (arg0 == 9) {
			Static66.aClass8_Sub2_Sub1_4.method2398(44);
			Static66.aClass8_Sub2_Sub1_4.method2330(arg3);
			Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		}
		if (arg0 == 10) {
			Static66.aClass8_Sub2_Sub1_4.method2398(165);
			Static66.aClass8_Sub2_Sub1_4.method2330(arg3);
			Static66.aClass8_Sub2_Sub1_4.method2333(arg2);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZI[B[Lclient!mf;II)[I")
	public static int[] method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class112[] arg5, @OriginalArg(7) int arg6) {
		@Pc(5) byte local5;
		if (arg2) {
			local5 = 1;
		} else {
			local5 = 4;
		}
		@Pc(23) int local23;
		@Pc(30) int local30;
		if (!arg2) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (local23 = 0; local23 < 64; local23++) {
					for (local30 = 0; local30 < 64; local30++) {
						if (local23 + arg6 > 0 && local23 + arg6 < 103 && local30 + arg3 > 0 && local30 + arg3 < 103) {
							arg5[local18].anIntArrayArray14[arg6 + local23][local30 + arg3] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(104) Class8_Sub2 local104 = new Class8_Sub2(arg4);
		local30 = arg0 + arg3;
		local23 = arg6 + arg1;
		@Pc(125) int local125;
		for (@Pc(115) int local115 = 0; local115 < local5; local115++) {
			for (@Pc(120) int local120 = 0; local120 < 64; local120++) {
				for (local125 = 0; local125 < 64; local125++) {
					Static123.method1974(local104, false, local30 + local125, local125 + arg3, local115, arg6 + local120, 0, 0, local120 + local23, 0, arg2);
				}
			}
		}
		@Pc(160) boolean local160 = false;
		@Pc(168) boolean local168 = false;
		@Pc(204) int local204;
		@Pc(233) int local233;
		@Pc(254) int local254;
		@Pc(256) int local256;
		@Pc(292) int local292;
		while (local104.anInt2955 < local104.aByteArray24.length) {
			local125 = local104.method2334();
			if (local125 == 128) {
				local160 = true;
				Static44.anIntArray72[0] = local104.method2375();
				Static44.anIntArray72[1] = local104.method2360();
				Static44.anIntArray72[2] = local104.method2360();
				Static44.anIntArray72[3] = local104.method2360();
				Static44.anIntArray72[4] = local104.method2375();
			} else {
				if (local125 != 129) {
					local104.anInt2955--;
					break;
				}
				local168 = true;
				for (local204 = 0; local204 < 4; local204++) {
					@Pc(215) byte local215 = local104.method2374();
					if (local215 == 0) {
						local233 = arg6;
						local254 = arg6 + 64;
						if (local254 < 0) {
							local254 = 0;
						} else if (local254 >= 104) {
							local254 = 104;
						}
						if (arg6 < 0) {
							local233 = 0;
						} else if (arg6 >= 104) {
							local233 = 104;
						}
						local292 = arg3 + 64;
						local256 = arg3;
						if (local292 < 0) {
							local292 = 0;
						} else if (local292 >= 104) {
							local292 = 104;
						}
						if (arg3 < 0) {
							local256 = 0;
						} else if (arg3 >= 104) {
							local256 = 104;
						}
						while (local254 > local233) {
							while (local256 < local292) {
								Static212.aByteArrayArrayArray12[local204][local233][local256] = 0;
								local256++;
							}
							local233++;
						}
					} else if (local215 == 1) {
						for (local233 = 0; local233 < 64; local233 += 4) {
							for (local254 = 0; local254 < 64; local254 += 4) {
								@Pc(350) byte local350 = local104.method2374();
								for (local292 = arg6 + local233; local292 < arg6 + local233 + 4; local292++) {
									for (@Pc(365) int local365 = arg3 + local254; local365 < local254 + arg3 + 4; local365++) {
										if (local292 >= 0 && local292 < 104 && local365 >= 0 && local365 < 104) {
											Static212.aByteArrayArrayArray12[local204][local292][local365] = local350;
										}
									}
								}
							}
						}
					} else if (local215 == 2 && local204 > 0) {
						local233 = arg6;
						if (arg6 < 0) {
							local233 = 0;
						} else if (arg6 >= 104) {
							local233 = 104;
						}
						local254 = arg6 + 64;
						local256 = arg3;
						if (arg3 < 0) {
							local256 = 0;
						} else if (arg3 >= 104) {
							local256 = 104;
						}
						if (local254 < 0) {
							local254 = 0;
						} else if (local254 >= 104) {
							local254 = 104;
						}
						local292 = arg3 + 64;
						if (local292 < 0) {
							local292 = 0;
						} else if (local292 >= 104) {
							local292 = 104;
						}
						while (local254 > local233) {
							while (local292 > local256) {
								Static212.aByteArrayArrayArray12[local204][local233][local256] = Static212.aByteArrayArrayArray12[local204 - 1][local233][local256];
								local256++;
							}
							local233++;
						}
					}
				}
			}
		}
		@Pc(608) int local608;
		if (Static116.aBoolean188 && !arg2) {
			@Pc(558) Class24 local558 = null;
			while (true) {
				while (local104.aByteArray24.length > local104.anInt2955) {
					local204 = local104.method2334();
					if (local204 == 0) {
						local558 = new Class24(local104);
					} else if (local204 == 1) {
						local608 = local104.method2334();
						if (local608 > 0) {
							for (local233 = 0; local233 < local608; local233++) {
								@Pc(625) Class28 local625 = new Class28(local104);
								if (local625.anInt867 == 31) {
									@Pc(640) Class113 local640 = Static169.method2665(local104.method2375());
									local625.method622(local640.anInt3253, local640.anInt3252, local640.anInt3247, local640.anInt3246);
								}
								local625.anInt863 += arg6 << 7;
								local625.anInt877 += arg3 << 7;
								local256 = local625.anInt863 >> 7;
								local292 = local625.anInt877 >> 7;
								if (local256 >= 0 && local292 >= 0 && local256 < 104 && local292 < 104) {
									local625.aBoolean61 = (Static170.aByteArrayArrayArray9[1][local256][local292] & 0x2) != 0;
									local625.anInt862 = Static195.anIntArrayArrayArray7[local625.anInt870][local256][local292] - local625.anInt862;
									Static186.method2921(local625);
								}
							}
						}
					} else if (local204 == 2) {
						if (local558 == null) {
							local558 = new Class24();
						}
						local558.method534(local104);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local558 == null) {
					local558 = new Class24();
				}
				for (local204 = 0; local204 < 8; local204++) {
					for (local608 = 0; local608 < 8; local608++) {
						local233 = local204 + (arg6 >> 3);
						local254 = (arg3 >> 3) + local608;
						if (local233 >= 0 && local233 < 13 && local254 >= 0 && local254 < 13) {
							Static169.aClass24ArrayArray1[local233][local254] = local558;
						}
					}
				}
				break;
			}
		}
		if (!local168) {
			for (local125 = 0; local125 < 4; local125++) {
				for (local204 = 0; local204 < 16; local204++) {
					for (local608 = 0; local608 < 16; local608++) {
						local233 = (arg6 >> 2) + local204;
						local254 = (arg3 >> 2) + local608;
						if (local233 >= 0 && local233 < 26 && local254 >= 0 && local254 < 26) {
							Static212.aByteArrayArrayArray12[local125][local233][local254] = 0;
						}
					}
				}
			}
		}
		return local160 ? Static44.anIntArray72 : null;
	}
}
