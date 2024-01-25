import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_138 = new Class205(100, 15);

	@OriginalMember(owner = "client!fo", name = "vb", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_94 = new Class11(9, -1);

	@OriginalMember(owner = "client!fo", name = "zb", descriptor = "[B")
	public static final byte[] aByteArray114 = new byte[2048];

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Lclient!ip;")
	public static Class1_Sub2 method5549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub2_2;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIILclient!ro;)V")
	public static void method5557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub4 arg4) {
		@Pc(4) Class251 local4 = Static377.method4610(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt1533 = (arg1 << Static333.anInt5694) + Static241.anInt4320;
		arg4.anInt1541 = arg3;
		arg4.anInt1540 = (arg2 << Static333.anInt5694) + Static241.anInt4320;
		for (@Pc(28) Class46 local28 = local4.aClass46_3; local28 != null; local28 = local28.aClass46_1) {
			if (local28.aClass1_Sub5_1.aBoolean457) {
				@Pc(38) int local38 = local28.aClass1_Sub5_1.method5540();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt1541 += local8;
			arg4.aBoolean113 = true;
		}
		local4.aClass1_Sub4_1 = arg4;
	}
}
