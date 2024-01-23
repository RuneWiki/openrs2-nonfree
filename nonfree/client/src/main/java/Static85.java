import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
	public static int anInt1998;

	@OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
	public static int anInt1997 = 0;

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString68 = "Loaded update list";

	@OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
	public static int anInt2005 = 0;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(BII)I")
	public static int method1539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)V")
	public static void method1540() {
		if (Static115.aBoolean398) {
			return;
		}
		Static115.aBoolean398 = true;
		if (Static41.aBoolean65) {
			Static148.aFloat33 = (int) Static148.aFloat33 - 17 & 0xFFFFFFF0;
		} else {
			Static231.aFloat46 += (-Static231.aFloat46 - 12.0F) / 2.0F;
		}
		Static63.aBoolean100 = true;
	}
}
