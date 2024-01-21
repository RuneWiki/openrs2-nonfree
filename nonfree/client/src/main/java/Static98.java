import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "Lclient!gb;")
	public static Class1_Sub2_Sub8_Sub1_Sub1 aClass1_Sub2_Sub8_Sub1_Sub1_4;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_72;

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_660 = Static81.method1507("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!dj;")
	public static Class24 aClass24_655 = aClass24_660;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	public static int anInt2224 = 0;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_656 = Static81.method1507("Create a free account");

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!dj;")
	public static Class24 aClass24_657 = aClass24_656;

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_659 = Static81.method1507("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "Lclient!dj;")
	public static Class24 aClass24_658 = aClass24_659;

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "[S")
	public static final short[] aShortArray28 = new short[500];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	public static void method1715(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class1_Sub24 local4 = (Class1_Sub24) Static143.aClass57_32.method1876(); local4 != null; local4 = (Class1_Sub24) Static143.aClass57_32.method1873()) {
			if ((local4.aLong149 >> 48 & 0xFFFFL) == (long) arg0) {
				local4.method3563();
			}
		}
	}
}
