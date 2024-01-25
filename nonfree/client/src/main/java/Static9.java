import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	public static int anInt6459;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	public static int anInt6462;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "J")
	public static long aLong243 = -1L;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "[I")
	public static final int[] anIntArray511 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
	public static int anInt6461 = 0;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
	public static int anInt6463 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method5407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(10) Class72 local10 = Static289.method4934(arg2, arg1);
		if (local10 == null) {
			return;
		}
		if (local10.anObjectArray12 != null) {
			@Pc(20) Class4_Sub22 local20 = new Class4_Sub22();
			local20.aClass72_12 = local10;
			local20.aString106 = arg3;
			local20.anObjectArray34 = local10.anObjectArray12;
			local20.anInt3124 = arg0;
			Static97.method1756(local20);
		}
		@Pc(37) boolean local37 = true;
		if (local10.anInt1804 > 0) {
			local37 = Static154.method2991(local10);
		}
		if (!local37 || !Static46.method876(local10).method257(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static320.aClass4_Sub7_Sub1_3.method1237(49);
			Static320.aClass4_Sub7_Sub1_3.method2387(arg1);
			Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		}
		if (arg0 == 2) {
			Static320.aClass4_Sub7_Sub1_3.method1237(109);
			Static320.aClass4_Sub7_Sub1_3.method2387(arg1);
			Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		}
		if (arg0 == 3) {
			Static320.aClass4_Sub7_Sub1_3.method1237(242);
			Static320.aClass4_Sub7_Sub1_3.method2387(arg1);
			Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		}
		if (arg0 == 4) {
			Static320.aClass4_Sub7_Sub1_3.method1237(222);
			Static320.aClass4_Sub7_Sub1_3.method2387(arg1);
			Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		}
		if (arg0 == 5) {
			Static320.aClass4_Sub7_Sub1_3.method1237(136);
			Static320.aClass4_Sub7_Sub1_3.method2387(arg1);
			Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		}
		if (arg0 == 6) {
			Static320.aClass4_Sub7_Sub1_3.method1237(26);
			Static320.aClass4_Sub7_Sub1_3.method2387(arg1);
			Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		}
		if (arg0 == 7) {
			Static320.aClass4_Sub7_Sub1_3.method1237(130);
			Static320.aClass4_Sub7_Sub1_3.method2387(arg1);
			Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		}
		if (arg0 == 8) {
			Static320.aClass4_Sub7_Sub1_3.method1237(161);
			Static320.aClass4_Sub7_Sub1_3.method2387(arg1);
			Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		}
		if (arg0 == 9) {
			Static320.aClass4_Sub7_Sub1_3.method1237(168);
			Static320.aClass4_Sub7_Sub1_3.method2387(arg1);
			Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		}
		if (arg0 == 10) {
			Static320.aClass4_Sub7_Sub1_3.method1237(250);
			Static320.aClass4_Sub7_Sub1_3.method2387(arg1);
			Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!am;Lclient!al;)V")
	public static void method5410(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Interface1 arg1) {
		Static199.aClass11_146 = arg0;
		Static202.anInterface1_4 = arg1;
	}
}
