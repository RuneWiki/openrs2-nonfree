import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public static int anInt291;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] aClass4_Sub2_Sub3_Sub1Array3;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public static int anInt286 = 0;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!ja;")
	public static Class39 aClass39_207 = Static28.method504("Fertigkeit)2");

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_208 = Static28.method504("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_209 = Static28.method504("(Y");

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public static volatile int anInt290 = -1;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!ja;")
	private static Class39 aClass39_212 = Static28.method504("To play on this world move to a free area first");

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_210 = aClass39_212;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_211 = Static28.method504("Lade Texturen )2 ");

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "J")
	public static long aLong16 = 0L;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public static int anInt292 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method190() {
		Static3.aClass12_2.method233();
		Static108.aClass12_75.method233();
		Static32.aClass12_22.method233();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZLclient!ja;Lclient!ja;Lclient!pd;)V")
	public static void method191(@OriginalArg(3) Class39 arg0, @OriginalArg(4) Class39 arg1, @OriginalArg(5) Class20 arg2) {
		@Pc(8) int local8 = arg2.method484(arg1);
		@Pc(14) int local14 = arg2.method475(arg0, local8);
		Static72.method528(255, arg2, local14, local8);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public static void method192() {
		aClass39_208 = null;
		aClass39_207 = null;
		aClass39_209 = null;
		aClass39_212 = null;
		aClass4_Sub2_Sub3_Sub1Array3 = null;
		aClass39_211 = null;
		aClass39_210 = null;
	}
}
