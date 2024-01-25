import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!h")
public final class Class387 {

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "[I")
	public int[] anIntArray684 = new int[20];

	@OriginalMember(owner = "loader!h", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray84;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "I")
	public final int anInt10305;

	@OriginalMember(owner = "loader!h", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString121;

	@OriginalMember(owner = "loader!h", name = "e", descriptor = "I")
	public final int anInt10306;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString120;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class387(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray84 = arg2;
		this.anInt10305 = arg4;
		this.aString121 = arg1;
		this.anInt10306 = arg3;
		this.anIntArray684 = arg5;
		this.aString120 = arg0;
	}
}
