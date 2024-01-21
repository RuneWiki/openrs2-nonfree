import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray140 = new int[5][5000];

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	public static final int anInt4748 = 20;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
	public static int anInt4752 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!qa;I)V")
	public static void method3200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub5_Sub1_Sub2 arg2) {
		if (arg2.anInt3568 == arg1 && arg1 != -1) {
			@Pc(20) int local20 = Static121.method2378(arg1).anInt3450;
			if (local20 == 1) {
				arg2.anInt3572 = 0;
				arg2.anInt3597 = arg0;
				arg2.anInt3589 = 0;
				arg2.anInt3586 = 0;
			}
			if (local20 == 2) {
				arg2.anInt3572 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt3568 == -1 || Static121.method2378(arg1).anInt3451 >= Static121.method2378(arg2.anInt3568).anInt3451) {
			arg2.anInt3589 = 0;
			arg2.anInt3556 = arg2.anInt3561;
			arg2.anInt3586 = 0;
			arg2.anInt3597 = arg0;
			arg2.anInt3568 = arg1;
			arg2.anInt3572 = 0;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)I")
	public static int method3201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)V")
	public static void method3202() {
		Static9.anIntArrayArrayArray1 = new int[4][105][105];
		Static158.anIntArray397 = new int[104];
		Static165.anIntArray408 = new int[104];
		Static28.aByteArrayArrayArray5 = new byte[4][104][104];
		Static143.aByteArrayArrayArray6 = new byte[4][105][105];
		Static171.aByteArrayArrayArray8 = new byte[4][104][104];
		Static78.anIntArray210 = new int[104];
		Static95.anInt2954 = 99;
		Static107.aByteArrayArrayArray4 = new byte[4][104][104];
		Static60.aByteArrayArrayArray3 = new byte[4][104][104];
		Static116.anIntArray289 = new int[104];
		Static141.anIntArrayArray63 = new int[105][105];
		Static22.anIntArray44 = new int[104];
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	public static void method3203() {
		anIntArrayArray140 = null;
	}
}
