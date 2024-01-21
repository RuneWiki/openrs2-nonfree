import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	public static int anInt2021;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "Lclient!fc;")
	public static Class29 aClass29_2;

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
	public static int anInt2024;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_620 = Static181.method2795("glow1:");

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_618 = aClass83_620;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_619 = Static181.method2795("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_621 = Static181.method2795("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public static int anInt2022 = 0;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Lclient!qe;")
	public static Class83 aClass83_622 = aClass83_620;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
	public static int anInt2023 = 0;

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_623 = Static181.method2795(" <col=ffff00>");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZLclient!ja;)V")
	public static void method1619(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		@Pc(2) int local2 = arg1.anInt1869;
		@Pc(10) int local10 = (int) arg1.aLong149;
		arg1.method3254();
		if (arg0) {
			Static149.method2327(local2);
		}
		Static71.method1374(local2);
		@Pc(31) Class5 local31 = Static74.method1401(local10);
		if (local31 != null) {
			Static121.method2085(local31);
		}
		Static159.aBoolean152 = false;
		Static98.anInt2124 = 0;
		Static124.method1906(Static162.anInt3931, Static160.anInt3230, Static43.anInt1134, Static177.anInt3624);
		if (Static138.anInt2942 != -1) {
			Static169.method2640(Static138.anInt2942, 1);
		}
	}
}
