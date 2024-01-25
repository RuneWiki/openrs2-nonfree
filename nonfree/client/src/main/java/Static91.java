import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "I")
	public static int anInt1512;

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "Lclient!fk;")
	public static Class5_Sub16_Sub1 aClass5_Sub16_Sub1_1;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "Lclient!el;")
	public static final Class109 aClass109_38 = new Class109(48, -2);

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "J")
	public static volatile long aLong42 = 0L;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BI)V")
	public static void method1356(@OriginalArg(1) int arg0) {
		if (Static596.method8616(arg0)) {
			Static510.method7463(Static489.aClass73ArrayArray2[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BLclient!ib;)Lclient!pm;")
	public static Class280 method1357(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(15) int local15 = arg0.method8519();
		return new Class280(local15);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(III)Z")
	public static boolean method1358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIII)I")
	public static int method1359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(17) int local17 = local7 >= 8 ? arg1 : arg3;
		@Pc(37) int local37 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg3 : arg0) : arg1;
		return ((local7 & 0x2) == 0 ? local37 : -local37) + ((local7 & 0x1) == 0 ? local17 : -local17);
	}
}
