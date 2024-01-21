import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
	public static int anInt1955;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_12;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_607 = Static181.method2795("scape main");

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Lclient!dc;")
	public static final Class19 aClass19_9 = new Class19();

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method1587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg8 && arg7 == arg2 && arg0 == arg6 && arg3 == arg5) {
			Static69.method1300(arg8, arg0, arg7, arg3, arg1);
			return;
		}
		@Pc(34) int local34 = arg8;
		@Pc(36) int local36 = arg7;
		@Pc(40) int local40 = arg8 * 3;
		@Pc(44) int local44 = arg7 * 3;
		@Pc(48) int local48 = arg4 * 3;
		@Pc(52) int local52 = arg2 * 3;
		@Pc(56) int local56 = arg5 * 3;
		@Pc(60) int local60 = arg6 * 3;
		@Pc(68) int local68 = local48 + arg0 - local60 - arg8;
		@Pc(77) int local77 = arg3 + local52 - local56 - arg7;
		@Pc(88) int local88 = local60 + local40 - local48 - local48;
		@Pc(99) int local99 = local56 + local44 - local52 - local52;
		@Pc(104) int local104 = local52 - local44;
		@Pc(108) int local108 = local48 - local40;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(118) int local118 = local110 * local110 >> 12;
			@Pc(124) int local124 = local110 * local118 >> 12;
			@Pc(128) int local128 = local124 * local68;
			@Pc(132) int local132 = local124 * local77;
			@Pc(136) int local136 = local118 * local99;
			@Pc(140) int local140 = local88 * local118;
			@Pc(144) int local144 = local104 * local110;
			@Pc(148) int local148 = local108 * local110;
			@Pc(159) int local159 = (local128 + local140 + local148 >> 12) + arg8;
			@Pc(170) int local170 = arg7 + (local136 + local132 + local144 >> 12);
			Static69.method1300(local34, local159, local36, local170, arg1);
			local34 = local159;
			local36 = local170;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static133.method2211(arg0)) {
			Static181.aClass5Array2 = null;
			Static154.method2369(arg7, arg1, arg5, arg4, Static175.aClass5ArrayArray1[arg0], arg6, arg3, -1, arg2);
			if (Static181.aClass5Array2 != null) {
				Static154.method2369(arg7, arg1, Static214.anInt4263, Static99.anInt2139, Static181.aClass5Array2, arg6, arg3, -1412584499, arg2);
				Static181.aClass5Array2 = null;
			}
		} else if (arg2 == -1) {
			for (@Pc(32) int local32 = 0; local32 < 100; local32++) {
				Static124.aBooleanArray16[local32] = true;
			}
		} else {
			Static124.aBooleanArray16[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Lclient!ag;")
	public static Class2_Sub2_Sub2 method1590(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub2_Sub2 local15 = (Class2_Sub2_Sub2) Static113.aClass86_35.method2643((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(29) byte[] local29 = Static133.aClass28_136.method852(Static169.method2639(arg0), Static120.method2082(arg0));
		local15 = new Class2_Sub2_Sub2();
		if (local29 != null) {
			local15.method122(new Class2_Sub3(local29));
		}
		Static113.aClass86_35.method2647(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([BI)V")
	public static void method1591(@OriginalArg(0) byte[] arg0) {
		@Pc(3) int local3 = 0;
		while (true) {
			while (arg0.length > local3) {
				@Pc(21) int local21 = arg0[local3++] * 64 - Static154.anInt3114;
				@Pc(31) int local31 = arg0[local3++] * 64 - Static57.anInt1431;
				@Pc(59) int local59;
				@Pc(67) int local67;
				if (local21 > 0 && local31 > 0 && Static127.anInt2810 > local21 + 64 && Static177.anInt3615 > local31 + 64) {
					local59 = local21 >> 6;
					local67 = Static177.anInt3615 - local31 - 1 >> 6;
					for (@Pc(69) int local69 = 0; local69 < 64; local69++) {
						for (@Pc(73) int local73 = -64; local73 < 0; local73++) {
							@Pc(80) byte local80 = arg0[local3++];
							if (local80 != 0) {
								@Pc(95) byte local95;
								if ((local80 & 0x1) == 1) {
									local95 = arg0[local3++];
									if (Static77.aByteArrayArrayArray33[local59][local67] == null) {
										Static77.aByteArrayArrayArray33[local59][local67] = new byte[4096];
									}
									Static77.aByteArrayArrayArray33[local59][local67][local69 + (-(local73 + 1) << 6)] = (byte) local95;
								}
								if ((local80 & 0x2) == 2) {
									local95 = arg0[local3++];
									if (Static164.aByteArrayArrayArray57[local59][local67] == null) {
										Static164.aByteArrayArrayArray57[local59][local67] = new byte[4096];
									}
									Static164.aByteArrayArrayArray57[local59][local67][(-(local73 + 1) << 6) + local69] = (byte) (local95 - 28);
								}
								if ((local80 & 0x4) == 4) {
									local3 += 3;
									@Pc(203) int local203 = (arg0[local3 - 1] & 0xFF) + ((arg0[local3 - 3] & 0xFF) << 16) + ((arg0[local3 - 2] & 0xFF) << 8);
									if (Static29.anIntArrayArrayArray2[local59][local67] == null) {
										Static29.anIntArrayArrayArray2[local59][local67] = new int[4096];
									}
									local203--;
									@Pc(221) Class2_Sub2_Sub20 local221 = Static99.method1689(local203);
									if (local221.anIntArray264 != null) {
										local221 = local221.method2050();
										if (local221 == null || local221.anInt2659 == -1) {
											continue;
										}
									}
									Static29.anIntArrayArrayArray2[local59][local67][(-(local73 + 1) << 6) + local69] = local221.anInt2679 + 1;
									@Pc(262) Class2_Sub12 local262 = new Class2_Sub12();
									local262.anInt1425 = local221.anInt2659;
									local262.anInt1424 = Static177.anInt3615 - local31;
									local262.anInt1432 = local21;
									aClass19_9.method684(local262);
								}
							}
						}
					}
				} else {
					for (local59 = 0; local59 < 64; local59++) {
						for (local67 = -64; local67 < 0; local67++) {
							@Pc(301) byte local301 = arg0[local3++];
							if (local301 != 0) {
								if ((local301 & 0x1) == 1) {
									local3++;
								}
								if ((local301 & 0x2) == 2) {
									local3++;
								}
								if ((local301 & 0x4) == 4) {
									local3 += 3;
								}
							}
						}
					}
				}
			}
			return;
		}
	}
}
