import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
	public static int anInt2553 = 0;

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(B)Z")
	public static boolean method2158() {
		try {
			@Pc(7) Class267 local7 = new Class267();
			@Pc(12) byte[] local12 = local7.method6805(Static583.aByteArray102);
			Static256.method3018(local12);
			return true;
		} catch (@Pc(27) Exception local27) {
			return false;
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V")
	public static void method2160() {
		if (Static637.aClass80_3 != null) {
			Static637.aClass80_3.method3198();
		}
		if (Static28.aClass80_1 != null) {
			Static28.aClass80_1.method3198();
		}
	}
}
