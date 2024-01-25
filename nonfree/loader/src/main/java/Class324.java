import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class324 {

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "[I")
	public int[] anIntArray771 = new int[20];

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString217;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "I")
	public final int anInt9422;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "I")
	public final int anInt9421;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString218;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray47;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class324(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString217 = arg0;
		this.anInt9422 = arg4;
		this.anInt9421 = arg3;
		this.anIntArray771 = arg5;
		this.aString218 = arg1;
		this.aStringArray47 = arg2;
	}
}
