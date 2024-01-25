import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "Lclient!av;")
	public static Class26 aClass26_10;

	@OriginalMember(owner = "client!dca", name = "d", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_10 = new Class238();

	@OriginalMember(owner = "client!dca", name = "e", descriptor = "Lclient!sn;")
	public static final Class308 aClass308_2 = new Class308();

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BZII)I")
	public static int method1543(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class2_Sub22 local15 = Static284.method8371(arg0, arg2);
		if (local15 == null) {
			return 0;
		} else if (arg1 >= 0 && local15.anIntArray220.length > arg1) {
			return local15.anIntArray220[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)V")
	public static void method1544(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub5_Sub10 local10 = Static594.method8175(arg0, 17);
		local10.method4387();
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIZIZBI)V")
	public static void method1546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= arg3) {
			return;
		}
		@Pc(13) int local13 = (arg5 + arg3) / 2;
		@Pc(15) int local15 = arg5;
		@Pc(19) Class202_Sub1 local19 = Static339.aClass202_Sub1Array1[local13];
		Static339.aClass202_Sub1Array1[local13] = Static339.aClass202_Sub1Array1[arg3];
		Static339.aClass202_Sub1Array1[arg3] = local19;
		for (@Pc(31) int local31 = arg5; local31 < arg3; local31++) {
			if (Static367.method5562(arg4, arg0, arg1, Static339.aClass202_Sub1Array1[local31], local19, arg2) <= 0) {
				@Pc(47) Class202_Sub1 local47 = Static339.aClass202_Sub1Array1[local31];
				Static339.aClass202_Sub1Array1[local31] = Static339.aClass202_Sub1Array1[local15];
				Static339.aClass202_Sub1Array1[local15++] = local47;
			}
		}
		Static339.aClass202_Sub1Array1[arg3] = Static339.aClass202_Sub1Array1[local15];
		Static339.aClass202_Sub1Array1[local15] = local19;
		method1546(arg0, arg1, arg2, local15 - 1, arg4, arg5);
		method1546(arg0, arg1, arg2, arg3, arg4, local15 + 1);
	}
}
