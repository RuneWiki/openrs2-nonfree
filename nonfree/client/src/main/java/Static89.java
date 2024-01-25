import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "Lclient!mr;")
	public static Class224 aClass224_1;

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "Lclient!gda;")
	public static Class121 aClass121_1;

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
	public static int anInt2295 = 0;

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
	public static int anInt2296 = 1;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II[B)I")
	public static int method1821(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static168.method2765(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)Lclient!qe;")
	public static Class21_Sub9 method1822() {
		@Pc(14) Class21_Sub9 local14 = (Class21_Sub9) Static88.aClass158_7.method3719();
		if (local14 == null) {
			return new Class21_Sub9();
		} else {
			Static94.anInt2373--;
			return local14;
		}
	}
}
