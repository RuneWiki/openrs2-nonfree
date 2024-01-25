import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_29 = new Class208(37, 7);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIB)I")
	public static int method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static142.anInt2752 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg0 - Static287.anInt3859;
		@Pc(24) int local24 = arg1 - Static287.anInt3862;
		for (@Pc(34) Class1_Sub51 local34 = (Class1_Sub51) Static287.aClass111_18.method2547(); local34 != null; local34 = (Class1_Sub51) Static287.aClass111_18.method2554()) {
			if (local34.anInt9675 == arg2) {
				@Pc(43) int local43 = local34.anInt9680;
				@Pc(46) int local46 = local34.anInt9679;
				@Pc(56) int local56 = Static287.anInt3862 + local46 | Static287.anInt3859 + local43 << 14;
				@Pc(75) int local75 = (local24 - local46) * (local24 - local46) + (local19 - local43) * (-local43 + local19);
				if (local12 < 0 || local75 < local14) {
					local14 = local75;
					local12 = local56;
				}
			}
		}
		return local12;
	}
}
