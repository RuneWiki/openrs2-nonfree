import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!vh;")
	public static Class250 aClass250_18;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
	public static final int[] anIntArray146 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIILclient!tf;B)V")
	public static void method1422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26_Sub2_Sub2_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray590[0];
		@Pc(15) int local15 = arg2.anIntArray589[0];
		if (local10 < 0 || Static135.anInt2314 <= local10 || local15 < 0 || local15 >= Static352.anInt6022 || (arg0 < 0 || arg0 >= Static135.anInt2314 || arg1 < 0 || Static352.anInt6022 <= arg1)) {
			return;
		}
		@Pc(69) int local69 = Static119.method5888(local15, arg1, arg2.method5535(), 0, -4, true, Static353.anIntArray481, Static170.aClass112Array1[arg2.aByte95], local10, 0, arg0, 0, 0, Static425.anIntArray630);
		if (local69 >= 1 && local69 <= 3) {
			for (@Pc(79) int local79 = 0; local79 < local69 - 1; local79++) {
				arg2.method5260((byte) 2, Static353.anIntArray481[local79], Static425.anIntArray630[local79]);
			}
		}
	}
}
