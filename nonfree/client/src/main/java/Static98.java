import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "Lclient!ae;")
	public static Class8 aClass8_123;

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "Lclient!pb;")
	public static final Class265 aClass265_16 = new Class265(2);

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IBIZII)V")
	public static void method7269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class6_Sub6 local20 = (Class6_Sub6) Static296.aClass209_21.method5038(local14);
		if (local20 == null) {
			local20 = new Class6_Sub6();
			Static296.aClass209_21.method5035(local14, local20);
		}
		if (arg3 >= local20.anIntArray55.length) {
			@Pc(41) int[] local41 = new int[arg3 + 1];
			@Pc(46) int[] local46 = new int[arg3 + 1];
			for (@Pc(48) int local48 = 0; local48 < local20.anIntArray55.length; local48++) {
				local41[local48] = local20.anIntArray55[local48];
				local46[local48] = local20.anIntArray54[local48];
			}
			for (@Pc(78) int local78 = local20.anIntArray55.length; local78 < arg3; local78++) {
				local41[local78] = -1;
				local46[local78] = 0;
			}
			local20.anIntArray55 = local41;
			local20.anIntArray54 = local46;
		}
		local20.anIntArray55[arg3] = arg1;
		local20.anIntArray54[arg3] = arg0;
	}
}
