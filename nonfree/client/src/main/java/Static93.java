import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_31 = new Class126(65, 3);

	@OriginalMember(owner = "client!db", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public static void method1878(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		Static408.anInt6951 = arg0;
		Static658.anInt10079 = arg1;
		Static255.anInt4818 = 0;
		Static303.anInt9951 = 0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IFFLclient!mfa;IIFIFFI)[B")
	public static byte[] method1880(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class157 arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static225.method3515(arg2, arg4, arg3, arg1, arg0, arg5, local10, 0);
		return local10;
	}
}
