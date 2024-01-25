import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!da", name = "v", descriptor = "I")
	public static int anInt11140;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!c;")
	public static final Class51 aClass51_35 = new Class51(6, 1);

	@OriginalMember(owner = "client!da", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray51 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method9424() {
		for (@Pc(8) Class14_Sub2_Sub20 local8 = (Class14_Sub2_Sub20) Static111.aClass32_7.method584(); local8 != null; local8 = (Class14_Sub2_Sub20) Static111.aClass32_7.method577()) {
			if (Static668.method9270(local8.anInt10001)) {
				Static389.method5926(local8);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method9433(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = Static258.anInt4846;
		@Pc(14) int[] local14 = Static43.anIntArray35;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			@Pc(25) Class4_Sub3_Sub3_Sub3_Sub2 local25 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local14[local18]];
			if (local25 != null && local25 != Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 && local25.aString37 != null && local25.aString37.equalsIgnoreCase(arg0)) {
				@Pc(46) Class251 local46 = null;
				if (arg1 == 1) {
					local46 = Static214.aClass251_100;
				} else if (arg1 == 4) {
					local46 = Static213.aClass251_147;
				} else if (arg1 == 5) {
					local46 = Static391.aClass251_162;
				} else if (arg1 == 6) {
					local46 = Static629.aClass251_250;
				} else if (arg1 == 7) {
					local46 = Static558.aClass251_228;
				} else if (arg1 == 9) {
					local46 = Static29.aClass251_15;
				}
				local16 = true;
				if (local46 != null) {
					@Pc(105) Class14_Sub54 local105 = Static72.method1195(Static277.aClass347_2.aClass197_2, local46);
					local105.aClass14_Sub21_Sub2_2.method7751(local14[local18]);
					local105.aClass14_Sub21_Sub2_2.method7737(0);
					Static277.aClass347_2.method8308(local105);
				}
				break;
			}
		}
		if (!local16) {
			Static354.method5381(Static21.aClass21_20.method324(Static26.anInt352) + arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public static void method9437(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class14_Sub2_Sub9 local14 = Static499.method7527((long) arg0, 12);
		local14.method4004();
		local14.anInt4595 = arg1;
	}
}
