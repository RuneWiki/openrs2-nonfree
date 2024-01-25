import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!fl", name = "qb", descriptor = "I")
	public static int anInt1903;

	@OriginalMember(owner = "client!fl", name = "rb", descriptor = "Lclient!di;")
	public static Class38 aClass38_3;

	@OriginalMember(owner = "client!fl", name = "sb", descriptor = "Lclient!qj;")
	public static Class165 aClass165_33;

	@OriginalMember(owner = "client!fl", name = "tb", descriptor = "Lclient!sh;")
	public static Class186 aClass186_1;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_53 = new Class140(30);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIIIIIIIII)V")
	public static void method1778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class1_Sub21 local7 = null;
		for (@Pc(12) Class1_Sub21 local12 = (Class1_Sub21) Static51.aClass195_44.method5029(); local12 != null; local12 = (Class1_Sub21) Static51.aClass195_44.method5021()) {
			if (local12.anInt3651 == arg5 && arg4 == local12.anInt3654 && arg2 == local12.anInt3653 && local12.anInt3639 == arg3) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub21();
			local7.anInt3651 = arg5;
			local7.anInt3654 = arg4;
			local7.anInt3653 = arg2;
			local7.anInt3639 = arg3;
			Static294.method5053(local7);
			Static51.aClass195_44.method5018(local7);
		}
		local7.anInt3645 = arg6;
		local7.anInt3638 = arg7;
		local7.anInt3640 = arg8;
		local7.anInt3655 = arg1;
		local7.anInt3648 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	public static void method1783() {
		for (@Pc(6) Class1_Sub36 local6 = (Class1_Sub36) Static233.aClass195_41.method5029(); local6 != null; local6 = (Class1_Sub36) Static233.aClass195_41.method5021()) {
			if (local6.aBoolean494) {
				local6.method4956();
			}
		}
		for (@Pc(39) Class1_Sub36 local39 = (Class1_Sub36) Static193.aClass195_38.method5029(); local39 != null; local39 = (Class1_Sub36) Static193.aClass195_38.method5021()) {
			if (local39.aBoolean494) {
				local39.method4956();
			}
		}
	}
}
