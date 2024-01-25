import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static85 {

	@OriginalMember(owner = "client!dt", name = "i", descriptor = "[I")
	public static int[] anIntArray219;

	@OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
	public static int anInt2043;

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "[B")
	public static final byte[] aByteArray22 = new byte[2048];

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_30 = new Class177(52, 4);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)I")
	public static int method1523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static256.anIntArray235[arg0 & 0x3] : 256;
	}
}
