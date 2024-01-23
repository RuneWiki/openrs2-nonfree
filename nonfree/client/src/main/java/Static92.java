import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!gm", name = "bb", descriptor = "I")
	public static int anInt2083;

	@OriginalMember(owner = "client!gm", name = "cb", descriptor = "Lclient!jn;")
	public static Class82 aClass82_6;

	@OriginalMember(owner = "client!gm", name = "eb", descriptor = "Lclient!td;")
	public static Class156 aClass156_4;

	@OriginalMember(owner = "client!gm", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26 = new String[500];

	@OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
	public static int anInt2070 = -1;

	@OriginalMember(owner = "client!gm", name = "db", descriptor = "[I")
	public static int[] anIntArray185 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(BI)V")
	public static void method1621(@OriginalArg(1) int arg0) {
		Static279.aFloatArray29[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static279.aFloatArray29[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static279.aFloatArray29[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static219.method3466(3);
		Static219.method3466(4);
	}

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "(III)V")
	public static void method1623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(23) int local23;
		if (Static227.anInt4511 != arg0) {
			Static209.anIntArray377 = new int[arg0];
			for (local23 = 0; local23 < arg0; local23++) {
				Static209.anIntArray377[local23] = (local23 << 12) / arg0;
			}
			Static268.anInt5247 = arg0 * 32;
			Static227.anInt4511 = arg0;
			Static229.anInt4527 = arg0 - 1;
		}
		if (arg1 == Static26.anInt632) {
			return;
		}
		if (arg1 == Static227.anInt4511) {
			Static132.anIntArray265 = Static209.anIntArray377;
		} else {
			Static132.anIntArray265 = new int[arg1];
			for (local23 = 0; local23 < arg1; local23++) {
				Static132.anIntArray265[local23] = (local23 << 12) / arg1;
			}
		}
		Static26.anInt632 = arg1;
		Static202.anInt4099 = arg1 - 1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!km;Lclient!km;)V")
	public static void method1624(@OriginalArg(1) Class91 arg0, @OriginalArg(2) Class91 arg1) {
		Static36.aClass91_38 = arg1;
		Static166.aClass91_135 = arg0;
	}
}
