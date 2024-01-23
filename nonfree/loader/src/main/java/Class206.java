import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class206 {

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "[I")
	public int[] anIntArray487 = new int[20];

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "I")
	public int anInt5570;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "Ljava/lang/String;")
	public String aString197;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Ljava/lang/String;")
	public String aString198;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray41;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "I")
	public int anInt5569;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class206(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt5570 = arg3;
		this.aString197 = arg1;
		this.aString198 = arg0;
		this.anIntArray487 = arg5;
		this.aStringArray41 = arg2;
		this.anInt5569 = arg4;
	}
}
