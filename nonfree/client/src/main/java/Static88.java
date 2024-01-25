import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public static int anInt6642;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "[I")
	public static int[] anIntArray529;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_204 = new Class214(52, 6);

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_128 = new Class266(12, 0, 1, 0);

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray11 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_87 = new Class212(65, 8);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZII)I")
	public static int method5355(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}
}
