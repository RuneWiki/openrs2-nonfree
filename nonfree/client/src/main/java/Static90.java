import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray8 = new byte[50][];

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	public static int anInt2299 = 0;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_31 = new Class90(53, 2);

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public static int anInt2301 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z[BII)[B")
	public static byte[] method1826(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static599.method3060(arg0, arg1, local6, 0, 32768);
		return local6;
	}
}
