import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "[S")
	public static short[] aShortArray27 = new short[256];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method1689() {
		@Pc(7) int local7 = Static155.anInt2952;
		@Pc(9) int[] local9 = Static381.anIntArray619;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class31_Sub2_Sub1_Sub1 local19 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt7313 > 0) {
				local19.anInt7313--;
				if (local19.anInt7313 == 0) {
					local19.aString72 = null;
				}
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static5.anInt163; local57++) {
			@Pc(63) int local63 = Static331.anIntArray648[local57];
			@Pc(67) Class31_Sub2_Sub1_Sub2 local67 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local63];
			if (local67 != null && local67.anInt7313 > 0) {
				local67.anInt7313--;
				if (local67.anInt7313 == 0) {
					local67.aString72 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!ya;)V")
	public static void method1690(@OriginalArg(1) Class39 arg0) {
		if (Static446.anInt7163 != Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100 && (client.lb != null && Static280.method4062(arg0, Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100))) {
			Static446.anInt7163 = Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100;
		}
	}
}
