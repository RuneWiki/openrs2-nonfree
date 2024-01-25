import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString23 = "";

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public static final int anInt1924 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method1586() {
		@Pc(9) int[] local9 = new int[Static643.aClass275_2.anInt7494];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static643.aClass275_2.anInt7494; local13++) {
			@Pc(20) Class255 local20 = Static643.aClass275_2.method6641(local13);
			if (local20.anInt6554 >= 0 || local20.anInt6517 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static123.anIntArray225 = new int[local11];
		for (@Pc(48) int local48 = 0; local48 < local11; local48++) {
			Static123.anIntArray225[local48] = local9[local48];
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)J")
	public static synchronized long method1587() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static579.aLong249) {
			Static290.aLong124 += Static579.aLong249 - local10;
		}
		Static579.aLong249 = local10;
		return local10 + Static290.aLong124;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)I")
	public static int method1589(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
