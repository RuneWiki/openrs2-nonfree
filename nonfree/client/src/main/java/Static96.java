import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "[I")
	public static final int[] anIntArray83 = new int[1];

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[2];

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V")
	public static void method1406() {
		@Pc(8) Class5_Sub6 local8 = (Class5_Sub6) Static536.aClass102_65.method1916();
		@Pc(22) boolean local22 = Static370.aClass73_22 != null || Static288.anInt5464 > 0;
		@Pc(26) int local26 = local8.method5803();
		@Pc(30) int local30 = local8.method5804();
		if (local22) {
			Static216.anInt3515 = 1;
		}
		if (local22) {
			Static117.aClass5_Sub5_Sub19_1 = Static133.aClass5_Sub5_Sub19_2;
		} else {
			Static369.method5421(Static133.aClass5_Sub5_Sub19_2, local30, local26);
		}
	}
}
