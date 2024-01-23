import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class200 {

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "[I")
	public int[] anIntArray572 = new int[20];

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/String;")
	public String aString455;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "I")
	public int anInt6326;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray52;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	public String aString454;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "I")
	public int anInt6327;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class200(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString455 = arg0;
		this.anInt6326 = arg4;
		this.anIntArray572 = arg5;
		this.aStringArray52 = arg2;
		this.aString454 = arg1;
		this.anInt6327 = arg3;
	}
}
