import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class226 {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "[I")
	public int[] anIntArray572 = new int[20];

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "I")
	public final int anInt6873;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString271;

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString272;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray45;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public final int anInt6874;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class226(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt6873 = arg4;
		this.aString271 = arg0;
		this.anIntArray572 = arg5;
		this.aString272 = arg1;
		this.aStringArray45 = arg2;
		this.anInt6874 = arg3;
	}
}
