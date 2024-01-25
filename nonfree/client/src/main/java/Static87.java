import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	public static int anInt6205;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "Lclient!bt;")
	public static final Class48 aClass48_13 = new Class48(9, -1);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII)V")
	public static void method5157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static556.anInt9087 = arg0;
		Static392.anInt6960 = arg2;
		Static260.anInt4823 = arg1;
		Static201.anInt3831 = arg4;
		Static672.anInt10801 = arg3;
		if (Static672.anInt10801 >= 100) {
			@Pc(30) int local30 = Static392.anInt6960 * 512 + 256;
			@Pc(36) int local36 = Static260.anInt4823 * 512 + 256;
			@Pc(45) int local45 = Static441.method6444(Static481.anInt8082, local30, local36) - Static201.anInt3831;
			@Pc(50) int local50 = local30 - Static332.anInt6132;
			@Pc(55) int local55 = local45 - Static200.anInt3808;
			@Pc(60) int local60 = local36 - Static407.anInt7215;
			@Pc(72) int local72 = (int) Math.sqrt((double) (local50 * local50 + local60 * local60));
			Static79.anInt1141 = (int) (Math.atan2((double) local55, (double) local72) * 2607.5945876176133D) & 0x3FFF;
			Static207.anInt3885 = (int) (Math.atan2((double) local50, (double) local60) * -2607.5945876176133D) & 0x3FFF;
			if (Static79.anInt1141 < 1024) {
				Static79.anInt1141 = 1024;
			}
			Static388.anInt6926 = 0;
			if (Static79.anInt1141 > 3072) {
				Static79.anInt1141 = 3072;
			}
		}
		Static660.anInt10605 = 2;
		Static493.anInt8261 = -1;
		Static513.anInt8562 = -1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)I")
	public static int method5158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}
}
