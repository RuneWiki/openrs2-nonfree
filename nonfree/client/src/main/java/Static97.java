import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "D")
	public static double aDouble6;

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_11 = new Class124();

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "Z")
	public static boolean aBoolean118 = true;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	public static void method1622() {
		@Pc(10) Class5_Sub47 local10;
		for (local10 = (Class5_Sub47) Static59.aClass124_60.method2572(); local10 != null; local10 = (Class5_Sub47) Static59.aClass124_60.method2569()) {
			Static166.method2458(false, local10);
		}
		for (local10 = (Class5_Sub47) Static227.aClass124_36.method2572(); local10 != null; local10 = (Class5_Sub47) Static227.aClass124_36.method2569()) {
			Static166.method2458(true, local10);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)V")
	public static void method1623(@OriginalArg(1) int arg0) {
		if (Static62.anInt991 == 1) {
			Static106.anInt1880 = arg0;
		} else if (Static62.anInt991 == 2) {
			Static489.anInt8413 = arg0;
		}
	}
}
