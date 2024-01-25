import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static93 {

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!uu;")
	public static Class343 aClass343_52;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V")
	public static void method1568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static32.aClass3_Sub41_3.aClass7_Sub15_2.method5663() != 0 && arg3 != 0 && Static154.anInt3152 < 50 && arg0 != -1) {
			Static110.aClass130Array1[Static154.anInt3152++] = new Class130((byte) 1, arg0, arg3, arg4, arg2, 0, arg1, (Class9_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BZ)V")
	public static void method1572(@OriginalArg(1) boolean arg0) {
		if (Static369.aClass302_1 == null) {
			Static222.method3856();
		}
		if (arg0) {
			Static369.aClass302_1.method7397();
		}
	}
}
