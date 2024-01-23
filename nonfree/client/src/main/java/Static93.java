import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
	public static int anInt1895;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	public static int anInt1898;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Lclient!gj;")
	public static Class59 aClass59_20 = new Class59();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!io;III)V")
	public static void method1699(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub33 local12;
		if (arg2 < Static153.anInt3006) {
			local12 = Static105.aClass1_Sub33ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass36_1 != null && local12.aClass36_1.aClass15_1.method4680()) {
				arg0.method4683(local12.aClass36_1.aClass15_1, 128, 0, 0, true);
			}
		}
		if (arg3 < Static153.anInt3006) {
			local12 = Static105.aClass1_Sub33ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass36_1 != null && local12.aClass36_1.aClass15_1.method4680()) {
				arg0.method4683(local12.aClass36_1.aClass15_1, 0, 0, 128, true);
			}
		}
		if (arg2 < Static153.anInt3006 && arg3 < Static285.anInt5122) {
			local12 = Static105.aClass1_Sub33ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass36_1 != null && local12.aClass36_1.aClass15_1.method4680()) {
				arg0.method4683(local12.aClass36_1.aClass15_1, 128, 0, 128, true);
			}
		}
		if (arg2 < Static153.anInt3006 && arg3 > 0) {
			local12 = Static105.aClass1_Sub33ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass36_1 != null && local12.aClass36_1.aClass15_1.method4680()) {
				arg0.method4683(local12.aClass36_1.aClass15_1, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)I")
	public static int method1707(@OriginalArg(0) boolean arg0) {
		@Pc(10) long local10 = Static298.method4535();
		for (@Pc(22) Class1_Sub9 local22 = arg0 ? (Class1_Sub9) Static86.aClass142_7.method3534() : (Class1_Sub9) Static86.aClass142_7.method3530(); local22 != null; local22 = (Class1_Sub9) Static86.aClass142_7.method3530()) {
			if (local10 > (local22.aLong37 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local22.aLong37 & 0x4000000000000000L) != 0L) {
					@Pc(53) int local53 = (int) local22.aLong214;
					Static55.anIntArray64[local53] = Static107.anIntArray191[local53];
					local22.method4779();
					return local53;
				}
				local22.method4779();
			}
		}
		return -1;
	}
}
