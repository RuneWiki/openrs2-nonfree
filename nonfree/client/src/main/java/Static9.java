import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ba", name = "db", descriptor = "Z")
	public static boolean aBoolean19;

	@OriginalMember(owner = "client!ba", name = "nb", descriptor = "[I")
	public static int[] anIntArray97;

	@OriginalMember(owner = "client!ba", name = "vb", descriptor = "Lclient!cd;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!ba", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_112 = Static170.method3101(")4l");

	@OriginalMember(owner = "client!ba", name = "ob", descriptor = "Lclient!eh;")
	public static Class28 aClass28_113 = Static170.method3101("Okay");

	@OriginalMember(owner = "client!ba", name = "sb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_114 = Static170.method3101("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ba", name = "wb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_115 = Static170.method3101("sch-Utteln:");

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V")
	public static void method287() {
		for (@Pc(4) Class3_Sub2_Sub1_Sub7 local4 = (Class3_Sub2_Sub1_Sub7) Static33.aClass23_6.method858(); local4 != null; local4 = (Class3_Sub2_Sub1_Sub7) Static33.aClass23_6.method861()) {
			if (local4.anInt3612 != Static171.anInt4109 || local4.aBoolean173) {
				local4.method3167();
			} else if (local4.anInt3622 <= Static14.anInt481) {
				local4.method2768(Static165.anInt3991);
				if (local4.aBoolean173) {
					local4.method3167();
				} else {
					Static63.method1494(local4.anInt3612, local4.anInt3611, local4.anInt3618, local4.anInt3620, 60, local4, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(IIII)V")
	public static void method288(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			Static137.anInt3510 = -1;
			Static154.anInt3821 = -1;
			return;
		}
		@Pc(33) int local33 = Static33.method848(arg1, Static171.anInt4109, arg2) - arg0;
		@Pc(37) int local37 = Class3_Sub2_Sub2_Sub2.anIntArray127[Static169.anInt683];
		@Pc(41) int local41 = arg1 - Static28.anInt900;
		@Pc(45) int local45 = arg2 - Static85.anInt2512;
		@Pc(49) int local49 = local33 - Static163.anInt3970;
		@Pc(53) int local53 = Class3_Sub2_Sub2_Sub2.anIntArray129[Static169.anInt683];
		@Pc(57) int local57 = Class3_Sub2_Sub2_Sub2.anIntArray127[Static44.anInt3941];
		@Pc(61) int local61 = Class3_Sub2_Sub2_Sub2.anIntArray129[Static44.anInt3941];
		@Pc(71) int local71 = local61 * local41 + local45 * local57 >> 16;
		@Pc(81) int local81 = local45 * local61 - local41 * local57 >> 16;
		@Pc(83) int local83 = local71;
		@Pc(94) int local94 = local49 * local53 - local81 * local37 >> 16;
		@Pc(104) int local104 = local53 * local81 + local49 * local37 >> 16;
		if (local104 < 50) {
			Static154.anInt3821 = -1;
			Static137.anInt3510 = -1;
		} else {
			Static137.anInt3510 = (local83 << 9) / local104 + 256;
			Static154.anInt3821 = (local94 << 9) / local104 + 167;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
	public static void method289() {
		aClass15_1 = null;
		aClass28_113 = null;
		aClass28_114 = null;
		aClass28_112 = null;
		anIntArray97 = null;
		aClass28_115 = null;
	}
}
