import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Lclient!oj;")
	public static Class149 aClass149_1;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
	public static int anInt175;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "[Lclient!s;")
	public static Class105[] aClass105Array1;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public static int anInt173 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public static void method149() {
		@Pc(12) int local12 = anInt173;
		@Pc(14) int[] local14 = Static195.anIntArray322;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class1_Sub2_Sub3_Sub1 local24 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local14[local16]];
			if (local24 != null && local24.anInt6936 > 0) {
				local24.anInt6936--;
				if (local24.anInt6936 == 0) {
					local24.aString73 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static186.anInt4092; local54++) {
			@Pc(60) int local60 = Static171.anIntArray292[local54];
			@Pc(64) Class1_Sub2_Sub3_Sub2 local64 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local60];
			if (local64 != null && local64.anInt6936 > 0) {
				local64.anInt6936--;
				if (local64.anInt6936 == 0) {
					local64.aString73 = null;
				}
			}
		}
	}
}
