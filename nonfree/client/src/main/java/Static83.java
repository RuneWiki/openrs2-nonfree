import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!kb;")
	private static Class46 aClass46_695 = Static65.method1172(" ");

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!kb;")
	public static Class46 aClass46_696 = aClass46_695;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_697 = Static65.method1172("<col=ff7000>");

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "[I")
	public static int[] anIntArray212 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method1399() {
		for (@Pc(10) Class3_Sub12 local10 = (Class3_Sub12) Static129.aClass54_10.method1598(); local10 != null; local10 = (Class3_Sub12) Static129.aClass54_10.method1609()) {
			@Pc(15) int local15 = local10.anInt1766;
			if (Static57.method1063(local15)) {
				@Pc(21) boolean local21 = true;
				@Pc(25) Class33[] local25 = Static26.aClass33ArrayArray1[local15];
				for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
					if (local25[local27] != null) {
						local21 = local25[local27].aBoolean50;
						break;
					}
				}
				if (!local21) {
					@Pc(51) int local51 = (int) local10.aLong143;
					@Pc(55) Class33 local55 = Static179.method2873(local51);
					if (local55 != null) {
						Static142.method2373(local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1401() {
		aClass46_696 = null;
		aClass46_695 = null;
		anIntArrayArrayArray5 = null;
		aClass46_697 = null;
		anIntArray212 = null;
	}
}
