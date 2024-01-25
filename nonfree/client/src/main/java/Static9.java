import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public static int anInt277 = 0;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
	public static final int[] anIntArray27 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_1 = new Class342(12, 0, 1, 0);

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
	public static int anInt281 = -1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)V")
	public static void method204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static414.anInt7237; local11++) {
			@Pc(17) Rectangle local17 = Class237.aRectangleArray1[local11];
			if (arg1 < local17.width + local17.x && arg1 + arg3 > local17.x && local17.y + local17.height > arg2 && local17.y < arg0 + arg2) {
				Static143.aBooleanArray15[local11] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([BLjava/lang/String;II)I")
	public static int method205(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(20) int local20 = Static357.method5415(arg1.charAt(local12));
			@Pc(35) int local35 = local10 <= local12 + 1 ? -1 : Static357.method5415(arg1.charAt(local12 + 1));
			@Pc(50) int local50 = local12 + 2 >= local10 ? -1 : Static357.method5415(arg1.charAt(local12 + 2));
			@Pc(65) int local65 = local10 > local12 + 3 ? Static357.method5415(arg1.charAt(local12 + 3)) : -1;
			arg0[arg2++] = (byte) (local35 >>> 4 | local20 << 2);
			if (local50 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local35 & 0xF) << 4 | local50 >>> 2);
			if (local65 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local50 & 0x3) << 6 | local65);
		}
		return arg2;
	}
}
