import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!el", name = "r", descriptor = "Lclient!fc;")
	public static Class79 aClass79_2;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "I")
	public static int anInt1565 = -1;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "I")
	public static int anInt1570 = 0;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "Lclient!iu;")
	public static Class112 aClass112_3 = null;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V")
	public static void method1267(@OriginalArg(0) int arg0) {
		Static365.anInt5878 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static19.anInt329; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static230.anInt6113; local6++) {
				if (Static25.aClass132ArrayArrayArray1[arg0][local3][local6] == null) {
					Static25.aClass132ArrayArrayArray1[arg0][local3][local6] = new Class132(arg0, local3, local6);
				}
			}
		}
	}
}
