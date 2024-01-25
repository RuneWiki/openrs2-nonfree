import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class396 {

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "[I")
	public int[] anIntArray672 = new int[20];

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray79;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "I")
	public final int anInt10367;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "I")
	public final int anInt10368;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString134;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString135;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class396(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray79 = arg2;
		this.anInt10367 = arg4;
		this.anInt10368 = arg3;
		this.aString134 = arg1;
		this.aString135 = arg0;
		this.anIntArray672 = arg5;
	}
}
