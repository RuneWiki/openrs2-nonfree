import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class200 {

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "[I")
	public int[] anIntArray538 = new int[20];

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "Ljava/lang/String;")
	public String aString197;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public int anInt5954;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray48;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "I")
	public int anInt5953;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	public String aString196;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class200(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString197 = arg0;
		this.anInt5954 = arg4;
		this.aStringArray48 = arg2;
		this.anInt5953 = arg3;
		this.aString196 = arg1;
		this.anIntArray538 = arg5;
	}
}
