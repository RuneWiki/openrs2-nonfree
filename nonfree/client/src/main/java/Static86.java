import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!es", name = "d", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "Lclient!tb;")
	public static Class189 aClass189_4;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "Lclient!kr;")
	public static Class46 aClass46_6;

	@OriginalMember(owner = "client!es", name = "j", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_36 = new Class140("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIIIIIZI)Z")
	public static boolean method1714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(30) int local30 = Static63.method1316(arg6, Static177.aClass1_Sub2_Sub3_Sub1_1.method5787(), Static17.anIntArray31, arg0, Static300.anIntArray460, arg1, arg7, Static182.aClass61Array2[Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77], arg2, arg5, arg8, arg4, arg9, arg3);
		if (local30 < 1) {
			return false;
		}
		Static57.anInt1013 = Static300.anIntArray460[local30 - 1];
		Static360.anInt6858 = Static17.anIntArray31[local30 - 1];
		Static100.aBoolean187 = false;
		Static107.method2099();
		return true;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!dr;Z)V")
	public static void method1715(@OriginalArg(0) Class37 arg0) {
		@Pc(7) int local7 = Static118.anInt2499;
		@Pc(9) int local9 = Static220.anInt4855;
		@Pc(11) int local11 = Static118.anInt2488;
		@Pc(17) int local17 = Static130.anInt2766;
		arg0.method3694(local11, -10660793, local17, local7, local9);
		arg0.method3694(local11 - 2, -16777216, 16, local7 + 1, local9 + 1);
		arg0.method3737(local17 - 19, local7 + 1, -16777216, local9 + 18, local11 + -2);
		Static25.aClass71_1.method5250(Static251.aClass140_124.method4155(Static239.anInt2803), local9 + 14, -10660793, -1, local7 + 3);
		@Pc(76) int local76 = Class1_Sub2_Sub5.lb.method2470();
		@Pc(80) int local80 = Class1_Sub2_Sub5.lb.method2466();
		@Pc(82) int local82 = 0;
		for (@Pc(87) Class2_Sub31 local87 = (Class2_Sub31) Static103.aClass180_24.method4919(); local87 != null; local87 = (Class2_Sub31) Static103.aClass180_24.method4916()) {
			@Pc(103) int local103 = local9 + (Static225.anInt4918 - local82 - 1) * 16 + 31;
			@Pc(105) short local105 = -1;
			if (local76 > local7 && local76 < local7 + local11 && local80 > local103 - 13 && local80 < local103 + 3 && local87.aBoolean468) {
				local105 = -256;
			}
			@Pc(143) int[] local143 = null;
			if (Static2.method59(local87.anInt5368)) {
				local143 = Static310.aClass184_2.method5040((int) local87.aLong163).anIntArray296;
			} else if (Static223.method4181(local87.anInt5368)) {
				@Pc(159) Class1_Sub2_Sub3_Sub2 local159 = Static95.aClass1_Sub2_Sub3_Sub2Array1[(int) local87.aLong163];
				if (local159 != null) {
					@Pc(164) Class139 local164 = local159.aClass139_1;
					if (local164.anIntArray350 != null) {
						local164 = local164.method4120();
					}
					if (local164 != null) {
						local143 = local164.anIntArray351;
					}
				}
			} else if (Static237.method4310(local87.anInt5368)) {
				@Pc(198) Class74 local198;
				if (local87.anInt5368 == 1002) {
					local198 = Static228.method4210((int) local87.aLong163);
				} else {
					local198 = Static228.method4210((int) (local87.aLong163 >>> 32 & 0x7FFFFFFFL));
				}
				if (local198.anIntArray161 != null) {
					local198 = local198.method1997();
				}
				if (local198 != null) {
					local143 = local198.anIntArray164;
				}
			}
			@Pc(230) String local230 = Static159.method2497(local87);
			if (local143 != null) {
				local230 = local230 + Static106.method2086(local143);
			}
			Static25.aClass71_1.method5245(Static87.anIntArray130, Static65.aClass46Array24, local7 + 3, local103, local230, local105);
			local82++;
			if (local87.aBoolean469) {
				Static242.aClass46_18.method5016(Static99.aClass82_3.method2230(local230) + local7 + 5, local103 + -12);
			}
		}
		Static304.method5123(Static220.anInt4855, Static118.anInt2499, Static130.anInt2766, Static118.anInt2488);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!dr;B)V")
	public static void method1716(@OriginalArg(0) Class37 arg0) {
		if (Static258.aBoolean470) {
			Static53.method1175(arg0);
		} else {
			Static189.method3531(arg0);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg1; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg4; local16 <= arg2; local16++) {
				if (arg3 == Static200.anIntArrayArray39[local12][local16] && Static153.anIntArrayArray32[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
