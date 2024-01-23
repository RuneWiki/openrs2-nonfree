import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	public static int anInt279;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString22 = "Loading wordpack - ";

	@OriginalMember(owner = "client!am", name = "h", descriptor = "I")
	public static int anInt283 = -2;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public static int anInt285 = 0;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIILclient!hd;IJIIII)Z")
	public static boolean method296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static79.method1342(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public static void method298() {
		if (Static95.anInt2198 > 0) {
			Static170.method2760();
		} else {
			Static121.aClass104_4 = Static5.aClass104_5;
			Static5.aClass104_5 = null;
			Static112.method1823(40);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLclient!th;Lclient!th;)V")
	public static void method299(@OriginalArg(1) Class168 arg0, @OriginalArg(2) Class168 arg1) {
		Static50.aClass168_12 = arg0;
		Static102.aClass168_27 = arg1;
		Static50.aClass168_12.method4068(34);
		@Pc(15) int local15 = (int) (Math.random() * 21.0D) - 10;
		@Pc(25) int local25 = (int) (Math.random() * 21.0D) - 10;
		@Pc(32) int local32 = (int) (Math.random() * 21.0D) - 10;
		@Pc(39) int local39 = (int) (Math.random() * 41.0D) - 20;
		Static112.anInt2461 = local32 + local39;
		Static240.anInt5001 = local39 + local15;
		Static271.anInt5428 = local39 + local25;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Lclient!qa;")
	public static Class136 method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class136 local14 = local7.aClass136_1;
			local7.aClass136_1 = null;
			return local14;
		}
	}
}
