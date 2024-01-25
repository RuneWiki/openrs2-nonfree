import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class397 {

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "[I")
	public int[] anIntArray963 = new int[20];

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public final int anInt10902;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray44;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString142;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "I")
	public final int anInt10903;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString141;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class397(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10902 = arg4;
		this.aStringArray44 = arg2;
		this.aString142 = arg1;
		this.anInt10903 = arg3;
		this.anIntArray963 = arg5;
		this.aString141 = arg0;
	}
}
