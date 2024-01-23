import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!fh;")
	public static Class58 aClass58_59;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
	public static int anInt2580;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt2579 = 0;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Lclient!jb;")
	public static Class94 aClass94_2 = new Class94();

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	public static int anInt2582 = 0;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public static void method2015() {
		@Pc(8) int local8 = Static36.method561();
		if (local8 == 0) {
			Static9.aByteArrayArrayArray2 = null;
			Static165.method2693(0);
		} else if (local8 == 1) {
			Static298.method4499((byte) 0);
			Static165.method2693(512);
			if (Static174.aByteArrayArrayArray17 != null) {
				Static84.method1498();
			}
		} else {
			Static298.method4499((byte) (Static86.anInt1997 - 4 & 0xFF));
			Static165.method2693(2);
		}
		Static248.anInt4710 = Static281.anInt5335;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
	public static void method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static156.anInt3068 = Static218.aClass191ArrayArray1[arg0][arg1].anInt6039;
		Static286.anInt5364 = Static218.aClass191ArrayArray1[arg0][arg1].anInt6041;
		Static272.anInt5212 = Static218.aClass191ArrayArray1[arg0][arg1].anInt6037;
		Static178.method2788((float) Static156.anInt3068, (float) Static286.anInt5364, (float) Static272.anInt5212);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[Ljava/lang/Object;II[I)V")
	public static void method2018(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg2 + arg0) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) int local16 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local16;
		@Pc(30) Object local30 = arg1[local10];
		arg1[local10] = arg1[arg0];
		arg1[arg0] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg0; local42++) {
			if (local16 + (local42 & 0x1) > arg3[local42]) {
				@Pc(68) int local68 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12] = local68;
				@Pc(82) Object local82 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12++] = local82;
			}
		}
		arg3[arg0] = arg3[local12];
		arg3[local12] = local16;
		arg1[arg0] = arg1[local12];
		arg1[local12] = local30;
		method2018(local12 - 1, arg1, arg2, arg3);
		method2018(arg0, arg1, local12 + 1, arg3);
	}
}
