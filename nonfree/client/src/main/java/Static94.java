import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "Lclient!ul;")
	public static Class246 aClass246_56;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString17 = "";

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_21 = new Class179(73, 11);

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	public static final int anInt1952 = 1338;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ya;Lclient!or;III)V")
	public static void method1691(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class80 local12;
		if (arg3 < Static132.anInt2639) {
			local12 = client.lb[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass31_Sub1_2 != null && local12.aClass31_Sub1_2.method5971()) {
				arg1.method5972(0, arg0, Static186.anInt3374, local12.aClass31_Sub1_2, 0, true);
			}
		}
		if (arg4 < Static132.anInt2639) {
			local12 = client.lb[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass31_Sub1_2 != null && local12.aClass31_Sub1_2.method5971()) {
				arg1.method5972(Static186.anInt3374, arg0, 0, local12.aClass31_Sub1_2, 0, true);
			}
		}
		if (arg3 < Static132.anInt2639 && arg4 < Static87.anInt1875) {
			local12 = client.lb[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass31_Sub1_2 != null && local12.aClass31_Sub1_2.method5971()) {
				arg1.method5972(Static186.anInt3374, arg0, Static186.anInt3374, local12.aClass31_Sub1_2, 0, true);
			}
		}
		if (arg3 < Static132.anInt2639 && arg4 > 0) {
			local12 = client.lb[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass31_Sub1_2 != null && local12.aClass31_Sub1_2.method5971()) {
				arg1.method5972(-Static186.anInt3374, arg0, Static186.anInt3374, local12.aClass31_Sub1_2, 0, true);
			}
		}
	}
}
