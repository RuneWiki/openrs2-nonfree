import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
	public static int[] anIntArray401;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array10;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!kh;")
	public static Class29 aClass29_71;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array21;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public static int anInt3689 = 0;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1583 = Static51.method932(")4l");

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	public static int anInt3690 = 0;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1584 = Static51.method932("titlebutton");

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1585 = Static51.method932("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1586 = Static51.method932("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBILclient!ea;II)V")
	public static void method2623(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub4_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == null) {
			return;
		}
		@Pc(19) int local19 = arg1 * arg1 + arg0 * arg0;
		@Pc(25) int local25 = Static64.anInt1576 + Static45.anInt1123 & 0x7FF;
		if (local19 > 6400) {
			return;
		}
		@Pc(35) int local35 = Class2_Sub1_Sub4_Sub4.anIntArray299[local25];
		@Pc(39) int local39 = Class2_Sub1_Sub4_Sub4.anIntArray304[local25];
		@Pc(47) int local47 = local35 * 256 / (anInt3690 + 256);
		@Pc(55) int local55 = local39 * 256 / (anInt3690 + 256);
		@Pc(65) int local65 = arg0 * local55 + local47 * arg1 >> 16;
		@Pc(76) int local76 = local55 * arg1 - arg0 * local47 >> 16;
		if (local19 > 2500) {
			arg2.method741(Static149.aClass2_Sub1_Sub4_Sub3_7, local65 + arg3 + 4 + 94 - arg2.anInt891 / 2, -(arg2.anInt889 / 2) + -4 + -local76 + 83 + arg4);
		} else {
			arg2.method738(arg3 + local65 + 94 + 4 - arg2.anInt891 / 2, -(arg2.anInt889 / 2) + -4 + -local76 + arg4 + 83);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method2625() {
		aClass10_1586 = null;
		aClass29_71 = null;
		aClass10_1584 = null;
		aClass10_1583 = null;
		aClass10_1585 = null;
		aClass2_Sub1_Sub4_Sub3Array21 = null;
		anIntArray401 = null;
		aClass2_Sub1_Sub4_Sub2Array10 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!cd;ILclient!cd;)V")
	public static void method2627(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10 arg2) {
		Static163.method2472(arg1, null, arg2, arg0);
	}
}
