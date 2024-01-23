import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
	public static int anInt2633;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public static int anInt2635 = 0;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "[C")
	public static char[] aCharArray1 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	public static int anInt2642 = -1;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZIZIIB)V")
	public static void method2029(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 >= arg4) {
			return;
		}
		@Pc(6) int local6 = arg0;
		@Pc(12) int local12 = (arg4 + arg0) / 2;
		@Pc(16) Class115_Sub1 local16 = Static42.aClass115_Sub1Array1[local12];
		Static42.aClass115_Sub1Array1[local12] = Static42.aClass115_Sub1Array1[arg4];
		Static42.aClass115_Sub1Array1[arg4] = local16;
		for (@Pc(28) int local28 = arg0; local28 < arg4; local28++) {
			if (Static136.method2536(arg1, local16, arg3, arg2, Static42.aClass115_Sub1Array1[local28], arg5) <= 0) {
				@Pc(45) Class115_Sub1 local45 = Static42.aClass115_Sub1Array1[local28];
				Static42.aClass115_Sub1Array1[local28] = Static42.aClass115_Sub1Array1[local6];
				Static42.aClass115_Sub1Array1[local6++] = local45;
			}
		}
		Static42.aClass115_Sub1Array1[arg4] = Static42.aClass115_Sub1Array1[local6];
		Static42.aClass115_Sub1Array1[local6] = local16;
		method2029(arg0, arg1, arg2, arg3, local6 - 1, arg5);
		method2029(local6 + 1, arg1, arg2, arg3, arg4, arg5);
	}
}
