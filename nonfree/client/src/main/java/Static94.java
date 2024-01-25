import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "J")
	public static long aLong53;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
	public static final int[] anIntArray154 = new int[25];

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method1751(@OriginalArg(0) Class137 arg0) {
		if (Static313.anInt9044 < 2 && !Static238.aBoolean302 || Static299.aClass230_4 != null) {
			return;
		}
		@Pc(49) String local49;
		if (Static238.aBoolean302 && Static313.anInt9044 < 2) {
			local49 = Static139.aString30 + Static514.aClass303_34.method7473(Static232.anInt4258) + Static639.aString114 + " ->";
		} else if (Static538.aBoolean652 && Static68.aClass65_1.method1565(81) && Static313.anInt9044 > 2) {
			local49 = Static654.method9084(Static12.aClass14_Sub3_Sub11_1);
		} else {
			@Pc(42) Class14_Sub3_Sub11 local42 = Static12.aClass14_Sub3_Sub11_1;
			if (local42 == null) {
				return;
			}
			local49 = Static654.method9084(local42);
			@Pc(51) int[] local51 = null;
			if (Static461.method6748(local42.anInt4752)) {
				local51 = Static175.aClass247_2.method5962((int) local42.aLong144).anIntArray72;
			} else if (local42.anInt4755 != -1) {
				local51 = Static175.aClass247_2.method5962(local42.anInt4755).anIntArray72;
			} else if (Static254.method3738(local42.anInt4752)) {
				@Pc(82) Class14_Sub44 local82 = (Class14_Sub44) Static579.aClass187_73.method4078((long) (int) local42.aLong144);
				if (local82 != null) {
					@Pc(87) Class12_Sub2_Sub2_Sub1_Sub1 local87 = local82.aClass12_Sub2_Sub2_Sub1_Sub1_2;
					@Pc(90) Class283 local90 = local87.aClass283_1;
					if (local90.anIntArray638 != null) {
						local90 = local90.method7129(Static595.aClass241_1);
					}
					if (local90 != null) {
						local51 = local90.anIntArray639;
					}
				}
			} else if (Static198.method3030(local42.anInt4752)) {
				@Pc(126) Class203 local126;
				if (local42.anInt4752 == 1010) {
					local126 = Static511.aClass13_2.method86((int) local42.aLong144);
				} else {
					local126 = Static511.aClass13_2.method86((int) (local42.aLong144 >>> 32 & 0x7FFFFFFFL));
				}
				if (local126.anIntArray440 != null) {
					local126 = local126.method5007(Static595.aClass241_1);
				}
				if (local126 != null) {
					local51 = local126.anIntArray444;
				}
			}
			if (local51 != null) {
				local49 = local49 + Static433.method8535(local51);
			}
		}
		if (Static313.anInt9044 > 2) {
			local49 = local49 + "<col=ffffff> / " + (Static313.anInt9044 - 2) + Static514.aClass303_27.method7473(Static232.anInt4258);
		}
		if (Static608.aClass230_10 != null) {
			@Pc(259) Class38 local259 = Static608.aClass230_10.method5453(arg0);
			if (local259 == null) {
				local259 = Static448.aClass38_10;
			}
			local259.method8983(Static511.anInt3032, Static142.anInt2688, local49, Static59.anInt1420, Static135.aClass20Array3, Static387.anIntArray518, Static492.aRandom1, Static608.aClass230_10.anInt6672, Static608.aClass230_10.anInt6713, Static608.aClass230_10.anInt6665, Static608.aClass230_10.anInt6703, Static608.aClass230_10.anInt6701, Static31.anIntArray65, Static608.aClass230_10.anInt6698);
			Static481.method7124(Static31.anIntArray65[3], Static31.anIntArray65[1], Static31.anIntArray65[2], Static31.anIntArray65[0]);
		} else if (Static472.aClass230_9 != null && Static630.aClass77_8 == Static174.aClass77_11) {
			@Pc(240) int local240 = Static448.aClass38_10.method8981(Static492.aRandom1, Static135.aClass20Array3, Static387.anIntArray518, Static674.anInt11170 + 4, local49, Static511.anInt3032, Static549.anInt9387 + 16);
			Static481.method7124(16, Static549.anInt9387, local240 + Static48.aClass158_1.method3601(local49), Static674.anInt11170 - -4);
			return;
		}
	}
}
