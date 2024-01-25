import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!dfa", name = "G", descriptor = "I")
	public static int anInt8689;

	@OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
	public static int anInt8690;

	@OriginalMember(owner = "client!dfa", name = "F", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_255 = new Class363(5, 4);

	@OriginalMember(owner = "client!dfa", name = "i", descriptor = "(B)V")
	public static void method7255() {
		@Pc(9) Class313 local9 = Static210.aClass313_25;
		synchronized (Static210.aClass313_25) {
			Static210.aClass313_25.method6983();
		}
	}

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "(I)V")
	public static void method7256() {
		Static418.aClass313_43.method6977();
	}

	@OriginalMember(owner = "client!dfa", name = "i", descriptor = "(I)V")
	public static void method7258() {
		@Pc(17) byte[] local17;
		if (Static62.anObject10 == null) {
			@Pc(10) Class127_Sub1_Sub2 local10 = new Class127_Sub1_Sub2();
			local17 = local10.method4134();
			Static62.anObject10 = Static276.method3094(local17);
		}
		if (Static402.anObject37 == null) {
			@Pc(32) Class127_Sub2_Sub2 local32 = new Class127_Sub2_Sub2();
			local17 = local32.method7987();
			Static402.anObject37 = Static276.method3094(local17);
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)I")
	public static int method7259(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
