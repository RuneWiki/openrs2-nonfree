import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	public static int anInt8344;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIII)Lclient!cd;")
	public static Class1_Sub1_Sub2 method6987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class262 local11 = Static399.aClass262ArrayArrayArray2[arg2][arg0][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(22) Class1_Sub1_Sub2 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class187 local27 = local11.aClass187_3; local27 != null; local27 = local27.aClass187_1) {
			@Pc(31) Class1_Sub1 local31 = local27.aClass1_Sub1_1;
			if (local31 instanceof Class1_Sub1_Sub2) {
				@Pc(37) Class1_Sub1_Sub2 local37 = (Class1_Sub1_Sub2) local31;
				@Pc(47) int local47 = local37.method4394() * 64 + 60 - 64;
				@Pc(54) int local54 = local37.anInt7660 - local47 >> 7;
				@Pc(62) int local62 = local37.anInt7659 - local47 >> 7;
				@Pc(70) int local70 = local37.anInt7660 + local47 >> 7;
				@Pc(77) int local77 = local47 + local37.anInt7659 >> 7;
				if (local54 <= arg0 && arg1 >= local62 && arg0 <= local70 && local77 >= arg1) {
					@Pc(110) int local110 = (local77 + 1 - arg1) * (local70 + 1 - arg0);
					if (local24 < local110) {
						local24 = local110;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}
}
