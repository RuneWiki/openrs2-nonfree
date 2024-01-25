import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!dp", name = "m", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
	public static int anInt2272;

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "[I")
	public static final int[] anIntArray199 = new int[4096];

	@OriginalMember(owner = "client!dp", name = "w", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!dp", name = "x", descriptor = "[I")
	public static final int[] anIntArray201 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "[Lclient!dba;")
	public static final Class64[] aClass64Array1 = new Class64[14];

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public static void method2072(@OriginalArg(0) int arg0) {
		Static477.anInt8709 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static537.anInt9566; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static509.anInt9164; local6++) {
				if (Static120.aClass37ArrayArrayArray1[arg0][local3][local6] == null) {
					Static120.aClass37ArrayArrayArray1[arg0][local3][local6] = new Class37(arg0, local3, local6);
				}
			}
		}
	}
}
