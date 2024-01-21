import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "U", descriptor = "Lclient!qf;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!ah", name = "eb", descriptor = "I")
	public static int anInt260;

	@OriginalMember(owner = "client!ah", name = "bb", descriptor = "Lclient!ua;")
	public static Class82 aClass82_6 = new Class82(50);

	@OriginalMember(owner = "client!ah", name = "cb", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array3 = new Class77[100];

	@OriginalMember(owner = "client!ah", name = "db", descriptor = "I")
	public static volatile int anInt259 = 0;

	@OriginalMember(owner = "client!ah", name = "fb", descriptor = "I")
	public static int anInt261 = 0;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)I")
	public static int method143() {
		@Pc(12) int local12 = Static161.method2725(Static7.anInt215, Static54.anInt1472, Static121.anInt2979);
		return local12 - Static160.anInt4578 >= 800 || (Static140.aByteArrayArrayArray6[Static54.anInt1472][Static7.anInt215 >> 7][Static121.anInt2979 >> 7] & 0x4) == 0 ? 3 : Static54.anInt1472;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII)V")
	public static void method144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static172.aClass60_1.method2077(arg4, arg1, arg2);
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(65) int local65;
		@Pc(49) int local49;
		if (local11 != 0) {
			local24 = Static172.aClass60_1.method2059(arg4, arg1, arg2, local11);
			local30 = local24 >> 6 & 0x3;
			local34 = local24 & 0x1F;
			@Pc(37) int[] local37 = Static76.aClass2_Sub2_Sub3_Sub2_4.anIntArray81;
			local39 = arg3;
			if (local11 > 0) {
				local39 = arg0;
			}
			local49 = local11 >> 14 & 0x7FFF;
			local65 = arg1 * 4 + (52736 - arg2 * 512) * 4 + 24624;
			@Pc(71) Class2_Sub2_Sub5 local71 = Static121.method2129(local49);
			if (local71.anInt530 == -1) {
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						local37[local65] = local39;
						local37[local65 + 512] = local39;
						local37[local65 + 1024] = local39;
						local37[local65 + 1536] = local39;
					} else if (local30 == 1) {
						local37[local65] = local39;
						local37[local65 + 1] = local39;
						local37[local65 + 2] = local39;
						local37[local65 + 3] = local39;
					} else if (local30 == 2) {
						local37[local65 + 3] = local39;
						local37[local65 + 512 + 3] = local39;
						local37[local65 + 3 + 1024] = local39;
						local37[local65 + 1539] = local39;
					} else if (local30 == 3) {
						local37[local65 + 1536] = local39;
						local37[local65 + 1537] = local39;
						local37[local65 + 1536 + 2] = local39;
						local37[local65 + 1536 + 3] = local39;
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						local37[local65] = local39;
					} else if (local30 == 1) {
						local37[local65 + 3] = local39;
					} else if (local30 == 2) {
						local37[local65 + 1539] = local39;
					} else if (local30 == 3) {
						local37[local65 + 1536] = local39;
					}
				}
				if (local34 == 2) {
					if (local30 == 3) {
						local37[local65] = local39;
						local37[local65 + 512] = local39;
						local37[local65 + 1024] = local39;
						local37[local65 + 1536] = local39;
					} else if (local30 == 0) {
						local37[local65] = local39;
						local37[local65 + 1] = local39;
						local37[local65 + 2] = local39;
						local37[local65 + 3] = local39;
					} else if (local30 == 1) {
						local37[local65 + 3] = local39;
						local37[local65 + 512 + 3] = local39;
						local37[local65 + 1024 + 3] = local39;
						local37[local65 + 3 + 1536] = local39;
					} else if (local30 == 2) {
						local37[local65 + 1536] = local39;
						local37[local65 + 1536 + 1] = local39;
						local37[local65 + 1536 + 2] = local39;
						local37[local65 + 3 + 1536] = local39;
					}
				}
			} else {
				@Pc(389) Class2_Sub2_Sub3_Sub3 local389 = Static55.aClass2_Sub2_Sub3_Sub3Array9[local71.anInt530];
				if (local389 != null) {
					@Pc(401) int local401 = (local71.anInt520 * 4 - local389.anInt1451) / 2;
					@Pc(412) int local412 = (local71.anInt538 * 4 - local389.anInt1449) / 2;
					local389.method1019(local401 + arg1 * 4 + 48, (-local71.anInt538 + 104 - arg2) * 4 + 48 + local412);
				}
			}
		}
		local11 = Static172.aClass60_1.method2063(arg4, arg1, arg2);
		if (local11 != 0) {
			local24 = Static172.aClass60_1.method2059(arg4, arg1, arg2, local11);
			local34 = local24 & 0x1F;
			local30 = local24 >> 6 & 0x3;
			local39 = local11 >> 14 & 0x7FFF;
			@Pc(470) Class2_Sub2_Sub5 local470 = Static121.method2129(local39);
			@Pc(499) int local499;
			if (local470.anInt530 != -1) {
				@Pc(577) Class2_Sub2_Sub3_Sub3 local577 = Static55.aClass2_Sub2_Sub3_Sub3Array9[local470.anInt530];
				if (local577 != null) {
					local49 = (local470.anInt520 * 4 - local577.anInt1451) / 2;
					local499 = (local470.anInt538 * 4 - local577.anInt1449) / 2;
					local577.method1019(arg1 * 4 + local49 + 48, local499 + 48 + (-arg2 + 104 + -local470.anInt538) * 4);
				}
			} else if (local34 == 9) {
				@Pc(482) int[] local482 = Static76.aClass2_Sub2_Sub3_Sub2_4.anIntArray81;
				local65 = 15658734;
				local499 = (52736 - arg2 * 512) * 4 + arg1 * 4 + 24624;
				if (local11 > 0) {
					local65 = 15597568;
				}
				if (local30 == 0 || local30 == 2) {
					local482[local499 + 1536] = local65;
					local482[local499 + 1 + 1024] = local65;
					local482[local499 + 514] = local65;
					local482[local499 + 3] = local65;
				} else {
					local482[local499] = local65;
					local482[local499 + 512 + 1] = local65;
					local482[local499 + 1024 + 2] = local65;
					local482[local499 + 1539] = local65;
				}
			}
		}
		local11 = Static172.aClass60_1.method2072(arg4, arg1, arg2);
		if (local11 == 0) {
			return;
		}
		local24 = local11 >> 14 & 0x7FFF;
		@Pc(643) Class2_Sub2_Sub5 local643 = Static121.method2129(local24);
		if (local643.anInt530 == -1) {
			return;
		}
		@Pc(652) Class2_Sub2_Sub3_Sub3 local652 = Static55.aClass2_Sub2_Sub3_Sub3Array9[local643.anInt530];
		if (local652 != null) {
			local39 = (local643.anInt520 * 4 - local652.anInt1451) / 2;
			@Pc(676) int local676 = (local643.anInt538 * 4 - local652.anInt1449) / 2;
			local652.method1019(arg1 * 4 + local39 + 48, local676 + (-arg2 + 104 - local643.anInt538) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
	public static void method145() {
		aClass66_1 = null;
		aClass82_6 = null;
		aClass77Array3 = null;
	}
}
