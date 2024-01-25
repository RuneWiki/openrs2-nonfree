import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "[Lclient!paa;")
	public static Class255[] aClass255Array1;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!sl;B)Lclient!qa;")
	public static Class269 method2067(@OriginalArg(0) Class3_Sub3 arg0) {
		@Pc(12) int local12 = arg0.method4225();
		@Pc(19) Class83 local19 = Static352.method5820()[arg0.method4225()];
		@Pc(26) Class50 local26 = Static496.method2282()[arg0.method4225()];
		@Pc(30) int local30 = arg0.method4209();
		@Pc(34) int local34 = arg0.method4209();
		@Pc(38) int local38 = arg0.method4221();
		@Pc(42) int local42 = arg0.method4221();
		@Pc(46) int local46 = arg0.method4207();
		@Pc(50) int local50 = arg0.method4207();
		@Pc(54) int local54 = arg0.method4207();
		@Pc(63) boolean local63 = arg0.method4225() == 1;
		return new Class269(local12, local19, local26, local30, local34, local38, local42, local46, local50, local54, local63);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lclient!dk;")
	public static Class3_Sub14 method2068() {
		@Pc(14) Class3_Sub14 local14 = Static502.method7404();
		local14.aClass130_38 = null;
		local14.anInt2267 = 0;
		local14.aClass3_Sub3_Sub2_2 = new Class3_Sub3_Sub2(5000);
		return local14;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)I")
	public static int method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
