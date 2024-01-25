import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	public static int anInt1741;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	public static int anInt1742;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_23 = new Class84("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public static void method1478() {
		@Pc(10) int local10 = 0;
		if (Static389.aClass128_Sub1_1.method2975(Static285.anInt7839)) {
			local10 = 55;
		}
		if (!Static389.aClass128_Sub1_1.aBoolean245) {
			local10 |= 0x40;
		}
		Static33.method568(local10);
		Static71.aClass105_6.method2342(local10);
		Static196.aClass139_1.method3230(local10);
		Static322.aClass187_2.method4502(local10);
		Static168.aClass115_2.method2714(local10);
		Static377.method5163(local10);
		Static169.method2692(local10);
		Static146.method2196(local10);
		Static24.method472(local10);
		if (Static151.anInt2579 == 10) {
			Static455.method4431(28);
		} else if (Static151.anInt2579 == 30) {
			Static455.method4431(25);
			return;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Z")
	public static boolean method1479() {
		try {
			return Static62.method1101();
		} catch (@Pc(15) IOException local15) {
			Static32.method556();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(79) String local79 = "T2 - " + (Static329.aClass237_97 == null ? -1 : Static329.aClass237_97.method5430()) + "," + (Static264.aClass237_82 == null ? -1 : Static264.aClass237_82.method5430()) + "," + (Static411.aClass237_119 == null ? -1 : Static411.aClass237_119.method5430()) + " - " + Static283.anInt4985 + "," + (Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray590[0] + Static437.anInt7555) + "," + (Static134.anInt5502 + Static196.aClass26_Sub2_Sub2_Sub1_1.anIntArray589[0]) + " - ";
			for (@Pc(81) int local81 = 0; local81 < Static283.anInt4985 && local81 < 50; local81++) {
				local79 = local79 + Static173.aClass1_Sub1_Sub1_1.aByteArray66[local81] + ",";
			}
			Static315.method4700(local20, local79);
			Static234.method3459();
			return true;
		}
	}
}
