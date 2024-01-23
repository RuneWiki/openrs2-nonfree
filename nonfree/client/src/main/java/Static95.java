import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_18;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject3 = new Object();

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "[[S")
	public static short[][] aShortArrayArray54 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_460 = Static199.method3560("welle2:");

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
	public static int anInt2100 = 0;

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "Lclient!qe;")
	public static Class78 aClass78_461 = Static199.method3560("mod_icons");

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "Lclient!he;")
	public static Class44 aClass44_21 = new Class44();

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "Lclient!qe;")
	private static Class78 aClass78_464 = Static199.method3560("wave:");

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "Lclient!qe;")
	public static Class78 aClass78_462 = aClass78_464;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "[Lclient!gg;")
	public static Class5_Sub2_Sub1[] aClass5_Sub2_Sub1Array1 = new Class5_Sub2_Sub1[32768];

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "Lclient!qe;")
	public static Class78 aClass78_463 = Static199.method3560("Benutzen");

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "Lclient!qe;")
	public static Class78 aClass78_465 = aClass78_464;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "[Lclient!nh;")
	public static Class2_Sub23[] aClass2_Sub23Array1 = new Class2_Sub23[2048];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BILclient!oe;I)[Lclient!gd;")
	public static Class2_Sub3_Sub8[] method1661(@OriginalArg(2) Class72 arg0, @OriginalArg(3) int arg1) {
		return Static55.method713(arg1, arg0) ? Static225.method3969() : null;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!qe;Lclient!qe;II)V")
	public static void method1663(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(3) int arg2) {
		Static188.method3489(arg0, null, arg2, -1, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)V")
	public static void method1664(@OriginalArg(1) int arg0) {
		if (Static80.method1339(arg0)) {
			Static169.method3106(-1, Static181.aClass64ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjava/lang/Object;Lclient!gj;)V")
	public static void method1665(@OriginalArg(1) Object arg0, @OriginalArg(2) Class41 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static156.method2805(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	public static void method1666() {
		Static58.aClass110_8.method3889();
		Static89.aClass53_7.method1797();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjava/awt/Component;IB)Lclient!ba;")
	public static Class10 method1667(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class10_Sub2");
			@Pc(15) Class10 local15 = (Class10) local11.getDeclaredConstructor().newInstance();
			local15.method2688(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class10_Sub1 local28 = new Class10_Sub1();
			local28.method2688(arg1, arg2, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	public static void method1668() {
		System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
		System.exit(1);
	}
}
