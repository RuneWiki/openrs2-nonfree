import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "Lclient!cv;")
	public static Class8 aClass8_3;

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "Lclient!lw;")
	public static Class199 aClass199_3;

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "[I")
	public static final int[] anIntArray239 = new int[32];

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IBI)Z")
	public static boolean method3872(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZ)I")
	public static int method3873(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
	public static void method3874() {
		if (Static260.aClass45_8 != null) {
			Static260.aClass45_8.method7387();
			Static90.aClass54_6 = null;
			Static260.aClass45_8 = null;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIII)V")
	public static void method3876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(15) int local15 = arg3 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static93.method1747(arg4, arg0, arg2, arg3);
			}
		} else if (local15 == 0) {
			Static526.method7025(arg2, arg4, arg0, arg1);
		} else {
			@Pc(49) int local49 = (local15 << 12) / local10;
			@Pc(58) int local58 = arg4 - (local49 * arg2 >> 12);
			@Pc(70) int local70;
			@Pc(79) int local79;
			if (Static469.anInt4270 > arg1) {
				local70 = Static469.anInt4270;
				local79 = local58 + (Static469.anInt4270 * local49 >> 12);
			} else if (Static325.anInt5516 < arg1) {
				local70 = Static325.anInt5516;
				local79 = local58 + (Static325.anInt5516 * local49 >> 12);
			} else {
				local70 = arg1;
				local79 = arg3;
			}
			@Pc(109) int local109;
			@Pc(111) int local111;
			if (Static469.anInt4270 > arg2) {
				local111 = local58 + (local49 * Static469.anInt4270 >> 12);
				local109 = Static469.anInt4270;
			} else if (Static325.anInt5516 >= arg2) {
				local109 = arg2;
				local111 = arg4;
			} else {
				local111 = local58 + (Static325.anInt5516 * local49 >> 12);
				local109 = Static325.anInt5516;
			}
			if (local111 < Static395.anInt6904) {
				local109 = (Static395.anInt6904 - local58 << 12) / local49;
				local111 = Static395.anInt6904;
			} else if (Static561.anInt2703 < local111) {
				local109 = (Static561.anInt2703 - local58 << 12) / local49;
				local111 = Static561.anInt2703;
			}
			if (Static395.anInt6904 > local79) {
				local70 = (Static395.anInt6904 - local58 << 12) / local49;
				local79 = Static395.anInt6904;
			} else if (local79 > Static561.anInt2703) {
				local79 = Static561.anInt2703;
				local70 = (Static561.anInt2703 - local58 << 12) / local49;
			}
			Static463.method6425(arg0, local79, local111, local109, local70);
		}
	}
}
