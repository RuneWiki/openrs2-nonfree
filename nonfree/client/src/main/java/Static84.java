import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "Lclient!hfa;")
	public static final Class141 aClass141_3 = new Class141();

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_43 = new Class44(100, 4);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/lang/String;II[B)I")
	public static int method1571(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(25) int local25 = Static611.method8582(arg0.charAt(local12));
			@Pc(44) int local44 = local10 <= local12 + 1 ? -1 : Static611.method8582(arg0.charAt(local12 + 1));
			@Pc(59) int local59 = local10 <= local12 + 2 ? -1 : Static611.method8582(arg0.charAt(local12 + 2));
			@Pc(78) int local78 = local10 > local12 + 3 ? Static611.method8582(arg0.charAt(local12 + 3)) : -1;
			arg2[arg1++] = (byte) (local44 >>> 4 | local25 << 2);
			if (local59 == -1) {
				break;
			}
			arg2[arg1++] = (byte) (local59 >>> 2 | (local44 & 0xF) << 4);
			if (local78 == -1) {
				break;
			}
			arg2[arg1++] = (byte) (local78 | (local59 & 0x3) << 6);
		}
		return arg1;
	}
}
