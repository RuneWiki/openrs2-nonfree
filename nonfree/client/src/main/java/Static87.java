import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!jf", name = "R", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_700 = Static158.method3034("Okay");

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_30 = new Class89(100);

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_701 = Static158.method3034("<col=c0ff00>");

	@OriginalMember(owner = "client!jf", name = "X", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_702 = Static158.method3034(")1");

	@OriginalMember(owner = "client!jf", name = "bb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_703 = Static158.method3034("sl_stars");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIIILclient!aa;IZJ)Z")
	public static boolean method2043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static146.anInt3815 || local4 >= Static193.anInt4611) {
					return false;
				}
				@Pc(25) Class2_Sub17 local25 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt3604 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class6 local49 = new Class6();
		local49.aLong8 = arg11;
		local49.anInt295 = arg0;
		local49.anInt294 = arg5;
		local49.anInt289 = arg6;
		local49.anInt297 = arg7;
		local49.aClass2_Sub1_Sub1_1 = arg8;
		local49.anInt296 = arg9;
		local49.anInt299 = arg1;
		local49.anInt291 = arg2;
		local49.anInt292 = arg1 + arg3 - 1;
		local49.anInt300 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static118.aClass2_Sub17ArrayArrayArray1[local124][local92][local95] == null) {
						Static118.aClass2_Sub17ArrayArrayArray1[local124][local92][local95] = new Class2_Sub17(local124, local92, local95);
					}
				}
				@Pc(157) Class2_Sub17 local157 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][local92][local95];
				local157.aClass6Array2[local157.anInt3604] = local49;
				local157.anIntArray409[local157.anInt3604] = local98;
				local157.anInt3608 |= local98;
				local157.anInt3604++;
			}
		}
		if (arg10) {
			Static102.aClass6Array1[Static17.anInt552++] = local49;
		}
		return true;
	}
}
