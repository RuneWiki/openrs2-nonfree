import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!da", name = "n", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "F")
	public static float aFloat113;

	@OriginalMember(owner = "client!da", name = "h", descriptor = "I")
	public static int anInt7361 = 0;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "[I")
	public static final int[] anIntArray461 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!da", name = "x", descriptor = "I")
	public static int anInt7373 = -1;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method6335() {
		for (@Pc(10) Class6_Sub4_Sub10 local10 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8910(); local10 != null; local10 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8908()) {
			if (local10.anInt5448 > 1) {
				local10.anInt5448 = 0;
				Static653.aClass10_63.method366(local10, ((Class6_Sub4_Sub12) local10.aClass384_11.aClass6_Sub4_62.aClass6_Sub4_67).aLong225);
				local10.aClass384_11.method8913();
			}
		}
		Static183.anInt3155 = 0;
		Static305.anInt5201 = 0;
		Static31.aClass362_3.method8543();
		Static472.aClass209_45.method5041();
		Static258.aClass384_7.method8913();
		Static671.method9094(Static17.aClass6_Sub4_Sub12_1);
	}
}
