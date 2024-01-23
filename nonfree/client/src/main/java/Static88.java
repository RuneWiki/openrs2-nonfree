import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "B")
	public static byte aByte10;

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
	public static int anInt2053;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
	public static int anInt2055;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "[Lclient!v;")
	public static Class163[] aClass163Array2 = new Class163[14];

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
	public static int anInt2052 = 100;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	public static int anInt2054 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)V")
	public static void method1531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class1_Sub2_Sub6 local4 = Static104.method831(arg1, 12);
		local4.method1192();
		local4.anInt1565 = arg0;
	}
}
