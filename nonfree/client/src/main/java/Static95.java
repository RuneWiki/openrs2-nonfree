import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array8;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public static int anInt2446;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!ee;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!jd;")
	public static Class38 aClass38_20 = new Class38();

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_1201 = Static9.method266("(U0a )2 via: ");

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Lclient!id;")
	public static Class34 aClass34_1202 = Static9.method266("runes");

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!id;")
	private static Class34 aClass34_1203 = Static9.method266("FULL");

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "[I")
	public static int[] anIntArray311 = new int[256];

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_1204 = aClass34_1203;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	public static int anInt2447 = -1;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLclient!ie;)Lclient!db;")
	public static Class1_Sub8 method1617(@OriginalArg(0) int arg0, @OriginalArg(2) Class35 arg1) {
		@Pc(10) byte[] local10 = arg1.method1571(arg0);
		return local10 == null ? null : new Class1_Sub8(local10);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method1618() {
		aClass34_1202 = null;
		aClass1_Sub1_Sub2_Sub1Array8 = null;
		aClass34_1204 = null;
		anIntArray311 = null;
		aClass38_20 = null;
		aClass21_1 = null;
		aClass34_1201 = null;
		aClass34_1203 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLclient!le;Z)V")
	public static void method1619(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) int local6 = arg0.anInt1893;
		@Pc(10) int local10 = (int) arg0.aLong162;
		arg0.method2039();
		if (arg1) {
			Static96.method1642(local6);
		}
		Static101.method1691(local6);
		@Pc(25) Class1_Sub9 local25 = Static113.method1814(local10);
		if (local25 != null) {
			Static10.method277(local25);
		}
		Static115.aBoolean158 = false;
		Static71.anInt1876 = 0;
		Static8.method259(Static2.anInt274, Static88.anInt2288, Static15.anInt605, Static58.anInt1621);
		if (Static9.anInt451 != -1) {
			Static14.method348(Static9.anInt451, 1);
		}
	}
}
