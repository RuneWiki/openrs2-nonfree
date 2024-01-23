import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "[Lclient!te;")
	public static Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array9;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	public static volatile int anInt2130 = -1;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "[I")
	public static int[] anIntArray138 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public static int anInt2132 = 0;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_719 = Static64.method1101(")2");

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!ia;")
	public static Class51 aClass51_720 = Static64.method1101("Lade Texturen )2 ");

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int anInt2134 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZILclient!hb;)V")
	public static void method1635(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		@Pc(7) int local7 = (int) arg1.aLong170;
		@Pc(10) int local10 = arg1.anInt1677;
		arg1.method3758();
		if (arg0) {
			Static105.method1795(local10);
		}
		Static219.method3609(local10);
		@Pc(27) Class71 local27 = Static7.method102(local7);
		if (local27 != null) {
			Static82.method1438(local27);
		}
		Static202.anInt4289 = 0;
		Static156.aBoolean164 = false;
		Static221.method3642(Static72.anInt1644, Static200.anInt4245, Static184.anInt3998, Static53.anInt1242);
		if (Static9.anInt179 != -1) {
			Static55.method955(Static9.anInt179, 1);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method1636() {
		Static167.aClass1_Sub16_Sub1_2.method3823(33);
		Static167.aClass1_Sub16_Sub1_2.method3786(0L);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!mb;Lclient!lf;Lclient!mb;Z)V")
	public static void method1637(@OriginalArg(1) Class70 arg0, @OriginalArg(2) Class1_Sub2_Sub11_Sub1_Sub1 arg1, @OriginalArg(3) Class70 arg2, @OriginalArg(4) boolean arg3) {
		Static30.aClass70_23 = arg2;
		Static137.aBoolean137 = arg3;
		Static217.aClass70_43 = arg0;
		@Pc(15) int local15 = Static30.aClass70_23.method3514() - 1;
		Static29.anInt686 = local15 * 256 + Static30.aClass70_23.method3532(local15);
		Static46.aClass1_Sub2_Sub11_Sub1_Sub1_1 = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ia;IZ)V")
	public static void method1638(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub2_Sub10 local8 = Static110.method1051(2, arg1);
		local8.method1523();
		local8.aClass51_654 = arg0;
	}
}
