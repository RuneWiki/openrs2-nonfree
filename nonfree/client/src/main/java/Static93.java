import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
	public static int anInt1786;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
	public static int anInt1792;

	@OriginalMember(owner = "client!fh", name = "fb", descriptor = "[I")
	public static final int[] anIntArray226 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!fh", name = "hb", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BILclient!rg;I)V")
	public static void method1726(@OriginalArg(1) int arg0, @OriginalArg(2) Class177 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt5193 == 1) {
			Static164.method3162(-1, arg1.anInt5219, "", 0L, 21, 0, arg1.aString207);
		}
		if (arg1.anInt5193 == 2 && !Static89.aBoolean156) {
			@Pc(42) String local42 = Static280.method4827(arg1);
			if (local42 != null) {
				Static164.method3162(-1, arg1.anInt5219, "<col=00ff00>" + arg1.aString206, 0L, 13, -1, local42);
			}
		}
		if (arg1.anInt5193 == 3) {
			Static164.method3162(-1, arg1.anInt5219, "", 0L, 39, 0, Static55.aString45);
		}
		if (arg1.anInt5193 == 4) {
			Static164.method3162(-1, arg1.anInt5219, "", 0L, 40, 0, arg1.aString207);
		}
		if (arg1.anInt5193 == 5) {
			Static164.method3162(-1, arg1.anInt5219, "", 0L, 36, 0, arg1.aString207);
		}
		if (arg1.anInt5193 == 6 && Static297.aClass177_20 == null) {
			Static164.method3162(-1, arg1.anInt5219, "", 0L, 58, -1, arg1.aString207);
		}
		@Pc(160) int local160;
		@Pc(154) int local154;
		if (arg1.anInt5208 == 2) {
			local154 = 0;
			for (@Pc(156) int local156 = 0; local156 < arg1.anInt5191; local156++) {
				for (local160 = 0; local160 < arg1.anInt5211; local160++) {
					@Pc(169) int local169 = (arg1.anInt5175 + 32) * local160;
					@Pc(177) int local177 = (arg1.anInt5263 + 32) * local156;
					if (local154 < 20) {
						local169 += arg1.anIntArray654[local154];
						local177 += arg1.anIntArray656[local154];
					}
					if (local169 <= arg2 && arg0 >= local177 && arg2 < local169 + 32 && arg0 < local177 + 32) {
						Static300.anInt5811 = local154;
						Static193.aClass177_12 = arg1;
						if (arg1.anIntArray668[local154] > 0) {
							@Pc(230) Class1_Sub35 local230 = Static47.method1096(arg1);
							@Pc(239) Class61 local239 = Static241.method4285(arg1.anIntArray668[local154] - 1);
							if (Static243.anInt4739 == 1 && local230.method4897()) {
								if (arg1.anInt5219 != Static84.anInt1651 || Static114.anInt2289 != local154) {
									Static164.method3162(Static320.anInt6136, arg1.anInt5219, Static285.aString222 + " -> <col=ff9040>" + local239.aString74, (long) local239.anInt1826, 46, local154, Static313.aString241);
								}
							} else if (Static89.aBoolean156 && local230.method4897()) {
								@Pc(608) Class1_Sub1_Sub18 local608 = Static21.anInt502 == -1 ? null : Static305.method5149(Static21.anInt502);
								if ((Static95.anInt1903 & 0x10) != 0 && (local608 == null || local239.method1732(Static21.anInt502, local608.anInt5480) != local608.anInt5480)) {
									Static164.method3162(Static181.anInt3761, arg1.anInt5219, Static144.aString113 + " -> <col=ff9040>" + local239.aString74, (long) local239.anInt1826, 15, local154, Static21.aString15);
								}
							} else {
								@Pc(294) String[] local294 = local239.aStringArray10;
								@Pc(300) int local300;
								@Pc(313) byte local313;
								@Pc(319) int local319;
								if (local230.method4897()) {
									for (local300 = 4; local300 >= 3; local300--) {
										if (local294 != null && local294[local300] != null) {
											if (local300 == 3) {
												local313 = 45;
											} else {
												local313 = 9;
											}
											local319 = -1;
											if (local239.anInt1790 == local300) {
												local319 = local239.anInt1830;
											}
											if (local300 == local239.anInt1828) {
												local319 = local239.anInt1798;
											}
											Static164.method3162(local319, arg1.anInt5219, "<col=ff9040>" + local239.aString74, (long) local239.anInt1826, local313, local154, local294[local300]);
										}
									}
								}
								if (local230.method4895()) {
									Static164.method3162(Static320.anInt6136, arg1.anInt5219, "<col=ff9040>" + local239.aString74, (long) local239.anInt1826, 43, local154, Static313.aString241);
								}
								if (local230.method4897() && local294 != null) {
									for (local300 = 2; local300 >= 0; local300--) {
										if (local294[local300] != null) {
											local313 = 0;
											local319 = -1;
											if (local300 == 0) {
												local313 = 26;
											}
											if (local300 == 1) {
												local313 = 37;
											}
											if (local300 == 2) {
												local313 = 41;
											}
											if (local239.anInt1790 == local300) {
												local319 = local239.anInt1830;
											}
											if (local239.anInt1828 == local300) {
												local319 = local239.anInt1798;
											}
											Static164.method3162(local319, arg1.anInt5219, "<col=ff9040>" + local239.aString74, (long) local239.anInt1826, local313, local154, local294[local300]);
										}
									}
								}
								local294 = arg1.aStringArray35;
								if (local294 != null) {
									for (local300 = 4; local300 >= 0; local300--) {
										if (local294[local300] != null) {
											local313 = 0;
											if (local300 == 0) {
												local313 = 20;
											}
											local319 = -1;
											if (local300 == 1) {
												local313 = 7;
											}
											if (local300 == 2) {
												local313 = 2;
											}
											if (local300 == 3) {
												local313 = 17;
											}
											if (local239.anInt1790 == local300) {
												local319 = local239.anInt1830;
											}
											if (local300 == 4) {
												local313 = 30;
											}
											if (local239.anInt1828 == local300) {
												local319 = local239.anInt1798;
											}
											Static164.method3162(local319, arg1.anInt5219, "<col=ff9040>" + local239.aString74, (long) local239.anInt1826, local313, local154, local294[local300]);
										}
									}
								}
								Static164.method3162(Static338.anInt6420, arg1.anInt5219, "<col=ff9040>" + local239.aString74, (long) local239.anInt1826, 1004, local154, Static206.aString167);
							}
						}
					}
					local154++;
				}
			}
		}
		if (!arg1.aBoolean445) {
			return;
		}
		if (!Static89.aBoolean156) {
			@Pc(681) String local681;
			for (local154 = 9; local154 >= 5; local154--) {
				local681 = Static172.method5111(arg1, local154);
				if (local681 != null) {
					Static164.method3162(Static223.method4077(arg1, local154), arg1.anInt5219, arg1.aString211, (long) (local154 + 1), 1001, arg1.anInt5239, local681);
				}
			}
			local681 = Static280.method4827(arg1);
			if (local681 != null) {
				Static164.method3162(-1, arg1.anInt5219, arg1.aString211, 0L, 13, arg1.anInt5239, local681);
			}
			for (local160 = 4; local160 >= 0; local160--) {
				@Pc(740) String local740 = Static172.method5111(arg1, local160);
				if (local740 != null) {
					Static164.method3162(Static223.method4077(arg1, local160), arg1.anInt5219, arg1.aString211, (long) (local160 + 1), 19, arg1.anInt5239, local740);
				}
			}
			if (Static47.method1096(arg1).method4900()) {
				if (arg1.aString209 == null) {
					Static164.method3162(-1, arg1.anInt5219, "", 0L, 58, arg1.anInt5239, Static32.aString25);
				} else {
					Static164.method3162(-1, arg1.anInt5219, "", 0L, 58, arg1.anInt5239, arg1.aString209);
				}
				return;
			}
			return;
		}
		if (Static47.method1096(arg1).method4893() && (Static95.anInt1903 & 0x20) != 0) {
			Static164.method3162(Static181.anInt3761, arg1.anInt5219, Static144.aString113 + " -> " + arg1.aString211, 0L, 5, arg1.anInt5239, Static21.aString15);
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V")
	public static void method1731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static49.anInt1124 && arg0 <= Static291.anInt5657) {
			@Pc(28) int local28 = Static216.method3969(Static251.anInt6512, arg1, Static106.anInt2157);
			@Pc(34) int local34 = Static216.method3969(Static251.anInt6512, arg3, Static106.anInt2157);
			Static19.method444(local34, arg0, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZII)I")
	public static int method1733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local12;
	}
}
