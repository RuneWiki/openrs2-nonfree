import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!du", name = "m", descriptor = "I")
	public static int anInt1536 = 0;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "I")
	public static int anInt1538 = 0;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(Z)V")
	public static void method1256() {
		for (@Pc(12) int local12 = 0; local12 < Static344.anInt5625; local12++) {
			@Pc(18) Class75 local18 = Static113.aClass75Array1[local12];
			if (local18.aByte16 == 2) {
				if (local18.aClass5_Sub22_Sub2_1 == null) {
					local18.anInt1970 = Integer.MIN_VALUE;
				} else {
					Static119.aClass5_Sub22_Sub3_3.method3636(local18.aClass5_Sub22_Sub2_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "()V")
	public static void method1257() {
		Static74.method1088(Static96.anInt1667);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIII)V")
	public static void method1258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static281.aClass5_Sub15_Sub2_13.anInt7013 = 0;
		Static281.aClass5_Sub15_Sub2_13.method5583(Static316.aClass210_7.anInt5855);
		Static281.aClass5_Sub15_Sub2_13.method5583(arg1);
		Static281.aClass5_Sub15_Sub2_13.method5583(arg0);
		Static281.aClass5_Sub15_Sub2_13.method5566(arg2);
		Static281.aClass5_Sub15_Sub2_13.method5566(arg3);
		Static188.anInt3155 = 1;
		Static456.anInt7451 = -3;
		Static371.anInt6077 = 0;
		Static274.anInt4304 = 0;
	}
}
