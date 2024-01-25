import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
	public static int anInt1921;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "Lclient!tc;")
	public static Class221 aClass221_2;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "[Lclient!ij;")
	public static Class107[] aClass107Array2;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
	public static int anInt1924;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "Lclient!wk;")
	public static Class246 aClass246_6 = new Class246(64);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;IZB)I")
	public static int method1870(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local35; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(88) int local88;
			if (local48 >= '0' && local48 <= '9') {
				local88 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local88 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local88 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local88) {
				throw new NumberFormatException();
			}
			if (local28) {
				local88 = -local88;
			}
			@Pc(124) int local124 = local88 + arg1 * local32;
			if (local124 / arg1 != local32) {
				throw new NumberFormatException();
			}
			local32 = local124;
			local30 = true;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local32;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!kk;B)Lclient!re;")
	public static Class65_Sub3 method1871(@OriginalArg(0) Class2_Sub16 arg0) {
		return new Class65_Sub3(arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5356(), arg0.method5356(), arg0.method5350());
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ae;III)V")
	public static void method1873(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static133.anInt2725 = arg1;
		Static283.anInt4895 = arg2;
		Static31.aClass4_5 = arg0;
	}
}
