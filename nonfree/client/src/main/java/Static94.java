import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZI)I")
	public static int method2022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static298.aClass53Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 7;
		@Pc(15) int local15 = arg0 >> 7;
		if (local11 < 0 || local15 < 0 || Static233.anInt5573 - 1 < local11 || local15 > Static134.anInt2971 - 1) {
			return 0;
		}
		@Pc(41) int local41 = arg2;
		if (arg2 < 3 && (Static200.aByteArrayArrayArray8[1][local11][local15] & 0x2) != 0) {
			local41 = arg2 + 1;
		}
		return Static298.aClass53Array3[local41].method2792(arg1, arg0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIZ)I")
	public static int method2025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static200.aByteArrayArrayArray8[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static200.aByteArrayArrayArray8[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[B)Z")
	public static boolean method2027(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub8 local8 = new Class1_Sub8(arg0);
		@Pc(14) int local14 = local8.method4532();
		if (local14 != 1) {
			return false;
		}
		@Pc(39) boolean local39 = local8.method4532() == 1;
		if (local39) {
			Static282.method5534(local8);
		}
		Static17.method417(local8);
		return true;
	}
}
