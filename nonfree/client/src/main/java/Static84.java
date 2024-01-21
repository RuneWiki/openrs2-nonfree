import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "Lclient!jc;")
	public static Class40 aClass40_22;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "Z")
	public static boolean aBoolean104;

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
	public static int anInt2127;

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "Lclient!ab;")
	public static Class2_Sub2 aClass2_Sub2_4 = new Class2_Sub2(8);

	@OriginalMember(owner = "client!jh", name = "w", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1251 = Static107.method1838("Prepared sound engine");

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
	public static int anInt2125 = 255;

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1257 = Static107.method1838("Please try again)3");

	@OriginalMember(owner = "client!jh", name = "y", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1252 = aClass28_1257;

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
	public static int anInt2126 = 0;

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1253 = Static107.method1838("AUS");

	@OriginalMember(owner = "client!jh", name = "C", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1254 = Static107.method1838("leuchten3:");

	@OriginalMember(owner = "client!jh", name = "D", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1255 = Static107.method1838("scape main");

	@OriginalMember(owner = "client!jh", name = "E", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1256 = aClass28_1251;

	@OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
	public static int anInt2128 = 0;

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
	public static int anInt2129 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!hf;Lclient!mc;Z)V")
	public static void method1487(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class40_Sub1 arg2) {
		@Pc(7) Class2_Sub7 local7 = new Class2_Sub7();
		local7.aClass40_Sub1_33 = arg2;
		local7.anInt972 = 1;
		local7.aLong145 = arg0;
		local7.aClass32_2 = arg1;
		@Pc(27) Class65 local27 = Static67.aClass65_4;
		synchronized (Static67.aClass65_4) {
			Static67.aClass65_4.method2116(local7);
		}
		Static72.method1304();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIILclient!ie;III)V")
	public static void method1488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class36 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class2_Sub4_Sub6 local9 = Static151.method2339(arg3);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (arg6 == 1 || arg6 == 3) {
			local20 = local9.anInt1037;
			local23 = local9.anInt1050;
		} else {
			local23 = local9.anInt1037;
			local20 = local9.anInt1050;
		}
		@Pc(40) int local40 = (arg2 << 7) + (local20 << 6);
		@Pc(44) int[][] local44 = Static78.anIntArrayArrayArray6[arg1];
		@Pc(57) int local57;
		@Pc(55) int local55;
		if (arg7 + local23 > 104) {
			local55 = arg7 + 1;
			local57 = arg7;
		} else {
			local55 = (local23 + 1 >> 1) + arg7;
			local57 = arg7 + (local23 >> 1);
		}
		@Pc(93) int local93;
		@Pc(87) int local87;
		if (arg2 + local20 <= 104) {
			local87 = arg2 + (local20 + 1 >> 1);
			local93 = arg2 + (local20 >> 1);
		} else {
			local93 = arg2;
			local87 = arg2 + 1;
		}
		@Pc(128) int local128 = local44[local87][local55] + local44[local93][local55] + local44[local93][local57] + local44[local87][local57] >> 2;
		@Pc(145) long local145 = (long) ((arg6 | 0x400) << 20 | arg7 << 7 | arg2 | arg4 << 14);
		if (local9.anInt1051 == 0) {
			local145 |= Long.MIN_VALUE;
		}
		@Pc(163) int local163 = (arg7 << 7) + (local23 << 6);
		if (local9.anInt1049 == 1) {
			local145 |= 0x400000L;
		}
		local145 |= (long) arg3 << 32;
		@Pc(204) Class2_Sub4_Sub1 local204;
		if (arg4 == 22) {
			if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
				local204 = local9.method716(local163, local44, 22, arg6, local40, local128);
			} else {
				local204 = new Class2_Sub4_Sub1_Sub4(arg3, 22, arg6, arg1, arg2, arg7, local9.anInt1024, true, null);
			}
			Static151.method2338(arg0, arg2, arg7, local128, local204, local145);
			if (local9.anInt1027 == 1) {
				arg5.method1375(arg2, arg7);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
				local204 = local9.method716(local163, local44, 10, arg6, local40, local128);
			} else {
				local204 = new Class2_Sub4_Sub1_Sub4(arg3, 10, arg6, arg1, arg2, arg7, local9.anInt1024, true, null);
			}
			if (local204 != null) {
				Static63.method1166(arg0, arg2, arg7, local128, local20, local23, local204, arg4 == 11 ? 256 : 0, local145);
			}
			if (local9.anInt1027 != 0) {
				arg5.method1378(local9.aBoolean44, local23, arg2, arg7, local20);
			}
		} else if (arg4 >= 12) {
			if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
				local204 = local9.method716(local163, local44, arg4, arg6, local40, local128);
			} else {
				local204 = new Class2_Sub4_Sub1_Sub4(arg3, arg4, arg6, arg1, arg2, arg7, local9.anInt1024, true, null);
			}
			Static63.method1166(arg0, arg2, arg7, local128, 1, 1, local204, 0, local145);
			if (local9.anInt1027 != 0) {
				arg5.method1378(local9.aBoolean44, local23, arg2, arg7, local20);
			}
		} else if (arg4 == 0) {
			if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
				local204 = local9.method716(local163, local44, 0, arg6, local40, local128);
			} else {
				local204 = new Class2_Sub4_Sub1_Sub4(arg3, 0, arg6, arg1, arg2, arg7, local9.anInt1024, true, null);
			}
			Static28.method592(arg0, arg2, arg7, local128, local204, null, Static110.anIntArray258[arg6], 0, local145);
			if (local9.anInt1027 != 0) {
				arg5.method1366(arg7, arg2, local9.aBoolean44, arg6, arg4);
			}
		} else if (arg4 == 1) {
			if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
				local204 = local9.method716(local163, local44, 1, arg6, local40, local128);
			} else {
				local204 = new Class2_Sub4_Sub1_Sub4(arg3, 1, arg6, arg1, arg2, arg7, local9.anInt1024, true, null);
			}
			Static28.method592(arg0, arg2, arg7, local128, local204, null, Static126.anIntArray271[arg6], 0, local145);
			if (local9.anInt1027 != 0) {
				arg5.method1366(arg7, arg2, local9.aBoolean44, arg6, arg4);
			}
		} else {
			@Pc(532) Class2_Sub4_Sub1 local532;
			if (arg4 == 2) {
				@Pc(513) int local513 = arg6 + 1 & 0x3;
				@Pc(542) Class2_Sub4_Sub1 local542;
				if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
					local532 = local9.method716(local163, local44, 2, arg6 + 4, local40, local128);
					local542 = local9.method716(local163, local44, 2, local513, local40, local128);
				} else {
					local532 = new Class2_Sub4_Sub1_Sub4(arg3, 2, arg6 + 4, arg1, arg2, arg7, local9.anInt1024, true, null);
					local542 = new Class2_Sub4_Sub1_Sub4(arg3, 2, local513, arg1, arg2, arg7, local9.anInt1024, true, null);
				}
				Static28.method592(arg0, arg2, arg7, local128, local532, local542, Static110.anIntArray258[arg6], Static110.anIntArray258[local513], local145);
				if (local9.anInt1027 != 0) {
					arg5.method1366(arg7, arg2, local9.aBoolean44, arg6, arg4);
				}
			} else if (arg4 == 3) {
				if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
					local204 = local9.method716(local163, local44, 3, arg6, local40, local128);
				} else {
					local204 = new Class2_Sub4_Sub1_Sub4(arg3, 3, arg6, arg1, arg2, arg7, local9.anInt1024, true, null);
				}
				Static28.method592(arg0, arg2, arg7, local128, local204, null, Static126.anIntArray271[arg6], 0, local145);
				if (local9.anInt1027 != 0) {
					arg5.method1366(arg7, arg2, local9.aBoolean44, arg6, arg4);
				}
			} else if (arg4 == 9) {
				if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
					local204 = local9.method716(local163, local44, arg4, arg6, local40, local128);
				} else {
					local204 = new Class2_Sub4_Sub1_Sub4(arg3, arg4, arg6, arg1, arg2, arg7, local9.anInt1024, true, null);
				}
				Static63.method1166(arg0, arg2, arg7, local128, 1, 1, local204, 0, local145);
				if (local9.anInt1027 != 0) {
					arg5.method1378(local9.aBoolean44, local23, arg2, arg7, local20);
				}
			} else if (arg4 == 4) {
				if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
					local532 = local9.method716(local163, local44, 4, arg6, local40, local128);
				} else {
					local532 = new Class2_Sub4_Sub1_Sub4(arg3, 4, arg6, arg1, arg2, arg7, local9.anInt1024, true, null);
				}
				Static69.method1286(arg0, arg2, arg7, local128, local532, null, Static110.anIntArray258[arg6], 0, 0, 0, local145);
			} else {
				@Pc(799) int local799;
				@Pc(797) long local797;
				@Pc(835) Class2_Sub4_Sub1 local835;
				if (arg4 == 5) {
					local797 = Static41.method740(arg0, arg2, arg7);
					local799 = 16;
					if (local797 != 0L) {
						local799 = Static151.method2339((int) (local797 >>> 32) & Integer.MAX_VALUE).anInt1036;
					}
					if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
						local835 = local9.method716(local163, local44, 4, arg6, local40, local128);
					} else {
						local835 = new Class2_Sub4_Sub1_Sub4(arg3, 4, arg6, arg1, arg2, arg7, local9.anInt1024, true, null);
					}
					Static69.method1286(arg0, arg2, arg7, local128, local835, null, Static110.anIntArray258[arg6], 0, local799 * Static103.anIntArray236[arg6], Static123.anIntArray266[arg6] * local799, local145);
				} else if (arg4 == 6) {
					local799 = 8;
					local797 = Static41.method740(arg0, arg2, arg7);
					if (local797 != 0L) {
						local799 = Static151.method2339((int) (local797 >>> 32) & Integer.MAX_VALUE).anInt1036 / 2;
					}
					if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
						local835 = local9.method716(local163, local44, 4, arg6 + 4, local40, local128);
					} else {
						local835 = new Class2_Sub4_Sub1_Sub4(arg3, 4, arg6 + 4, arg1, arg2, arg7, local9.anInt1024, true, null);
					}
					Static69.method1286(arg0, arg2, arg7, local128, local835, null, 256, arg6, local799 * Static56.anIntArray132[arg6], local799 * Static179.anIntArray370[arg6], local145);
				} else if (arg4 == 7) {
					@Pc(966) int local966 = arg6 + 2 & 0x3;
					if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
						local532 = local9.method716(local163, local44, 4, local966 + 4, local40, local128);
					} else {
						local532 = new Class2_Sub4_Sub1_Sub4(arg3, 4, local966 + 4, arg1, arg2, arg7, local9.anInt1024, true, null);
					}
					Static69.method1286(arg0, arg2, arg7, local128, local532, null, 256, local966, 0, 0, local145);
				} else if (arg4 == 8) {
					local799 = 8;
					local797 = Static41.method740(arg0, arg2, arg7);
					if (local797 != 0L) {
						local799 = Static151.method2339((int) (local797 >>> 32) & Integer.MAX_VALUE).anInt1036 / 2;
					}
					@Pc(1051) int local1051 = arg6 + 2 & 0x3;
					@Pc(1091) Class2_Sub4_Sub1 local1091;
					if (local9.anInt1024 == -1 && local9.anIntArray82 == null) {
						local835 = local9.method716(local163, local44, 4, arg6 + 4, local40, local128);
						local1091 = local9.method716(local163, local44, 4, local1051 + 4, local40, local128);
					} else {
						local835 = new Class2_Sub4_Sub1_Sub4(arg3, 4, arg6 + 4, arg1, arg2, arg7, local9.anInt1024, true, null);
						local1091 = new Class2_Sub4_Sub1_Sub4(arg3, 4, local1051 + 4, arg1, arg2, arg7, local9.anInt1024, true, null);
					}
					Static69.method1286(arg0, arg2, arg7, local128, local835, local1091, 256, arg6, Static56.anIntArray132[arg6] * local799, local799 * Static179.anIntArray370[arg6], local145);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	public static void method1489() {
		aClass28_1251 = null;
		aClass28_1256 = null;
		aClass2_Sub2_4 = null;
		aClass40_22 = null;
		aClass28_1257 = null;
		aClass28_1253 = null;
		aClass28_1252 = null;
		aClass28_1255 = null;
		aClass28_1254 = null;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)V")
	public static void method1490() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}
}
