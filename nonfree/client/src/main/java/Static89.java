import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static89 {

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!iea;")
	public static final Class171 aClass171_1 = new Class171();

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public static int anInt1348 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!sba;)Z")
	public static boolean method1309(@OriginalArg(1) Class323 arg0) {
		return arg0 == null ? false : Static525.method7546(arg0.anInt8824 - arg0.anInt8832, -arg0.anInt8825 + arg0.anInt8831, arg0.anInt8825, arg0.anInt8830 - arg0.anInt8822, arg0.anInt8832, arg0.anInt8822);
	}
}
