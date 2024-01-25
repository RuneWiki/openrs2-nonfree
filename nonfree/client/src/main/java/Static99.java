import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ga", name = "bb", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "[I")
	public static final int[] anIntArray216 = new int[50];

	@OriginalMember(owner = "client!ga", name = "X", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!ga", name = "Y", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_40 = new Class93("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ga", name = "Z", descriptor = "Z")
	public static volatile boolean aBoolean197 = true;

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
	public static int anInt2255 = 0;

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
	public static int anInt2256 = -1;

	@OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
	public static int anInt2257 = 0;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Lclient!di;")
	public static Class2_Sub11_Sub1 method2234(@OriginalArg(0) int arg0) {
		@Pc(10) Class119 local10 = Static286.aClass119_172;
		@Pc(19) Class2_Sub11_Sub1 local19;
		synchronized (Static286.aClass119_172) {
			local19 = (Class2_Sub11_Sub1) Static286.aClass119_172.method3311((long) arg0);
			if (local19 == null) {
				local19 = new Class2_Sub11_Sub1(arg0);
				Static286.aClass119_172.method3308(local19, (long) arg0);
			}
		}
		synchronized (local19) {
			return local19.method1347() ? local19 : null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V")
	public static void method2235() {
		@Pc(5) byte local5 = 0;
		if (Static348.aBoolean606) {
			local5 = 55;
		}
		Static344.method5932(local5);
		Static339.method5841(local5);
		Static351.method4758(local5);
		Static351.method4759(local5);
		Static126.method2622(local5);
		Static241.method4175(local5);
		Static161.method3038(local5);
		Static248.method4497(local5);
		Static7.method215(local5);
		if (Static263.anInt5396 == 10) {
			Static125.method2616(28);
		} else if (Static263.anInt5396 == 30) {
			Static125.method2616(25);
		}
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
	public static void method2236() {
		if (Static268.anInt5456 != 3) {
			Static261.anInt5114 = -1;
		}
	}
}
