import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!ht;")
	public static Class113 aClass113_7;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_111 = new Class36(51, -1);

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
	public static final int[] anIntArray552 = new int[1000];

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!er;")
	public static final Class69 aClass69_60 = new Class69(4);

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public static void method4900() {
		if (Static121.anInt2513 <= 0) {
			Static127.aString23 = "";
			return;
		}
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static76.aStringArray10.length; local17++) {
			if (Static76.aStringArray10[local17].startsWith("--> ")) {
				local15++;
				if (local15 == Static121.anInt2513) {
					Static127.aString23 = Static76.aStringArray10[local17].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)I")
	public static int method4901(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
