import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_2 = new Class100(21, -1);

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
	public static byte[] method53(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static543.method7672(local13) : local13;
		} else if (arg1 instanceof Class19) {
			@Pc(27) Class19 local27 = (Class19) arg1;
			return local27.method348();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I[S)[S")
	public static short[] method54(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static681.method2475(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
