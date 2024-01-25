import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_35 = new Class286(52, 4);

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZIIII)V")
	public static void method1483(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class2_Sub23 local20 = (Class2_Sub23) Static562.aClass162_42.method3519(local14);
		if (local20 == null) {
			local20 = new Class2_Sub23();
			Static562.aClass162_42.method3522(local20, local14);
		}
		if (arg2 >= local20.anIntArray234.length) {
			@Pc(51) int[] local51 = new int[arg2 + 1];
			@Pc(56) int[] local56 = new int[arg2 + 1];
			for (@Pc(58) int local58 = 0; local58 < local20.anIntArray234.length; local58++) {
				local51[local58] = local20.anIntArray234[local58];
				local56[local58] = local20.anIntArray233[local58];
			}
			for (@Pc(88) int local88 = local20.anIntArray234.length; local88 < arg2; local88++) {
				local51[local88] = -1;
				local56[local88] = 0;
			}
			local20.anIntArray234 = local51;
			local20.anIntArray233 = local56;
		}
		local20.anIntArray234[arg2] = arg1;
		local20.anIntArray233[arg2] = arg3;
	}
}
