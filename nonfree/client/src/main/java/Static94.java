import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!ja;")
	public static Class33 aClass33_29 = new Class33(64);

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_738 = Static60.method1113("gelb:");

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_739 = Static60.method1113("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt2532 = 0;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	public static int anInt2533 = 500;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
	public static int anInt2535 = 0;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_740 = Static60.method1113("Spieler");

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_741 = Static60.method1113("T");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
	public static int method1627() {
		return Static132.anInt3125++;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method1628() {
		Static71.aClass7_1.method1573();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static38.aLongArray2[local6] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static104.aLongArray6[local24] = 0L;
		}
		Static87.anInt2315 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public static void method1629() {
		aClass33_29 = null;
		aClass22_741 = null;
		aClass22_739 = null;
		aClass22_738 = null;
		aClass22_740 = null;
	}
}
