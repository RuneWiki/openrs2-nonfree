import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!c")
public final class Class400 {

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "[I")
	public int[] anIntArray625 = new int[20];

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "I")
	public final int anInt10932;

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString127;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "I")
	public final int anInt10931;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString126;

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray43;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class400(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10932 = arg4;
		this.aString127 = arg1;
		this.anInt10931 = arg3;
		this.aString126 = arg0;
		this.aStringArray43 = arg2;
		this.anIntArray625 = arg5;
	}
}
