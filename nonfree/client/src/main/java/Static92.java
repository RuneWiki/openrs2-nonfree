import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "[I")
	public static int[] anIntArray87;

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
	public static int anInt1526;

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
	public static int anInt1528;

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "Lclient!ofa;")
	public static final Class255 aClass255_3 = new Class255(4);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method1424(@OriginalArg(1) Class143 arg0) {
		if (Static223.anInt3566 < 2 && !Static386.aBoolean482 || Static610.aClass394_12 != null) {
			return;
		}
		@Pc(36) String local36;
		if (Static386.aBoolean482 && Static223.anInt3566 < 2) {
			local36 = Static11.aString1 + Static49.aClass42_32.method730(Static259.anInt4113) + Static116.aString18 + " ->";
		} else if (Static464.aBoolean585 && Static176.aClass157_1.method3300(81) && Static223.anInt3566 > 2) {
			local36 = Static554.method3435(Static529.aClass5_Sub2_Sub13_5);
		} else {
			@Pc(58) Class5_Sub2_Sub13 local58 = Static529.aClass5_Sub2_Sub13_5;
			if (local58 == null) {
				return;
			}
			local36 = Static554.method3435(local58);
			@Pc(67) int[] local67 = null;
			if (Static613.method8234(local58.anInt6711)) {
				local67 = Static259.aClass135_1.method2776((int) local58.aLong198).anIntArray351;
			} else if (local58.anInt6709 != -1) {
				local67 = Static259.aClass135_1.method2776(local58.anInt6709).anIntArray351;
			} else if (Static152.method2244(local58.anInt6711)) {
				@Pc(145) Class5_Sub34 local145 = (Class5_Sub34) Static223.aClass335_19.method7766((long) (int) local58.aLong198);
				if (local145 != null) {
					@Pc(150) Class41_Sub1_Sub1_Sub3_Sub1 local150 = local145.aClass41_Sub1_Sub1_Sub3_Sub1_1;
					@Pc(153) Class311 local153 = local150.aClass311_1;
					if (local153.anIntArray476 != null) {
						local153 = local153.method7325(Static413.aClass63_1);
					}
					if (local153 != null) {
						local67 = local153.anIntArray474;
					}
				}
			} else if (Static63.method930(local58.anInt6711)) {
				@Pc(114) Class81 local114;
				if (local58.anInt6711 == 1007) {
					local114 = Static400.aClass140_4.method2839((int) local58.aLong198);
				} else {
					local114 = Static400.aClass140_4.method2839((int) (local58.aLong198 >>> 32 & 0x7FFFFFFFL));
				}
				if (local114.anIntArray100 != null) {
					local114 = local114.method1760(Static413.aClass63_1);
				}
				if (local114 != null) {
					local67 = local114.anIntArray96;
				}
			}
			if (local67 != null) {
				local36 = local36 + Static216.method3090(local67);
			}
		}
		if (Static223.anInt3566 > 2) {
			local36 = local36 + "<col=ffffff> / " + (Static223.anInt3566 - 2) + Static49.aClass42_25.method730(Static259.anInt4113);
		}
		if (Static582.aClass394_11 != null) {
			@Pc(220) Class72 local220 = Static582.aClass394_11.method8741(arg0);
			if (local220 == null) {
				local220 = Static32.aClass72_2;
			}
			local220.method6917(Static163.aRandom1, Static582.aClass394_11.anInt10496, Static558.anIntArray502, local36, Static91.anIntArray452, Static582.aClass394_11.anInt10452, Static582.aClass394_11.anInt10536, Static535.anInt10419, Static582.aClass394_11.anInt10483, Static582.aClass394_11.anInt10532, Static113.aClass59Array2, Static608.anInt9821, Static582.aClass394_11.anInt10518, Static250.anInt4002);
			Static177.method2603(Static91.anIntArray452[2], Static91.anIntArray452[0], Static91.anIntArray452[3], Static91.anIntArray452[1]);
		} else if (Class41_Sub1_Sub4_Sub2.lb != null && Static591.aClass174_7 == Static137.aClass174_1) {
			@Pc(285) int local285 = Static32.aClass72_2.method6927(Static558.anIntArray502, Static163.aRandom1, local36, Static271.anInt4279 + 4, Static608.anInt9821, Static465.anInt8114 + 16, Static113.aClass59Array2);
			Static177.method2603(local285 + Static358.aClass198_7.method4076(local36), Static271.anInt4279 - -4, 16, Static465.anInt8114);
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(III)V")
	public static void method1425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(12, (long) arg1);
		local9.method2438();
		local9.anInt2749 = arg0;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method1426(@OriginalArg(0) Class5_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static298.aClass88Array3 != Static176.aClass88Array1) {
			@Pc(12) int local12 = Static230.aClass88Array2[arg1].method8753(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class88 local19 = Static230.aClass88Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8753(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method8755(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
