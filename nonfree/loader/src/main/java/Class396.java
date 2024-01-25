import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class396 {

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "[I")
	public int[] anIntArray730 = new int[20];

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	public final int anInt10638;

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "I")
	public final int anInt10639;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray50;

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString127;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString126;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class396(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10638 = arg4;
		this.anIntArray730 = arg5;
		this.anInt10639 = arg3;
		this.aStringArray50 = arg2;
		this.aString127 = arg0;
		this.aString126 = arg1;
	}
}
