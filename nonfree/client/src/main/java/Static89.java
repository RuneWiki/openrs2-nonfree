import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!db", name = "H", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_22 = new Class99(16);

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	public static int anInt2628 = 0;

	@OriginalMember(owner = "client!db", name = "S", descriptor = "[I")
	public static final int[] anIntArray126 = new int[8];

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)I")
	public static int method2478() {
		if (Static232.aFrame1 == null) {
			return Static172.aBoolean306 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([I[II)V")
	public static void method2479(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static222.aByteArrayArrayArray4 = null;
			Static52.anIntArray77 = null;
			Static621.anIntArray704 = null;
			return;
		}
		Static621.anIntArray704 = arg0;
		Static52.anIntArray77 = new int[arg0.length];
		Static222.aByteArrayArrayArray4 = new byte[arg0.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static621.anIntArray704.length; local28++) {
			Static222.aByteArrayArrayArray4[local28] = new byte[arg1[local28]][];
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
	public static void method2480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static26.anInt546 = arg3;
		Static369.anInt7338 = arg2;
		Static129.anInt3274 = arg1;
		Static407.anInt7708 = arg4;
		Static596.anInt10491 = arg0;
		if (Static26.anInt546 >= 100) {
			@Pc(30) int local30 = Static129.anInt3274 * 512 + 256;
			@Pc(36) int local36 = Static596.anInt10491 * 512 + 256;
			@Pc(45) int local45 = Static590.method8716(local30, Static12.anInt172, local36) - Static369.anInt7338;
			@Pc(49) int local49 = local30 - Static135.anInt3347;
			@Pc(54) int local54 = local45 - Static639.anInt11034;
			@Pc(58) int local58 = local36 - Static621.anInt10870;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local49 * local49 + local58 * local58));
			Static266.anInt5673 = (int) (Math.atan2((double) local54, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static189.anInt11070 = (int) (-2607.5945876176133D * Math.atan2((double) local49, (double) local58)) & 0x3FFF;
			if (Static266.anInt5673 < 1024) {
				Static266.anInt5673 = 1024;
			}
			Static113.anInt3037 = 0;
			if (Static266.anInt5673 > 3072) {
				Static266.anInt5673 = 3072;
			}
		}
		Static496.anInt9165 = 2;
		Static442.anInt8212 = -1;
		Static194.anInt4508 = -1;
	}
}
