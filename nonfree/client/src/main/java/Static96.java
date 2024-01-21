import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_10;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "Lclient!n;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[250][];

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
	public static int anInt2150 = 0;

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_758 = Static151.method2243("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_759 = Static151.method2243("Lade)3)3)3");

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_761 = Static151.method2243("shake:");

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "Lclient!mb;")
	public static Class62 aClass62_760 = aClass62_761;

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_763 = Static151.method2243("Connection lost)3");

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "Lclient!mb;")
	public static Class62 aClass62_762 = aClass62_763;

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "J")
	public static long aLong74 = 0L;

	@OriginalMember(owner = "client!jg", name = "N", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_764 = aClass62_761;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ii;I)Z")
	public static boolean method1460(@OriginalArg(0) Class47 arg0) {
		if (arg0.anIntArray174 == null) {
			return false;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.anIntArray174.length; local20++) {
			@Pc(27) int local27 = Static3.method95(local20, arg0);
			@Pc(32) int local32 = arg0.anIntArray162[local20];
			if (arg0.anIntArray174[local20] == 2) {
				if (local27 >= local32) {
					return false;
				}
			} else if (arg0.anIntArray174[local20] == 3) {
				if (local27 <= local32) {
					return false;
				}
			} else if (arg0.anIntArray174[local20] == 4) {
				if (local32 == local27) {
					return false;
				}
			} else if (local32 != local27) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ug;IIIIBI)Lclient!ug;")
	public static Class7_Sub7 method1462(@OriginalArg(0) Class7_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) long local4 = (long) arg1;
		@Pc(14) Class7_Sub7 local14 = (Class7_Sub7) Static78.aClass79_6.method2352(local4);
		if (local14 == null) {
			@Pc(21) Class7_Sub3 local21 = Static70.method975(Static126.aClass71_Sub1_14, arg1);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method979(64, 768, -50, -10, -50);
			Static78.aClass79_6.method2349(local4, local14);
		}
		@Pc(41) int local41 = arg0.method3152();
		@Pc(44) int local44 = arg0.method3155();
		@Pc(52) int local52 = arg0.method3162();
		@Pc(55) int local55 = arg0.method3157();
		local14 = local14.method3164(true);
		if (arg5 != 0) {
			local14.method3151(arg5);
		}
		@Pc(70) Class7_Sub7_Sub1 local70 = (Class7_Sub7_Sub1) local14;
		if (arg2 != Static175.method2548(arg4 + local52, Static126.anInt2806, arg3 + local41) || arg2 != Static175.method2548(arg4 + local55, Static126.anInt2806, local44 + arg3)) {
			for (@Pc(96) int local96 = 0; local96 < local70.anInt4492; local96++) {
				local70.anIntArray404[local96] += Static175.method2548(arg4 + local70.anIntArray420[local96], Static126.anInt2806, arg3 + local70.anIntArray410[local96]) - arg2;
			}
			local70.aBoolean192 = false;
		}
		return local14;
	}
}
