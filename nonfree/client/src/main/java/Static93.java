import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1 aClass4_Sub2_Sub3_Sub1_9;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] aClass4_Sub2_Sub3_Sub1Array12;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1796 = Static28.method504("Your profile will be transferred in:");

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1793 = aClass39_1796;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1795 = Static28.method504("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1794 = aClass39_1795;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1800 = Static28.method504("Players");

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1797 = aClass39_1800;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1798 = Static28.method504("This computers address has been blocked");

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1799 = aClass39_1798;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	public static int anInt3185 = 1;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method2206() {
		aClass39_1796 = null;
		aClass39_1799 = null;
		aClass39_1798 = null;
		aClass39_1800 = null;
		aClass4_Sub2_Sub3_Sub1Array12 = null;
		aClass39_1793 = null;
		aClass39_1795 = null;
		aClass39_1794 = null;
		aClass39_1797 = null;
		aClass4_Sub2_Sub3_Sub1_9 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
	public static void method2207(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static27.method502(arg0)) {
			return;
		}
		@Pc(19) Class4_Sub5[] local19 = Static109.aClass4_Sub5ArrayArray1[arg0];
		for (@Pc(31) int local31 = 0; local31 < local19.length; local31++) {
			@Pc(37) Class4_Sub5 local37 = local19[local31];
			if (local37.anObjectArray22 != null) {
				@Pc(44) Class4_Sub17 local44 = new Class4_Sub17();
				local44.aClass4_Sub5_51 = local37;
				local44.anObjectArray27 = local37.anObjectArray22;
				Static104.method1857(local44);
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ja;Lclient!pd;Lclient!ja;I)Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1 method2210(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class39 arg2) {
		@Pc(9) int local9 = arg1.method484(arg2);
		@Pc(19) int local19 = arg1.method475(arg0, local9);
		return Static94.method1706(arg1, local9, local19);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BIIIII)V")
	public static void method2212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static101.aClass43_1.method1099(arg1, arg2, arg0);
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(28) int local28;
		@Pc(60) int local60;
		@Pc(41) int local41;
		if (local11 != 0) {
			local20 = Static101.aClass43_1.method1075(arg1, arg2, arg0, local11);
			local26 = local20 >> 6 & 0x3;
			local28 = arg4;
			@Pc(31) int[] local31 = Static110.aClass4_Sub2_Sub3_Sub1_7.anIntArray141;
			local35 = local20 & 0x1F;
			local41 = local11 >> 14 & 0x7FFF;
			@Pc(45) Class4_Sub2_Sub10 local45 = Static73.method1207(local41);
			local60 = arg2 * 4 + (-arg0 + 103) * 512 * 4 + 24624;
			if (local11 > 0) {
				local28 = arg3;
			}
			if (local45.anInt1408 == -1) {
				if (local35 == 0 || local35 == 2) {
					if (local26 == 0) {
						local31[local60] = local28;
						local31[local60 + 512] = local28;
						local31[local60 + 1024] = local28;
						local31[local60 + 1536] = local28;
					} else if (local26 == 1) {
						local31[local60] = local28;
						local31[local60 + 1] = local28;
						local31[local60 + 2] = local28;
						local31[local60 + 3] = local28;
					} else if (local26 == 2) {
						local31[local60 + 3] = local28;
						local31[local60 + 515] = local28;
						local31[local60 + 1024 + 3] = local28;
						local31[local60 + 1536 + 3] = local28;
					} else if (local26 == 3) {
						local31[local60 + 1536] = local28;
						local31[local60 + 1536 + 1] = local28;
						local31[local60 + 2 + 1536] = local28;
						local31[local60 + 3 + 1536] = local28;
					}
				}
				if (local35 == 3) {
					if (local26 == 0) {
						local31[local60] = local28;
					} else if (local26 == 1) {
						local31[local60 + 3] = local28;
					} else if (local26 == 2) {
						local31[local60 + 1536 + 3] = local28;
					} else if (local26 == 3) {
						local31[local60 + 1536] = local28;
					}
				}
				if (local35 == 2) {
					if (local26 == 3) {
						local31[local60] = local28;
						local31[local60 + 512] = local28;
						local31[local60 + 1024] = local28;
						local31[local60 + 1536] = local28;
					} else if (local26 == 0) {
						local31[local60] = local28;
						local31[local60 + 1] = local28;
						local31[local60 + 2] = local28;
						local31[local60 + 3] = local28;
					} else if (local26 == 1) {
						local31[local60 + 3] = local28;
						local31[local60 + 3 + 512] = local28;
						local31[local60 + 1027] = local28;
						local31[local60 + 1539] = local28;
					} else if (local26 == 2) {
						local31[local60 + 1536] = local28;
						local31[local60 + 1537] = local28;
						local31[local60 + 1538] = local28;
						local31[local60 + 3 + 1536] = local28;
					}
				}
			} else {
				@Pc(76) Class4_Sub2_Sub3_Sub4 local76 = Static38.aClass4_Sub2_Sub3_Sub4Array2[local45.anInt1408];
				if (local76 != null) {
					@Pc(89) int local89 = (local45.anInt1410 * 4 - local76.anInt2267) / 2;
					@Pc(100) int local100 = (local45.anInt1413 * 4 - local76.anInt2266) / 2;
					local76.method1688(local89 + arg2 * 4 + 48, 48 - -((-local45.anInt1413 + -arg0 + 104) * 4) - -local100);
				}
			}
		}
		local11 = Static101.aClass43_1.method1117(arg1, arg2, arg0);
		if (local11 != 0) {
			local20 = Static101.aClass43_1.method1075(arg1, arg2, arg0, local11);
			local26 = local20 >> 6 & 0x3;
			local35 = local20 & 0x1F;
			local28 = local11 >> 14 & 0x7FFF;
			@Pc(468) Class4_Sub2_Sub10 local468 = Static73.method1207(local28);
			@Pc(491) int local491;
			if (local468.anInt1408 != -1) {
				@Pc(478) Class4_Sub2_Sub3_Sub4 local478 = Static38.aClass4_Sub2_Sub3_Sub4Array2[local468.anInt1408];
				if (local478 != null) {
					local491 = (local468.anInt1413 * 4 - local478.anInt2266) / 2;
					local41 = (local468.anInt1410 * 4 - local478.anInt2267) / 2;
					local478.method1688(local41 + arg2 * 4 + 48, (-local468.anInt1413 + 104 + -arg0) * 4 + (48 - -local491));
				}
			} else if (local35 == 9) {
				local60 = 15658734;
				if (local11 > 0) {
					local60 = 15597568;
				}
				@Pc(545) int[] local545 = Static110.aClass4_Sub2_Sub3_Sub1_7.anIntArray141;
				local491 = (52736 - arg0 * 512) * 4 + arg2 * 4 + 24624;
				if (local26 == 0 || local26 == 2) {
					local545[local491 + 1536] = local60;
					local545[local491 + 1024 + 1] = local60;
					local545[local491 + 2 + 512] = local60;
					local545[local491 + 3] = local60;
				} else {
					local545[local491] = local60;
					local545[local491 + 512 + 1] = local60;
					local545[local491 + 1024 + 2] = local60;
					local545[local491 + 3 + 1536] = local60;
				}
			}
		}
		local11 = Static101.aClass43_1.method1113(arg1, arg2, arg0);
		if (local11 == 0) {
			return;
		}
		local20 = local11 >> 14 & 0x7FFF;
		@Pc(655) Class4_Sub2_Sub10 local655 = Static73.method1207(local20);
		if (local655.anInt1408 == -1) {
			return;
		}
		@Pc(665) Class4_Sub2_Sub3_Sub4 local665 = Static38.aClass4_Sub2_Sub3_Sub4Array2[local655.anInt1408];
		if (local665 != null) {
			@Pc(678) int local678 = (local655.anInt1413 * 4 - local665.anInt2266) / 2;
			local28 = (local655.anInt1410 * 4 - local665.anInt2267) / 2;
			local665.method1688(local28 + arg2 * 4 + 48, (-local655.anInt1413 + 104 + -arg0) * 4 + 48 + local678);
			return;
		}
	}
}
