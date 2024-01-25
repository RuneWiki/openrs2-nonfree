import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
	public static int anInt1986;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_71 = new Class18(64, -1);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method1872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static272.method4850(arg3)) {
			Static44.method1080(Static341.aClass112ArrayArray1[arg3], -1, arg4, arg6, arg7, arg8, arg5, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
	public static void method1874() {
		if (!Static77.aBoolean119) {
			return;
		}
		@Pc(16) Class112 local16 = Static147.method2868(Static166.anInt3467, Static9.anInt239);
		if (local16 != null && local16.anObjectArray18 != null) {
			@Pc(25) Class1_Sub35 local25 = new Class1_Sub35();
			local25.aClass112_16 = local16;
			local25.anObjectArray34 = local16.anObjectArray18;
			Static302.method5243(local25);
		}
		Static45.anInt1171 = -1;
		Static77.aBoolean119 = false;
		Static325.anInt5187 = -1;
		if (local16 != null) {
			Static133.method2725(local16);
		}
	}
}
