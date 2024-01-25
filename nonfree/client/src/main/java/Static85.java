import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public static int anInt1713;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	public static int anInt1718 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIB)V")
	public static void method1401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Static565.anInt9560 + arg0;
		@Pc(13) int local13 = arg1 + Static567.anInt9589;
		if (Static421.aClass217ArrayArrayArray5 == null || arg0 < 0 || arg1 < 0 || Static326.anInt5541 <= arg0 || arg1 >= Static448.anInt7637 || Static97.aClass5_Sub25_8.aClass6_Sub6_2.method1639() == 0 && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 != arg2) {
			return;
		}
		@Pc(66) long local66 = (long) (local9 | arg2 << 28 | local13 << 14);
		@Pc(72) Class5_Sub18 local72 = (Class5_Sub18) Static440.aClass273_28.method6581(local66);
		if (local72 == null) {
			Static559.method8125(arg2, arg0, arg1);
			return;
		}
		@Pc(86) Class5_Sub32 local86 = (Class5_Sub32) local72.aClass330_8.method7908();
		if (local86 == null) {
			Static559.method8125(arg2, arg0, arg1);
			return;
		}
		@Pc(100) Class4_Sub2_Sub5_Sub1 local100 = (Class4_Sub2_Sub5_Sub1) Static559.method8125(arg2, arg0, arg1);
		if (local100 == null) {
			local100 = new Class4_Sub2_Sub5_Sub1(arg0 << 9, Static11.aClass61Array1[arg2].method8580(arg1, arg0), arg1 << 9, arg2, arg2);
		} else {
			local100.anInt10267 = local100.anInt10249 = -1;
		}
		local100.anInt10254 = local86.anInt5329;
		local100.anInt10262 = local86.anInt5333;
		label56: while (true) {
			@Pc(143) Class5_Sub32 local143 = (Class5_Sub32) local72.aClass330_8.method7914();
			if (local143 == null) {
				break;
			}
			if (local143.anInt5333 != local100.anInt10262) {
				local100.anInt10257 = local143.anInt5329;
				local100.anInt10267 = local143.anInt5333;
				while (true) {
					@Pc(168) Class5_Sub32 local168 = (Class5_Sub32) local72.aClass330_8.method7914();
					if (local168 == null) {
						break label56;
					}
					if (local100.anInt10262 != local168.anInt5333 && local168.anInt5333 != local100.anInt10267) {
						local100.anInt10249 = local168.anInt5333;
						local100.anInt10261 = local168.anInt5329;
					}
				}
			}
		}
		@Pc(212) int local212 = Static644.method9021((arg1 << 9) + 256, (arg0 << 9) + 256, arg2);
		local100.anInt10231 = arg0 << 9;
		local100.anInt10228 = local212;
		local100.aByte132 = (byte) arg2;
		local100.anInt10253 = 0;
		local100.anInt10229 = arg1 << 9;
		local100.aByte131 = (byte) arg2;
		if (Static23.method285(arg0, arg1)) {
			local100.aByte131++;
		}
		Static573.method2153(arg2, arg0, arg1, local212, local100);
	}
}
