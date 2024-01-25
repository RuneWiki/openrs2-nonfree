import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt1205 = 0;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "[I")
	public static final int[] anIntArray129 = new int[4096];

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public static int anInt1208 = 999999;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt1209 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(JB)V")
	public static void method1061(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static75.anInt1065;
		@Pc(9) int local9 = Static4.anInt58;
		@Pc(17) int local17;
		@Pc(25) int local25;
		if (Static23.anInt350 != local7) {
			local17 = local7 - Static23.anInt350;
			local25 = (int) ((long) local17 * arg0 / 320L);
			if (local17 <= 0) {
				if (local25 == 0) {
					local25 = -1;
				} else if (local25 < local17) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = 1;
			} else if (local25 > local17) {
				local25 = local17;
			}
			Static23.anInt350 += local25;
		}
		if (!Static126.aClass19_Sub1_1.aBoolean382) {
			Static336.aFloat72 += (float) arg0 * Static286.aFloat68 / 40.0F * 8.0F;
			Static99.aFloat9 += Static392.aFloat81 * (float) arg0 / 40.0F * 8.0F;
		}
		if (Static446.anInt7039 != local9) {
			local17 = local9 - Static446.anInt7039;
			local25 = (int) (arg0 * (long) local17 / 320L);
			if (local17 <= 0) {
				if (local25 == 0) {
					local25 = -1;
				} else if (local17 > local25) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = 1;
			} else if (local17 < local25) {
				local25 = local17;
			}
			Static446.anInt7039 += local25;
		}
		Static454.method5849();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method1062() {
		if (Static229.anInt4148 <= 0) {
			Static2.aString1 = "";
			return;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static253.aStringArray34.length; local18++) {
			if (Static253.aStringArray34[local18].startsWith("--> ")) {
				local16++;
				if (Static229.anInt4148 == local16) {
					Static2.aString1 = Static253.aStringArray34[local18].substring(4);
					break;
				}
			}
		}
	}
}
