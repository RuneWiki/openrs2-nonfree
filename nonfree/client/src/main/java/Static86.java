import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!e", name = "O", descriptor = "I")
	public static int anInt1836;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_61 = new Class175("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIILclient!hi;Z)V")
	public static void method1483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class96 arg4, @OriginalArg(6) boolean arg5) {
		if (Static205.anInt4113 >= 50 || (arg4 == null || arg4.anIntArrayArray29 == null || arg1 >= arg4.anIntArrayArray29.length || arg4.anIntArrayArray29[arg1] == null)) {
			return;
		}
		@Pc(32) int local32 = arg4.anIntArrayArray29[arg1][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(59) int local59;
		if (arg4.anIntArrayArray29[arg1].length > 1) {
			local59 = (int) (Math.random() * (double) arg4.anIntArrayArray29[arg1].length);
			if (local59 > 0) {
				local36 = arg4.anIntArrayArray29[arg1][local59];
			}
		}
		@Pc(72) int local72 = local32 & 0x1F;
		if (local72 == 0) {
			if (arg5) {
				Static222.method3517(local36, 255, local42, 0);
			}
		} else if (Static123.aClass21_Sub1_1.anInt863 != 0) {
			local59 = arg0 - 64 >> 7;
			@Pc(109) int local109 = arg3 - 64 >> 7;
			Static192.aClass83Array1[Static205.anInt4113++] = new Class83((byte) 1, local36, local42, 0, 255, local72 + (local59 << 16) + (arg2 << 24) + (local109 << 8));
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(II)Z")
	public static boolean method1485(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
