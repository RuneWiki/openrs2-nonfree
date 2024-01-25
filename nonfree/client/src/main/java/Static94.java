import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	public static int anInt2266;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!jo;")
	public static Class168 aClass168_25;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!jo;")
	public static Class168 aClass168_26;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)V")
	public static void method2048(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(5, arg0);
		local8.method3828();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)Z")
	public static boolean method2049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static110.method2276(arg0, arg1) || Static44.method1138(arg0, arg1);
	}
}
