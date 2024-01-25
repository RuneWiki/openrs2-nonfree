import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Lclient!ofa;")
	public static final Class255 aClass255_21 = new Class255(3);

	@OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
	public static final int[] anIntArray452 = new int[4];

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIBI)V")
	public static void method6922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg1 + 1;
		Static343.method5202(arg2, Static286.anIntArrayArray42[arg1], arg3, arg4);
		@Pc(28) int local28 = arg0 - 1;
		Static343.method5202(arg2, Static286.anIntArrayArray42[arg0], arg3, arg4);
		for (@Pc(35) int local35 = local15; local35 <= local28; local35++) {
			@Pc(41) int[] local41 = Static286.anIntArrayArray42[local35];
			local41[arg2] = local41[arg4] = arg3;
		}
	}
}
