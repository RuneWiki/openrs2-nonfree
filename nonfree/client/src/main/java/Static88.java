import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Lclient!tb;")
	public static Class44 aClass44_52;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1252 = Static33.method650("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1253 = Static33.method650("gr-Un:");

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1254 = Static33.method650("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt2370 = -1;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1255 = Static33.method650("M");

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1256 = Static33.method650("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1257 = Static33.method650("@cya@");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZIII[Lclient!wc;II[BI)V")
	public static void method1609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class81[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (arg5 + local7 > 0 && local7 + arg5 < 103 && arg0 + local11 > 0 && local11 + arg0 < 103) {
					arg4[arg8].anIntArrayArray29[local7 + arg5][arg0 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(77) Class3_Sub2 local77 = new Class3_Sub2(arg7);
		for (@Pc(79) int local79 = 0; local79 < 4; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 64; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
					if (local79 == arg2 && arg3 <= local83 && arg3 + 8 > local83 && local87 >= arg6 && local87 < arg6 + 8) {
						Static41.method765(Static11.method238(local87 & 0x7, local83 & 0x7, arg1) + arg5, local77, arg8, arg1, 0, Static57.method1084(arg1, local87 & 0x7, local83 & 0x7) + arg0, 0);
					} else {
						Static41.method765(-1, local77, 0, 0, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method1610() {
		aClass56_1254 = null;
		aClass56_1253 = null;
		aClass44_52 = null;
		aClass56_1257 = null;
		aClass56_1252 = null;
		aClass56_1256 = null;
		aClass56_1255 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!td;I)I")
	public static int method1611(@OriginalArg(1) Class3_Sub1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray26 == null || arg1 >= arg0.anIntArrayArray26.length) {
			return -2;
		}
		try {
			@Pc(21) int local21 = 0;
			@Pc(26) int[] local26 = arg0.anIntArrayArray26[arg1];
			@Pc(28) byte local28 = 0;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(40) int local40 = local26[local21++];
				@Pc(42) byte local42 = 0;
				@Pc(44) int local44 = 0;
				if (local40 == 0) {
					return local35;
				}
				if (local40 == 15) {
					local42 = 1;
				}
				if (local40 == 16) {
					local42 = 2;
				}
				if (local40 == 17) {
					local42 = 3;
				}
				if (local40 == 1) {
					local44 = Static92.anIntArray218[local26[local21++]];
				}
				if (local40 == 2) {
					local44 = Static105.anIntArray223[local26[local21++]];
				}
				if (local40 == 3) {
					local44 = Static113.anIntArray287[local26[local21++]];
				}
				@Pc(107) int local107;
				@Pc(118) Class3_Sub1_Sub16 local118;
				@Pc(123) int local123;
				@Pc(136) int local136;
				if (local40 == 4) {
					local107 = local26[local21++] << 16;
					@Pc(114) int local114 = local107 + local26[local21++];
					local118 = Static96.method1688(local114);
					local123 = local26[local21++];
					if (local123 != -1 && (!Static12.method239(local123).aBoolean82 || Static3.aBoolean168)) {
						for (local136 = 0; local136 < local118.anIntArray267.length; local136++) {
							if (local118.anIntArray267[local136] == local123 + 1) {
								local44 += local118.anIntArray265[local136];
							}
						}
					}
				}
				if (local40 == 5) {
					local44 = Static115.anIntArray292[local26[local21++]];
				}
				if (local40 == 6) {
					local44 = Class3_Sub2.anIntArray27[Static105.anIntArray223[local26[local21++]] - 1];
				}
				if (local40 == 7) {
					local44 = Static115.anIntArray292[local26[local21++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local44 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt1368;
				}
				if (local40 == 9) {
					for (local107 = 0; local107 < 25; local107++) {
						if (Static43.aBooleanArray1[local107]) {
							local44 += Static105.anIntArray223[local107];
						}
					}
				}
				if (local40 == 10) {
					local107 = local26[local21++] << 16;
					local107 += local26[local21++];
					local118 = Static96.method1688(local107);
					local123 = local26[local21++];
					if (local123 != -1 && (!Static12.method239(local123).aBoolean82 || Static3.aBoolean168)) {
						for (local136 = 0; local136 < local118.anIntArray267.length; local136++) {
							if (local118.anIntArray267[local136] == local123 + 1) {
								local44 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local44 = Static47.anInt1377;
				}
				if (local40 == 12) {
					local44 = Static33.anInt964;
				}
				if (local40 == 13) {
					local107 = Static115.anIntArray292[local26[local21++]];
					@Pc(322) int local322 = local26[local21++];
					local44 = (local107 & 0x1 << local322) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local107 = local26[local21++];
					local44 = Static75.method1343(local107);
				}
				if (local40 == 18) {
					local44 = (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 >> 7) + Static18.anInt497;
				}
				if (local40 == 19) {
					local44 = (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 >> 7) + Static57.anInt1618;
				}
				if (local40 == 20) {
					local44 = local26[local21++];
				}
				if (local42 == 0) {
					if (local28 == 0) {
						local35 += local44;
					}
					if (local28 == 1) {
						local35 -= local44;
					}
					if (local28 == 2 && local44 != 0) {
						local35 /= local44;
					}
					if (local28 == 3) {
						local35 *= local44;
					}
					local28 = 0;
				} else {
					local28 = local42;
				}
			}
		} catch (@Pc(431) Exception local431) {
			return -1;
		}
	}
}
