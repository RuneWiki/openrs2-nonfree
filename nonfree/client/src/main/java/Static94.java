import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!er", name = "l", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!er", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString34;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "I")
	public static int anInt1810 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!qa;Lclient!tn;)V")
	public static void method1466(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Class229 arg1) {
		@Pc(39) boolean local39 = Static388.aClass193_3.method4256(arg1.anInt6933, arg0, arg1.anInt6890, arg1.anInt6869, arg1.anInt6937 | 0xFF000000, arg1.aBoolean551 ? Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1 : null, arg1.anInt6918) == null;
		if (local39) {
			Static75.aClass142_11.method3212(new Class1_Sub19(arg1.anInt6918, arg1.anInt6933, arg1.anInt6869, arg1.anInt6937 | 0xFF000000, arg1.anInt6890, arg1.aBoolean551));
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILjava/lang/Object;I)[B")
	public static byte[] method1468(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(20) byte[] local20 = (byte[]) arg1;
			return Static423.method5697(arg0, local20);
		} else if (arg1 instanceof Class98) {
			@Pc(32) Class98 local32 = (Class98) arg1;
			return local32.method2921(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method1470(@OriginalArg(0) int arg0) {
		@Pc(15) String local15 = Integer.toString(arg0);
		for (@Pc(20) int local20 = local15.length() - 3; local20 > 0; local20 -= 3) {
			local15 = local15.substring(0, local20) + "," + local15.substring(local20);
		}
		if (local15.length() > 9) {
			return " <col=00ff80>" + local15.substring(0, local15.length() - 8) + Static135.aClass96_42.method1935(Static389.anInt7061) + " (" + local15 + ")</col>";
		} else if (local15.length() > 6) {
			return " <col=ffffff>" + local15.substring(0, local15.length() - 4) + Static283.aClass96_79.method1935(Static389.anInt7061) + " (" + local15 + ")</col>";
		} else {
			return " <col=ffff00>" + local15 + "</col>";
		}
	}
}
