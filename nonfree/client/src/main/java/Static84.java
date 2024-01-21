import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!oc;")
	public static Class56 aClass56_58;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!lf;")
	public static Class7 aClass7_13;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "[Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array6;

	@OriginalMember(owner = "client!o", name = "s", descriptor = "Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_8;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "[I")
	public static int[] anIntArray335;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!fc;")
	public static Class25 aClass25_911 = Static78.method1313(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!fc;")
	private static Class25 aClass25_912 = Static78.method1313("Loading wordpack )2 ");

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!fc;")
	public static Class25 aClass25_913 = Static78.method1313("mapmarker");

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!fc;")
	public static Class25 aClass25_914 = Static78.method1313("mapback");

	@OriginalMember(owner = "client!o", name = "m", descriptor = "Lclient!fc;")
	private static Class25 aClass25_917 = Static78.method1313("Loading textures )2 ");

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_915 = aClass25_917;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_916 = Static78.method1313("Classic");

	@OriginalMember(owner = "client!o", name = "t", descriptor = "Lclient!fc;")
	private static Class25 aClass25_921 = Static78.method1313("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!o", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_918 = aClass25_921;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_919 = Static78.method1313("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!o", name = "r", descriptor = "Lclient!fc;")
	public static Class25 aClass25_920 = aClass25_912;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "[Lclient!fc;")
	public static Class25[] aClass25Array14 = new Class25[500];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method1409() {
		aClass56_58 = null;
		aClass25_919 = null;
		aClass25_913 = null;
		aClass1_Sub2_Sub2_Sub1_8 = null;
		aClass25_911 = null;
		aClass25_918 = null;
		aClass25Array14 = null;
		aClass25_921 = null;
		aClass7_13 = null;
		aClass25_915 = null;
		aClass1_Sub2_Sub2_Sub4Array6 = null;
		aClass25_914 = null;
		aClass25_917 = null;
		aClass25_916 = null;
		aClass25_920 = null;
		aClass25_912 = null;
		anIntArray335 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([I[IIIZ[Lclient!be;)V")
	public static void method1410(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class11[] arg4) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(16) int local16 = arg2 - 1;
		@Pc(22) int local22 = (arg3 + arg2) / 2;
		@Pc(26) Class11 local26 = arg4[local22];
		arg4[local22] = arg4[arg2];
		@Pc(36) int local36 = arg3 + 1;
		arg4[arg2] = local26;
		while (local36 > local16) {
			@Pc(44) boolean local44 = true;
			@Pc(47) int local47;
			@Pc(64) int local64;
			@Pc(77) int local77;
			do {
				local36--;
				for (local47 = 0; local47 < 4; local47++) {
					if (arg1[local47] == 2) {
						local77 = local26.anInt274;
						local64 = arg4[local36].anInt274;
					} else if (arg1[local47] == 1) {
						local64 = arg4[local36].anInt273;
						if (local64 == -1 && arg0[local47] == 1) {
							local64 = 2001;
						}
						local77 = local26.anInt273;
						if (local77 == -1 && arg0[local47] == 1) {
							local77 = 2001;
						}
					} else if (arg1[local47] == 3) {
						local64 = arg4[local36].aBoolean7 ? 1 : 0;
						local77 = local26.aBoolean7 ? 1 : 0;
					} else {
						local64 = arg4[local36].anInt275;
						local77 = local26.anInt275;
					}
					if (local64 != local77) {
						if ((arg0[local47] != 1 || local64 <= local77) && (arg0[local47] != 0 || local64 >= local77)) {
							local44 = false;
						}
						break;
					}
					if (local47 == 3) {
						local44 = false;
					}
				}
			} while (local44);
			local44 = true;
			do {
				local16++;
				for (local47 = 0; local47 < 4; local47++) {
					if (arg1[local47] == 2) {
						local77 = local26.anInt274;
						local64 = arg4[local16].anInt274;
					} else if (arg1[local47] == 1) {
						local64 = arg4[local16].anInt273;
						if (local64 == -1 && arg0[local47] == 1) {
							local64 = 2001;
						}
						local77 = local26.anInt273;
						if (local77 == -1 && arg0[local47] == 1) {
							local77 = 2001;
						}
					} else if (arg1[local47] == 3) {
						local64 = arg4[local16].aBoolean7 ? 1 : 0;
						local77 = local26.aBoolean7 ? 1 : 0;
					} else {
						local77 = local26.anInt275;
						local64 = arg4[local16].anInt275;
					}
					if (local64 != local77) {
						if ((arg0[local47] != 1 || local77 <= local64) && (arg0[local47] != 0 || local77 >= local64)) {
							local44 = false;
						}
						break;
					}
					if (local47 == 3) {
						local44 = false;
					}
				}
			} while (local44);
			if (local16 < local36) {
				@Pc(334) Class11 local334 = arg4[local16];
				arg4[local16] = arg4[local36];
				arg4[local36] = local334;
			}
		}
		method1410(arg0, arg1, arg2, local36, arg4);
		method1410(arg0, arg1, local36 + 1, arg3, arg4);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIILclient!ac;IIIIILclient!od;)V")
	public static void method1411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class62 arg8) {
		@Pc(20) int local20 = Static7.anIntArrayArrayArray3[arg6][arg0 + 1][arg5];
		@Pc(28) int local28 = Static7.anIntArrayArrayArray3[arg6][arg0][arg5];
		@Pc(38) int local38 = Static7.anIntArrayArrayArray3[arg6][arg0][arg5 + 1];
		@Pc(50) int local50 = (arg7 << 14) + arg0 + (arg5 << 7) + 1073741824;
		@Pc(62) int local62 = Static7.anIntArrayArrayArray3[arg6][arg0 + 1][arg5 + 1];
		@Pc(66) Class1_Sub2_Sub6 local66 = Static78.method1315(arg7);
		if (local66.anInt877 == 0) {
			local50 += Integer.MIN_VALUE;
		}
		@Pc(79) int local79 = arg4 + (arg1 << 6);
		if (local66.anInt849 == 1) {
			local79 += 256;
		}
		@Pc(94) int local94 = local62 + local20 + local28 + local38 >> 2;
		@Pc(122) Class1_Sub2_Sub3 local122;
		if (arg4 == 22) {
			if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
				local122 = local66.method710(local38, 22, local28, arg1, local20, local62);
			} else {
				local122 = new Class1_Sub2_Sub3_Sub5(arg7, 22, arg1, local28, local20, local62, local38, local66.anInt847, true, null);
			}
			arg2.method76(arg3, arg0, arg5, local94, local122, local50, local79);
			if (local66.anInt871 == 1) {
				arg8.method1451(arg0, arg5);
			}
			return;
		}
		@Pc(213) int local213;
		if (arg4 == 10 || arg4 == 11) {
			if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
				local122 = local66.method710(local38, 10, local28, arg1, local20, local62);
			} else {
				local122 = new Class1_Sub2_Sub3_Sub5(arg7, 10, arg1, local28, local20, local62, local38, local66.anInt847, true, null);
			}
			if (local122 != null) {
				@Pc(210) int local210;
				if (arg1 == 1 || arg1 == 3) {
					local213 = local66.anInt857;
					local210 = local66.anInt845;
				} else {
					local210 = local66.anInt857;
					local213 = local66.anInt845;
				}
				@Pc(223) int local223 = 0;
				if (arg4 == 11) {
					local223 += 256;
				}
				arg2.method86(arg3, arg0, arg5, local94, local213, local210, local122, local223, local50, local79);
			}
			if (local66.anInt871 != 0) {
				arg8.method1455(local66.aBoolean34, arg5, local66.anInt845, arg0, local66.anInt857, arg1);
			}
		} else if (arg4 >= 12) {
			if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
				local122 = local66.method710(local38, arg4, local28, arg1, local20, local62);
			} else {
				local122 = new Class1_Sub2_Sub3_Sub5(arg7, arg4, arg1, local28, local20, local62, local38, local66.anInt847, true, null);
			}
			arg2.method86(arg3, arg0, arg5, local94, 1, 1, local122, 0, local50, local79);
			if (local66.anInt871 != 0) {
				arg8.method1455(local66.aBoolean34, arg5, local66.anInt845, arg0, local66.anInt857, arg1);
			}
		} else if (arg4 == 0) {
			if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
				local122 = local66.method710(local38, 0, local28, arg1, local20, local62);
			} else {
				local122 = new Class1_Sub2_Sub3_Sub5(arg7, 0, arg1, local28, local20, local62, local38, local66.anInt847, true, null);
			}
			arg2.method82(arg3, arg0, arg5, local94, local122, null, Static46.anIntArray240[arg1], 0, local50, local79);
			if (local66.anInt871 != 0) {
				arg8.method1452(arg5, arg0, arg4, local66.aBoolean34, arg1);
			}
		} else if (arg4 == 1) {
			if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
				local122 = local66.method710(local38, 1, local28, arg1, local20, local62);
			} else {
				local122 = new Class1_Sub2_Sub3_Sub5(arg7, 1, arg1, local28, local20, local62, local38, local66.anInt847, true, null);
			}
			arg2.method82(arg3, arg0, arg5, local94, local122, null, Static1.anIntArray8[arg1], 0, local50, local79);
			if (local66.anInt871 != 0) {
				arg8.method1452(arg5, arg0, arg4, local66.aBoolean34, arg1);
			}
		} else {
			@Pc(471) int local471;
			@Pc(500) Class1_Sub2_Sub3 local500;
			if (arg4 == 2) {
				local471 = arg1 + 1 & 0x3;
				@Pc(490) Class1_Sub2_Sub3 local490;
				if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
					local490 = local66.method710(local38, 2, local28, arg1 + 4, local20, local62);
					local500 = local66.method710(local38, 2, local28, local471, local20, local62);
				} else {
					local490 = new Class1_Sub2_Sub3_Sub5(arg7, 2, arg1 + 4, local28, local20, local62, local38, local66.anInt847, true, null);
					local500 = new Class1_Sub2_Sub3_Sub5(arg7, 2, local471, local28, local20, local62, local38, local66.anInt847, true, null);
				}
				arg2.method82(arg3, arg0, arg5, local94, local490, local500, Static46.anIntArray240[arg1], Static46.anIntArray240[local471], local50, local79);
				if (local66.anInt871 != 0) {
					arg8.method1452(arg5, arg0, arg4, local66.aBoolean34, arg1);
				}
			} else if (arg4 == 3) {
				if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
					local122 = local66.method710(local38, 3, local28, arg1, local20, local62);
				} else {
					local122 = new Class1_Sub2_Sub3_Sub5(arg7, 3, arg1, local28, local20, local62, local38, local66.anInt847, true, null);
				}
				arg2.method82(arg3, arg0, arg5, local94, local122, null, Static1.anIntArray8[arg1], 0, local50, local79);
				if (local66.anInt871 != 0) {
					arg8.method1452(arg5, arg0, arg4, local66.aBoolean34, arg1);
				}
			} else if (arg4 == 9) {
				if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
					local122 = local66.method710(local38, arg4, local28, arg1, local20, local62);
				} else {
					local122 = new Class1_Sub2_Sub3_Sub5(arg7, arg4, arg1, local28, local20, local62, local38, local66.anInt847, true, null);
				}
				arg2.method86(arg3, arg0, arg5, local94, 1, 1, local122, 0, local50, local79);
				if (local66.anInt871 != 0) {
					arg8.method1455(local66.aBoolean34, arg5, local66.anInt845, arg0, local66.anInt857, arg1);
				}
			} else {
				if (local66.aBoolean32) {
					if (arg1 == 1) {
						local471 = local38;
						local38 = local62;
						local62 = local20;
						local20 = local28;
						local28 = local471;
					} else if (arg1 == 2) {
						local471 = local38;
						local38 = local20;
						local20 = local471;
						local471 = local62;
						local62 = local28;
						local28 = local471;
					} else if (arg1 == 3) {
						local471 = local38;
						local38 = local28;
						local28 = local20;
						local20 = local62;
						local62 = local471;
					}
				}
				if (arg4 == 4) {
					if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
						local122 = local66.method710(local38, 4, local28, 0, local20, local62);
					} else {
						local122 = new Class1_Sub2_Sub3_Sub5(arg7, 4, 0, local28, local20, local62, local38, local66.anInt847, true, null);
					}
					arg2.method51(arg3, arg0, arg5, local94, local122, Static46.anIntArray240[arg1], arg1 * 512, 0, 0, local50, local79);
				} else if (arg4 == 5) {
					local471 = 16;
					local213 = arg2.method62(arg3, arg0, arg5);
					if (local213 != 0) {
						local471 = Static78.method1315(local213 >> 14 & 0x7FFF).anInt873;
					}
					if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
						local500 = local66.method710(local38, 4, local28, 0, local20, local62);
					} else {
						local500 = new Class1_Sub2_Sub3_Sub5(arg7, 4, 0, local28, local20, local62, local38, local66.anInt847, true, null);
					}
					arg2.method51(arg3, arg0, arg5, local94, local500, Static46.anIntArray240[arg1], arg1 * 512, local471 * Static61.anIntArray264[arg1], local471 * Static97.anIntArray398[arg1], local50, local79);
				} else if (arg4 == 6) {
					if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
						local122 = local66.method710(local38, 4, local28, 0, local20, local62);
					} else {
						local122 = new Class1_Sub2_Sub3_Sub5(arg7, 4, 0, local28, local20, local62, local38, local66.anInt847, true, null);
					}
					arg2.method51(arg3, arg0, arg5, local94, local122, 256, arg1, 0, 0, local50, local79);
				} else if (arg4 == 7) {
					if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
						local122 = local66.method710(local38, 4, local28, 0, local20, local62);
					} else {
						local122 = new Class1_Sub2_Sub3_Sub5(arg7, 4, 0, local28, local20, local62, local38, local66.anInt847, true, null);
					}
					arg2.method51(arg3, arg0, arg5, local94, local122, 512, arg1, 0, 0, local50, local79);
				} else if (arg4 == 8) {
					if (local66.anInt847 == -1 && local66.anIntArray171 == null) {
						local122 = local66.method710(local38, 4, local28, 0, local20, local62);
					} else {
						local122 = new Class1_Sub2_Sub3_Sub5(arg7, 4, 0, local28, local20, local62, local38, local66.anInt847, true, null);
					}
					arg2.method51(arg3, arg0, arg5, local94, local122, 768, arg1, 0, 0, local50, local79);
				}
			}
		}
	}
}
