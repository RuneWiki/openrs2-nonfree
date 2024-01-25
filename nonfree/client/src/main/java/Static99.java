import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!fn", name = "I", descriptor = "Lclient!go;")
	public static Class82 aClass82_3;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "F")
	public static float aFloat33 = 1024.0F;

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
	public static int anInt2030 = 0;

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
	public static final int anInt2034 = 2;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V")
	public static void method1984() {
		if (Static269.anInt6656 == 5) {
			Static269.anInt6656 = 6;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	public static void method1985(@OriginalArg(1) int arg0) {
		Static301.anInt5990 = arg0;
		Static291.aClass107_34.method3015();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ID)V")
	public static void method1986(@OriginalArg(1) double arg0) {
		if (arg0 == Static181.aDouble1) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(29) int local29 = (int) (Math.pow((double) local17 / 255.0D, arg0) * 255.0D);
			Static335.anIntArray499[local17] = local29 > 255 ? 255 : local29;
		}
		Static181.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB[BI)I")
	public static int method1988(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(15) int local15 = arg0; local15 < arg2; local15++) {
			local7 = local7 >>> 8 ^ Class124_Sub1.anIntArray304[(arg1[local15] ^ local7) & 0xFF];
		}
		return ~local7;
	}
}
