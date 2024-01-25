import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!en", name = "v", descriptor = "Lclient!ml;")
	public static Class156 aClass156_2;

	@OriginalMember(owner = "client!en", name = "z", descriptor = "Lclient!ne;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!en", name = "G", descriptor = "Lclient!bp;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!en", name = "D", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!ug;)Lclient!qq;")
	public static Class78_Sub3 method1488(@OriginalArg(1) Class1_Sub28 arg0) {
		return new Class78_Sub3(arg0.method5382(), arg0.method5382(), arg0.method5382(), arg0.method5382(), arg0.method5382(), arg0.method5382(), arg0.method5382(), arg0.method5382(), arg0.method5345(), arg0.method5337());
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public static void method1489() {
		@Pc(12) int local12 = Static285.anInt5015;
		@Pc(14) int[] local14 = Static103.anIntArray135;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class25_Sub5_Sub1_Sub2 local24 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local14[local16]];
			if (local24 != null) {
				Static232.method3334(local24.method3427(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 >= Static427.anInt7214 && Static434.anInt7302 >= arg2 && Static427.anInt7214 <= arg4 && arg4 <= Static434.anInt7302 && arg0 >= Static427.anInt7214 && arg0 <= Static434.anInt7302 && Static427.anInt7214 <= arg5 && arg5 <= Static434.anInt7302 && arg6 >= Static289.anInt5053 && arg6 <= Static93.anInt1676 && Static289.anInt5053 <= arg8 && arg8 <= Static93.anInt1676 && arg7 >= Static289.anInt5053 && arg7 <= Static93.anInt1676 && Static289.anInt5053 <= arg3 && Static93.anInt1676 >= arg3) {
			Static297.method4604(arg4, arg7, arg8, arg6, arg2, arg3, arg5, arg0, arg1);
		} else {
			Static226.method3264(arg1, arg0, arg7, arg5, arg4, arg8, arg3, arg2, arg6);
		}
	}
}
