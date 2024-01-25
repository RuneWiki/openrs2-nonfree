import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	public static int anInt6705;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!ee;")
	public static final Class3_Sub15 aClass3_Sub15_6 = new Class3_Sub15(0, -1);

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "[C")
	public static final char[] aCharArray12 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "[I")
	public static final int[] anIntArray561 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
	public static int method5618(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(31) int local31 = local25 | local25 >>> 8;
		@Pc(37) int local37 = local31 | local31 >>> 16;
		return arg0 & ~local37;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public static void method5621() {
		Static353.method5714(25);
		Static165.method2610();
		System.gc();
	}
}
