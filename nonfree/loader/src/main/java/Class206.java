import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class206 {

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "[I")
	public int[] anIntArray699 = new int[20];

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "I")
	public int anInt5930;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray42;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "I")
	public int anInt5931;

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "Ljava/lang/String;")
	public String aString197;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	public String aString196;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class206(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt5930 = arg4;
		this.aStringArray42 = arg2;
		this.anInt5931 = arg3;
		this.anIntArray699 = arg5;
		this.aString197 = arg0;
		this.aString196 = arg1;
	}
}
