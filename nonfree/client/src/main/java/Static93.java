import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gn", name = "nb", descriptor = "[Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2[] aClass1_Sub2_Sub11_Sub2Array1;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "[I")
	public static int[] anIntArray186 = new int[32];

	@OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
	public static int anInt2105 = 0;

	@OriginalMember(owner = "client!gn", name = "Bb", descriptor = "[Lclient!gk;")
	public static Class1_Sub2_Sub10[] aClass1_Sub2_Sub10Array2 = new Class1_Sub2_Sub10[14];

	@OriginalMember(owner = "client!gn", name = "Db", descriptor = "I")
	public static int anInt2134 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method1658(@OriginalArg(0) String arg0) {
		@Pc(8) long local8 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local8 *= 37L;
			@Pc(28) char local28 = arg0.charAt(local17);
			if (local28 >= 'A' && local28 <= 'Z') {
				local8 += local28 - 64;
			} else if (local28 >= 'a' && local28 <= 'z') {
				local8 += local28 - 96;
			} else if (local28 >= '0' && local28 <= '9') {
				local8 += local28 + 27 - 48;
			}
			if (local8 >= 177917621779460413L) {
				break;
			}
		}
		while (local8 % 37L == 0L && local8 != 0L) {
			local8 /= 37L;
		}
		return local8;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLclient!in;)Z")
	public static boolean method1673(@OriginalArg(1) Class71 arg0) {
		if (arg0.anInt2713 == 205) {
			Static107.anInt2505 = 250;
			return true;
		} else {
			return false;
		}
	}
}
