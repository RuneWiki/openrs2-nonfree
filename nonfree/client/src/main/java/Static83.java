import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	public static int anInt1507 = -1;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	public static int anInt1516 = 64;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "J")
	public static long aLong63 = 0L;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)I")
	public static int method1244(@OriginalArg(0) boolean arg0) {
		@Pc(4) long local4 = Static135.method2186();
		for (@Pc(20) Class1_Sub21 local20 = arg0 ? (Class1_Sub21) Static276.aClass156_15.method3822() : (Class1_Sub21) Static276.aClass156_15.method3820(); local20 != null; local20 = (Class1_Sub21) Static276.aClass156_15.method3820()) {
			if ((local20.aLong158 & 0x3FFFFFFFFFFFFFFFL) < local4) {
				if ((local20.aLong158 & 0x4000000000000000L) != 0L) {
					@Pc(51) int local51 = (int) local20.aLong223;
					Static46.anIntArray78[local51] = Static264.anIntArray457[local51];
					local20.method4616();
					return local51;
				}
				local20.method4616();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
	public static void method1245(@OriginalArg(0) int arg0) {
		Static260.anInt5037 = arg0;
		Static255.method3874(3);
		Static255.method3874(4);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public static void method1246(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class1 local14 = Static298.aClass156_29.method3822(); local14 != null; local14 = Static298.aClass156_29.method3820()) {
			if ((local14.aLong223 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method4616();
			}
		}
	}
}
