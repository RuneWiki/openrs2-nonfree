import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
	public static int anInt2090;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "Lclient!ne;")
	public static Class146 aClass146_19;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!mo;")
	public static Class143 aClass143_49;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!mo;")
	public static Class143 aClass143_50;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "[I")
	public static final int[] anIntArray191 = new int[2500];

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Lclient!lc;")
	public static final Class126 aClass126_2 = new Class126();

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
	public static int anInt2091 = 0;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)I")
	public static int method2095() {
		if ((double) Static241.aFloat107 == 3.0D) {
			return 37;
		} else if ((double) Static241.aFloat107 == 4.0D) {
			return 50;
		} else if ((double) Static241.aFloat107 == 6.0D) {
			return 75;
		} else if ((double) Static241.aFloat107 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public static void method2096() {
		for (@Pc(15) int local15 = 0; local15 < Static108.aByteArrayArrayArray5.length; local15++) {
			for (@Pc(19) int local19 = 0; local19 < Static108.aByteArrayArrayArray5[0].length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < Static108.aByteArrayArrayArray5[0][0].length; local23++) {
					Static108.aByteArrayArrayArray5[local15][local19][local23] = 0;
				}
			}
		}
	}
}
