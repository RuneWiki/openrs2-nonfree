import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
	public static int anInt2721;

	@OriginalMember(owner = "client!dea", name = "o", descriptor = "Z")
	public static boolean aBoolean215 = true;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IJ)V")
	public static void method2322(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static150.anInt3512;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (local7 != Static369.anInt7056) {
			local19 = local7 - Static369.anInt7056;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local19 > local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static369.anInt7056 += local27;
		}
		@Pc(63) int local63 = Static260.anInt5570;
		Static532.aFloat179 += (float) arg0 * Static529.aFloat136 / 40.0F * 8.0F;
		if (local63 != Static387.anInt7286) {
			local19 = local63 - Static387.anInt7286;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local27 < local19) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local27 > local19) {
				local27 = local19;
			}
			Static387.anInt7286 += local27;
		}
		Static595.aFloat184 += Static338.aFloat133 * (float) arg0 / 40.0F * 8.0F;
		Static229.method4152();
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IC)I")
	public static int method2323(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class6_Sub13_Sub3.anIntArray450.length > arg0 ? Class6_Sub13_Sub3.anIntArray450[arg0] : -1;
	}
}
