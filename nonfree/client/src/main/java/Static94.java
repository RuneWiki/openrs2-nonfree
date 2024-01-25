import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	public static void method1699() {
		@Pc(12) int local12 = Static231.anInt4727;
		@Pc(14) int[] local14 = Static249.anIntArray372;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class4_Sub1_Sub1_Sub2 local24 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local14[local16]];
			if (local24 != null && local24.anInt7119 > 0) {
				local24.anInt7119--;
				if (local24.anInt7119 == 0) {
					local24.aString62 = null;
				}
			}
		}
		for (@Pc(50) int local50 = 0; local50 < Static464.anInt7995; local50++) {
			@Pc(57) long local57 = (long) Static291.anIntArray405[local50];
			@Pc(63) Class6_Sub34 local63 = (Class6_Sub34) Static593.aClass128_43.method3263(local57);
			if (local63 != null) {
				@Pc(68) Class4_Sub1_Sub1_Sub1 local68 = local63.aClass4_Sub1_Sub1_Sub1_2;
				if (local68.anInt7119 > 0) {
					local68.anInt7119--;
					if (local68.anInt7119 == 0) {
						local68.aString62 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)I")
	public static int method1700(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static414.method5968(arg0);
	}
}
