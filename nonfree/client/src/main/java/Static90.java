import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!dfa", name = "A", descriptor = "[B")
	public static final byte[] aByteArray41 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!dfa", name = "B", descriptor = "Z")
	public static final boolean aBoolean201 = false;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIB)Z")
	public static boolean method2002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static181.method1443(arg0, arg1) | Static418.method1821(arg1, arg0)) & Static334.method5311(arg1, arg0);
	}

	@OriginalMember(owner = "client!dfa", name = "b", descriptor = "(III)Z")
	public static boolean method2003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLclient!iaa;)Lclient!uf;")
	public static Class101_Sub3 method2004(@OriginalArg(1) Class6_Sub26 arg0) {
		@Pc(7) Class101 local7 = Static170.method3473(arg0);
		@Pc(11) int local11 = arg0.method4999();
		@Pc(17) int local17 = arg0.method4999();
		@Pc(26) int local26 = arg0.method4999();
		@Pc(30) int local30 = arg0.method4999();
		@Pc(36) int local36 = arg0.method4999();
		@Pc(40) int local40 = arg0.method4999();
		return new Class101_Sub3(local7.aClass148_10, local7.aClass49_11, local7.anInt9011, local7.anInt9013, local7.anInt9016, local7.anInt9009, local7.anInt9010, local11, local17, local26, local30, local36, local40);
	}
}
