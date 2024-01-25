import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dca", name = "i", descriptor = "[I")
	public static int[] anIntArray79;

	@OriginalMember(owner = "client!dca", name = "l", descriptor = "Lclient!ega;")
	public static final Class93 aClass93_1 = new Class93();

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IZ)I")
	public static int method1391(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static181.anInt3401;
		if (local5 == 0) {
			return arg0 ? 0 : Static251.anInt4580;
		} else if (local5 == 1) {
			return Static251.anInt4580;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1393(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static645.anInt10557 >= 200 && !Static82.aBoolean119 || Static645.anInt10557 >= 200) {
			Static218.method3476(Static184.aClass131_12.method3168(Static375.anInt7800));
			return;
		}
		@Pc(46) String local46 = Static382.method5678(arg0);
		if (local46 == null) {
			return;
		}
		@Pc(96) String local96;
		for (@Pc(52) int local52 = 0; local52 < Static645.anInt10557; local52++) {
			@Pc(62) String local62 = Static382.method5678(Static167.aStringArray13[local52]);
			if (local62 != null && local62.equals(local46)) {
				Static218.method3476(arg0 + Static184.aClass131_39.method3168(Static375.anInt7800));
				return;
			}
			if (Static7.aStringArray1[local52] != null) {
				local96 = Static382.method5678(Static7.aStringArray1[local52]);
				if (local96 != null && local96.equals(local46)) {
					Static218.method3476(arg0 + Static184.aClass131_39.method3168(Static375.anInt7800));
					return;
				}
			}
		}
		for (@Pc(130) int local130 = 0; local130 < Static62.anInt1053; local130++) {
			local96 = Static382.method5678(Static119.aStringArray8[local130]);
			if (local96 != null && local96.equals(local46)) {
				Static218.method3476(Static184.aClass131_44.method3168(Static375.anInt7800) + arg0 + Static184.aClass131_45.method3168(Static375.anInt7800));
				return;
			}
			if (Static669.aStringArray42[local130] != null) {
				@Pc(179) String local179 = Static382.method5678(Static669.aStringArray42[local130]);
				if (local179 != null && local179.equals(local46)) {
					Static218.method3476(Static184.aClass131_44.method3168(Static375.anInt7800) + arg0 + Static184.aClass131_45.method3168(Static375.anInt7800));
					return;
				}
			}
		}
		if (Static382.method5678(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString44).equals(local46)) {
			Static218.method3476(Static184.aClass131_42.method3168(Static375.anInt7800));
			return;
		}
		@Pc(243) Class389 local243 = Static120.method1769(false);
		@Pc(249) Class5_Sub41 local249 = Static647.method8905(Static672.aClass381_272, local243.aClass393_2);
		local249.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(arg0));
		local249.aClass5_Sub36_Sub2_1.method7327(arg0);
		local243.method9079(local249);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZJ)V")
	public static void method1397(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static362.anInt9812 + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805;
		@Pc(15) int local15 = Static630.anInt10209 + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803;
		if (Static620.anInt8145 - local10 < -2000 || Static620.anInt8145 - local10 > 2000 || Static343.anInt5712 - local15 < -2000 || Static343.anInt5712 - local15 > 2000) {
			Static620.anInt8145 = local10;
			Static343.anInt5712 = local15;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (local10 != Static620.anInt8145) {
			local63 = local10 - Static620.anInt8145;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local71 < local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local63 < local71) {
				local71 = local63;
			}
			Static620.anInt8145 += local71;
		}
		Static243.aFloat117 += (float) arg0 * Static449.aFloat140 / 6.0F;
		if (Static343.anInt5712 != local15) {
			local63 = local15 - Static343.anInt5712;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 > 0) {
				if (local71 == 0) {
					local71 = 1;
				} else if (local71 > local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = -1;
			} else if (local63 > local71) {
				local71 = local63;
			}
			Static343.anInt5712 += local71;
		}
		Static211.aFloat113 += Static317.aFloat130 * (float) arg0 / 6.0F;
		Static301.method4696();
	}
}
