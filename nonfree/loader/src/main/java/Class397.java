import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class397 {

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "[I")
	public int[] anIntArray613 = new int[20];

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public final int anInt10901;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "I")
	public final int anInt10902;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString126;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString127;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray62;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class397(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10901 = arg4;
		this.anInt10902 = arg3;
		this.anIntArray613 = arg5;
		this.aString126 = arg0;
		this.aString127 = arg1;
		this.aStringArray62 = arg2;
	}
}
