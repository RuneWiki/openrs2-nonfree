import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class368 {

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "[I")
	public int[] anIntArray602 = new int[20];

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString270;

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "I")
	public final int anInt10348;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	public final int anInt10347;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray53;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString271;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class368(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString270 = arg1;
		this.anInt10348 = arg3;
		this.anInt10347 = arg4;
		this.anIntArray602 = arg5;
		this.aStringArray53 = arg2;
		this.aString271 = arg0;
	}
}
