import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dr", name = "C", descriptor = "Lclient!ps;")
	public static final Class2_Sub29 aClass2_Sub29_1 = new Class2_Sub29(new byte[5000]);

	@OriginalMember(owner = "client!dr", name = "G", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_41 = new Class239(10, -1);

	@OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
	public static int anInt1853 = -1;

	@OriginalMember(owner = "client!dr", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V")
	public static void method1751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class2_Sub13_Sub15 local13 = Static370.method5893(arg3, 10);
		local13.method6968();
		local13.anInt8320 = arg1;
		local13.anInt8314 = arg0;
		local13.anInt8318 = arg2;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(IBI)V")
	public static void method1753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static185.aClass212_1 == Static533.aClass212_4) {
			if (Static318.method5088(false, -2, 1, 1, 0, arg1, arg0, 0)) {
				return;
			}
			Static318.method5088(false, -3, 1, 1, 0, arg1, arg0, 0);
		} else if (Static318.method5088(false, -3, 1, 1, 0, arg1, arg0, 0)) {
			return;
		} else {
			Static318.method5088(false, -2, 1, 1, 0, arg1, arg0, 0);
		}
	}
}
