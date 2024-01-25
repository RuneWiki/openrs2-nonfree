import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
	public static int anInt1931;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
	public static final int[] anIntArray195 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
	public static final int[] anIntArray196 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
	public static final int[] anIntArray197 = new int[13];

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString65 = "Discard";

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
	public static void method1555() {
		@Pc(5) Class154 local5 = Static337.aClass154_88;
		synchronized (Static337.aClass154_88) {
			Static337.aClass154_88.method4220(5);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
	public static void method1556(@OriginalArg(0) int arg0) {
		Static121.anInt2748 = arg0;
		@Pc(7) Class154 local7 = Static251.aClass154_79;
		synchronized (Static251.aClass154_79) {
			Static251.aClass154_79.method4219();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZIZ)Ljava/lang/String;")
	public static String method1558(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		for (@Pc(41) int local41 = arg0 / 10; local41 != 0; local41 /= 10) {
			local37++;
		}
		@Pc(56) char[] local56 = new char[local37];
		local56[0] = '+';
		for (@Pc(69) int local69 = local37 - 1; local69 > 0; local69--) {
			@Pc(73) int local73 = arg0;
			arg0 /= 10;
			@Pc(84) int local84 = local73 - arg0 * 10;
			if (local84 < 10) {
				local56[local69] = (char) (local84 + 48);
			} else {
				local56[local69] = (char) (local84 + 87);
			}
		}
		return new String(local56);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public static void method1559() {
		Static141.method2782();
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	public static void method1560() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static71.aBooleanArray11[local7] = false;
		}
		Static9.anInt6462 = Static332.anInt6592;
		Static76.anInt1672 = -1;
		Static184.anInt4058 = Static105.anInt6098;
		Static293.anInt5930 = 0;
		Static303.anInt3065 = 5;
		Static207.anInt4345 = Static342.anInt6706;
		Static63.anInt1302 = Static288.anInt5845;
		Static179.anInt3943 = -1;
		Static249.anInt5201 = Static230.anInt4796;
		Static336.anInt6660 = Static133.anInt3056;
		Static11.anInt263 = 0;
	}
}
