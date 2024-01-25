import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!fj", name = "t", descriptor = "Lclient!gl;")
	public static Class2 aClass2_7;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString79 = "glow3:";

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "[I")
	public static final int[] anIntArray190 = new int[100];

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
	public static int anInt2078 = 3;

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
	public static volatile int anInt2084 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!mo;ILclient!mo;Lclient!mo;)V")
	public static void method2091(@OriginalArg(0) Class143 arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) Class143 arg2) {
		Static118.aClass143_58 = arg2;
		Static352.method5926(arg0, arg1);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)C")
	public static char method2093(@OriginalArg(1) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(46) char local46 = Static284.aCharArray7[local12 - 128];
			if (local46 == '\u0000') {
				local46 = '?';
			}
			local12 = local46;
		}
		return (char) local12;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method2094(@OriginalArg(1) String arg0) {
		if (Static21.aStringArray23 == null) {
			Static252.method4375();
		}
		@Pc(22) String[] local22 = Static105.method2289(arg0, '\n');
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			for (@Pc(28) int local28 = Static354.anInt6718; local28 > 0; local28--) {
				Static21.aStringArray23[local28] = Static21.aStringArray23[local28 - 1];
			}
			Static21.aStringArray23[0] = local22[local24];
			if (Static21.aStringArray23.length - 1 > Static354.anInt6718) {
				Static354.anInt6718++;
				if (Static274.anInt5227 > 0) {
					Static274.anInt5227++;
				}
			}
		}
	}
}
